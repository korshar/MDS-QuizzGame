
import Server.ServerInterface;
import java.io.Serializable;
import javax.ejb.EJB;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jonat
 */
@SessionScoped
@Named
public class AdminController implements Serializable{
    
    @EJB
    ServerInterface server;
    String selected;
    public void ativaJogo(){
        server.clearList();
        server.setEstadoJogo(true);
    }
    
    public void resetServer(){
        server.hardReset();
    }
    
    public String getSelected() {
        return selected;
    }

    public void setSelected(String s) {
        this.selected = s;
    }
    
    public void ativaPergunta(){
        switch(Integer.parseInt(selected)){
            case 1:{
                server.getPergunta(0).setBlocked(false);
                break;
            }
            case 2:{
                server.getPergunta(1).setBlocked(false);
                break;
            }
            case 3:{
                server.getPergunta(2).setBlocked(false);
                break;
            }
            case 4:{
                server.getPergunta(3).setBlocked(false);
                break;
            }
            case 5:{
             server.getPergunta(4).setBlocked(false);
                break;
            }
        }
    }
}
