package tests;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import calculadoracomplejos.*;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Eduardo Ocampo
 */
public class CalculadoraComplejosTest {
    
    @Test
    public void suma(){
        NumeroComplejo n1 = new NumeroComplejo(5,2);
        NumeroComplejo n2 = new NumeroComplejo(6,8);
        NumeroComplejo res = new NumeroComplejo(11,10);
        
        assertTrue(n1.suma(n2).equals(res));
    } 
    
    @Test
    public void producto(){
        NumeroComplejo n1 = new NumeroComplejo(0,1);
        NumeroComplejo n2 = new NumeroComplejo(0,1);
        NumeroComplejo res = new NumeroComplejo(-1,0);
        
        assertTrue(n1.producto(n2).equals(res));
    }
    
    @Test
    public void resta(){
        NumeroComplejo n1 = new NumeroComplejo(5,10);
        NumeroComplejo n2 = new NumeroComplejo(2,5);
        NumeroComplejo res = new NumeroComplejo(3,5);
        
        assertTrue(n1.resta(n2).equals(res));
    }
    
    @Test
    public void division(){
        NumeroComplejo n1 = new NumeroComplejo(3,5);
        NumeroComplejo n2 = new NumeroComplejo(1,-1);
        NumeroComplejo res = new NumeroComplejo(-1,4);
        
        assertTrue(n1.division(n2).equals(res));
    }
    
    @Test
    public void modulo(){
        NumeroComplejo n1 = new NumeroComplejo(3,5);
        double res = 5.83;
        
        assertTrue(n1.modulo()== res);
    }
    
    @Test
    public void conjugado(){
        NumeroComplejo n1 = new NumeroComplejo(3,5);
        NumeroComplejo res = new NumeroComplejo(3,-5);
        
        assertTrue(n1.conjugado().equals(res));
    }
    
    @Test
    public void polar(){
        NumeroComplejo n1 = new NumeroComplejo(3,5);
        String res = "5.83,1.03";
        
        assertTrue(n1.polar().equals(res));
    }
    
    @Test
    public void fase(){
        NumeroComplejo n1 = new NumeroComplejo(3,5);
        double res = 1.03;
        
        assertTrue(n1.fase()== res);
    }
    
    @Test
    public void adicionVector(){
        NumeroComplejo n1 = new NumeroComplejo(3,5);
        double res = 1.03;
        
        assertTrue(n1.fase()== res);
    }
    
    

    NumeroComplejo c1 = new NumeroComplejo(3,2);
    NumeroComplejo c2 = new NumeroComplejo(-1,3);
    NumeroComplejo c3 = new NumeroComplejo(-10,-7);
    NumeroComplejo c4 = new NumeroComplejo(9,-8);

    MatrizCompleja cm1 = new MatrizCompleja(new NumeroComplejo[][]{{c1,c2},{c3,c4}});

    NumeroComplejo c5 = new NumeroComplejo(-2,2);
    NumeroComplejo c6 = new NumeroComplejo(6,3);
    NumeroComplejo c7 = new NumeroComplejo(-4,-3);
    NumeroComplejo c8 = new NumeroComplejo(2,-3);

    MatrizCompleja cm2 = new MatrizCompleja(new NumeroComplejo[][]{{c5,c6},{c7,c8}});

    @Test
    public void sumaMatriz() {
        NumeroComplejo t1 = new NumeroComplejo(1,4);
        NumeroComplejo t2 = new NumeroComplejo(5,6);
        NumeroComplejo t3 = new NumeroComplejo(-14,-10);
        NumeroComplejo t4 = new NumeroComplejo(11,-11);

        MatrizCompleja tm1 = new MatrizCompleja(new NumeroComplejo[][]{{t1,t2},{t3,t4}});
        assertTrue(tm1.equals(cm1.suma(cm2)));
    }

    @Test
    public void restaMatriz() {
        NumeroComplejo t1 = new NumeroComplejo(5,0);
        NumeroComplejo t2 = new NumeroComplejo(-7,0);
        NumeroComplejo t3 = new NumeroComplejo(-6,-4);
        NumeroComplejo t4 = new NumeroComplejo(7,-5);

        MatrizCompleja tm1 = new MatrizCompleja(new NumeroComplejo[][]{{t1,t2},{t3,t4}});
        assertTrue(tm1.equals(cm1.resta(cm2)));
    }
    
    @Test
    public void productoMatriz() {
        NumeroComplejo t1 = new NumeroComplejo(3,-7);
        NumeroComplejo t2 = new NumeroComplejo(19,30);
        NumeroComplejo t3 = new NumeroComplejo(-26,-1);
        NumeroComplejo t4 = new NumeroComplejo(-45,-115);

        MatrizCompleja tm1 = new MatrizCompleja(new NumeroComplejo[][]{{t1,t2},{t3,t4}});
        assertTrue(tm1.equals(cm1.producto(cm2)));
    }
    
