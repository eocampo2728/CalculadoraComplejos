/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tests;

import org.junit.Test;
import static org.junit.Assert.*;
import com.mycompany.calculadoracomplejos.*;


public class MatrizComplejaTest {

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
    public void suma() {
        NumeroComplejo t1 = new NumeroComplejo(1,4);
        NumeroComplejo t2 = new NumeroComplejo(5,6);
        NumeroComplejo t3 = new NumeroComplejo(-14,-10);
        NumeroComplejo t4 = new NumeroComplejo(11,-11);

        MatrizCompleja tm1 = new MatrizCompleja(new NumeroComplejo[][]{{t1,t2},{t3,t4}});
        assertTrue(tm1.equals(cm1.suma(cm2)));
    }

    @Test
    public void resta() {
        NumeroComplejo t1 = new NumeroComplejo(5,0);
        NumeroComplejo t2 = new NumeroComplejo(-7,0);
        NumeroComplejo t3 = new NumeroComplejo(-6,-4);
        NumeroComplejo t4 = new NumeroComplejo(7,-5);

        MatrizCompleja tm1 = new MatrizCompleja(new NumeroComplejo[][]{{t1,t2},{t3,t4}});
        assertTrue(tm1.equals(cm1.resta(cm2)));
    }

    @Test
    void traspose() {
        MatrizCompleja tm1 = new MatrizCompleja(new NumeroComplejo[][]{{c1,c3},{c2,c4}});
        assertTrue(tm1.equals(cm1.transpuesta()));
    }

    @Test
    void conjugate() {
        MatrizCompleja tm1 = new MatrizCompleja(new NumeroComplejo[][]{{c1.conjugado(),c2.conjugado()},
                                                                    {c3.conjugado(),c4.conjugado()}});
        assertTrue(tm1.equals(cm1.conjugada()));
    }

    @Test
    void adjoint() {
        MatrizCompleja tm1 = new MatrizCompleja(new NumeroComplejo[][]{{c1.conjugado(),c3.conjugado()},
                                                                    {c2.conjugado(),c4.conjugado()}});
        assertTrue(tm1.equals(cm1.adjunta()));
    }

    @Test
    void norm() {
        MatrizCompleja tm1 = new MatrizCompleja(new NumeroComplejo[][]{{c1,c2,c3,c4}});
        double ans = Math.sqrt(317);
        double comp = tm1.norma();
        assertEquals(ans,comp);
        
    }

    @Test
    void distance() {
        ComplexMatrix tm1 = new ComplexMatrix(new ComplexNumber[][]{{c1,c2,c3,c4}});
        ComplexMatrix tm2 = new ComplexMatrix(new ComplexNumber[][]{{c5,c6,c7,c8}});
        assertEquals(Math.sqrt(200),tm1.distance(tm2));
    }

    @Test
    void isHermitian() {
        ComplexNumber t1 = ComplexNumber.newComplexNumberAlgebraicForm(2,0);
        ComplexNumber t2 = ComplexNumber.newComplexNumberAlgebraicForm(2,1);
        ComplexNumber t3 = ComplexNumber.newComplexNumberAlgebraicForm(4,0);
        ComplexNumber t4 = ComplexNumber.newComplexNumberAlgebraicForm(2,-1);
        ComplexNumber t5 = ComplexNumber.newComplexNumberAlgebraicForm(3,0);
        ComplexNumber t6 = ComplexNumber.newComplexNumberAlgebraicForm(0,1);
        ComplexNumber t7 = ComplexNumber.newComplexNumberAlgebraicForm(4,0);
        ComplexNumber t8 = ComplexNumber.newComplexNumberAlgebraicForm(0,-1);
        ComplexNumber t9 = ComplexNumber.newComplexNumberAlgebraicForm(1,0);
        assertTrue(new ComplexMatrix(new ComplexNumber[][]{{t1,t2,t3},
                                                            {t4,t5,t6},
                                                            {t7,t8,t9}})
                .isHermitian());
    }

    @Test
    void isUnitary() {
        ComplexNumber t1 = ComplexNumber.newComplexNumberAlgebraicForm(1,1);
        ComplexNumber t2 = ComplexNumber.newComplexNumberAlgebraicForm(1,-1);
        ComplexMatrix complexMatrix = new ComplexMatrix(new ComplexNumber[][]{{t1,t2},{t2,t1}});
        assertTrue(complexMatrix.multiplyEscalar(ComplexNumber.newComplexNumberAlgebraicForm(1.0/2.0,0)).isUnitary());
    }

    @Test
    void multiplyEscalar() {
        ComplexNumber t1 = ComplexNumber.newComplexNumberAlgebraicForm(12,-5);
        ComplexNumber t2 = ComplexNumber.newComplexNumberAlgebraicForm(7,9);
        ComplexNumber t3 = ComplexNumber.newComplexNumberAlgebraicForm(-41,16);
        ComplexNumber t4 = ComplexNumber.newComplexNumberAlgebraicForm(-6,-43);
        ComplexMatrix tm1= new ComplexMatrix(new ComplexNumber[][]{{t1,t2},{t3,t4}});
        assertTrue(tm1.equals(cm1.multiplyEscalar(ComplexNumber.newComplexNumberAlgebraicForm(2,-3))));
    }

    @Test
    void varience() {
        assertTrue(ComplexNumber.newComplexNumberAlgebraicForm(0.25,0).equals( new ComplexMatrix(new ComplexNumber[][]{{
            ComplexNumber.newComplexNumberAlgebraicForm(1,0),
                ComplexNumber.newComplexNumberAlgebraicForm(0,-1)
        },{
            ComplexNumber.newComplexNumberAlgebraicForm(0,1),
                ComplexNumber.newComplexNumberAlgebraicForm(2,0)
        }}).varience(new ComplexMatrix(new ComplexNumber[][]{{
            ComplexNumber.newComplexNumberAlgebraicForm(Math.sqrt(2)/2.0,0)
        },{
            ComplexNumber.newComplexNumberAlgebraicForm(0,Math.sqrt(2)/2.0)
        }}))));
    }

    @Test
    void orbit() throws ComplexException {
        ComplexNumber t1 = ComplexNumber.newComplexNumberAlgebraicForm(1,1);
        ComplexNumber t2 = ComplexNumber.newComplexNumberAlgebraicForm(1,-1);
        ComplexMatrix complexMatrix = new ComplexMatrix(new ComplexNumber[][]{{t1,t2},{t2,t1}}).multiplyEscalar(ComplexNumber.newComplexNumberAlgebraicForm(1.0/2.0,0));
        ComplexMatrix vector = new ComplexMatrix(new ComplexNumber[][]{{ComplexNumber.newComplexNumberAlgebraicForm(1,0), ComplexNumber.newComplexNumberAlgebraicForm(0,0)}}).adjoint();
        ArrayList<ComplexMatrix> complexMatrices = new ArrayList<ComplexMatrix>();
        complexMatrices.add(complexMatrix);
        complexMatrices.add(complexMatrix);
        assertTrue(ComplexMatrix.finalOrbit(complexMatrices,vector).equals(new ComplexMatrix(new ComplexNumber[][]{{ComplexNumber.newComplexNumberAlgebraicForm(0,0)},{ComplexNumber.newComplexNumberAlgebraicForm(1,0)}})));
    }
}