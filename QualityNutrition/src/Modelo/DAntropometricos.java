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
@Table(name = "d_antropometricos")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "DAntropometricos.findAll", query = "SELECT d FROM DAntropometricos d"),
    @NamedQuery(name = "DAntropometricos.findByIdDAntropometricos", query = "SELECT d FROM DAntropometricos d WHERE d.idDAntropometricos = :idDAntropometricos"),
    @NamedQuery(name = "DAntropometricos.findByIdPaciente", query = "SELECT d FROM DAntropometricos d WHERE d.idPaciente = :idPaciente"),
    @NamedQuery(name = "DAntropometricos.findByPeso", query = "SELECT d FROM DAntropometricos d WHERE d.peso = :peso"),
    @NamedQuery(name = "DAntropometricos.findByAltura", query = "SELECT d FROM DAntropometricos d WHERE d.altura = :altura"),
    @NamedQuery(name = "DAntropometricos.findByDiametrobf", query = "SELECT d FROM DAntropometricos d WHERE d.diametrobf = :diametrobf"),
    @NamedQuery(name = "DAntropometricos.findByDiametrobm", query = "SELECT d FROM DAntropometricos d WHERE d.diametrobm = :diametrobm"),
    @NamedQuery(name = "DAntropometricos.findByDiametrocodo", query = "SELECT d FROM DAntropometricos d WHERE d.diametrocodo = :diametrocodo"),
    @NamedQuery(name = "DAntropometricos.findByDiametrotobillo", query = "SELECT d FROM DAntropometricos d WHERE d.diametrotobillo = :diametrotobillo"),
    @NamedQuery(name = "DAntropometricos.findByGrasasubabd", query = "SELECT d FROM DAntropometricos d WHERE d.grasasubabd = :grasasubabd"),
    @NamedQuery(name = "DAntropometricos.findByPerimetroabd", query = "SELECT d FROM DAntropometricos d WHERE d.perimetroabd = :perimetroabd"),
    @NamedQuery(name = "DAntropometricos.findByPerimetrocefalico", query = "SELECT d FROM DAntropometricos d WHERE d.perimetrocefalico = :perimetrocefalico"),
    @NamedQuery(name = "DAntropometricos.findByPerimetrohombros", query = "SELECT d FROM DAntropometricos d WHERE d.perimetrohombros = :perimetrohombros"),
    @NamedQuery(name = "DAntropometricos.findByPerimetromu\u00f1eca", query = "SELECT d FROM DAntropometricos d WHERE d.perimetromu\u00f1eca = :perimetromu\u00f1eca"),
    @NamedQuery(name = "DAntropometricos.findByPerimetrosupmusl", query = "SELECT d FROM DAntropometricos d WHERE d.perimetrosupmusl = :perimetrosupmusl"),
    @NamedQuery(name = "DAntropometricos.findByPerimetroantebrazo", query = "SELECT d FROM DAntropometricos d WHERE d.perimetroantebrazo = :perimetroantebrazo"),
    @NamedQuery(name = "DAntropometricos.findByPerimetrobrazo", query = "SELECT d FROM DAntropometricos d WHERE d.perimetrobrazo = :perimetrobrazo"),
    @NamedQuery(name = "DAntropometricos.findByPerimetrobrazofelx", query = "SELECT d FROM DAntropometricos d WHERE d.perimetrobrazofelx = :perimetrobrazofelx"),
    @NamedQuery(name = "DAntropometricos.findByPerimetrobrazorelaj", query = "SELECT d FROM DAntropometricos d WHERE d.perimetrobrazorelaj = :perimetrobrazorelaj"),
    @NamedQuery(name = "DAntropometricos.findByPerimetrocuello", query = "SELECT d FROM DAntropometricos d WHERE d.perimetrocuello = :perimetrocuello"),
    @NamedQuery(name = "DAntropometricos.findByPerimetrotobillo", query = "SELECT d FROM DAntropometricos d WHERE d.perimetrotobillo = :perimetrotobillo"),
    @NamedQuery(name = "DAntropometricos.findByPerimetrogemelar", query = "SELECT d FROM DAntropometricos d WHERE d.perimetrogemelar = :perimetrogemelar"),
    @NamedQuery(name = "DAntropometricos.findByPerimetromedmuslo", query = "SELECT d FROM DAntropometricos d WHERE d.perimetromedmuslo = :perimetromedmuslo"),
    @NamedQuery(name = "DAntropometricos.findByPerimetropectoral", query = "SELECT d FROM DAntropometricos d WHERE d.perimetropectoral = :perimetropectoral"),
    @NamedQuery(name = "DAntropometricos.findByPlieguecutabdominal", query = "SELECT d FROM DAntropometricos d WHERE d.plieguecutabdominal = :plieguecutabdominal"),
    @NamedQuery(name = "DAntropometricos.findByPlieguecutaxilarmed", query = "SELECT d FROM DAntropometricos d WHERE d.plieguecutaxilarmed = :plieguecutaxilarmed"),
    @NamedQuery(name = "DAntropometricos.findByPlieguecutbicipital", query = "SELECT d FROM DAntropometricos d WHERE d.plieguecutbicipital = :plieguecutbicipital"),
    @NamedQuery(name = "DAntropometricos.findByPlieguecutpantorrilla", query = "SELECT d FROM DAntropometricos d WHERE d.plieguecutpantorrilla = :plieguecutpantorrilla"),
    @NamedQuery(name = "DAntropometricos.findByPlieguecutiliocristal", query = "SELECT d FROM DAntropometricos d WHERE d.plieguecutiliocristal = :plieguecutiliocristal"),
    @NamedQuery(name = "DAntropometricos.findByPlieguecutpectoral", query = "SELECT d FROM DAntropometricos d WHERE d.plieguecutpectoral = :plieguecutpectoral"),
    @NamedQuery(name = "DAntropometricos.findByPlieguecutsubescapular", query = "SELECT d FROM DAntropometricos d WHERE d.plieguecutsubescapular = :plieguecutsubescapular"),
    @NamedQuery(name = "DAntropometricos.findByPlieguecutsupraesp", query = "SELECT d FROM DAntropometricos d WHERE d.plieguecutsupraesp = :plieguecutsupraesp"),
    @NamedQuery(name = "DAntropometricos.findByPlieguecutsuprailiaco", query = "SELECT d FROM DAntropometricos d WHERE d.plieguecutsuprailiaco = :plieguecutsuprailiaco"),
    @NamedQuery(name = "DAntropometricos.findByPlieguemusanterior", query = "SELECT d FROM DAntropometricos d WHERE d.plieguemusanterior = :plieguemusanterior"),
    @NamedQuery(name = "DAntropometricos.findByPerimetrocadera", query = "SELECT d FROM DAntropometricos d WHERE d.perimetrocadera = :perimetrocadera"),
    @NamedQuery(name = "DAntropometricos.findByPerimetrocintura", query = "SELECT d FROM DAntropometricos d WHERE d.perimetrocintura = :perimetrocintura"),
    @NamedQuery(name = "DAntropometricos.findByPlieguecuttricipital", query = "SELECT d FROM DAntropometricos d WHERE d.plieguecuttricipital = :plieguecuttricipital")})
