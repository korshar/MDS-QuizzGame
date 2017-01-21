/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Server;

import Utils.Pergunta;
import Utils.Utilizador;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import javax.ejb.Singleton;

/**
 *
 * @author Andre Pinho
 */
@Singleton
public class Server implements ServerInterface {

    static List<Utilizador> utilizadores;
    static List<Pergunta> perguntas;
    boolean jogo;
    

    public Server() {
        utilizadores = new ArrayList<>();
        perguntas = new ArrayList<>();
        perguntas.add(new Pergunta("Qual é o maior clube de futebol do mundo?",1,"Benfica", "Real Madrid", "AC Milan", "Benfica", "Barcelona"));
        perguntas.add(new Pergunta("Qual foi o melhor Jogador Fifa em 2016?",2,"CR7", "CR7", "Messi", "Griezmann", "André Baladas"));
        perguntas.add(new Pergunta("Qual a linguagem de Programação mais usada neste momento?",3,"JAVA", "OBJECTIVE-C", "C++", "Python", "JAVA"));
        perguntas.add(new Pergunta("Qual a capital do Tuvalu",4,"Funafuti", "Funafuti", "Alapi", "Marmelândia", "Bagan"));
        perguntas.add(new Pergunta("De onde provém a famosa água JANA?",5,"Croacia", "Malta", "Croacia", "Suécia", "Dinamarca"));
        jogo=false;
    }

    @Override
    public Utilizador getUser(String nome) {
        for (Utilizador u : utilizadores) {
            if (u.getUsername().equals(nome)) {
                return u;
            } else {
            }
        }
        return null;
    }

    @Override
    public void addUser(String nome) {
        utilizadores.add(new Utilizador(nome));
    }

    @Override
    public void clearList() {
        utilizadores.clear();
    }

    @Override
    public void removeUser(String nome) {
        utilizadores.stream().filter((u) -> (u.getUsername().equals(nome))).forEach((u) -> {
            utilizadores.remove(u);
        });
    }

    @Override
    public boolean aprovUserName(String nome) {
        for (Utilizador s : utilizadores) {
            if (s.getUsername().equalsIgnoreCase(nome)) {
                return false;
            }
        }
        if (nome.equals("")) {
            return false;
        }
        if (nome == null) {
            return false;
        }
        if (nome.isEmpty()) {
            return false;
        }
        return true;
    }


    @Override
    public List<Utilizador> getLista() {
        return Server.utilizadores;
    }

    @Override
    public void setEstadoJogo(boolean estado) {
        this.jogo=estado;
    }

    @Override
    public boolean getEstadoJogo() {
        return this.jogo;
    }

    @Override
    public Pergunta getNextPergunta() {
        return perguntas.iterator().next();
    }

    @Override
    public Pergunta getPergunta(int id) {
        return perguntas.get(id);
    }

}
