/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.Entity;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author nguye
 */
@Entity
@Table(name = "Tienlai")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Tienlai.findAll", query = "SELECT t FROM Tienlai t"),
    @NamedQuery(name = "Tienlai.findByTtngay", query = "SELECT t FROM Tienlai t WHERE t.ttngay = :ttngay"),
    @NamedQuery(name = "Tienlai.findBySoluonggao", query = "SELECT t FROM Tienlai t WHERE t.soluonggao = :soluonggao"),
    @NamedQuery(name = "Tienlai.findByLai", query = "SELECT t FROM Tienlai t WHERE t.lai = :lai"),
    @NamedQuery(name = "Tienlai.findByTuan", query = "SELECT t FROM Tienlai t WHERE t.tuan = :tuan")})
public class Tienlai implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ttngay")
    private Integer ttngay;
    @Basic(optional = false)
    @NotNull
    @Column(name = "soluonggao")
    private int soluonggao;
    @Column(name = "lai")
    private Integer lai;
    @Column(name = "tuan")
    private Integer tuan;

    public Tienlai() {
    }

    public Tienlai(Integer ttngay) {
        this.ttngay = ttngay;
    }

    public Tienlai(Integer ttngay, int soluonggao) {
        this.ttngay = ttngay;
        this.soluonggao = soluonggao;
    }

    public Integer getTtngay() {
        return ttngay;
    }

    public void setTtngay(Integer ttngay) {
        this.ttngay = ttngay;
    }

    public int getSoluonggao() {
        return soluonggao;
    }

    public void setSoluonggao(int soluonggao) {
        this.soluonggao = soluonggao;
    }

    public Integer getLai() {
        return lai;
    }

    public void setLai(Integer lai) {
        this.lai = lai;
    }

    public Integer getTuan() {
        return tuan;
    }

    public void setTuan(Integer tuan) {
        this.tuan = tuan;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (ttngay != null ? ttngay.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Tienlai)) {
            return false;
        }
        Tienlai other = (Tienlai) object;
        if ((this.ttngay == null && other.ttngay != null) || (this.ttngay != null && !this.ttngay.equals(other.ttngay))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.example.Entity.Tienlai[ ttngay=" + ttngay + " ]";
    }
    
}
