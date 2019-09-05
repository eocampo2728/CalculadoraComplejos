/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.calculadoracomplejos;

/**
 *
 * @author 2120046
 */
public class MatrizCompleja {
    
    private NumeroComplejo[][] matrix;

    public MatrizCompleja(int i, int j){
        matrix = new NumeroComplejo[i][j];
    }

    public MatrizCompleja(NumeroComplejo[][] matrix){
        this.matrix = matrix;
    }
    
    /**
     * Agregar un numero complejo
     * @param i Posicion i en la matriz
     * @param j Posicion j en la matriz
     * @param numero Numero a agregar
     */
    public void add(int i, int j, NumeroComplejo numero){
        matrix[i][j] = numero;
    }
    
}
