/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.calculadoracomplejos;

/**
 *
 * @author Eduardo Ocampo
 */
public class MatrizCompleja {
    
    private NumeroComplejo[][] matriz;

    public MatrizCompleja(int i, int j){
        matriz = new NumeroComplejo[i][j];
    }

    public MatrizCompleja(NumeroComplejo[][] matrix){
        this.matriz = matrix;
    }
    
    /**
     * Agregar un numero complejo a una matriz
     * @param i Posicion i en la matriz
     * @param j Posicion j en la matriz
     * @param numero Numero a agregar
     */
    public void agregar(int i, int j, NumeroComplejo numero){
        matriz[i][j] = numero;
    }
    
    /**
     * Este metodo suma dos matrices complejsa
     * @param m1 Matriz que se decea sumar
     * @return Matriz resultado de la suma
     */
    public MatrizCompleja suma(MatrizCompleja m1){
        NumeroComplejo[][] resultado = new NumeroComplejo[matriz.length][matriz[0].length];
        for(int i = 0; i< matriz.length; i++){
            for(int j = 0; j< matriz[0].length; j++){
                resultado[i][j] = matriz[i][j].suma(m1.getMatriz()[i][j]); 
            }
        }
        return new MatrizCompleja(resultado);
    }
    
    /**
     * Este metodo resta dos matrices complejas
     * @param m1 Matriz que se decea restar
     * @return Matriz resultado de la resta
     */
    public MatrizCompleja resta(MatrizCompleja m1){
        NumeroComplejo[][] resultado = new NumeroComplejo[matriz.length][matriz[0].length];
        for(int i = 0; i< matriz.length; i++){
            for(int j = 0; j< matriz[0].length; j++){
                resultado[i][j] = matriz[i][j].resta(m1.getMatriz()[i][j]);
            }
        }
        return new MatrizCompleja(resultado);
    }
    
    /**
     * Este metodo hace el producto escalar con un vector o una matriz
     * @param n1 Numero complejo que se quiere multiplicar por la matriz
     * @return Matriz resutado del producto escalar con la matriz.
     */
    public MatrizCompleja productoEscalar(NumeroComplejo n1){
        NumeroComplejo[][] resultado = new NumeroComplejo[matriz.length][matriz[0].length];
        for(int i = 0; i<matriz.length;i++){
            for(int j = 0; j<matriz[0].length;j++){
                resultado[i][j] = matriz[i][j].producto(n1);
            }
        }
        return new MatrizCompleja(resultado);
    }
    
    /**
     * Este metodo hace la matriz traspuesta
     * @return La matriz transpuesta
     */
    public MatrizCompleja transpuesta(){
        NumeroComplejo[][] resultado = new NumeroComplejo[matriz[0].length][matriz.length];
        for(int i = 0; i< matriz.length; i++){
            for(int j = 0; j< matriz[0].length; j++){
                resultado[j][i] = matriz[i][j];
            }
        }
        return new MatrizCompleja(resultado);
    }
    
    /**
     * Este metodo hace la matriz conjugada
     * @return La matriz conjugada
     */
    public MatrizCompleja conjugada(){
        NumeroComplejo[][] resultado = new NumeroComplejo[matriz.length][matriz[0].length];
        for(int i = 0; i< matriz.length; i++){
            for(int j = 0; j< matriz[0].length; j++){
                resultado[i][j] = matriz[i][j].conjugado();
            }
        }
        return new MatrizCompleja(resultado);
    }
    
    /**
     * Este metodo hace la matriz adjunta
     * @return la matriz adjunta
     */
    public MatrizCompleja adjunta(){
        return this.transpuesta().conjugada();
    }
    
    /**
     * Este metodo calcula la norma
     * @return La norma de una matriz
     */
    public Double norma(){
        Double temp = 0.0;
        for(int i = 0; i < matriz.length; i++){
            for(int j = 0; j < matriz[0].length; j++){
                //resultado = resultado.sum(matrix[i][j].power(2));
                temp+=Math.pow(matriz[i][j].norma(),2);
            }
        }
        return  Math.sqrt(temp);
    }
    
    /**
     * Este metodo calcula la distancia entre dos matrices
     * @param m1 Matriz con la que se decea comparar
     * @return Distancia entre las dos matrices
     */
    public Double distancia(MatrizCompleja m1){
        return this.resta(m1).norma();
    }
    
    /**
     * Este metodo dice si una materia es hermitian o no
     * @return Si la matriz es hermitian o no
     */
    public boolean Hermitian(){
        if(this.equals(this.adjunta())){
            return true;
        }else{
            return false;
        }
    }
    
    public boolean equals(MatrizCompleja m1){
        boolean bandera = true;
        for(int i = 0; i< matriz.length && bandera; i++){
            for(int j = 0; j< matriz[0].length && bandera; j++){
                if(!matriz[i][j].equals(m1.getMatriz()[i][j])){
                    bandera = false;
                }
            }
        }
        return bandera;
    }
    
    public NumeroComplejo[][] getMatriz(){
        return matriz;
    }
}
