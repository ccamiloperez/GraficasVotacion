/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.udec.votaciongraficas.controlador;

import javax.inject.Named;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;

/**
 *Este metodo constituye el control de la pagina resultado
 * @author ASUS
 */
@Named(value = "resultadoControl")
@RequestScoped
public class ResultadoControl {
    /**
     * injeccion de dependencias de la pagina inicio
     */
    @Inject
    private InicioControl inicio;
    /**
     * variable que almacena el nombre del ganador
     */
    private String ganador;
    /**
     * variable que almacena el total de votos
     */
    private int total;
    /**
     * Constructor vacio
     */
    public ResultadoControl() {
    }

    public String getGanador() {
        return ganador;
    }

    public void setGanador(String ganador) {
        this.ganador = ganador;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public InicioControl getInicio() {
        return inicio;
    }

    public void setInicio(InicioControl inicio) {
        this.inicio = inicio;
    }
    /**
     * Metodo para obtener el candidato ganador de las votaciones
     * @return string ganador
     */
     public String ganador(){
        if(inicio.getCandidatoA()==inicio.getCandidatoB() && inicio.getCandidatoB()==inicio.getCandidatoC()){
            ganador="Ninguno, hubo empate"; 
        
        }else{
        if (inicio.getCandidatoA() > inicio.getCandidatoB() && inicio.getCandidatoA() > inicio.getCandidatoC()) {
            ganador = "Juan Gonzalez";
        } else if (inicio.getCandidatoB() > inicio.getCandidatoA() && inicio.getCandidatoB() > inicio.getCandidatoC()) {
            ganador = "Alberto morales";
        } else {
            ganador = "Camilo Lopez";
        }
        }
        return ganador;
    }
     /**
      * Metodo que retorna el total de votos efectuados
      * @return int total
      */
     public int totalVotos(){
         total=inicio.getCandidatoA()+inicio.getCandidatoB()+inicio.getCandidatoC();
         return total;
     }
}
