/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import Server.ServerInterface;
import Utils.Pergunta;
import Utils.Utilizador;
import java.io.IOException;
import java.io.Serializable;
import javax.ejb.EJB;
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
    Utilizador user;
    Pergunta per;
    String selected;
    String Opcao1;
    String Opcao4;
    String Opcao2;
    String Opcao3;
    String Pergunta;
    int Nperg;
    
    private static final long serialVersionUID = 1L;
    
    public String introduzNome(){
        return null;
    }
    
    public String getUsername(){
        if(user==null){
           return "Utilizador inválido";
        }
        else
            return user.toString();
    }
    

    public void setUsername(String value) throws IOException {
      if(value.equalsIgnoreCase("adminMDS")){
          user = new Utilizador("adminMDS");
          FacesContext.getCurrentInstance().getExternalContext().redirect("AdminControls.xhtml");
      }
      else{
          if(server.aprovUserName(value)){
           server.addUser(value); 
           user=server.getUser(value);
           this.Nperg = 0;
           per=server.getNextPergunta();
           FacesContext.getCurrentInstance().getExternalContext().redirect("Questions.xhtml");
            
        }
       else{
           user=null;
        }
      }
     
    }
    
    public String getPergunta(){
        
        return this.Pergunta = per.getPergunta();
    }
    
     public String getOpcao1(){
        
        return Opcao1 = per.getOpcao1();
        
    }
     
    public String getOpcao2(){
       
        return Opcao2 = per.getOpcao2();
        
    }
    
    public String getOpcao3(){
       
        return Opcao3 = per.getOpcao3();
        
    }
    
    public String getOpcao4(){
       
        return Opcao4 = per.getOpcao4();
        
    }
    
    public String getSelected(){
        return selected;
    }
    
    public void setSelected(String s){
        this.selected = s;
    }
    
    public void selecionaPergunta(){
       per = server.getPergunta(Nperg++);
       
    }
   

}
