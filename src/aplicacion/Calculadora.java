package aplicacion;

import java.lang.Math;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author 2120046
 */
public class Calculadora {

    /**
     * @param args the command line arguments
     */
    
    public static NumeroComplejo suma(NumeroComplejo n1, NumeroComplejo n2){
        double pReal;
        double pImaginaria;
        
        pReal = n1.getParteReal() + n2.getParteReal();
        pImaginaria = n1.getParteImaginaria() + n2.getParteImaginaria();
        
        return new NumeroComplejo(pReal,pImaginaria);
    }
    
    public static NumeroComplejo producto(NumeroComplejo n1, NumeroComplejo n2){
        double pReal;
        double pImaginaria;
        
        pReal = (n1.getParteReal() * n2.getParteReal()) - (n1.getParteImaginaria() * n2.getParteImaginaria()) ;
        pImaginaria = (n1.getParteImaginaria() * n2.getParteReal()) + (n1.getParteReal() * n2.getParteImaginaria());
        
        return new NumeroComplejo(pReal,pImaginaria);
    }
    
    public static NumeroComplejo resta(NumeroComplejo n1, NumeroComplejo n2){
        double pReal;
        double pImaginaria;
        
        pReal = n1.getParteReal() - n2.getParteReal();
        pImaginaria = n1.getParteImaginaria() - n2.getParteImaginaria();
        
        return new NumeroComplejo(pReal,pImaginaria);
    }
    
    public static NumeroComplejo division(NumeroComplejo n1, NumeroComplejo n2){
        double pReal;
        double pImaginaria;
        double div;
        
        pReal = (n1.getParteReal()*n2.getParteReal())+(-(n1.getParteImaginaria()*n2.getParteImaginaria()));
        pImaginaria = (n1.getParteImaginaria()*n2.getParteReal()) + (n2.getParteImaginaria()*n1.getParteReal());
        
        div = (n2.getParteReal()*n2.getParteReal()) + (n2.getParteImaginaria()*n2.getParteImaginaria());
        
        pReal = pReal/div;
        pImaginaria = pImaginaria/div;
        
        return new NumeroComplejo(pReal,pImaginaria);
    }
    
    public static double modulo(NumeroComplejo n1){
        double modulo;
        
        modulo = Math.sqrt((n1.getParteReal()*n1.getParteReal())+(n1.getParteImaginaria()*n1.getParteImaginaria()));
        
        return modulo;
    }
    
    public static NumeroComplejo conjugado(NumeroComplejo n1){
        return new NumeroComplejo(n1.getParteReal(),-n1.getParteImaginaria());
    }
    
    public static void polar(NumeroComplejo n1){
        double modulo;
        double fase;
        
        modulo = Math.sqrt((n1.getParteReal()*n1.getParteReal())+(n1.getParteImaginaria()*n1.getParteImaginaria()));
        fase = 1/(Math.tan(n1.getParteImaginaria()/n1.getParteReal()));
        
    }
    
    public static void fase(NumeroComplejo n1, NumeroComplejo n2){
        double fase;
        
        fase = 1/(Math.tan(n1.getParteImaginaria()/n1.getParteReal()));
        
        
    }
    
    public static void main(String[] args) {
        
        
    }
    
}
