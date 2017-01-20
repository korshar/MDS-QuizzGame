/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Server;

import Utils.Utilizador;
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
    boolean pergunta1;
    boolean pergunta2;
    boolean pergunta3;
    boolean pergunta4;
    boolean pergunta5;

    public Server() {
        utilizadores = new ArrayList<>();
        pergunta1 = false;
        pergunta2 = false;
        pergunta3 = false;
        pergunta4 = false;
        pergunta5 = false;
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
    public boolean isPergunta1() {
        return pergunta1;
    }

    @Override
    public boolean isPergunta2() {
        return pergunta2;
    }

    @Override
    public boolean isPergunta3() {
        return pergunta3;
    }

    @Override
    public boolean isPergunta4() {
        return pergunta4;
    }

    @Override
    public boolean isPergunta5() {
        return pergunta5;
    }

    @Override
    public void setPergunta1(boolean pergunta1) {
        this.pergunta1 = pergunta1;
    }

    @Override
    public void setPergunta2(boolean pergunta2) {
        this.pergunta2 = pergunta2;
    }

    @Override
    public void setPergunta3(boolean pergunta3) {
        this.pergunta3 = pergunta3;
    }

    @Override
    public void setPergunta4(boolean pergunta4) {
        this.pergunta4 = pergunta4;
    }

    @Override
    public void setPergunta5(boolean pergunta5) {
        this.pergunta5 = pergunta5;
    }

    @Override
    public List<Utilizador> getLista() {
        return Server.utilizadores;
    }

}