public class DAntropometricos implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID_D_ANTROPOMETRICOS")
    private Integer idDAntropometricos;
    @Column(name = "ID_PACIENTE")
    private Integer idPaciente;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "PESO")
    private Float peso;
    @Column(name = "ALTURA")
    private Float altura;
    @Column(name = "DIAMETROBF")
    private Float diametrobf;
    @Column(name = "DIAMETROBM")
    private Float diametrobm;
    @Column(name = "DIAMETROCODO")
    private Float diametrocodo;
    @Column(name = "DIAMETROTOBILLO")
    private Float diametrotobillo;
    @Column(name = "GRASASUBABD")
    private Float grasasubabd;
    @Column(name = "PERIMETROABD")
    private Float perimetroabd;
    @Column(name = "PERIMETROCEFALICO")
    private Float perimetrocefalico;
    @Column(name = "PERIMETROHOMBROS")
    private Float perimetrohombros;
    @Column(name = "PERIMETROMU\u00d1ECA")
    private Float perimetromuñeca;
    @Column(name = "PERIMETROSUPMUSL")
    private Float perimetrosupmusl;
    @Column(name = "PERIMETROANTEBRAZO")
    private Float perimetroantebrazo;
    @Column(name = "PERIMETROBRAZO")
    private Float perimetrobrazo;
    @Column(name = "PERIMETROBRAZOFELX")
    private Float perimetrobrazofelx;
    @Column(name = "PERIMETROBRAZORELAJ")
    private Float perimetrobrazorelaj;
    @Column(name = "PERIMETROCUELLO")
    private Float perimetrocuello;
    @Column(name = "PERIMETROTOBILLO")
    private Float perimetrotobillo;
    @Column(name = "PERIMETROGEMELAR")
    private Float perimetrogemelar;
    @Column(name = "PERIMETROMEDMUSLO")
    private Float perimetromedmuslo;
    @Column(name = "PERIMETROPECTORAL")
    private Float perimetropectoral;
    @Column(name = "PLIEGUECUTABDOMINAL")
    private Float plieguecutabdominal;
    @Column(name = "PLIEGUECUTAXILARMED")
    private Float plieguecutaxilarmed;
    @Column(name = "PLIEGUECUTBICIPITAL")
    private Float plieguecutbicipital;
    @Column(name = "PLIEGUECUTPANTORRILLA")
    private Float plieguecutpantorrilla;
    @Column(name = "PLIEGUECUTILIOCRISTAL")
    private Float plieguecutiliocristal;
    @Column(name = "PLIEGUECUTPECTORAL")
    private Float plieguecutpectoral;
    @Column(name = "PLIEGUECUTSUBESCAPULAR")
    private Float plieguecutsubescapular;
    @Column(name = "PLIEGUECUTSUPRAESP")
    private Float plieguecutsupraesp;
    @Column(name = "PLIEGUECUTSUPRAILIACO")
    private Float plieguecutsuprailiaco;
    @Column(name = "PLIEGUEMUSANTERIOR")
    private Float plieguemusanterior;
    @Column(name = "PERIMETROCADERA")
    private Float perimetrocadera;
    @Column(name = "PERIMETROCINTURA")
    private Float perimetrocintura;
    @Column(name = "PLIEGUECUTTRICIPITAL")
    private Float plieguecuttricipital;

    public DAntropometricos() {
    }

    public DAntropometricos(Integer idDAntropometricos) {
        this.idDAntropometricos = idDAntropometricos;
    }

    public Integer getIdDAntropometricos() {
        return idDAntropometricos;
    }

    public void setIdDAntropometricos(Integer idDAntropometricos) {
        this.idDAntropometricos = idDAntropometricos;
    }

    public Integer getIdPaciente() {
        return idPaciente;
    }

    public void setIdPaciente(Integer idPaciente) {
        this.idPaciente = idPaciente;
    }

    public Float getPeso() {
        return peso;
    }

    public void setPeso(Float peso) {
        this.peso = peso;
    }

    public Float getAltura() {
        return altura;
    }

    public void setAltura(Float altura) {
        this.altura = altura;
    }

    public Float getDiametrobf() {
        return diametrobf;
    }

    public void setDiametrobf(Float diametrobf) {
        this.diametrobf = diametrobf;
    }

    public Float getDiametrobm() {
        return diametrobm;
    }

    public void setDiametrobm(Float diametrobm) {
        this.diametrobm = diametrobm;
    }

    public Float getDiametrocodo() {
        return diametrocodo;
    }

    public void setDiametrocodo(Float diametrocodo) {
        this.diametrocodo = diametrocodo;
    }

    public Float getDiametrotobillo() {
        return diametrotobillo;
    }

    public void setDiametrotobillo(Float diametrotobillo) {
        this.diametrotobillo = diametrotobillo;
    }

    public Float getGrasasubabd() {
        return grasasubabd;
    }

    public void setGrasasubabd(Float grasasubabd) {
        this.grasasubabd = grasasubabd;
    }

    public Float getPerimetroabd() {
        return perimetroabd;
    }

    public void setPerimetroabd(Float perimetroabd) {
        this.perimetroabd = perimetroabd;
    }

    public Float getPerimetrocefalico() {
        return perimetrocefalico;
    }

    public void setPerimetrocefalico(Float perimetrocefalico) {
        this.perimetrocefalico = perimetrocefalico;
    }

    public Float getPerimetrohombros() {
        return perimetrohombros;
    }

    public void setPerimetrohombros(Float perimetrohombros) {
        this.perimetrohombros = perimetrohombros;
    }

    public Float getPerimetromuñeca() {
        return perimetromuñeca;
    }

    public void setPerimetromuñeca(Float perimetromuñeca) {
        this.perimetromuñeca = perimetromuñeca;
    }

    public Float getPerimetrosupmusl() {
        return perimetrosupmusl;
    }

    public void setPerimetrosupmusl(Float perimetrosupmusl) {
        this.perimetrosupmusl = perimetrosupmusl;
    }

    public Float getPerimetroantebrazo() {
        return perimetroantebrazo;
    }

    public void setPerimetroantebrazo(Float perimetroantebrazo) {
        this.perimetroantebrazo = perimetroantebrazo;
    }

    public Float getPerimetrobrazo() {
        return perimetrobrazo;
    }

    public void setPerimetrobrazo(Float perimetrobrazo) {
        this.perimetrobrazo = perimetrobrazo;
    }

    public Float getPerimetrobrazofelx() {
        return perimetrobrazofelx;
    }

    public void setPerimetrobrazofelx(Float perimetrobrazofelx) {
        this.perimetrobrazofelx = perimetrobrazofelx;
    }

    public Float getPerimetrobrazorelaj() {
        return perimetrobrazorelaj;
    }

    public void setPerimetrobrazorelaj(Float perimetrobrazorelaj) {
        this.perimetrobrazorelaj = perimetrobrazorelaj;
    }

    public Float getPerimetrocuello() {
        return perimetrocuello;
    }

    public void setPerimetrocuello(Float perimetrocuello) {
        this.perimetrocuello = perimetrocuello;
    }

    public Float getPerimetrotobillo() {
        return perimetrotobillo;
    }

    public void setPerimetrotobillo(Float perimetrotobillo) {
        this.perimetrotobillo = perimetrotobillo;
    }

    public Float getPerimetrogemelar() {
        return perimetrogemelar;
    }

    public void setPerimetrogemelar(Float perimetrogemelar) {
        this.perimetrogemelar = perimetrogemelar;
    }

    public Float getPerimetromedmuslo() {
        return perimetromedmuslo;
    }

    public void setPerimetromedmuslo(Float perimetromedmuslo) {
        this.perimetromedmuslo = perimetromedmuslo;
    }

    public Float getPerimetropectoral() {
        return perimetropectoral;
    }

    public void setPerimetropectoral(Float perimetropectoral) {
        this.perimetropectoral = perimetropectoral;
    }

    public Float getPlieguecutabdominal() {
        return plieguecutabdominal;
    }

    public void setPlieguecutabdominal(Float plieguecutabdominal) {
        this.plieguecutabdominal = plieguecutabdominal;
    }

    public Float getPlieguecutaxilarmed() {
        return plieguecutaxilarmed;
    }

    public void setPlieguecutaxilarmed(Float plieguecutaxilarmed) {
        this.plieguecutaxilarmed = plieguecutaxilarmed;
    }

    public Float getPlieguecutbicipital() {
        return plieguecutbicipital;
    }

    public void setPlieguecutbicipital(Float plieguecutbicipital) {
        this.plieguecutbicipital = plieguecutbicipital;
    }

    public Float getPlieguecutpantorrilla() {
        return plieguecutpantorrilla;
    }

    public void setPlieguecutpantorrilla(Float plieguecutpantorrilla) {
        this.plieguecutpantorrilla = plieguecutpantorrilla;
    }

    public Float getPlieguecutiliocristal() {
        return plieguecutiliocristal;
    }

    public void setPlieguecutiliocristal(Float plieguecutiliocristal) {
        this.plieguecutiliocristal = plieguecutiliocristal;
    }

    public Float getPlieguecutpectoral() {
        return plieguecutpectoral;
    }

    public void setPlieguecutpectoral(Float plieguecutpectoral) {
        this.plieguecutpectoral = plieguecutpectoral;
    }

    public Float getPlieguecutsubescapular() {
        return plieguecutsubescapular;
    }

    public void setPlieguecutsubescapular(Float plieguecutsubescapular) {
        this.plieguecutsubescapular = plieguecutsubescapular;
    }

    public Float getPlieguecutsupraesp() {
        return plieguecutsupraesp;
    }

    public void setPlieguecutsupraesp(Float plieguecutsupraesp) {
        this.plieguecutsupraesp = plieguecutsupraesp;
    }

    public Float getPlieguecutsuprailiaco() {
        return plieguecutsuprailiaco;
    }

    public void setPlieguecutsuprailiaco(Float plieguecutsuprailiaco) {
        this.plieguecutsuprailiaco = plieguecutsuprailiaco;
    }

    public Float getPlieguemusanterior() {
        return plieguemusanterior;
    }

    public void setPlieguemusanterior(Float plieguemusanterior) {
        this.plieguemusanterior = plieguemusanterior;
    }

    public Float getPerimetrocadera() {
        return perimetrocadera;
    }

    public void setPerimetrocadera(Float perimetrocadera) {
        this.perimetrocadera = perimetrocadera;
    }

    public Float getPerimetrocintura() {
        return perimetrocintura;
    }

    public void setPerimetrocintura(Float perimetrocintura) {
        this.perimetrocintura = perimetrocintura;
    }

    public Float getPlieguecuttricipital() {
        return plieguecuttricipital;
    }

    public void setPlieguecuttricipital(Float plieguecuttricipital) {
        this.plieguecuttricipital = plieguecuttricipital;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idDAntropometricos != null ? idDAntropometricos.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DAntropometricos)) {
            return false;
        }
        DAntropometricos other = (DAntropometricos) object;
        if ((this.idDAntropometricos == null && other.idDAntropometricos != null) || (this.idDAntropometricos != null && !this.idDAntropometricos.equals(other.idDAntropometricos))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Modelo.DAntropometricos[ idDAntropometricos=" + idDAntropometricos + " ]";
    }
    
}
