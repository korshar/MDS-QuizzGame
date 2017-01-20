/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Server;

import Utils.Utilizador;
import java.util.List;
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

    public void setPergunta1(boolean pergunta1);

    public boolean isPergunta5();

    public boolean isPergunta1();

    public boolean isPergunta2();

    public boolean isPergunta3();

    public boolean isPergunta4();

    public void setPergunta3(boolean pergunta3);

    public void setPergunta2(boolean pergunta2);

    public void setPergunta4(boolean pergunta4);

    public void setPergunta5(boolean pergunta5);

    public List<Utilizador> getLista();
}
