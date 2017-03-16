/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin21;

/**
 *
 * @author acomesanavila
 */
public class Boletin21 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Metodos met= new Metodos();
        met.llenarArray();
        met.ordenar();
        met.escribirTexto("fichero.txt");
    }
    
}
