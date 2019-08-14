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
    
    NumeroComplejo(double real, double imaginario){
        pReal = real;
        pImaginaria = imaginario;
    }
    
    @Override
    public String toString(){
        return ("("+Double.toString(pReal)+","+Double.toString(pImaginaria)+")");
    }
    
    public double getParteReal(){
        return pReal;
    }
    
    public double getParteImaginaria(){
        return pImaginaria;
    }
}
