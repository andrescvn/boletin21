/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin21;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import javax.swing.JOptionPane;

/**
 *
 * @author acomesanavila
 */
public class Metodos {

    ArrayList<String> palabras = new ArrayList();

    File fich;
    PrintWriter f = null;
    
    public void llenarArray() {
        for (int i = 0; i < 3; i++) {
            palabras.add(JOptionPane.showInputDialog("introduce palabras"));
        }
    }

    public void ordenar() {
        Collections.sort(palabras);
    }

    public void escribirTexto(String nomFich) {
        try {
            fich = new File(nomFich);
            f = new PrintWriter(fich);
            for (int i = 0; i < palabras.size(); i++) {
                f.println((i+1)+")"+palabras.get(i));
            }
            
        } catch (FileNotFoundException ex) {
            System.out.println(ex.getMessage());
        } finally {
            f.close();
        }
    }
}
