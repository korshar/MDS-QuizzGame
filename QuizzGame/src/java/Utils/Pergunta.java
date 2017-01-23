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
    int countWrongAnswers;
    int countCorrectAnswers;
    boolean blocked;

    public Pergunta(String s, int id, String r,String op1,String op2,String op3,String op4){
        this.pergunta = s;
        this.id = id;
        this.resposta = r;
        this.opcao1=op1;
        this.opcao2=op2;
        this.opcao3=op3;
        this.opcao4=op4;
        countWrongAnswers = 0;
        countCorrectAnswers = 0;
        blocked = true;
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
    
    
    public int getCountWrongAnswers() {
        return countWrongAnswers;
    }

    public void setCountWrongAnswers(int countWrongAnswers) {
        this.countWrongAnswers = countWrongAnswers;
    }

    public int getCountCorrectAnswers() {
        return countCorrectAnswers;
    }

    public void setCountCorrectAnswers(int countCorrectAnswers) {
        this.countCorrectAnswers = countCorrectAnswers;
    }
    
    public void incWrongAnswers(){
        countWrongAnswers++;
    }
    
    public void incCorrectAnswers(){
        countCorrectAnswers++;
    }
    
    public boolean isAnswer(int index){
        switch(index){
            case 1:
                return resposta.equals(opcao1);
            case 2:
                return resposta.equals(opcao2);
            case 3:
                return resposta.equals(opcao3);
            case 4:
                return resposta.equals(opcao4);
            default:
                return false;
        }
    }
    
    
}
