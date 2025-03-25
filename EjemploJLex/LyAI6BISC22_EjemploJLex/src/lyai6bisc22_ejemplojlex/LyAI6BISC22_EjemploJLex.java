/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lyai6bisc22_ejemplojlex;

import java.io.FileReader;

/**
 *
 * @author isala
 */
public class LyAI6BISC22_EjemploJLex {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        FileReader mArchivo;
        Yylex mAnalizador;
        
        try {
            mArchivo = new FileReader("programa.txt");
            mAnalizador = new Yylex(mArchivo);
            mAnalizador.yylex();
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
        
    }
    
}
