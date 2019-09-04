/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.calculadoracomplejos1;

import java.lang.Math;

/**
 *
 * @author 2120046
 */
public class Calculadora {

      
    /**
     * Este metodo suma dos numeros complejos.
     * @param n1 primer numero complejo.
     * @param n2 segundo numero complejo.
     * @return El numero complejo resultado de la suma.
     */
    public static NumeroComplejo suma(NumeroComplejo n1, NumeroComplejo n2){
        double pReal;
        double pImaginaria;
        
        pReal = n1.getParteReal() + n2.getParteReal();
        pImaginaria = n1.getParteImaginaria() + n2.getParteImaginaria();
        
        return new NumeroComplejo(pReal,pImaginaria);
    }
    
    /**
     * Este metodo multiplica dos numeros complejos.
     * @param n1 primer numero complejo.
     * @param n2 segundo numero complejo.
     * @return El numero complejo resultado de la multiplicacion.
     */
    public static NumeroComplejo producto(NumeroComplejo n1, NumeroComplejo n2){
        double pReal;
        double pImaginaria;
        
        pReal = (n1.getParteReal() * n2.getParteReal()) - (n1.getParteImaginaria() * n2.getParteImaginaria()) ;
        pImaginaria = (n1.getParteImaginaria() * n2.getParteReal()) + (n1.getParteReal() * n2.getParteImaginaria());
        
        return new NumeroComplejo(pReal,pImaginaria);
    }
    
    /**
     * Este metodo resta dos numeros complejos(n1-n2). 
     * @param n1 primer numero complejo.
     * @param n2 segundo numero complejo.
     * @return El numero complejo resultado de la resta.
     */
    public static NumeroComplejo resta(NumeroComplejo n1, NumeroComplejo n2){
        double pReal;
        double pImaginaria;
        
        pReal = n1.getParteReal() - n2.getParteReal();
        pImaginaria = n1.getParteImaginaria() - n2.getParteImaginaria();
        
        return new NumeroComplejo(pReal,pImaginaria); 
    }
    
    /**
     * Este metodo divide dos numeros complejos(n1/n2).
     * @param n1 primer numero complejo.
     * @param n2 segundo numero complejo.
     * @return El numero complejo resultado de la division.
     */
    public static NumeroComplejo division(NumeroComplejo n1, NumeroComplejo n2){
        double pReal;
        double pImaginaria;
        double div;
        
        pReal = (n1.getParteReal()*n2.getParteReal())+(n1.getParteImaginaria()*n2.getParteImaginaria());
        pImaginaria = (n1.getParteImaginaria()*n2.getParteReal()) - (n2.getParteImaginaria()*n1.getParteReal());
        
        div = (n2.getParteReal()*n2.getParteReal()) + (n2.getParteImaginaria()*n2.getParteImaginaria());
        
        pReal = pReal/div;
        pImaginaria = pImaginaria/div;
        
        return new NumeroComplejo(pReal,pImaginaria);
    }
    
    /**
     * Este metodo calcula el modulo de un numero complejo.
     * @param n1 Numero complejo al que se le quiere saber el modulo.
     * @return El modulo del numero complejo.
     */
    public static double modulo(NumeroComplejo n1){
        double modulo;
        
        modulo = Math.sqrt((n1.getParteReal()*n1.getParteReal())+(n1.getParteImaginaria()*n1.getParteImaginaria()));        
        modulo = Math.round(modulo * 100);
        modulo = modulo / 100 ;
        
        return (modulo) ;
    }
    
    /**
     * Este metodo calcula el conjugado de un numero complejo.
     * @param n1 Numero complejo al que se le quiere saber el conjugado.
     * @return El numero complejo conjugado
     */
    public static NumeroComplejo conjugado(NumeroComplejo n1){
        return new NumeroComplejo(n1.getParteReal(),-n1.getParteImaginaria());
    }
    
    /**
     * Este metodo calcula las coordenadas polares de un numero complejo.
     * @param n1 Numero complejo al que se le quiere saber su equivalencia en coordenadas polares.
     * @return La coordenada polar como string
     */
    public static String polar(NumeroComplejo n1){
        double modulo;
        double fase;
        
        modulo = modulo(n1);
        fase = fase(n1);
        
        return (Double.toString(modulo)+","+Double.toString(fase));
    }
    
    /**
     * Este metodo calcula la fase de un numero complejo.
     * @param n1 El numero complejo al que se le quiere saber la fase.
     * @return La fase del numero complejo.
     */
    public static double fase(NumeroComplejo n1){
        double fase;
        
        fase = (Math.atan(n1.getParteImaginaria()/n1.getParteReal()));
        fase = Math.round(fase * 100);
        fase = fase / 100 ;
        
        return fase;
    }
    
    public static NumeroComplejo numeroComplejoInverso(NumeroComplejo n1){
        return new NumeroComplejo(-n1.getParteReal(), -n1.getParteImaginaria());
    }
    
    public static void main(String[] args) {
        
        
    }
    
}
