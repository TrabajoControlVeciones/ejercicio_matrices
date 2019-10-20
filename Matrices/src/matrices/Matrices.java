/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matrices;
//librerias
import java.util.Scanner;

public class Matrices {
  

  public static void main(String[] args) {
    
    // este objeto guardara las lines dadas por el usuario
    Scanner entrada = new Scanner(System.in);
    
    operaciones matrizObj = new operaciones();//objeto con constructor vacio
    operaciones matrizParametros = new operaciones( 1 , 4 );//objeto con constrtor,con parametros int 
    
    //Se imprime el mensaje siguiente, indicando al usuario la accion de dar tamaño de matriz 
    System.out.println( "------Ingresa el tamaño de la matriz------\n" );
    
    //solicitamos el numero de filas
    System.out.println( "Ingresa el numero de filas" );
    matrizObj.setFilas( entrada.nextInt() );//pasamos el numero capturado con el metodo setFilas a variable filas
    
    //solicitamos el numero de columnas 
    System.out.println( "Ingresa el numero de columnas" );
    matrizObj.setColumnas( entrada.nextInt() );//pasamoe el numero capturado con el metodo setColumnas a variable filas
    
    /*imprimimos un separador*/
    System.out.println("--------------------------------------------------------");
    
    /*declaramos una matriz pasando los valores de tamaño*/
    int matriz[][] = new int[matrizObj.getFilas()][matrizObj.getColumnas()]; //
    
    /*siclos for para el recorrido de la matriz en este caso los usamos para llenarla*/
    for( int i = 0; i < matrizObj.getFilas(); i++ ){//numero de filas 
      for( int j = 0; j < matrizObj.getColumnas(); j++ ){//numero de columnas 
        //mensaje para indcar el lugar del numero 
        System.out.println( "Ingresa el valor de [" + i + ", " + j + "]"  );
        //damos el numero de ingresado en la posicion de la matriz dada por el siclo
        matriz[i][j] = entrada.nextInt();
      }
    }
    //asignamos la nueva matriz en la mtrizObj utilizando el metodo set
    matrizObj.setMatris(matriz);
    //se imprime un separador
    System.out.println( "------------------------------------------"  );
    matrizObj.solucion();
    
  }//main
}//class Matrices 
