create database tinhlai
use tinhlai

create table Tienlai(
ttngay int primary key identity,
soluonggao int not null,
lai int,
tuan int
)

create trigger UpdateLai
on Tienlai
after insert
as
begin
    UPDATE Tienlai
    SET tuan = CEILING(ttngay / 7.0);
    
    UPDATE Tienlai
    SET lai = (soluonggao / 5) * 0.3 * ((SELECT price FROM LoaiGao WHERE [name] = N'xịn') - (SELECT price FROM LoaiGao WHERE [name] = N'xấu'))
    WHERE lai IS NULL;
end;

create table Loaigao(
id int primary key identity,
[name] nvarchar(10),
price int
)


insert into Loaigao values(N'xịn',20000),(N'xấu',2000);

insert into Tienlai(soluonggao) values(81), ( 93), ( 111), (111), ( 93), ( 57), ( 105),
( 96), ( 36), ( 72), ( 117), (18), ( 66), (36),
( 15), (27), ( 27), ( 69), ( 57), ( 93), ( 69),
( 33), ( 114), ( 48), ( 39), (78), (90), ( 18),
( 36), ( 36)