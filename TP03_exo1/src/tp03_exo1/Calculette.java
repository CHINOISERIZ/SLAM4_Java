/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp03_exo1;

/**
 *
 * @author CHINOISERIZ
 */
public class Calculette {
    
    private float resultat;
    private float operande1;
    private float operande2;
    private String operateur;
    
    public Calculette(float operande1, String operateur, float operande2){
        this.operande1 = operande1;
        this.operateur = operateur;
        this.operande2 = operande2;
        this.resultat = 0;
    }    
       
    public float Diviser(){
        resultat = operande1 / operande2;
        return resultat;
    }    
    public float Multiplier(){
        resultat = operande1 * operande2;
        return resultat;
    }
    public float Soustraire(){
        resultat = operande1 - operande2;
        return resultat;
    }
    public float Additionner(){
        resultat = operande1 + operande2;
        return resultat;
    } 
    
    public float Calculer(){
        switch (operateur){
            case "/":
                return Diviser();
            case "*":
                return Multiplier();
            case "-":
                return Soustraire();
            case "+":
                return Additionner();
        }
        return 0;
    }    
}
