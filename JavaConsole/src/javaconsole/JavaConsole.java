/*
    **Comentarios multilinea**
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.

    Se crea un paquete que tendra una clase en JAVA
 */
package javaconsole; // Nombre del paquete

/**
 *
 * @author Diego Alex
 */

// Comentario de una linea
// Nombre de la clase
public class JavaConsole {
    /**
     * @param args the command line arguments
     */
    /*** Variables ***/
    // Cadena
    static String cadenaAleatoria = "Cadena a imprimir";
    /*** Constantes ***/
    // Constante double
    static final double PINUM = 3.1416; 
    
    /*** Clase y metodo main ***/
    public static void main(String[] args) { //Entrada al programa
        // TODO code application logic here
        /*** Impresión en consola ***/
        System.out.println("Hola Java");
        // Imprimiendo variable
        System.out.println(cadenaAleatoria);
        // Imprimiendo constante
        System.out.println(PINUM);
        
    }
    
}
