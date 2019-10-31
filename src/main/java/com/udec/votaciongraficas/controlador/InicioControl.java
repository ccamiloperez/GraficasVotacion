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
    
    
    public InicioControl() {
    }
    @PostConstruct
    public void init(){
    
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
}
