/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Server;

import Utils.Pergunta;
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

    public List<Utilizador> getLista();
    
    public void setEstadoJogo(boolean estado);
    
    public boolean getEstadoJogo();
    
    public Pergunta getNextPergunta();
    
    public Pergunta getPergunta(int id);
    
    public List<Utilizador> getUtilizadores();

    public void setUtilizadores(List<Utilizador> utilizadores);
    
    public List<Pergunta> getPerguntas();

    public void setPerguntas(List<Pergunta> perguntas);
    
    public void hardReset();
    
    public void incPergunta(int i);
    
    public int getCurrentQuestions();
    
}
