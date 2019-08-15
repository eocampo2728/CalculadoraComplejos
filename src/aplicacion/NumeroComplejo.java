package aplicacion;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


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
