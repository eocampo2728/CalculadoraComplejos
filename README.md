# CalculadoraComplejos

## Description
Este programa es una calculadora de numeros complejos, está compuesta de 2 clases principales y 1 clase de pruebas.

Esta calculadora contiene los siguientes metodos para operacion de numeros complejos.

	1. Suma de complejos
	2. Producto de complejos
	3. Resta
	4. División
	5. Módulo
	6. Conjugado
	7. Conversión entre representaciones polar y cartesiano
	8. Retornar la fase de un número complejo.

Esta calculadora contiene los siguentes metodos para operaciones de matrices y vectores complejos.

	1. Adición de vectores complejos.
	2. Inversa de vectores complejos.
	3. Multiplicación escalar de vectores complejos.
	4. Adición de matrices complejos.
	5. Inversa de matrices complejos.
	6. Multiplicación escalar de matrices complejas.
	7. Matriz transpuesta
	8. Matriz conjugada
	9. Matriz adjunta
	10. Función para calcular la "acción" de una matriz sobre un vector.
	11. Norma de matrices
	12. Distancia entrematrices
	13. Revisar si es unitaria
	14. Revisar si es Hermitian
	15. Producto tensor
	

## Getting Started
Para correr este programa, solo necesita clonar el repositorio y abrirlo en [NetBeans](https://netbeans.org/), o en cualquier compilador que soporte proyectos maven.

## Install
Para hacer la instalacion de esta libreria, se debe clonar el repositorio:
![ins](https://github.com/eocampo2728/CalculadoraComplejos/blob/master/cap01.PNG?raw=true)
Ya con el repositorio clonado en su dispositivo, se puede compilar mediante cualquier compilador.

## Test
Para probar este programa se necesita compilarlo en cualquier compilador, esta libreria tiene una clase de pruebas llamada CalculadoraComplejosTest.

![test](https://github.com/eocampo2728/CalculadoraComplejos/blob/master/cap02.PNG?raw=true)

En esta clase se encuentran todas las pruebas de la libreria. Para correr las pruebas solo se necesita ejecutar los comandos:
```
mvn compile
mvn test
```

## Use
Para usar esta libreria lo unico que se necesita hacer es importa la libreria, en el programa en el que se decea utilizarlo.
Esta libreria cuenta con 8 operaciones de numeros complejos y 15 operaciones de matrices o vectores complejos.
Las operaciones de numeros complejos son:
```java
public NumeroComplejo suma(NumeroComplejo n1)
public NumeroComplejo producto(NumeroComplejo n1)
public NumeroComplejo resta(NumeroComplejo n1)
public NumeroComplejo division(NumeroComplejo n1)
public Double modulo()
public Double fase()
public NumeroComplejo conjugado()
public NumeroComplejo inverso()
public String polar()
public Double norma()
```
```java
public MatrizCompleja suma(MatrizCompleja m1)
public MatrizCompleja resta(MatrizCompleja m1)
public MatrizCompleja producto(MatrizCompleja complexMatrix)
public MatrizCompleja productoEscalar(NumeroComplejo n1)
public MatrizCompleja transpuesta()
public MatrizCompleja conjugada()
public MatrizCompleja adjunta()
public MatrizCompleja tensor(MatrizCompleja complexMatrix)
public Double norma()
public Double distancia(MatrizCompleja m1)
public boolean Hermitian()
public boolean isUnitary()
```

## Autor
Eduardo Ocampo

## Build With
Este Programa fue creado en Java y utilizando la herramienta [NetBeans](https://netbeans.org/).

