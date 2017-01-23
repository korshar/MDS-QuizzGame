/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utils;
/**
 *
 * @author Andre Pinho
 */
public class Score {

    String topUser;
    String classification;
    String username;
    String points;

    public Score(String username){
        this.username = username;
        points = Integer.toString(0);
        topUser = new String();
        classification = new String();
    }

    public String getTopUser() {
        return topUser;
    }

    public void setTopUser(String topUser) {
        this.topUser = topUser;
    }

    public String getClassification() {
        return classification;
    }

    public void setClassification(String classification) {
        this.classification = classification;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPoints() {
        return points;
    }

    public void setPoints(String points) {
        this.points = points;
    }

    public void addPoints(int points){
        this.points = Integer.toString(points + Integer.parseInt(this.points));
    }
}
