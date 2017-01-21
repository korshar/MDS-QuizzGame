
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
    
    public void ativaJogo(){
        server.clearList();
        server.setEstadoJogo(true);
    }
    
    public void AtivaPergunta(int i){
        switch(i){
            case 1:{

                break;
            }
            case 2:{

                break;
            }
            case 3:{

                break;
            }
            case 4:{
                
                break;
            }
            case 5:{
             
                break;
            }
        }
    }
}
