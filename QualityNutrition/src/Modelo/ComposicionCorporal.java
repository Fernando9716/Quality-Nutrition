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
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
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
@Table(name = "composicion_corporal")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ComposicionCorporal.findAll", query = "SELECT c FROM ComposicionCorporal c"),
    @NamedQuery(name = "ComposicionCorporal.findByIdComposicionCorporal", query = "SELECT c FROM ComposicionCorporal c WHERE c.idComposicionCorporal = :idComposicionCorporal"),
    @NamedQuery(name = "ComposicionCorporal.findByIdPaciente", query = "SELECT c FROM ComposicionCorporal c WHERE c.idPaciente = :idPaciente"),
    @NamedQuery(name = "ComposicionCorporal.findByMasaMuscular", query = "SELECT c FROM ComposicionCorporal c WHERE c.masaMuscular = :masaMuscular"),
    @NamedQuery(name = "ComposicionCorporal.findByPorcentajemasagrasa", query = "SELECT c FROM ComposicionCorporal c WHERE c.porcentajemasagrasa = :porcentajemasagrasa"),
    @NamedQuery(name = "ComposicionCorporal.findByPorcentajemasamuscular", query = "SELECT c FROM ComposicionCorporal c WHERE c.porcentajemasamuscular = :porcentajemasamuscular"),
    @NamedQuery(name = "ComposicionCorporal.findByMasalibregrasa", query = "SELECT c FROM ComposicionCorporal c WHERE c.masalibregrasa = :masalibregrasa"),
    @NamedQuery(name = "ComposicionCorporal.findByMasamagra", query = "SELECT c FROM ComposicionCorporal c WHERE c.masamagra = :masamagra"),
    @NamedQuery(name = "ComposicionCorporal.findByMasaresidual", query = "SELECT c FROM ComposicionCorporal c WHERE c.masaresidual = :masaresidual"),
    @NamedQuery(name = "ComposicionCorporal.findByMasaosea", query = "SELECT c FROM ComposicionCorporal c WHERE c.masaosea = :masaosea")})
public class ComposicionCorporal implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID_COMPOSICION_CORPORAL")
    private Integer idComposicionCorporal;
    @Column(name = "ID_PACIENTE")
    private Integer idPaciente;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "MASA_MUSCULAR")
    private Float masaMuscular;
    @Column(name = "PORCENTAJEMASAGRASA")
    private Float porcentajemasagrasa;
    @Column(name = "PORCENTAJEMASAMUSCULAR")
    private Float porcentajemasamuscular;
    @Column(name = "MASALIBREGRASA")
    private Float masalibregrasa;
    @Column(name = "MASAMAGRA")
    private Float masamagra;
    @Column(name = "MASARESIDUAL")
    private Float masaresidual;
    @Column(name = "MASAOSEA")
    private Float masaosea;

    public ComposicionCorporal() {
    }

    public ComposicionCorporal(Integer idComposicionCorporal) {
        this.idComposicionCorporal = idComposicionCorporal;
    }

    public Integer getIdComposicionCorporal() {
        return idComposicionCorporal;
    }

    public void setIdComposicionCorporal(Integer idComposicionCorporal) {
        this.idComposicionCorporal = idComposicionCorporal;
    }

    public Integer getIdPaciente() {
        return idPaciente;
    }

    public void setIdPaciente(Integer idPaciente) {
        this.idPaciente = idPaciente;
    }

    public Float getMasaMuscular() {
        return masaMuscular;
    }

    public void setMasaMuscular(Float masaMuscular) {
        this.masaMuscular = masaMuscular;
    }

    public Float getPorcentajemasagrasa() {
        return porcentajemasagrasa;
    }

    public void setPorcentajemasagrasa(Float porcentajemasagrasa) {
        this.porcentajemasagrasa = porcentajemasagrasa;
    }

    public Float getPorcentajemasamuscular() {
        return porcentajemasamuscular;
    }

    public void setPorcentajemasamuscular(Float porcentajemasamuscular) {
        this.porcentajemasamuscular = porcentajemasamuscular;
    }

    public Float getMasalibregrasa() {
        return masalibregrasa;
    }

    public void setMasalibregrasa(Float masalibregrasa) {
        this.masalibregrasa = masalibregrasa;
    }

    public Float getMasamagra() {
        return masamagra;
    }

    public void setMasamagra(Float masamagra) {
        this.masamagra = masamagra;
    }

    public Float getMasaresidual() {
        return masaresidual;
    }

    public void setMasaresidual(Float masaresidual) {
        this.masaresidual = masaresidual;
    }

    public Float getMasaosea() {
        return masaosea;
    }

    public void setMasaosea(Float masaosea) {
        this.masaosea = masaosea;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idComposicionCorporal != null ? idComposicionCorporal.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ComposicionCorporal)) {
            return false;
        }
        ComposicionCorporal other = (ComposicionCorporal) object;
        if ((this.idComposicionCorporal == null && other.idComposicionCorporal != null) || (this.idComposicionCorporal != null && !this.idComposicionCorporal.equals(other.idComposicionCorporal))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Modelo.ComposicionCorporal[ idComposicionCorporal=" + idComposicionCorporal + " ]";
    }
    
}
