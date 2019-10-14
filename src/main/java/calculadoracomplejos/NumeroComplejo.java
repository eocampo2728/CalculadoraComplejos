/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadoracomplejos;

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
     * Este metodo suma dos numeros complejos.
     * @param n1 numero complejo.
     * @return El numero complejo resultado de la suma.
     */
    public NumeroComplejo suma(NumeroComplejo n1){
        
        return new NumeroComplejo(pReal+n1.getParteReal(),pImaginaria+n1.getParteImaginaria());
    }
    
    /**
     * Este metodo multiplica dos numeros complejos.
     * @param n1 primer numero complejo.
     * @return El numero complejo resultado de la multiplicacion.
     */
    public NumeroComplejo producto(NumeroComplejo n1){
        double real;
        double imaginaria;
        
        real = (n1.getParteReal() * this.pReal) - (n1.getParteImaginaria() * this.pImaginaria) ;
        imaginaria = (n1.getParteImaginaria() * this.pReal) + (n1.getParteReal() * this.pImaginaria);
        
        return new NumeroComplejo(real,imaginaria);
    }
    
    /**
     * Este metodo resta dos numeros complejos(n1-n2). 
     * @param n1 primer numero complejo.
     * @param n2 segundo numero complejo.
     * @return El numero complejo resultado de la resta.
     */
    public NumeroComplejo resta(NumeroComplejo n1){
        
        return new NumeroComplejo(pReal-n1.getParteReal(),pImaginaria-n1.getParteImaginaria());
    }
    
    /**
     * Este metodo divide dos numeros complejos(this/n1).
     * @param n1 primer numero complejo.
     * @return El numero complejo resultado de la division.
     */
    public NumeroComplejo division(NumeroComplejo n1){
        double real;
        double imaginaria;
        double div;
        
        real = (n1.getParteReal()*this.pReal)+(n1.getParteImaginaria()*this.pImaginaria);
        imaginaria = (n1.getParteReal()*this.pImaginaria) - (this.pReal*n1.getParteImaginaria());
        
        div = (n1.getParteReal()*n1.getParteReal()) + (n1.getParteImaginaria()*n1.getParteImaginaria());
        
        real = real/div;
        imaginaria = imaginaria/div;
        
        return new NumeroComplejo(real,imaginaria);
    }
    
    /**
     * Este metodo calcula el modulo de un numero complejo.
     * @return El modulo del numero complejo.
     */
    public double modulo(){
        double modulo;
        
        modulo = Math.sqrt((this.pReal*this.pReal)+(this.pImaginaria*this.pImaginaria));        
        modulo = Math.round(modulo * 100);
        modulo = modulo / 100 ;
        
        return (modulo) ;
    }
    
    /**
     * Este metodo calcula la fase de un numero complejo.
     * @return La fase del numero complejo.
     */
    public double fase(){
        double fase;
        
        fase = (Math.atan(this.pImaginaria/this.pReal));
        fase = Math.round(fase * 100);
        fase = fase / 100 ;
        
        return fase;
    }
    
    /**
     * Este metodo calcula el conjugado de un numero complejo.
     * @return El numero complejo conjugado
     */
    public NumeroComplejo conjugado(){
        return new NumeroComplejo(this.pReal,-this.pImaginaria);
    }
    
    /**
     * Este metodo calcula el Inverso de un numero complejo.
     * @return El numero complejo conjugado
     */
    public NumeroComplejo inverso(){
        return new NumeroComplejo(-this.pReal,-this.pImaginaria);
    }
    
    /**
     * Este metodo calcula las coordenadas polares de un numero complejo.
     * @return La coordenada polar como string
     */
    public String polar(){
        double modulo;
        double fase;
        
        modulo = modulo();
        fase = fase();
        
        return (Double.toString(modulo)+","+Double.toString(fase));
    }
    
    /**
     * Este metodo calcula la norma de un numero complejo.
     * @return Double que representa la norma
     */
    public Double norma(){
        return Math.sqrt((pReal*pReal)+(pImaginaria*pImaginaria));
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
    
    public NumeroComplejo productoEscalar(double num){
        return new NumeroComplejo(pReal*num, pImaginaria*num);
    }
    
    public double getParteReal(){
        return pReal;
    }
    
    public double getParteImaginaria(){
        return pImaginaria;
    }
}
