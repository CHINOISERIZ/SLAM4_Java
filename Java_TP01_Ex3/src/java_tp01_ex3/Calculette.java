/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_tp01_ex3;

/**
 *
 * @author CHINOISERIZ
 */
public class Calculette {
    
    public Calculette(){
        
    }
    
    // <editor-fold defaultstate="collapsed" desc="Fonction opération">    
    // Opération "+"
    public float Additionner(float op1, float op2){
        return op1 + op2;
    }
    // Opération "-"
    public float Soustraire(float op1, float op2){
        return op1 - op2;
    }
    // Opération "*"
    public float Multiplier(float op1, float op2){
        return op1 * op2;
    }
    // Opération "/"
    public float Diviser(float op1, float op2){
        return op1 / op2;
    }
    // Opération "%"
    public float Modulo(float op1, float op2){
        return op1 % op2;
    }    
    // Taux de rentabilité
    
    // </editor-fold>    
    
    // switch/case/default : étudier les cas d'opérateur
    // <editor-fold defaultstate="collapsed" desc="Fonction cas opération">   
    public float Calculer(float op1, float op2, String operateur){
        
        switch(operateur){
            case "+":
                return Additionner(op1, op2);             
                
            case "-":
                return Soustraire(op1, op2);                                
                
            case "*":
                return Multiplier(op1, op2);            
            
            case "/":
                return Diviser(op1, op2);
                
            case "%":
                return Modulo(op1, op2);
                
            default:
                System.out.println("erreur");                
                return 0;
        }       
    }    
    // </editor-fold>

    
   
}