    @Test
    public void productoEscalarMatriz() {
        NumeroComplejo t1 = new NumeroComplejo(12,-5);
        NumeroComplejo t2 = new NumeroComplejo(7,9);
        NumeroComplejo t3 = new NumeroComplejo(-41,16);
        NumeroComplejo t4 = new NumeroComplejo(-6,-43);
        MatrizCompleja tm1= new MatrizCompleja(new NumeroComplejo[][]{{t1,t2},{t3,t4}});
        assertTrue(tm1.equals(cm1.productoEscalar(new NumeroComplejo(2,-3))));
    }

    @Test
    public void transpuestaMatriz() {
        MatrizCompleja tm1 = new MatrizCompleja(new NumeroComplejo[][]{{c1,c3},{c2,c4}});
        assertTrue(tm1.equals(cm1.transpuesta()));
    }

    @Test
    public void conjugadaMatriz() {
        MatrizCompleja tm1 = new MatrizCompleja(new NumeroComplejo[][]{{c1.conjugado(),c2.conjugado()},
                                                                    {c3.conjugado(),c4.conjugado()}});
        assertTrue(tm1.equals(cm1.conjugada()));
    }

    @Test
    public void adjuntaMatriz() {
        MatrizCompleja tm1 = new MatrizCompleja(new NumeroComplejo[][]{{c1.conjugado(),c3.conjugado()},
                                                                    {c2.conjugado(),c4.conjugado()}});
        assertTrue(tm1.equals(cm1.adjunta()));
    }
    
    @Test
    public void tensorMatriz() {
        NumeroComplejo t1 = new NumeroComplejo(-10,2);
        NumeroComplejo t2 = new NumeroComplejo(12,21);
        NumeroComplejo t3 = new NumeroComplejo(-4,-8);
        NumeroComplejo t4 = new NumeroComplejo(-15,15);
        NumeroComplejo t5 = new NumeroComplejo(-6,-17);
        NumeroComplejo t6 = new NumeroComplejo(12,-5);
        NumeroComplejo t7 = new NumeroComplejo(13,-9);
        NumeroComplejo t8 = new NumeroComplejo(7,9);
        NumeroComplejo t9 = new NumeroComplejo(34,-6);
        NumeroComplejo t10 = new NumeroComplejo(-39,-72);
        NumeroComplejo t11 = new NumeroComplejo(-2,34);
        NumeroComplejo t12 = new NumeroComplejo(78,-21);
        NumeroComplejo t13 = new NumeroComplejo(19,58);
        NumeroComplejo t14 = new NumeroComplejo(-41,16);
        NumeroComplejo t15 = new NumeroComplejo(-60,5);
        NumeroComplejo t16 = new NumeroComplejo(-6,-43);
        MatrizCompleja tm1 = new MatrizCompleja(new NumeroComplejo[][]{{t1,t2,t3,t4},
                                                                    {t5,t6,t7,t8},
                                                                    {t9,t10,t11,t12},
                                                                    {t13,t14,t15,t16}});
        assertTrue(tm1.equals(cm1.tensor(cm2)));
    }

    @Test
    public void normaMatriz() {
        MatrizCompleja tm1 = new MatrizCompleja(new NumeroComplejo[][]{{c1,c2,c3,c4}});
        double ans = Math.sqrt(317);
        double comp = tm1.norma();
        assertEquals(ans,comp,0);
        
    }

    @Test
    public void distanciaMatriz() {
        MatrizCompleja tm1 = new MatrizCompleja(new NumeroComplejo[][]{{c1,c2,c3,c4}});
        MatrizCompleja tm2 = new MatrizCompleja(new NumeroComplejo[][]{{c5,c6,c7,c8}});
        double ans = Math.sqrt(200);
        double comp = tm1.distancia(tm2);
        assertEquals(ans,comp,0);
    }

    @Test
    public void hermitianMatriz() {
        NumeroComplejo t1 = new NumeroComplejo(2,0);
        NumeroComplejo t2 = new NumeroComplejo(2,1);
        NumeroComplejo t3 = new NumeroComplejo(4,0);
        NumeroComplejo t4 = new NumeroComplejo(2,-1);
        NumeroComplejo t5 = new NumeroComplejo(3,0);
        NumeroComplejo t6 = new NumeroComplejo(0,1);
        NumeroComplejo t7 = new NumeroComplejo(4,0);
        NumeroComplejo t8 = new NumeroComplejo(0,-1);
        NumeroComplejo t9 = new NumeroComplejo(1,0);
        assertTrue(new MatrizCompleja(new NumeroComplejo[][]{{t1,t2,t3},
                                                            {t4,t5,t6},
                                                            {t7,t8,t9}})
                .Hermitian());
    }

    @Test
    public void unitariaMatriz() {
        NumeroComplejo t1 = new NumeroComplejo(1,1);
        NumeroComplejo t2 = new NumeroComplejo(1,-1);
        MatrizCompleja complexMatrix = new MatrizCompleja(new NumeroComplejo[][]{{t1,t2},{t2,t1}});
        assertTrue(complexMatrix.productoEscalar(new NumeroComplejo(1.0/2.0,0)).isUnitary());
    }  
}