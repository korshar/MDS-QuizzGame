/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Server;

import Utils.Utilizador;
import javax.ejb.Local;

/**
 *
 * @author jonat
 */
@Local
public interface ServerInterface {
     public Utilizador getUser(String nome);
     public void addUser(String nome);
     public void clearList();
     public void removeUser(String nome);
     public boolean aprovUserName(String nome);
}
