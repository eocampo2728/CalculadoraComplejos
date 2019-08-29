/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.calculadoracomplejos1;

/**
 *
 * @author 2120046
 */
public class NumeroComplejo {
    public double pReal;
    public double pImaginaria;
    
    public NumeroComplejo(double real, double imaginario){
        pReal = real;
        pImaginaria = imaginario;
    }
    
    /**
     * este metodo es para saber si dos numeros complejos son iguales.
     * @param n1 Numero complejo con el que se quiere comparar.
     * @return Booleano que dice si son iguales o no.
     */
    public boolean equals(NumeroComplejo n1){
        if (n1.getParteReal() == this.getParteReal() && n1.getParteImaginaria() == this.getParteImaginaria()){
            return true;
        }
        return false;
    }
    
    public double getParteReal(){
        return pReal;
    }
    
    public double getParteImaginaria(){
        return pImaginaria;
    }
}
