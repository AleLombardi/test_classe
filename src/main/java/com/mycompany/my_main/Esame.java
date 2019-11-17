/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.my_main;

/**
 *
 * @author posta
 */




public class Esame {
    private String nome;
    private String cognome;
    private String materia;
    private int voto;
    
    public Esame(String nome, String cognome, String materia, int voto){
        this.nome = nome;
        this.cognome = cognome;
        this.materia = materia;
        this.voto = voto;
        
    }

    public String getNome() {
        return nome;
    }

    public String getCognome() {
        return cognome;
    }

    public String getMateria() {
        return materia;
    }

    public int getVoto() {
        
        return voto;
    }

    public void setNome(String nome) {
        this.nome = nome;
        
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    public void setVoto(int voto) {
        this.voto = voto;
    }
    
    
    
    
}
    

