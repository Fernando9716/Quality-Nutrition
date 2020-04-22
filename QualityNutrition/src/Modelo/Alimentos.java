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
@Table(name = "alimentos")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Alimentos.findAll", query = "SELECT a FROM Alimentos a"),
    @NamedQuery(name = "Alimentos.findByIdAlimento", query = "SELECT a FROM Alimentos a WHERE a.idAlimento = :idAlimento"),
    @NamedQuery(name = "Alimentos.findByNombreReceta", query = "SELECT a FROM Alimentos a WHERE a.nombreReceta = :nombreReceta"),
    @NamedQuery(name = "Alimentos.findByDescripcion", query = "SELECT a FROM Alimentos a WHERE a.descripcion = :descripcion"),
    @NamedQuery(name = "Alimentos.findByTiempoPreparacion", query = "SELECT a FROM Alimentos a WHERE a.tiempoPreparacion = :tiempoPreparacion"),
    @NamedQuery(name = "Alimentos.findByPesoPorcion", query = "SELECT a FROM Alimentos a WHERE a.pesoPorcion = :pesoPorcion"),
    @NamedQuery(name = "Alimentos.findByTotalMacronutrientes", query = "SELECT a FROM Alimentos a WHERE a.totalMacronutrientes = :totalMacronutrientes"),
    @NamedQuery(name = "Alimentos.findByModoPreparacion", query = "SELECT a FROM Alimentos a WHERE a.modoPreparacion = :modoPreparacion"),
    @NamedQuery(name = "Alimentos.findByEnergia", query = "SELECT a FROM Alimentos a WHERE a.energia = :energia"),
    @NamedQuery(name = "Alimentos.findByGrasa", query = "SELECT a FROM Alimentos a WHERE a.grasa = :grasa"),
    @NamedQuery(name = "Alimentos.findByHCarbono", query = "SELECT a FROM Alimentos a WHERE a.hCarbono = :hCarbono"),
    @NamedQuery(name = "Alimentos.findByProteinas", query = "SELECT a FROM Alimentos a WHERE a.proteinas = :proteinas"),
    @NamedQuery(name = "Alimentos.findByCloesterol", query = "SELECT a FROM Alimentos a WHERE a.cloesterol = :cloesterol"),
    @NamedQuery(name = "Alimentos.findByFibraAlimentaria", query = "SELECT a FROM Alimentos a WHERE a.fibraAlimentaria = :fibraAlimentaria"),
    @NamedQuery(name = "Alimentos.findBySodio", query = "SELECT a FROM Alimentos a WHERE a.sodio = :sodio"),
    @NamedQuery(name = "Alimentos.findByAgua", query = "SELECT a FROM Alimentos a WHERE a.agua = :agua"),
    @NamedQuery(name = "Alimentos.findByVitaminaA", query = "SELECT a FROM Alimentos a WHERE a.vitaminaA = :vitaminaA"),
    @NamedQuery(name = "Alimentos.findByVitaminaB6", query = "SELECT a FROM Alimentos a WHERE a.vitaminaB6 = :vitaminaB6"),
    @NamedQuery(name = "Alimentos.findByVitaminaB12", query = "SELECT a FROM Alimentos a WHERE a.vitaminaB12 = :vitaminaB12"),
    @NamedQuery(name = "Alimentos.findByVitaminaC", query = "SELECT a FROM Alimentos a WHERE a.vitaminaC = :vitaminaC"),
    @NamedQuery(name = "Alimentos.findByVitaminaD", query = "SELECT a FROM Alimentos a WHERE a.vitaminaD = :vitaminaD"),
    @NamedQuery(name = "Alimentos.findByVitaminaE", query = "SELECT a FROM Alimentos a WHERE a.vitaminaE = :vitaminaE"),
    @NamedQuery(name = "Alimentos.findByVitaminaK", query = "SELECT a FROM Alimentos a WHERE a.vitaminaK = :vitaminaK"),
    @NamedQuery(name = "Alimentos.findByAlmidon", query = "SELECT a FROM Alimentos a WHERE a.almidon = :almidon"),
    @NamedQuery(name = "Alimentos.findByLactosa", query = "SELECT a FROM Alimentos a WHERE a.lactosa = :lactosa"),
    @NamedQuery(name = "Alimentos.findByAlcohol", query = "SELECT a FROM Alimentos a WHERE a.alcohol = :alcohol"),
    @NamedQuery(name = "Alimentos.findByCafeina", query = "SELECT a FROM Alimentos a WHERE a.cafeina = :cafeina"),
    @NamedQuery(name = "Alimentos.findByAzucares", query = "SELECT a FROM Alimentos a WHERE a.azucares = :azucares"),
    @NamedQuery(name = "Alimentos.findByCalcio", query = "SELECT a FROM Alimentos a WHERE a.calcio = :calcio"),
    @NamedQuery(name = "Alimentos.findByHierro", query = "SELECT a FROM Alimentos a WHERE a.hierro = :hierro"),
    @NamedQuery(name = "Alimentos.findByMagnesio", query = "SELECT a FROM Alimentos a WHERE a.magnesio = :magnesio"),
    @NamedQuery(name = "Alimentos.findByFosforo", query = "SELECT a FROM Alimentos a WHERE a.fosforo = :fosforo"),
    @NamedQuery(name = "Alimentos.findByPotasio", query = "SELECT a FROM Alimentos a WHERE a.potasio = :potasio"),
    @NamedQuery(name = "Alimentos.findByZinc", query = "SELECT a FROM Alimentos a WHERE a.zinc = :zinc"),
    @NamedQuery(name = "Alimentos.findByCobre", query = "SELECT a FROM Alimentos a WHERE a.cobre = :cobre"),
    @NamedQuery(name = "Alimentos.findByFluor", query = "SELECT a FROM Alimentos a WHERE a.fluor = :fluor"),
    @NamedQuery(name = "Alimentos.findByMagneso", query = "SELECT a FROM Alimentos a WHERE a.magneso = :magneso"),
    @NamedQuery(name = "Alimentos.findBySelenio", query = "SELECT a FROM Alimentos a WHERE a.selenio = :selenio"),
    @NamedQuery(name = "Alimentos.findByTiamina", query = "SELECT a FROM Alimentos a WHERE a.tiamina = :tiamina"),
    @NamedQuery(name = "Alimentos.findByRiboflavina", query = "SELECT a FROM Alimentos a WHERE a.riboflavina = :riboflavina"),
    @NamedQuery(name = "Alimentos.findByNiacina", query = "SELECT a FROM Alimentos a WHERE a.niacina = :niacina"),
    @NamedQuery(name = "Alimentos.findByAcidoPantotenico", query = "SELECT a FROM Alimentos a WHERE a.acidoPantotenico = :acidoPantotenico"),
    @NamedQuery(name = "Alimentos.findByFlotato", query = "SELECT a FROM Alimentos a WHERE a.flotato = :flotato"),
    @NamedQuery(name = "Alimentos.findByAcidoFolico", query = "SELECT a FROM Alimentos a WHERE a.acidoFolico = :acidoFolico"),
    @NamedQuery(name = "Alimentos.findByGrasasTrans", query = "SELECT a FROM Alimentos a WHERE a.grasasTrans = :grasasTrans"),
    @NamedQuery(name = "Alimentos.findByGrasasSaturadas", query = "SELECT a FROM Alimentos a WHERE a.grasasSaturadas = :grasasSaturadas"),
    @NamedQuery(name = "Alimentos.findByGrasasMonoinsturadas", query = "SELECT a FROM Alimentos a WHERE a.grasasMonoinsturadas = :grasasMonoinsturadas"),
    @NamedQuery(name = "Alimentos.findByGrasasPoliinsaturadas", query = "SELECT a FROM Alimentos a WHERE a.grasasPoliinsaturadas = :grasasPoliinsaturadas"),
    @NamedQuery(name = "Alimentos.findByCloruro", query = "SELECT a FROM Alimentos a WHERE a.cloruro = :cloruro")})
