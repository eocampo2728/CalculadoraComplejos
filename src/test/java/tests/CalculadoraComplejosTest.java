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
    public void suma() {
        NumeroComplejo n1 = new NumeroComplejo(5, 2);
        NumeroComplejo n2 = new NumeroComplejo(6, 8);
        NumeroComplejo res = new NumeroComplejo(11, 10);

        assertTrue(n1.suma(n2).equals(res));
    }

    @Test
    public void producto() {
        NumeroComplejo n1 = new NumeroComplejo(0, 1);
        NumeroComplejo n2 = new NumeroComplejo(0, 1);
        NumeroComplejo res = new NumeroComplejo(-1, 0);

        assertTrue(n1.producto(n2).equals(res));
    }

    @Test
    public void resta() {
        NumeroComplejo n1 = new NumeroComplejo(5, 10);
        NumeroComplejo n2 = new NumeroComplejo(2, 5);
        NumeroComplejo res = new NumeroComplejo(3, 5);

        assertTrue(n1.resta(n2).equals(res));
    }

    @Test
    public void division() {
        NumeroComplejo n1 = new NumeroComplejo(3, 5);
        NumeroComplejo n2 = new NumeroComplejo(1, -1);
        NumeroComplejo res = new NumeroComplejo(-1, 4);

        assertTrue(n1.division(n2).equals(res));
    }

    @Test
    public void modulo() {
        NumeroComplejo n1 = new NumeroComplejo(3, 5);
        double res = 5.83;

        assertTrue(n1.modulo() == res);
    }

    @Test
    public void conjugado() {
        NumeroComplejo n1 = new NumeroComplejo(3, 5);
        NumeroComplejo res = new NumeroComplejo(3, -5);

        assertTrue(n1.conjugado().equals(res));
    }

    @Test
    public void polar() {
        NumeroComplejo n1 = new NumeroComplejo(3, 5);
        String res = "5.83,1.03";

        assertTrue(n1.polar().equals(res));
    }

    @Test
    public void fase() {
        NumeroComplejo n1 = new NumeroComplejo(3, 5);
        double res = 1.03;

        assertTrue(n1.fase() == res);
    }

    @Test
    public void adicionVector() {
        NumeroComplejo n1 = new NumeroComplejo(3, 5);
        double res = 1.03;

        assertTrue(n1.fase() == res);
    }

    NumeroComplejo c1 = new NumeroComplejo(3, 2);
    NumeroComplejo c2 = new NumeroComplejo(-1, 3);
    NumeroComplejo c3 = new NumeroComplejo(-10, -7);
    NumeroComplejo c4 = new NumeroComplejo(9, -8);

    MatrizCompleja cm1 = new MatrizCompleja(new NumeroComplejo[][]{{c1, c2}, {c3, c4}});

    NumeroComplejo c5 = new NumeroComplejo(-2, 2);
    NumeroComplejo c6 = new NumeroComplejo(6, 3);
    NumeroComplejo c7 = new NumeroComplejo(-4, -3);
    NumeroComplejo c8 = new NumeroComplejo(2, -3);

    MatrizCompleja cm2 = new MatrizCompleja(new NumeroComplejo[][]{{c5, c6}, {c7, c8}});

    @Test
    public void sumaMatriz() {
        NumeroComplejo t1 = new NumeroComplejo(1, 4);
        NumeroComplejo t2 = new NumeroComplejo(5, 6);
        NumeroComplejo t3 = new NumeroComplejo(-14, -10);
        NumeroComplejo t4 = new NumeroComplejo(11, -11);

        MatrizCompleja tm1 = new MatrizCompleja(new NumeroComplejo[][]{{t1, t2}, {t3, t4}});
        assertTrue(tm1.equals(cm1.suma(cm2)));
    }

    @Test
    public void restaMatriz() {
        NumeroComplejo t1 = new NumeroComplejo(5, 0);
        NumeroComplejo t2 = new NumeroComplejo(-7, 0);
        NumeroComplejo t3 = new NumeroComplejo(-6, -4);
        NumeroComplejo t4 = new NumeroComplejo(7, -5);

        MatrizCompleja tm1 = new MatrizCompleja(new NumeroComplejo[][]{{t1, t2}, {t3, t4}});
        assertTrue(tm1.equals(cm1.resta(cm2)));
    }

    @Test
    public void productoMatriz() {
        NumeroComplejo t1 = new NumeroComplejo(3, -7);
        NumeroComplejo t2 = new NumeroComplejo(19, 30);
        NumeroComplejo t3 = new NumeroComplejo(-26, -1);
        NumeroComplejo t4 = new NumeroComplejo(-45, -115);

        MatrizCompleja tm1 = new MatrizCompleja(new NumeroComplejo[][]{{t1, t2}, {t3, t4}});
        assertTrue(tm1.equals(cm1.producto(cm2)));
    }

    @Test
    public void productoEscalarMatriz() {
        NumeroComplejo t1 = new NumeroComplejo(12, -5);
        NumeroComplejo t2 = new NumeroComplejo(7, 9);
        NumeroComplejo t3 = new NumeroComplejo(-41, 16);
        NumeroComplejo t4 = new NumeroComplejo(-6, -43);
        MatrizCompleja tm1 = new MatrizCompleja(new NumeroComplejo[][]{{t1, t2}, {t3, t4}});
        assertTrue(tm1.equals(cm1.productoEscalar(new NumeroComplejo(2, -3))));
    }

    @Test
    public void matrizTanspuesta() {
        MatrizCompleja tm1 = new MatrizCompleja(new NumeroComplejo[][]{{c1, c3}, {c2, c4}});
        assertTrue(tm1.equals(cm1.transpuesta()));
    }

    @Test
    public void matrizConjugada() {
        MatrizCompleja tm1 = new MatrizCompleja(new NumeroComplejo[][]{{c1.conjugado(), c2.conjugado()},
        {c3.conjugado(), c4.conjugado()}});
        assertTrue(tm1.equals(cm1.conjugada()));
    }

    @Test
    public void matrizAdjunta() {
        MatrizCompleja tm1 = new MatrizCompleja(new NumeroComplejo[][]{{c1.conjugado(), c3.conjugado()},
        {c2.conjugado(), c4.conjugado()}});
        assertTrue(tm1.equals(cm1.adjunta()));
    }

    @Test
    public void tensorMatriz() {
        NumeroComplejo t1 = new NumeroComplejo(-10, 2);
        NumeroComplejo t2 = new NumeroComplejo(12, 21);
        NumeroComplejo t3 = new NumeroComplejo(-4, -8);
        NumeroComplejo t4 = new NumeroComplejo(-15, 15);
        NumeroComplejo t5 = new NumeroComplejo(-6, -17);
        NumeroComplejo t6 = new NumeroComplejo(12, -5);
        NumeroComplejo t7 = new NumeroComplejo(13, -9);
        NumeroComplejo t8 = new NumeroComplejo(7, 9);
        NumeroComplejo t9 = new NumeroComplejo(34, -6);
        NumeroComplejo t10 = new NumeroComplejo(-39, -72);
        NumeroComplejo t11 = new NumeroComplejo(-2, 34);
        NumeroComplejo t12 = new NumeroComplejo(78, -21);
        NumeroComplejo t13 = new NumeroComplejo(19, 58);
        NumeroComplejo t14 = new NumeroComplejo(-41, 16);
        NumeroComplejo t15 = new NumeroComplejo(-60, 5);
        NumeroComplejo t16 = new NumeroComplejo(-6, -43);
        MatrizCompleja tm1 = new MatrizCompleja(new NumeroComplejo[][]{{t1, t2, t3, t4},
        {t5, t6, t7, t8},
        {t9, t10, t11, t12},
        {t13, t14, t15, t16}});
        assertTrue(tm1.equals(cm1.tensor(cm2)));
    }

    @Test
    public void normaMatriz() {
        MatrizCompleja tm1 = new MatrizCompleja(new NumeroComplejo[][]{{c1, c2, c3, c4}});
        double ans = Math.sqrt(317);
        double comp = tm1.norma();
        assertEquals(ans, comp, 0);

    }

    @Test
    public void distanciaMatriz() {
        MatrizCompleja tm1 = new MatrizCompleja(new NumeroComplejo[][]{{c1, c2, c3, c4}});
        MatrizCompleja tm2 = new MatrizCompleja(new NumeroComplejo[][]{{c5, c6, c7, c8}});
        double ans = Math.sqrt(200);
        double comp = tm1.distancia(tm2);
        assertEquals(ans, comp, 0);
    }

    @Test
    public void hermitianMatriz() {
        NumeroComplejo t1 = new NumeroComplejo(2, 0);
        NumeroComplejo t2 = new NumeroComplejo(2, 1);
        NumeroComplejo t3 = new NumeroComplejo(4, 0);
        NumeroComplejo t4 = new NumeroComplejo(2, -1);
        NumeroComplejo t5 = new NumeroComplejo(3, 0);
        NumeroComplejo t6 = new NumeroComplejo(0, 1);
        NumeroComplejo t7 = new NumeroComplejo(4, 0);
        NumeroComplejo t8 = new NumeroComplejo(0, -1);
        NumeroComplejo t9 = new NumeroComplejo(1, 0);
        assertTrue(new MatrizCompleja(new NumeroComplejo[][]{{t1, t2, t3},
        {t4, t5, t6},
        {t7, t8, t9}})
                .Hermitian());
    }

    @Test
    public void matrizUnitaria() {
        NumeroComplejo t1 = new NumeroComplejo(1, 1);
        NumeroComplejo t2 = new NumeroComplejo(1, -1);
        MatrizCompleja complexMatrix = new MatrizCompleja(new NumeroComplejo[][]{{t1, t2}, {t2, t1}});
        assertTrue(complexMatrix.productoEscalar(new NumeroComplejo(1.0 / 2.0, 0)).isUnitary());
    }

    //Retos de programacion
    @Test
    public void pruebaBalas() {

        NumeroComplejo[][] matriz = new NumeroComplejo[8][1];
        for (int i = 0; i < 8; i++) {
            NumeroComplejo temp;
            if (i == 0) {
                temp = new NumeroComplejo(1, 0);
            } else {
                temp = new NumeroComplejo(0, 0);
            }
            matriz[i][0] = temp;
        }
        MatrizCompleja X = new MatrizCompleja(matriz);

        NumeroComplejo[][] matrix = new NumeroComplejo[8][8];
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                NumeroComplejo temp;
                if ((i == 1 && j == 0) || (i == 2 && j == 0)) {
                    temp = new NumeroComplejo(1.0 / 2.0, 0);
                } else if ((i == 3 && j == 1) || (i == 4 && j == 1) || (i == 5 && j == 1) || (i == 5 && j == 2) || (i == 6 && j == 2) || (i == 7 && j == 2)) {
                    temp = new NumeroComplejo(1.0 / 3.0, 0);

                } else if (i > 2 && j > 2 && i == j) {
                    temp = new NumeroComplejo(1, 0);
                } else {
                    temp = new NumeroComplejo(0, 0);
                }
                matrix[i][j] = temp;
            }
        }
        MatrizCompleja complexMatrix = new MatrizCompleja(matrix);

        MatrizCompleja macom = complexMatrix;

        NumeroComplejo[][] test = new NumeroComplejo[8][1];
        for (int i = 0; i < 8; i++) {
            NumeroComplejo temp;
            if (i == 3 || i == 4 || i == 6 || i == 7) {
                temp = new NumeroComplejo(1.0 / 6.0, 0);
            } else if (i == 5) {
                temp = new NumeroComplejo(1.0 / 3.0, 0);
            } else {
                temp = new NumeroComplejo(0, 0);
            }
            test[i][0] = temp;
        }
        MatrizCompleja matrixTest = new MatrizCompleja(test);

        assertTrue(macom.producto(macom).producto(X).equals(matrixTest));

    }

    @Test
    public void pruebaDobleRendija() {

        NumeroComplejo[][] matrix = new NumeroComplejo[8][8];
        for (int i = 0; i < 8; i++) {
            matrix[0][i] = new NumeroComplejo(0, 0);
        }
        matrix[1][0] = new NumeroComplejo(1.0 / Math.sqrt(2), 0);
        for (int i = 1; i < 8; i++) {
            matrix[1][i] = new NumeroComplejo(0, 0);
        }
        matrix[2][0] = new NumeroComplejo(1.0 / Math.sqrt(2), 0);
        for (int i = 1; i < 8; i++) {
            matrix[2][i] = new NumeroComplejo(0, 0);
        }
        for (int i = 0; i < 8; i++) {
            NumeroComplejo temp;
            if (i == 1) {
                temp = new NumeroComplejo(-1.0, 1).productoEscalar(1.0 / Math.sqrt(6));
            } else if (i == 3) {
                temp = new NumeroComplejo(1, 0);
            } else {
                temp = new NumeroComplejo(0, 0);
            }
            matrix[3][i] = temp;
        }
        for (int i = 0; i < 8; i++) {
            NumeroComplejo temp;
            if (i == 1) {
                temp = new NumeroComplejo(-1.0, -1.0).productoEscalar(1.0 / Math.sqrt(6));
            } else if (i == 4) {
                temp = new NumeroComplejo(1, 0);
            } else {
                temp = new NumeroComplejo(0, 0);
            }
            matrix[4][i] = temp;
        }
        for (int i = 0; i < 8; i++) {
            NumeroComplejo temp;
            if (i == 1) {
                temp = new NumeroComplejo(1.0, -1.0).productoEscalar(1.0 / Math.sqrt(6));
            } else if (i == 2) {
                temp = new NumeroComplejo(-1.0, 1.0).productoEscalar(1.0 / Math.sqrt(6));
            } else if (i == 5) {
                temp = new NumeroComplejo(1, 0);
            } else {
                temp = new NumeroComplejo(0, 0);
            }
            matrix[5][i] = temp;
        }
        for (int i = 0; i < 8; i++) {
            NumeroComplejo temp;
            if (i == 2) {
                temp = new NumeroComplejo(-1.0, -1.0).productoEscalar(1.0 / Math.sqrt(6));
            } else if (i == 6) {
                temp = new NumeroComplejo(1, 0);
            } else {
                temp = new NumeroComplejo(0, 0);
            }
            matrix[6][i] = temp;
        }
        for (int i = 0; i < 8; i++) {
            NumeroComplejo temp;
            if (i == 2) {
                temp = new NumeroComplejo(1.0, -1.0).productoEscalar(1.0 / Math.sqrt(6));
            } else if (i == 7) {
                temp = new NumeroComplejo(1, 0);
            } else {
                temp = new NumeroComplejo(0, 0);
            }
            matrix[7][i] = temp;
        }
        MatrizCompleja result = new MatrizCompleja(matrix);

        NumeroComplejo[][] expected = new NumeroComplejo[8][8];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 8; j++) {
                expected[i][j] = new NumeroComplejo(0, 0);
            }
        }
        for (int i = 0; i < 8; i++) {
            NumeroComplejo temp;
            if (i == 0) {
                temp = new NumeroComplejo(-1, 1).productoEscalar(1.0 / Math.sqrt(12));
            } else if (i == 1) {
                temp = new NumeroComplejo(-1, 1).productoEscalar(1.0 / Math.sqrt(6));
            } else if (i == 3) {
                temp = new NumeroComplejo(1, 0);
            } else {
                temp = new NumeroComplejo(0, 0);
            }
            expected[3][i] = temp;
        }
        for (int i = 0; i < 8; i++) {
            NumeroComplejo temp;
            if (i == 0) {
                temp = new NumeroComplejo(-1, -1).productoEscalar(1.0 / Math.sqrt(12));
            } else if (i == 1) {
                temp = new NumeroComplejo(-1, -1).productoEscalar(1.0 / Math.sqrt(6));
            } else if (i == 4) {
                temp = new NumeroComplejo(1, 0);
            } else {
                temp = new NumeroComplejo(0, 0);
            }
            expected[4][i] = temp;
        }
        for (int i = 0; i < 8; i++) {
            NumeroComplejo temp;
            if (i == 1) {
                temp = new NumeroComplejo(1, -1).productoEscalar(1.0 / Math.sqrt(6));
            } else if (i == 2) {
                temp = new NumeroComplejo(-1, 1).productoEscalar(1.0 / Math.sqrt(6));
            } else if (i == 5) {
                temp = new NumeroComplejo(1, 0);
            } else {
                temp = new NumeroComplejo(0, 0);
            }
            expected[5][i] = temp;
        }
        for (int i = 0; i < 8; i++) {
            NumeroComplejo temp;
            if (i == 0) {
                temp = new NumeroComplejo(-1, -1).productoEscalar(1.0 / Math.sqrt(12));
            } else if (i == 2) {
                temp = new NumeroComplejo(-1, -1).productoEscalar(1.0 / Math.sqrt(6));
            } else if (i == 6) {
                temp = new NumeroComplejo(1, 0);
            } else {
                temp = new NumeroComplejo(0, 0);
            }
            expected[6][i] = temp;
        }
        for (int i = 0; i < 8; i++) {
            NumeroComplejo temp;
            if (i == 0) {
                temp = new NumeroComplejo(1, -1).productoEscalar(1.0 / Math.sqrt(12));
            } else if (i == 2) {
                temp = new NumeroComplejo(1, -1).productoEscalar(1.0 / Math.sqrt(6));
            } else if (i == 7) {
                temp = new NumeroComplejo(1, 0);
            } else {
                temp = new NumeroComplejo(0, 0);
            }
            expected[7][i] = temp;
        }
        MatrizCompleja expectedMatrix = new MatrizCompleja(expected);

        assertTrue(result.producto(result).producto(result).equals(expectedMatrix));
    }

    @Test
    public void probabilidadEnUnaPosicion() {
        NumeroComplejo[][] matriz = new NumeroComplejo[1][4];
        matriz[0][0] = new NumeroComplejo(-3, -1);
        matriz[0][1] = new NumeroComplejo(0, -2);
        matriz[0][2] = new NumeroComplejo(0, 1);
        matriz[0][3] = new NumeroComplejo(2, 0);
        assertEquals(new MatrizCompleja(matriz).probabilidad(2), 0.05263157894736841, 0.00001);
    }

    @Test
    public void pruebaTransicion() {
        NumeroComplejo[][] si = new NumeroComplejo[1][2];
        NumeroComplejo[][] phi = new NumeroComplejo[1][2];
        si[0][0] = new NumeroComplejo(0, 1);
        si[0][1] = new NumeroComplejo(-1, 0);

        phi[0][0] = new NumeroComplejo(1, 0);
        phi[0][1] = new NumeroComplejo(0, 1);

        assertTrue(new MatrizCompleja(si).bra().transpuesta().productoEscalar(new NumeroComplejo(Math.sqrt(2) / 2, 0)).
                productoInterno(new MatrizCompleja(phi).productoEscalar(new NumeroComplejo(Math.sqrt(2) / 2, 0))).equals(
                new NumeroComplejo(0, -1.0000000000000002)));
    }

    @Test
    public void pruebaCoeficiente() {

        NumeroComplejo[][] matrix = new NumeroComplejo[6][6];
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                NumeroComplejo temp;
                if ((i == 2 && j == 1) || (i == 2 && j == 5) || (i == 3 && j == 3) || (i == 4 && j == 2) || (i == 5 && j == 0) || (i == 5 && j == 4)) {
                    temp = new NumeroComplejo(1, 0);
                } else {
                    temp = new NumeroComplejo(0, 0);
                }
                matrix[i][j] = temp;
            }
        }
        MatrizCompleja complexMatrix = new MatrizCompleja(matrix);

        NumeroComplejo[][] max = new NumeroComplejo[6][1];
        max[0][0] = new NumeroComplejo(6, 0);
        max[1][0] = new NumeroComplejo(2, 0);
        max[2][0] = new NumeroComplejo(1, 0);
        max[3][0] = new NumeroComplejo(5, 0);
        max[4][0] = new NumeroComplejo(3, 0);
        max[5][0] = new NumeroComplejo(10, 0);
        MatrizCompleja X = new MatrizCompleja(max);
        NumeroComplejo[][] macomparar = new NumeroComplejo[6][1];
        macomparar[0][0] = new NumeroComplejo(0, 0);
        macomparar[1][0] = new NumeroComplejo(0, 0);
        macomparar[2][0] = new NumeroComplejo(12, 0);
        macomparar[3][0] = new NumeroComplejo(5, 0);
        macomparar[4][0] = new NumeroComplejo(1, 0);
        macomparar[5][0] = new NumeroComplejo(9, 0);
        MatrizCompleja comparar = new MatrizCompleja(macomparar);
        assertTrue(complexMatrix.producto(X).equals(comparar));
    }
}
