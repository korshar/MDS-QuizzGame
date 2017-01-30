
import Server.ServerInterface;
import java.io.Serializable;
import javax.ejb.EJB;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

@SessionScoped
@Named
public class AdminController implements Serializable{
    
    @EJB
    ServerInterface server;
    String selected;
    public void ativaJogo(){
        server.hardReset();
        server.setEstadoJogo(true);
    }
    
    public void fechaJogo(){
        server.setEstadoJogo(false);
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
             
                for(int i = 0; i < server.getPerguntas().size(); i++){
                    if(i == 0)
                        server.getPergunta(i).setBlocked(false);
                    else
                        server.getPergunta(i).setBlocked(true);
                }
                  server.incPergunta(0);
                break;
            }
            case 2:{
                
                for(int i = 0; i < server.getPerguntas().size(); i++){
                    if(i == 1)
                        server.getPergunta(i).setBlocked(false);
                    else
                        server.getPergunta(i).setBlocked(true);
                }
                server.incPergunta(1);
                break;
            }
            case 3:{
                
                for(int i = 0; i < server.getPerguntas().size(); i++){
                    if(i == 2)
                        server.getPergunta(i).setBlocked(false);
                    else
                        server.getPergunta(i).setBlocked(true);
                }
                server.incPergunta(2);
                break;
            }
            case 4:{
               
                for(int i = 0; i < server.getPerguntas().size(); i++){
                    if(i == 3)
                        server.getPergunta(i).setBlocked(false);
                    else
                        server.getPergunta(i).setBlocked(true);
                }
                 server.incPergunta(3);
                break;
            }
            case 5:{
              
                for(int i = 0; i < server.getPerguntas().size(); i++){
                    if(i == 4)
                        server.getPergunta(i).setBlocked(false);
                    else
                        server.getPergunta(i).setBlocked(true);
                }
                server.incPergunta(4);
                break;
            }
        }
    }
}