public class Alimentos implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID_ALIMENTO")
    private Integer idAlimento;
    @Column(name = "NOMBRE_RECETA")
    private String nombreReceta;
    @Column(name = "DESCRIPCION")
    private String descripcion;
    @Column(name = "TIEMPO_PREPARACION")
    private Integer tiempoPreparacion;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "PESO_PORCION")
    private Float pesoPorcion;
    @Column(name = "TOTAL_MACRONUTRIENTES")
    private Float totalMacronutrientes;
    @Column(name = "MODO_PREPARACION")
    private String modoPreparacion;
    @Column(name = "ENERGIA")
    private Float energia;
    @Column(name = "GRASA")
    private Float grasa;
    @Column(name = "H_CARBONO")
    private Float hCarbono;
    @Column(name = "PROTEINAS")
    private Float proteinas;
    @Column(name = "CLOESTEROL")
    private Float cloesterol;
    @Column(name = "FIBRA_ALIMENTARIA")
    private Float fibraAlimentaria;
    @Column(name = "SODIO")
    private Float sodio;
    @Column(name = "AGUA")
    private Float agua;
    @Column(name = "VITAMINA_A")
    private Float vitaminaA;
    @Column(name = "VITAMINA_B6")
    private Float vitaminaB6;
    @Column(name = "VITAMINA_B12")
    private Float vitaminaB12;
    @Column(name = "VITAMINA_C")
    private Float vitaminaC;
    @Column(name = "VITAMINA_D")
    private Float vitaminaD;
    @Column(name = "VITAMINA_E")
    private Float vitaminaE;
    @Column(name = "VITAMINA_K")
    private Float vitaminaK;
    @Column(name = "ALMIDON")
    private Float almidon;
    @Column(name = "LACTOSA")
    private Float lactosa;
    @Column(name = "ALCOHOL")
    private Float alcohol;
    @Column(name = "CAFEINA")
    private Float cafeina;
    @Column(name = "AZUCARES")
    private Float azucares;
    @Column(name = "CALCIO")
    private Float calcio;
    @Column(name = "HIERRO")
    private Float hierro;
    @Column(name = "MAGNESIO")
    private Float magnesio;
    @Column(name = "FOSFORO")
    private Float fosforo;
    @Column(name = "POTASIO")
    private Float potasio;
    @Column(name = "ZINC")
    private Float zinc;
    @Column(name = "COBRE")
    private Float cobre;
    @Column(name = "FLUOR")
    private Float fluor;
    @Column(name = "MAGNESO")
    private Float magneso;
    @Column(name = "SELENIO")
    private Float selenio;
    @Column(name = "TIAMINA")
    private Float tiamina;
    @Column(name = "RIBOFLAVINA")
    private Float riboflavina;
    @Column(name = "NIACINA")
    private Float niacina;
    @Column(name = "ACIDO_PANTOTENICO")
    private Float acidoPantotenico;
    @Column(name = "FLOTATO")
    private Float flotato;
    @Column(name = "ACIDO_FOLICO")
    private Float acidoFolico;
    @Column(name = "GRASAS_TRANS")
    private Float grasasTrans;
    @Column(name = "GRASAS_SATURADAS")
    private Float grasasSaturadas;
    @Column(name = "GRASAS_MONOINSTURADAS")
    private Float grasasMonoinsturadas;
    @Column(name = "GRASAS_POLIINSATURADAS")
    private Float grasasPoliinsaturadas;
    @Column(name = "CLORURO")
    private Float cloruro;

    public Alimentos() {
    }

    public Alimentos(Integer idAlimento) {
        this.idAlimento = idAlimento;
    }

    public Integer getIdAlimento() {
        return idAlimento;
    }

    public void setIdAlimento(Integer idAlimento) {
        this.idAlimento = idAlimento;
    }

    public String getNombreReceta() {
        return nombreReceta;
    }

    public void setNombreReceta(String nombreReceta) {
        this.nombreReceta = nombreReceta;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Integer getTiempoPreparacion() {
        return tiempoPreparacion;
    }

    public void setTiempoPreparacion(Integer tiempoPreparacion) {
        this.tiempoPreparacion = tiempoPreparacion;
    }

    public Float getPesoPorcion() {
        return pesoPorcion;
    }

    public void setPesoPorcion(Float pesoPorcion) {
        this.pesoPorcion = pesoPorcion;
    }

    public Float getTotalMacronutrientes() {
        return totalMacronutrientes;
    }

    public void setTotalMacronutrientes(Float totalMacronutrientes) {
        this.totalMacronutrientes = totalMacronutrientes;
    }

    public String getModoPreparacion() {
        return modoPreparacion;
    }

    public void setModoPreparacion(String modoPreparacion) {
        this.modoPreparacion = modoPreparacion;
    }

    public Float getEnergia() {
        return energia;
    }

    public void setEnergia(Float energia) {
        this.energia = energia;
    }

    public Float getGrasa() {
        return grasa;
    }

    public void setGrasa(Float grasa) {
        this.grasa = grasa;
    }

    public Float getHCarbono() {
        return hCarbono;
    }

    public void setHCarbono(Float hCarbono) {
        this.hCarbono = hCarbono;
    }

    public Float getProteinas() {
        return proteinas;
    }

    public void setProteinas(Float proteinas) {
        this.proteinas = proteinas;
    }

    public Float getCloesterol() {
        return cloesterol;
    }

    public void setCloesterol(Float cloesterol) {
        this.cloesterol = cloesterol;
    }

    public Float getFibraAlimentaria() {
        return fibraAlimentaria;
    }

    public void setFibraAlimentaria(Float fibraAlimentaria) {
        this.fibraAlimentaria = fibraAlimentaria;
    }

    public Float getSodio() {
        return sodio;
    }

    public void setSodio(Float sodio) {
        this.sodio = sodio;
    }

    public Float getAgua() {
        return agua;
    }

    public void setAgua(Float agua) {
        this.agua = agua;
    }

    public Float getVitaminaA() {
        return vitaminaA;
    }

    public void setVitaminaA(Float vitaminaA) {
        this.vitaminaA = vitaminaA;
    }

    public Float getVitaminaB6() {
        return vitaminaB6;
    }

    public void setVitaminaB6(Float vitaminaB6) {
        this.vitaminaB6 = vitaminaB6;
    }

    public Float getVitaminaB12() {
        return vitaminaB12;
    }

    public void setVitaminaB12(Float vitaminaB12) {
        this.vitaminaB12 = vitaminaB12;
    }

    public Float getVitaminaC() {
        return vitaminaC;
    }

    public void setVitaminaC(Float vitaminaC) {
        this.vitaminaC = vitaminaC;
    }

    public Float getVitaminaD() {
        return vitaminaD;
    }

    public void setVitaminaD(Float vitaminaD) {
        this.vitaminaD = vitaminaD;
    }

    public Float getVitaminaE() {
        return vitaminaE;
    }

    public void setVitaminaE(Float vitaminaE) {
        this.vitaminaE = vitaminaE;
    }

    public Float getVitaminaK() {
        return vitaminaK;
    }

    public void setVitaminaK(Float vitaminaK) {
        this.vitaminaK = vitaminaK;
    }

    public Float getAlmidon() {
        return almidon;
    }

    public void setAlmidon(Float almidon) {
        this.almidon = almidon;
    }

    public Float getLactosa() {
        return lactosa;
    }

    public void setLactosa(Float lactosa) {
        this.lactosa = lactosa;
    }

    public Float getAlcohol() {
        return alcohol;
    }

    public void setAlcohol(Float alcohol) {
        this.alcohol = alcohol;
    }

    public Float getCafeina() {
        return cafeina;
    }

    public void setCafeina(Float cafeina) {
        this.cafeina = cafeina;
    }

    public Float getAzucares() {
        return azucares;
    }

    public void setAzucares(Float azucares) {
        this.azucares = azucares;
    }

    public Float getCalcio() {
        return calcio;
    }

    public void setCalcio(Float calcio) {
        this.calcio = calcio;
    }

    public Float getHierro() {
        return hierro;
    }

    public void setHierro(Float hierro) {
        this.hierro = hierro;
    }

    public Float getMagnesio() {
        return magnesio;
    }

    public void setMagnesio(Float magnesio) {
        this.magnesio = magnesio;
    }

    public Float getFosforo() {
        return fosforo;
    }

    public void setFosforo(Float fosforo) {
        this.fosforo = fosforo;
    }

    public Float getPotasio() {
        return potasio;
    }

    public void setPotasio(Float potasio) {
        this.potasio = potasio;
    }

    public Float getZinc() {
        return zinc;
    }

    public void setZinc(Float zinc) {
        this.zinc = zinc;
    }

    public Float getCobre() {
        return cobre;
    }

    public void setCobre(Float cobre) {
        this.cobre = cobre;
    }

    public Float getFluor() {
        return fluor;
    }

    public void setFluor(Float fluor) {
        this.fluor = fluor;
    }

    public Float getMagneso() {
        return magneso;
    }

    public void setMagneso(Float magneso) {
        this.magneso = magneso;
    }

    public Float getSelenio() {
        return selenio;
    }

    public void setSelenio(Float selenio) {
        this.selenio = selenio;
    }

    public Float getTiamina() {
        return tiamina;
    }

    public void setTiamina(Float tiamina) {
        this.tiamina = tiamina;
    }

    public Float getRiboflavina() {
        return riboflavina;
    }

    public void setRiboflavina(Float riboflavina) {
        this.riboflavina = riboflavina;
    }

    public Float getNiacina() {
        return niacina;
    }

    public void setNiacina(Float niacina) {
        this.niacina = niacina;
    }

    public Float getAcidoPantotenico() {
        return acidoPantotenico;
    }

    public void setAcidoPantotenico(Float acidoPantotenico) {
        this.acidoPantotenico = acidoPantotenico;
    }

    public Float getFlotato() {
        return flotato;
    }

    public void setFlotato(Float flotato) {
        this.flotato = flotato;
    }

    public Float getAcidoFolico() {
        return acidoFolico;
    }

    public void setAcidoFolico(Float acidoFolico) {
        this.acidoFolico = acidoFolico;
    }

    public Float getGrasasTrans() {
        return grasasTrans;
    }

    public void setGrasasTrans(Float grasasTrans) {
        this.grasasTrans = grasasTrans;
    }

    public Float getGrasasSaturadas() {
        return grasasSaturadas;
    }

    public void setGrasasSaturadas(Float grasasSaturadas) {
        this.grasasSaturadas = grasasSaturadas;
    }

    public Float getGrasasMonoinsturadas() {
        return grasasMonoinsturadas;
    }

    public void setGrasasMonoinsturadas(Float grasasMonoinsturadas) {
        this.grasasMonoinsturadas = grasasMonoinsturadas;
    }

    public Float getGrasasPoliinsaturadas() {
        return grasasPoliinsaturadas;
    }

    public void setGrasasPoliinsaturadas(Float grasasPoliinsaturadas) {
        this.grasasPoliinsaturadas = grasasPoliinsaturadas;
    }

    public Float getCloruro() {
        return cloruro;
    }

    public void setCloruro(Float cloruro) {
        this.cloruro = cloruro;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idAlimento != null ? idAlimento.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Alimentos)) {
            return false;
        }
        Alimentos other = (Alimentos) object;
        if ((this.idAlimento == null && other.idAlimento != null) || (this.idAlimento != null && !this.idAlimento.equals(other.idAlimento))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Modelo.Alimentos[ idAlimento=" + idAlimento + " ]";
    }
    
}
