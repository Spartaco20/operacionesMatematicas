/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.operaciones.modelo;

/**
 *
 * @author HP
 */
public class OperacionesMatematicas {
    
    private int valorA;
    private int valorB;
    private String action = "";
    private int resultado = 0;

    public OperacionesMatematicas() {
    }

    public OperacionesMatematicas(int valorA, int valorB, String action, int resultado){
        this.valorA = valorA;
        this.valorB = valorB;
        this.resultado = resultado;
        this.action = action;
    }
    
    public void suma() {
        this.resultado = this.valorA + this.valorB;
    }
    
    public void resta() {
        this.resultado = this.valorA - this.valorB;
    }
    
    public void multiplicacion() {
        this.resultado = this.valorA * this.valorB;
    }
    
    public void division() {
        this.resultado = this.valorA / this.valorB;
    }
    
    public int getValorA() {
        return valorA;
    }

    public void setValorA(int valorA) {
        this.valorA = valorA;
    }

    public int getValorB() {
        return valorB;
    }

    public void setValorB(int valorB) {
        this.valorB = valorB;
    }

    public int getResultado() {
        return resultado;
    }

    public void setResultado(int resultado) {
        this.resultado = resultado;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }
    
}
