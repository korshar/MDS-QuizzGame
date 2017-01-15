/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Server;

import java.util.ArrayList;
import java.util.List;
import javax.ejb.LocalBean;
import javax.ejb.Singleton;

/**
 *
 * @author Andre Pinho
 */
@Singleton
@LocalBean
public class Server {
    List<String> utilizadores;

    public Server() {
        utilizadores = new ArrayList<>();
    }
    
    public String getUser(String nome){
        for(String u : utilizadores){
            if(u.equals(nome))
                return u;
        }
        return null;
    }
    
    public void addUser(String nome){
        utilizadores.add(nome);
    }
    
    public void clearList(){
        utilizadores.clear();
    }
    
    public void removeUser(String nome){
        utilizadores.stream().filter((u) -> (u.equals(nome))).forEach((u) -> {
            utilizadores.remove(u);
        });
    }
    
    public boolean aprovUserName(String nome){
       for(String s : utilizadores){
           if(s.equals(nome))
               return false;
       }
       return true;
    }
}
