/*
 * To change this license header, choose License Headers in Project Properties.
 */
package matrices;

public class operaciones {
  private int filas; 
  private int columnas = 0;
  
  int matris[ ][ ] = new int[ filas ][ columnas ];
  
  //constructor vacio
  public operaciones(){ 
  }//constructor vacio
  
  //constructor con parametros 
  public operaciones( int filas, int columnas){
    
    this.filas = filas;
    this.columnas = columnas;
    
  }//constructor con parametros 
  
  /*--------------Metodos set-------------------------------*/
  public void setFilas(int filas) {
    this.filas = filas;
  }//setFilas

  public void setColumnas(int columnas) {
    this.columnas = columnas;
  }//setColumnas

  public void setMatris(int[][] matris) {
    this.matris = matris;
  }//setMatris
  
  /*--------------Metodos get-----------------------------*/

  public int getFilas() {
    return filas;
  }//getFilas

  public int getColumnas() {
    return columnas;
  }//getColumnas

  public int[][] getMatris() {
    return matris;
  }//getMatris
  
  //metodo de solucion 
  void solucion(){
    /*For de recorrido de la matris */
    for( int i = 0; i < filas; i++ ){
      for(int j = 0; j < columnas; j++){
        System.out.print( matris[ i ][ j ] );
      }
      System.out.print("\n");
    }//for
    
  }
  
}//class operaciones
