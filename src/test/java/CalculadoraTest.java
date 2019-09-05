/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import com.mycompany.calculadoracomplejos.*;
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
public class CalculadoraTest {
    
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

}