/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utils;

import java.util.Objects;

/**
 *
 * @author jonat
 */
public class Utilizador {
    static int i = 1;
    String Username;
    int pontos;
    int ID;

    public Utilizador(String nome) {
        Username = nome;
        pontos = 0;
        ID = i++;
    }
    
    

    public String getUsername() {
        return Username;
    }

    public int getPontos() {
        return pontos;
    }

    public void setPontos(int pontos) {
        this.pontos = pontos;
    }

    @Override
    public String toString() {
        return "Utilizador{" + "Username=" + Username + ", pontos=" + pontos + '}';
    }

    @Override
    public int hashCode() {
       
        return ID;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Utilizador other = (Utilizador) obj;
        if (!Objects.equals(this.Username, other.Username)) {
            return false;
        }
        
        return true;
    }
    
    
}
