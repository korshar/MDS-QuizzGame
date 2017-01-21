/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utils;

/**
 *
 * @author jonat
 */
public class Pergunta {
    String pergunta;
    int id;
    String resposta;
    String opcao1;
    String opcao2;
    String opcao3;
    String opcao4;
    
    public Pergunta(String s, int id, String r,String op1,String op2,String op3,String op4){
        this.pergunta = s;
        this.id = id;
        this.resposta = r;
        this.opcao1=op1;
        this.opcao2=op2;
        this.opcao3=op3;
        this.opcao4=op4;
    }

    public String getPergunta() {
        return pergunta;
    }

    public void setPergunta(String pergunta) {
        this.pergunta = pergunta;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getResposta() {
        return resposta;
    }

    public void setResposta(String resposta) {
        this.resposta = resposta;
    }

    public String getOpcao1() {
        return opcao1;
    }

    public void setOpcao1(String opcao1) {
        this.opcao1 = opcao1;
    }

    public String getOpcao2() {
        return opcao2;
    }

    public void setOpcao2(String opcao2) {
        this.opcao2 = opcao2;
    }

    public String getOpcao3() {
        return opcao3;
    }

    public void setOpcao3(String opcao3) {
        this.opcao3 = opcao3;
    }

    public String getOpcao4() {
        return opcao4;
    }

    public void setOpcao4(String opcao4) {
        this.opcao4 = opcao4;
    }
    
    
}
