/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.udec.votaciongraficas.controlador;

import java.io.Serializable;
import javax.annotation.PostConstruct;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import org.primefaces.model.chart.PieChartModel;



/**
 * Esta clase constituye el control de la pagina inicio
 * @author Cristian Perez
 * @author Julian Arias
 */
@Named(value = "inicioControl")
@SessionScoped
public class InicioControl implements Serializable {
    /**
     * variables que almacenan el numero de votos por cada candidato
     */
    private int candidatoA=0;
    private int candidatoB=0;
    private int candidatoC=0;
    /**
     * grafico circular
     */
    private PieChartModel grafica;
    
    /**
     * Metodo postconstuct que inicia la grafica circular
     */
    @PostConstruct
    public void init(){
        graficarVotos();
    }

    public PieChartModel getGrafica() {
        return grafica;
    }

    public void setGrafica(PieChartModel grafica) {
        this.grafica = grafica;
    }
    
    public int getCandidatoA() {
        return candidatoA;
    }

    public void setCandidatoA(int candidatoA) {
        this.candidatoA = candidatoA;
    }

    public int getCandidatoB() {
        return candidatoB;
    }

    public void setCandidatoB(int candidatoB) {
        this.candidatoB = candidatoB;
    }

    public int getCandidatoC() {
        return candidatoC;
    }

    public void setCandidatoC(int candidatoC) {
        this.candidatoC = candidatoC;
    }
    /**
     * metodo que suma los votos del candidato A
     */
    public void sumarVotosA(){
        setCandidatoA(getCandidatoA()+1);
    }
    /**
     * Metodo que suma los votos del candidato B
     */
    public void sumarVotosB(){
        setCandidatoB(getCandidatoB()+1);
    
    }
    /**
     * Metodo que suma los votos del candidato C
     */
    public void sumarVotosC(){
        setCandidatoC(getCandidatoC()+1);

    }
    /**
     * Metodo que crea la grafica de los votos parciales
     */
    public void graficarVotos() {
        grafica = new PieChartModel();
        grafica.set("Juan Gonzalez", getCandidatoA());
        grafica.set("Alberto Morales", getCandidatoB());
        grafica.set("Camilo Lopez", getCandidatoC());
   
        grafica.setTitle("Resultados Parciales");
        grafica.setLegendPosition("w");
        grafica.setShadow(false);
    }
}