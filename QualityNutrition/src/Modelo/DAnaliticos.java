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
@Table(name = "d_analiticos")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "DAnaliticos.findAll", query = "SELECT d FROM DAnaliticos d"),
    @NamedQuery(name = "DAnaliticos.findByIdDAnaliticos", query = "SELECT d FROM DAnaliticos d WHERE d.idDAnaliticos = :idDAnaliticos"),
    @NamedQuery(name = "DAnaliticos.findByIdPaciente", query = "SELECT d FROM DAnaliticos d WHERE d.idPaciente = :idPaciente"),
    @NamedQuery(name = "DAnaliticos.findByColesterolHdl", query = "SELECT d FROM DAnaliticos d WHERE d.colesterolHdl = :colesterolHdl"),
    @NamedQuery(name = "DAnaliticos.findByColesterolLdl", query = "SELECT d FROM DAnaliticos d WHERE d.colesterolLdl = :colesterolLdl"),
    @NamedQuery(name = "DAnaliticos.findByColesterolTotal", query = "SELECT d FROM DAnaliticos d WHERE d.colesterolTotal = :colesterolTotal"),
    @NamedQuery(name = "DAnaliticos.findByPresionArterialDiastolica", query = "SELECT d FROM DAnaliticos d WHERE d.presionArterialDiastolica = :presionArterialDiastolica"),
    @NamedQuery(name = "DAnaliticos.findByPresionArterialSistolica", query = "SELECT d FROM DAnaliticos d WHERE d.presionArterialSistolica = :presionArterialSistolica"),
    @NamedQuery(name = "DAnaliticos.findByTrigliceridos", query = "SELECT d FROM DAnaliticos d WHERE d.trigliceridos = :trigliceridos")})
public class DAnaliticos implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID_D_ANALITICOS")
    private Integer idDAnaliticos;
    @Column(name = "ID_PACIENTE")
    private Integer idPaciente;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "COLESTEROL_HDL")
    private Float colesterolHdl;
    @Column(name = "COLESTEROL_LDL")
    private Float colesterolLdl;
    @Column(name = "COLESTEROL_TOTAL")
    private Float colesterolTotal;
    @Column(name = "PRESION_ARTERIAL_DIASTOLICA")
    private Float presionArterialDiastolica;
    @Column(name = "PRESION_ARTERIAL_SISTOLICA")
    private Float presionArterialSistolica;
    @Column(name = "TRIGLICERIDOS")
    private Float trigliceridos;

    public DAnaliticos() {
    }

    public DAnaliticos(Integer idDAnaliticos) {
        this.idDAnaliticos = idDAnaliticos;
    }

    public Integer getIdDAnaliticos() {
        return idDAnaliticos;
    }

    public void setIdDAnaliticos(Integer idDAnaliticos) {
        this.idDAnaliticos = idDAnaliticos;
    }

    public Integer getIdPaciente() {
        return idPaciente;
    }

    public void setIdPaciente(Integer idPaciente) {
        this.idPaciente = idPaciente;
    }

    public Float getColesterolHdl() {
        return colesterolHdl;
    }

    public void setColesterolHdl(Float colesterolHdl) {
        this.colesterolHdl = colesterolHdl;
    }

    public Float getColesterolLdl() {
        return colesterolLdl;
    }

    public void setColesterolLdl(Float colesterolLdl) {
        this.colesterolLdl = colesterolLdl;
    }

    public Float getColesterolTotal() {
        return colesterolTotal;
    }

    public void setColesterolTotal(Float colesterolTotal) {
        this.colesterolTotal = colesterolTotal;
    }

    public Float getPresionArterialDiastolica() {
        return presionArterialDiastolica;
    }

    public void setPresionArterialDiastolica(Float presionArterialDiastolica) {
        this.presionArterialDiastolica = presionArterialDiastolica;
    }

    public Float getPresionArterialSistolica() {
        return presionArterialSistolica;
    }

    public void setPresionArterialSistolica(Float presionArterialSistolica) {
        this.presionArterialSistolica = presionArterialSistolica;
    }

    public Float getTrigliceridos() {
        return trigliceridos;
    }

    public void setTrigliceridos(Float trigliceridos) {
        this.trigliceridos = trigliceridos;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idDAnaliticos != null ? idDAnaliticos.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DAnaliticos)) {
            return false;
        }
        DAnaliticos other = (DAnaliticos) object;
        if ((this.idDAnaliticos == null && other.idDAnaliticos != null) || (this.idDAnaliticos != null && !this.idDAnaliticos.equals(other.idDAnaliticos))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Modelo.DAnaliticos[ idDAnaliticos=" + idDAnaliticos + " ]";
    }
    
}
