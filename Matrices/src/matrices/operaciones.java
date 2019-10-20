/*
 * To change this license header, choose License Headers in Project Properties.
 */
package matrices;

public class operaciones {
  int filas = 0, columnas = 0;
  
  int matris[ ][ ] = new int[ filas ][ columnas ];
  
  //constructor vacio
  public operaciones(){ 
  }
  
  //constructor con parametros 
  public operaciones( int filas, int columnas){
    
    this.filas = filas;
    this.columnas = columnas;
    
  }
  
  /*--------------Metodos set-------------------------------*/
  public void setFilas(int filas) {
    this.filas = filas;
  }

  public void setColumnas(int columnas) {
    this.columnas = columnas;
  }

  public void setA(int[][] matris) {
    this.matris = matris;
  }
  
  /*--------------Metodos get-----------------------------*/

  public int getFilas() {
    return filas;
  }

  public int getColumnas() {
    return columnas;
  }

  public int[][] getMatris() {
    return matris;
  }
  
  
  
}
