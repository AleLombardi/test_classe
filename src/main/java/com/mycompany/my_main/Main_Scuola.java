/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.my_main;

import javax.swing.JOptionPane;

/**
 *
 * @author posta
 */
public class Main_Scuola {

    static String frase;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Esame alunno = new Esame("nome", " cognome", " materia", 0);
        String num = JOptionPane.showInputDialog("Inserisci numero nomi: ");
        Integer numInt = Integer.valueOf(num);
        String[] array = new String[numInt];
        for (int i = 0; i < array.length; i++) {
            String insNome = JOptionPane.showInputDialog("inserisci il nome: ");
            //array[i] = insNome;
            //alunno.getNome();
            alunno.setNome(insNome);
            array[i] = alunno.getNome().substring(0, 2);
            //System.out.print(array[i]+" ");
        }
       
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+" ");

            
        }
       
    }
}
