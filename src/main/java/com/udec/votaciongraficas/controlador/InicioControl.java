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
 *
 * @author ASUS
 */
@Named(value = "inicioControl")
@SessionScoped
public class InicioControl implements Serializable {
    private int candidatoA=0;
    private int candidatoB=0;
    private int candidatoC=0;
    
    private PieChartModel grafica;
    
    public InicioControl() {
    }
    @PostConstruct
    public void init(){
        graficar();
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

      
    public void sumarVotosA(){
        setCandidatoA(getCandidatoA()+1);
    }
    public void sumarVotosB(){
        setCandidatoB(getCandidatoB()+1);
    
    }
    public void sumarVotosC(){
        setCandidatoC(getCandidatoC()+1);

    }
    public void graficar() {
        grafica = new PieChartModel();
        grafica.set("Juan Gonzalez", getCandidatoA());
        grafica.set("Alberto Morales", getCandidatoB());
        grafica.set("Camilo Lopez", getCandidatoC());
   
        grafica.setTitle("Resultados de las votaciones");
        grafica.setLegendPosition("w");
        grafica.setShadow(false);
    }
    
}
