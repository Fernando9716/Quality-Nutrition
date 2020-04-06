/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
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
import javax.persistence.Transient;
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
    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);
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
        Integer oldIdAlimento = this.idAlimento;
        this.idAlimento = idAlimento;
        changeSupport.firePropertyChange("idAlimento", oldIdAlimento, idAlimento);
    }

    public String getNombreReceta() {
        return nombreReceta;
    }

    public void setNombreReceta(String nombreReceta) {
        String oldNombreReceta = this.nombreReceta;
        this.nombreReceta = nombreReceta;
        changeSupport.firePropertyChange("nombreReceta", oldNombreReceta, nombreReceta);
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        String oldDescripcion = this.descripcion;
        this.descripcion = descripcion;
        changeSupport.firePropertyChange("descripcion", oldDescripcion, descripcion);
    }

    public Integer getTiempoPreparacion() {
        return tiempoPreparacion;
    }

    public void setTiempoPreparacion(Integer tiempoPreparacion) {
        Integer oldTiempoPreparacion = this.tiempoPreparacion;
        this.tiempoPreparacion = tiempoPreparacion;
        changeSupport.firePropertyChange("tiempoPreparacion", oldTiempoPreparacion, tiempoPreparacion);
    }

    public Float getPesoPorcion() {
        return pesoPorcion;
    }

    public void setPesoPorcion(Float pesoPorcion) {
        Float oldPesoPorcion = this.pesoPorcion;
        this.pesoPorcion = pesoPorcion;
        changeSupport.firePropertyChange("pesoPorcion", oldPesoPorcion, pesoPorcion);
    }

    public Float getTotalMacronutrientes() {
        return totalMacronutrientes;
    }

    public void setTotalMacronutrientes(Float totalMacronutrientes) {
        Float oldTotalMacronutrientes = this.totalMacronutrientes;
        this.totalMacronutrientes = totalMacronutrientes;
        changeSupport.firePropertyChange("totalMacronutrientes", oldTotalMacronutrientes, totalMacronutrientes);
    }

    public String getModoPreparacion() {
        return modoPreparacion;
    }

    public void setModoPreparacion(String modoPreparacion) {
        String oldModoPreparacion = this.modoPreparacion;
        this.modoPreparacion = modoPreparacion;
        changeSupport.firePropertyChange("modoPreparacion", oldModoPreparacion, modoPreparacion);
    }

    public Float getEnergia() {
        return energia;
    }

    public void setEnergia(Float energia) {
        Float oldEnergia = this.energia;
        this.energia = energia;
        changeSupport.firePropertyChange("energia", oldEnergia, energia);
    }

    public Float getGrasa() {
        return grasa;
    }

    public void setGrasa(Float grasa) {
        Float oldGrasa = this.grasa;
        this.grasa = grasa;
        changeSupport.firePropertyChange("grasa", oldGrasa, grasa);
    }

    public Float getHCarbono() {
        return hCarbono;
    }

    public void setHCarbono(Float hCarbono) {
        Float oldHCarbono = this.hCarbono;
        this.hCarbono = hCarbono;
        changeSupport.firePropertyChange("HCarbono", oldHCarbono, hCarbono);
    }

    public Float getProteinas() {
        return proteinas;
    }

    public void setProteinas(Float proteinas) {
        Float oldProteinas = this.proteinas;
        this.proteinas = proteinas;
        changeSupport.firePropertyChange("proteinas", oldProteinas, proteinas);
    }

    public Float getCloesterol() {
        return cloesterol;
    }

    public void setCloesterol(Float cloesterol) {
        Float oldCloesterol = this.cloesterol;
        this.cloesterol = cloesterol;
        changeSupport.firePropertyChange("cloesterol", oldCloesterol, cloesterol);
    }

    public Float getFibraAlimentaria() {
        return fibraAlimentaria;
    }

    public void setFibraAlimentaria(Float fibraAlimentaria) {
        Float oldFibraAlimentaria = this.fibraAlimentaria;
        this.fibraAlimentaria = fibraAlimentaria;
        changeSupport.firePropertyChange("fibraAlimentaria", oldFibraAlimentaria, fibraAlimentaria);
    }

    public Float getSodio() {
        return sodio;
    }

    public void setSodio(Float sodio) {
        Float oldSodio = this.sodio;
        this.sodio = sodio;
        changeSupport.firePropertyChange("sodio", oldSodio, sodio);
    }

    public Float getAgua() {
        return agua;
    }

    public void setAgua(Float agua) {
        Float oldAgua = this.agua;
        this.agua = agua;
        changeSupport.firePropertyChange("agua", oldAgua, agua);
    }

    public Float getVitaminaA() {
        return vitaminaA;
    }

    public void setVitaminaA(Float vitaminaA) {
        Float oldVitaminaA = this.vitaminaA;
        this.vitaminaA = vitaminaA;
        changeSupport.firePropertyChange("vitaminaA", oldVitaminaA, vitaminaA);
    }

    public Float getVitaminaB6() {
        return vitaminaB6;
    }

    public void setVitaminaB6(Float vitaminaB6) {
        Float oldVitaminaB6 = this.vitaminaB6;
        this.vitaminaB6 = vitaminaB6;
        changeSupport.firePropertyChange("vitaminaB6", oldVitaminaB6, vitaminaB6);
    }

    public Float getVitaminaB12() {
        return vitaminaB12;
    }

    public void setVitaminaB12(Float vitaminaB12) {
        Float oldVitaminaB12 = this.vitaminaB12;
        this.vitaminaB12 = vitaminaB12;
        changeSupport.firePropertyChange("vitaminaB12", oldVitaminaB12, vitaminaB12);
    }

    public Float getVitaminaC() {
        return vitaminaC;
    }

    public void setVitaminaC(Float vitaminaC) {
        Float oldVitaminaC = this.vitaminaC;
        this.vitaminaC = vitaminaC;
        changeSupport.firePropertyChange("vitaminaC", oldVitaminaC, vitaminaC);
    }

    public Float getVitaminaD() {
        return vitaminaD;
    }

    public void setVitaminaD(Float vitaminaD) {
        Float oldVitaminaD = this.vitaminaD;
        this.vitaminaD = vitaminaD;
        changeSupport.firePropertyChange("vitaminaD", oldVitaminaD, vitaminaD);
    }

    public Float getVitaminaE() {
        return vitaminaE;
    }

    public void setVitaminaE(Float vitaminaE) {
        Float oldVitaminaE = this.vitaminaE;
        this.vitaminaE = vitaminaE;
        changeSupport.firePropertyChange("vitaminaE", oldVitaminaE, vitaminaE);
    }

    public Float getVitaminaK() {
        return vitaminaK;
    }

    public void setVitaminaK(Float vitaminaK) {
        Float oldVitaminaK = this.vitaminaK;
        this.vitaminaK = vitaminaK;
        changeSupport.firePropertyChange("vitaminaK", oldVitaminaK, vitaminaK);
    }

    public Float getAlmidon() {
        return almidon;
    }

    public void setAlmidon(Float almidon) {
        Float oldAlmidon = this.almidon;
        this.almidon = almidon;
        changeSupport.firePropertyChange("almidon", oldAlmidon, almidon);
    }

    public Float getLactosa() {
        return lactosa;
    }

    public void setLactosa(Float lactosa) {
        Float oldLactosa = this.lactosa;
        this.lactosa = lactosa;
        changeSupport.firePropertyChange("lactosa", oldLactosa, lactosa);
    }

    public Float getAlcohol() {
        return alcohol;
    }

    public void setAlcohol(Float alcohol) {
        Float oldAlcohol = this.alcohol;
        this.alcohol = alcohol;
        changeSupport.firePropertyChange("alcohol", oldAlcohol, alcohol);
    }

    public Float getCafeina() {
        return cafeina;
    }

    public void setCafeina(Float cafeina) {
        Float oldCafeina = this.cafeina;
        this.cafeina = cafeina;
        changeSupport.firePropertyChange("cafeina", oldCafeina, cafeina);
    }

    public Float getAzucares() {
        return azucares;
    }

    public void setAzucares(Float azucares) {
        Float oldAzucares = this.azucares;
        this.azucares = azucares;
        changeSupport.firePropertyChange("azucares", oldAzucares, azucares);
    }

    public Float getCalcio() {
        return calcio;
    }

    public void setCalcio(Float calcio) {
        Float oldCalcio = this.calcio;
        this.calcio = calcio;
        changeSupport.firePropertyChange("calcio", oldCalcio, calcio);
    }

    public Float getHierro() {
        return hierro;
    }

    public void setHierro(Float hierro) {
        Float oldHierro = this.hierro;
        this.hierro = hierro;
        changeSupport.firePropertyChange("hierro", oldHierro, hierro);
    }

    public Float getMagnesio() {
        return magnesio;
    }

    public void setMagnesio(Float magnesio) {
        Float oldMagnesio = this.magnesio;
        this.magnesio = magnesio;
        changeSupport.firePropertyChange("magnesio", oldMagnesio, magnesio);
    }

    public Float getFosforo() {
        return fosforo;
    }

    public void setFosforo(Float fosforo) {
        Float oldFosforo = this.fosforo;
        this.fosforo = fosforo;
        changeSupport.firePropertyChange("fosforo", oldFosforo, fosforo);
    }

    public Float getPotasio() {
        return potasio;
    }

    public void setPotasio(Float potasio) {
        Float oldPotasio = this.potasio;
        this.potasio = potasio;
        changeSupport.firePropertyChange("potasio", oldPotasio, potasio);
    }

    public Float getZinc() {
        return zinc;
    }

    public void setZinc(Float zinc) {
        Float oldZinc = this.zinc;
        this.zinc = zinc;
        changeSupport.firePropertyChange("zinc", oldZinc, zinc);
    }

    public Float getCobre() {
        return cobre;
    }

    public void setCobre(Float cobre) {
        Float oldCobre = this.cobre;
        this.cobre = cobre;
        changeSupport.firePropertyChange("cobre", oldCobre, cobre);
    }

    public Float getFluor() {
        return fluor;
    }

    public void setFluor(Float fluor) {
        Float oldFluor = this.fluor;
        this.fluor = fluor;
        changeSupport.firePropertyChange("fluor", oldFluor, fluor);
    }

    public Float getMagneso() {
        return magneso;
    }

    public void setMagneso(Float magneso) {
        Float oldMagneso = this.magneso;
        this.magneso = magneso;
        changeSupport.firePropertyChange("magneso", oldMagneso, magneso);
    }

    public Float getSelenio() {
        return selenio;
    }

    public void setSelenio(Float selenio) {
        Float oldSelenio = this.selenio;
        this.selenio = selenio;
        changeSupport.firePropertyChange("selenio", oldSelenio, selenio);
    }

    public Float getTiamina() {
        return tiamina;
    }

    public void setTiamina(Float tiamina) {
        Float oldTiamina = this.tiamina;
        this.tiamina = tiamina;
        changeSupport.firePropertyChange("tiamina", oldTiamina, tiamina);
    }

    public Float getRiboflavina() {
        return riboflavina;
    }

    public void setRiboflavina(Float riboflavina) {
        Float oldRiboflavina = this.riboflavina;
        this.riboflavina = riboflavina;
        changeSupport.firePropertyChange("riboflavina", oldRiboflavina, riboflavina);
    }

    public Float getNiacina() {
        return niacina;
    }

    public void setNiacina(Float niacina) {
        Float oldNiacina = this.niacina;
        this.niacina = niacina;
        changeSupport.firePropertyChange("niacina", oldNiacina, niacina);
    }

    public Float getAcidoPantotenico() {
        return acidoPantotenico;
    }

    public void setAcidoPantotenico(Float acidoPantotenico) {
        Float oldAcidoPantotenico = this.acidoPantotenico;
        this.acidoPantotenico = acidoPantotenico;
        changeSupport.firePropertyChange("acidoPantotenico", oldAcidoPantotenico, acidoPantotenico);
    }

    public Float getFlotato() {
        return flotato;
    }

    public void setFlotato(Float flotato) {
        Float oldFlotato = this.flotato;
        this.flotato = flotato;
        changeSupport.firePropertyChange("flotato", oldFlotato, flotato);
    }

    public Float getAcidoFolico() {
        return acidoFolico;
    }

    public void setAcidoFolico(Float acidoFolico) {
        Float oldAcidoFolico = this.acidoFolico;
        this.acidoFolico = acidoFolico;
        changeSupport.firePropertyChange("acidoFolico", oldAcidoFolico, acidoFolico);
    }

    public Float getGrasasTrans() {
        return grasasTrans;
    }

    public void setGrasasTrans(Float grasasTrans) {
        Float oldGrasasTrans = this.grasasTrans;
        this.grasasTrans = grasasTrans;
        changeSupport.firePropertyChange("grasasTrans", oldGrasasTrans, grasasTrans);
    }

    public Float getGrasasSaturadas() {
        return grasasSaturadas;
    }

    public void setGrasasSaturadas(Float grasasSaturadas) {
        Float oldGrasasSaturadas = this.grasasSaturadas;
        this.grasasSaturadas = grasasSaturadas;
        changeSupport.firePropertyChange("grasasSaturadas", oldGrasasSaturadas, grasasSaturadas);
    }

    public Float getGrasasMonoinsturadas() {
        return grasasMonoinsturadas;
    }

    public void setGrasasMonoinsturadas(Float grasasMonoinsturadas) {
        Float oldGrasasMonoinsturadas = this.grasasMonoinsturadas;
        this.grasasMonoinsturadas = grasasMonoinsturadas;
        changeSupport.firePropertyChange("grasasMonoinsturadas", oldGrasasMonoinsturadas, grasasMonoinsturadas);
    }

    public Float getGrasasPoliinsaturadas() {
        return grasasPoliinsaturadas;
    }

    public void setGrasasPoliinsaturadas(Float grasasPoliinsaturadas) {
        Float oldGrasasPoliinsaturadas = this.grasasPoliinsaturadas;
        this.grasasPoliinsaturadas = grasasPoliinsaturadas;
        changeSupport.firePropertyChange("grasasPoliinsaturadas", oldGrasasPoliinsaturadas, grasasPoliinsaturadas);
    }

    public Float getCloruro() {
        return cloruro;
    }

    public void setCloruro(Float cloruro) {
        Float oldCloruro = this.cloruro;
        this.cloruro = cloruro;
        changeSupport.firePropertyChange("cloruro", oldCloruro, cloruro);
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

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
