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
public class Server implements ServerInterface{
    List<Utilizador> utilizadores;

    public Server() {
        utilizadores = new ArrayList<>();
    }
    
   @Override
    public Utilizador getUser(String nome){
        for(Utilizador u : utilizadores){
            if(u.equals(nome))
                return u;
        }
        return null;
    }
    
   @Override
    public void addUser(String nome){
        utilizadores.add(new Utilizador(nome));
    }
    
   @Override
    public void clearList(){
        utilizadores.clear();
    }
    
   @Override
    public void removeUser(String nome){
        utilizadores.stream().filter((u) -> (u.getUsername().equals(nome))).forEach((u) -> {
            utilizadores.remove(u);
        });
    }
    
   @Override
    public boolean aprovUserName(String nome){
       for(Utilizador s : utilizadores){
           if(s.getUsername().equals(nome))
               return false;
       }
       return true;
    }
}
