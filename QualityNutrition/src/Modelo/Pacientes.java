/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author fernando
 */
@Entity
@Table(name = "pacientes")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Pacientes.findAll", query = "SELECT p FROM Pacientes p"),
    @NamedQuery(name = "Pacientes.findByIdPaciente", query = "SELECT p FROM Pacientes p WHERE p.idPaciente = :idPaciente"),
    @NamedQuery(name = "Pacientes.findByNombreCompleto", query = "SELECT p FROM Pacientes p WHERE p.nombreCompleto = :nombreCompleto"),
    @NamedQuery(name = "Pacientes.findByGenero", query = "SELECT p FROM Pacientes p WHERE p.genero = :genero"),
    @NamedQuery(name = "Pacientes.findByFechaNacimiento", query = "SELECT p FROM Pacientes p WHERE p.fechaNacimiento = :fechaNacimiento"),
    @NamedQuery(name = "Pacientes.findByOcupacion", query = "SELECT p FROM Pacientes p WHERE p.ocupacion = :ocupacion"),
    @NamedQuery(name = "Pacientes.findByCodigopostal", query = "SELECT p FROM Pacientes p WHERE p.codigopostal = :codigopostal"),
    @NamedQuery(name = "Pacientes.findByNumeroTelefono", query = "SELECT p FROM Pacientes p WHERE p.numeroTelefono = :numeroTelefono"),
    @NamedQuery(name = "Pacientes.findByCorreoElectronico", query = "SELECT p FROM Pacientes p WHERE p.correoElectronico = :correoElectronico")})
public class Pacientes implements Serializable {
    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID_PACIENTE")
    private Integer idPaciente;
    @Column(name = "NOMBRE_COMPLETO")
    private String nombreCompleto;
    @Column(name = "GENERO")
    private String genero;
    @Column(name = "FECHA_NACIMIENTO")
    @Temporal(TemporalType.DATE)
    private Date fechaNacimiento;
    @Column(name = "OCUPACION")
    private String ocupacion;
    @Column(name = "CODIGOPOSTAL")
    private Integer codigopostal;
    @Column(name = "NUMERO_TELEFONO")
    private Integer numeroTelefono;
    @Column(name = "CORREO_ELECTRONICO")
    private String correoElectronico;

    public Pacientes() {
    }

    public Pacientes(Integer idPaciente) {
        this.idPaciente = idPaciente;
    }

    public Integer getIdPaciente() {
        return idPaciente;
    }

    public void setIdPaciente(Integer idPaciente) {
        Integer oldIdPaciente = this.idPaciente;
        this.idPaciente = idPaciente;
        changeSupport.firePropertyChange("idPaciente", oldIdPaciente, idPaciente);
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        String oldNombreCompleto = this.nombreCompleto;
        this.nombreCompleto = nombreCompleto;
        changeSupport.firePropertyChange("nombreCompleto", oldNombreCompleto, nombreCompleto);
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        String oldGenero = this.genero;
        this.genero = genero;
        changeSupport.firePropertyChange("genero", oldGenero, genero);
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        Date oldFechaNacimiento = this.fechaNacimiento;
        this.fechaNacimiento = fechaNacimiento;
        changeSupport.firePropertyChange("fechaNacimiento", oldFechaNacimiento, fechaNacimiento);
    }

    public String getOcupacion() {
        return ocupacion;
    }

    public void setOcupacion(String ocupacion) {
        String oldOcupacion = this.ocupacion;
        this.ocupacion = ocupacion;
        changeSupport.firePropertyChange("ocupacion", oldOcupacion, ocupacion);
    }

    public Integer getCodigopostal() {
        return codigopostal;
    }

    public void setCodigopostal(Integer codigopostal) {
        Integer oldCodigopostal = this.codigopostal;
        this.codigopostal = codigopostal;
        changeSupport.firePropertyChange("codigopostal", oldCodigopostal, codigopostal);
    }

    public Integer getNumeroTelefono() {
        return numeroTelefono;
    }

    public void setNumeroTelefono(Integer numeroTelefono) {
        Integer oldNumeroTelefono = this.numeroTelefono;
        this.numeroTelefono = numeroTelefono;
        changeSupport.firePropertyChange("numeroTelefono", oldNumeroTelefono, numeroTelefono);
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        String oldCorreoElectronico = this.correoElectronico;
        this.correoElectronico = correoElectronico;
        changeSupport.firePropertyChange("correoElectronico", oldCorreoElectronico, correoElectronico);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idPaciente != null ? idPaciente.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Pacientes)) {
            return false;
        }
        Pacientes other = (Pacientes) object;
        if ((this.idPaciente == null && other.idPaciente != null) || (this.idPaciente != null && !this.idPaciente.equals(other.idPaciente))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Modelo.Pacientes[ idPaciente=" + idPaciente + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}