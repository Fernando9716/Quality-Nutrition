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
@Table(name = "cita")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Cita.findAll", query = "SELECT c FROM Cita c"),
    @NamedQuery(name = "Cita.findByFolioCita", query = "SELECT c FROM Cita c WHERE c.folioCita = :folioCita"),
    @NamedQuery(name = "Cita.findByFecha", query = "SELECT c FROM Cita c WHERE c.fecha = :fecha"),
    @NamedQuery(name = "Cita.findByNombrePaciente", query = "SELECT c FROM Cita c WHERE c.nombrePaciente = :nombrePaciente"),
    @NamedQuery(name = "Cita.findByHora", query = "SELECT c FROM Cita c WHERE c.hora = :hora"),
    @NamedQuery(name = "Cita.findByServicio", query = "SELECT c FROM Cita c WHERE c.servicio = :servicio")})
public class Cita implements Serializable {
    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "FOLIO_CITA")
    private Integer folioCita;
    @Column(name = "FECHA")
    @Temporal(TemporalType.DATE)
    private Date fecha;
    @Column(name = "NOMBRE_PACIENTE")
    private String nombrePaciente;
    @Column(name = "HORA")
    private String hora;
    @Column(name = "SERVICIO")
    private String servicio;

    public Cita() {
    }

    public Cita(Integer folioCita) {
        this.folioCita = folioCita;
    }

    public Integer getFolioCita() {
        return folioCita;
    }

    public void setFolioCita(Integer folioCita) {
        Integer oldFolioCita = this.folioCita;
        this.folioCita = folioCita;
        changeSupport.firePropertyChange("folioCita", oldFolioCita, folioCita);
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        Date oldFecha = this.fecha;
        this.fecha = fecha;
        changeSupport.firePropertyChange("fecha", oldFecha, fecha);
    }

    public String getNombrePaciente() {
        return nombrePaciente;
    }

    public void setNombrePaciente(String nombrePaciente) {
        String oldNombrePaciente = this.nombrePaciente;
        this.nombrePaciente = nombrePaciente;
        changeSupport.firePropertyChange("nombrePaciente", oldNombrePaciente, nombrePaciente);
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        String oldHora = this.hora;
        this.hora = hora;
        changeSupport.firePropertyChange("hora", oldHora, hora);
    }

    public String getServicio() {
        return servicio;
    }

    public void setServicio(String servicio) {
        String oldServicio = this.servicio;
        this.servicio = servicio;
        changeSupport.firePropertyChange("servicio", oldServicio, servicio);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (folioCita != null ? folioCita.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Cita)) {
            return false;
        }
        Cita other = (Cita) object;
        if ((this.folioCita == null && other.folioCita != null) || (this.folioCita != null && !this.folioCita.equals(other.folioCita))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Modelo.Cita[ folioCita=" + folioCita + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
