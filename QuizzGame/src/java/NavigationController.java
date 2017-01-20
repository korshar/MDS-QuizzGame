/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import Server.ServerInterface;
import java.io.IOException;
import java.io.Serializable;
import javax.ejb.EJB;
import javax.enterprise.context.RequestScoped;
import javax.enterprise.context.SessionScoped;
import javax.faces.context.FacesContext;
import javax.inject.Named;

/**
 *
 * @author jonat
 */

@SessionScoped
@Named
public class NavigationController implements Serializable{
    @EJB
    private ServerInterface server;
    String userName=null;
    private static final long serialVersionUID = 1L;
    
    public String introduzNome(){
        return null;
    }
    
    public String getUsername(){
        if(userName==null){
           return "";
        }
        else
            return userName;
    }
    
    public void setUsername(String value) throws IOException {
      
       if(server.aprovUserName(value)){
           userName=value+true;
           server.addUser(value); 
           FacesContext.getCurrentInstance().getExternalContext().redirect("ProcessaUserName.xhtml");
            
        }
       else{
           userName=null;
    }
    }
   

}
