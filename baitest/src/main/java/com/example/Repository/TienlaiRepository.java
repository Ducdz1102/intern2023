/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.example.Repository;

import com.example.Entity.Tienlai;
import java.util.List;
import java.util.Map;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

/**
 *
 * @author nguye
 */
@Repository
public interface TienlaiRepository extends  JpaRepository<Tienlai,Integer>{
    
    @Query("SELECT sum(d.lai) FROM Tienlai d WHERE d.tuan = :weekNumber")
    Integer getTotalLaiForWeek( Integer weekNumber);
    
    @Query("SELECT d.tuan,sum(d.lai) FROM Tienlai d group by d.tuan order by d.tuan")
    List<Object[]> getlAllWeek();
    
    @Query("SELECT d.ttngay,d.lai FROM Tienlai d ORDER BY d.ttngay DESC")
    List<Object[]> getAllDay();
}
