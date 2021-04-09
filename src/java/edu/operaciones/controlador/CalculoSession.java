/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.operaciones.controlador;

import edu.operaciones.modelo.OperacionesMatematicas;
import java.io.Serializable;
import java.util.ArrayList;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author HP
 */
@ManagedBean
@SessionScoped
public class CalculoSession implements Serializable {

    OperacionesMatematicas objOm = new OperacionesMatematicas();
    private ArrayList<OperacionesMatematicas> listaResultados = new ArrayList<>();

    /**
     * Creates a new instance of CalculoSession
     */
    public CalculoSession() {
    }

    public void opSuma() {
        try {
            objOm.setAction("Suma");
            objOm.suma();
            OperacionesMatematicas objNew = new OperacionesMatematicas(objOm.getValorA(), objOm.getValorB(), objOm.getAction(), objOm.getResultado());
            listaResultados.add(objNew);
        } catch (Exception e) {
            e.getMessage();
        }
        objOm = new OperacionesMatematicas();
    }

    public void opResta() {
        try {
            objOm.setAction("Resta");
            objOm.resta();
            OperacionesMatematicas objNew = new OperacionesMatematicas(objOm.getValorA(), objOm.getValorB(), objOm.getAction(), objOm.getResultado());
            listaResultados.add(objNew);
        } catch (Exception e) {
            e.getMessage();
        }
        objOm = new OperacionesMatematicas();
    }

    public void opMultiplicacion() {
        try {
            objOm.setAction("Multiplicacion");
            objOm.multiplicacion();
            OperacionesMatematicas objNew = new OperacionesMatematicas(objOm.getValorA(), objOm.getValorB(), objOm.getAction(), objOm.getResultado());
            listaResultados.add(objNew);
        } catch (Exception e) {
            e.getMessage();
        }
        objOm = new OperacionesMatematicas();
    }

    public void opDivision() {
        try {
            objOm.setAction("Division");
            objOm.division();
            OperacionesMatematicas objNew = new OperacionesMatematicas(objOm.getValorA(), objOm.getValorB(), objOm.getAction(), objOm.getResultado());
            listaResultados.add(objNew);
        } catch (Exception e) {
            e.getMessage();
        }
        objOm = new OperacionesMatematicas();
    }

    public OperacionesMatematicas getObjOm() {
        return objOm;
    }

    public void setObjOm(OperacionesMatematicas objOm) {
        this.objOm = objOm;
    }

    public ArrayList<OperacionesMatematicas> getListaResultados() {
        return listaResultados;
    }

    public void setListaResultados(ArrayList<OperacionesMatematicas> listaResultados) {
        this.listaResultados = listaResultados;
    }
}
