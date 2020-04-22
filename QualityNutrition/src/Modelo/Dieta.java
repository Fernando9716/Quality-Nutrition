/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author fernando
 */
@Entity
@Table(name = "dieta")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Dieta.findAll", query = "SELECT d FROM Dieta d"),
    @NamedQuery(name = "Dieta.findByIdDieta", query = "SELECT d FROM Dieta d WHERE d.idDieta = :idDieta"),
    @NamedQuery(name = "Dieta.findByAlimento1", query = "SELECT d FROM Dieta d WHERE d.alimento1 = :alimento1"),
    @NamedQuery(name = "Dieta.findByNombre1", query = "SELECT d FROM Dieta d WHERE d.nombre1 = :nombre1"),
    @NamedQuery(name = "Dieta.findByAlimento2", query = "SELECT d FROM Dieta d WHERE d.alimento2 = :alimento2"),
    @NamedQuery(name = "Dieta.findByNombre2", query = "SELECT d FROM Dieta d WHERE d.nombre2 = :nombre2"),
    @NamedQuery(name = "Dieta.findByAlimento3", query = "SELECT d FROM Dieta d WHERE d.alimento3 = :alimento3"),
    @NamedQuery(name = "Dieta.findByNombre3", query = "SELECT d FROM Dieta d WHERE d.nombre3 = :nombre3"),
    @NamedQuery(name = "Dieta.findByAlimento4", query = "SELECT d FROM Dieta d WHERE d.alimento4 = :alimento4"),
    @NamedQuery(name = "Dieta.findByNombre4", query = "SELECT d FROM Dieta d WHERE d.nombre4 = :nombre4"),
    @NamedQuery(name = "Dieta.findByAlimento5", query = "SELECT d FROM Dieta d WHERE d.alimento5 = :alimento5"),
    @NamedQuery(name = "Dieta.findByNombre5", query = "SELECT d FROM Dieta d WHERE d.nombre5 = :nombre5"),
    @NamedQuery(name = "Dieta.findByAlimento6", query = "SELECT d FROM Dieta d WHERE d.alimento6 = :alimento6"),
    @NamedQuery(name = "Dieta.findByNombre6", query = "SELECT d FROM Dieta d WHERE d.nombre6 = :nombre6")})
public class Dieta implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id_dieta")
    private Integer idDieta;
    @Column(name = "alimento1")
    private Integer alimento1;
    @Column(name = "Nombre1")
    private String nombre1;
    @Column(name = "alimento2")
    private Integer alimento2;
    @Column(name = "Nombre2")
    private String nombre2;
    @Column(name = "alimento3")
    private Integer alimento3;
    @Column(name = "Nombre3")
    private String nombre3;
    @Column(name = "alimento4")
    private Integer alimento4;
    @Column(name = "Nombre4")
    private String nombre4;
    @Column(name = "alimento5")
    private Integer alimento5;
    @Column(name = "Nombre5")
    private String nombre5;
    @Column(name = "alimento6")
    private Integer alimento6;
    @Column(name = "Nombre6")
    private String nombre6;

    public Dieta() {
    }

    public Dieta(Integer idDieta) {
        this.idDieta = idDieta;
    }

    public Integer getIdDieta() {
        return idDieta;
    }

    public void setIdDieta(Integer idDieta) {
        this.idDieta = idDieta;
    }

    public Integer getAlimento1() {
        return alimento1;
    }

    public void setAlimento1(Integer alimento1) {
        this.alimento1 = alimento1;
    }

    public String getNombre1() {
        return nombre1;
    }

    public void setNombre1(String nombre1) {
        this.nombre1 = nombre1;
    }

    public Integer getAlimento2() {
        return alimento2;
    }

    public void setAlimento2(Integer alimento2) {
        this.alimento2 = alimento2;
    }

    public String getNombre2() {
        return nombre2;
    }

    public void setNombre2(String nombre2) {
        this.nombre2 = nombre2;
    }

    public Integer getAlimento3() {
        return alimento3;
    }

    public void setAlimento3(Integer alimento3) {
        this.alimento3 = alimento3;
    }

    public String getNombre3() {
        return nombre3;
    }

    public void setNombre3(String nombre3) {
        this.nombre3 = nombre3;
    }

    public Integer getAlimento4() {
        return alimento4;
    }

    public void setAlimento4(Integer alimento4) {
        this.alimento4 = alimento4;
    }

    public String getNombre4() {
        return nombre4;
    }

    public void setNombre4(String nombre4) {
        this.nombre4 = nombre4;
    }

    public Integer getAlimento5() {
        return alimento5;
    }

    public void setAlimento5(Integer alimento5) {
        this.alimento5 = alimento5;
    }

    public String getNombre5() {
        return nombre5;
    }

    public void setNombre5(String nombre5) {
        this.nombre5 = nombre5;
    }

    public Integer getAlimento6() {
        return alimento6;
    }

    public void setAlimento6(Integer alimento6) {
        this.alimento6 = alimento6;
    }

    public String getNombre6() {
        return nombre6;
    }

    public void setNombre6(String nombre6) {
        this.nombre6 = nombre6;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idDieta != null ? idDieta.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Dieta)) {
            return false;
        }
        Dieta other = (Dieta) object;
        if ((this.idDieta == null && other.idDieta != null) || (this.idDieta != null && !this.idDieta.equals(other.idDieta))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Modelo.Dieta[ idDieta=" + idDieta + " ]";
    }
    
}
