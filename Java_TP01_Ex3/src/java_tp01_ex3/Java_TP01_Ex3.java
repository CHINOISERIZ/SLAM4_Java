/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_tp01_ex3;

import java.util.Scanner;

/**
 *
 * @author CHINOISERIZ
 */
public class Java_TP01_Ex3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        Scanner input = new Scanner(System.in);
        Calculette calculatrice = new Calculette();
        
        System.out.println("TRI d'un projet d'investissement !");

        /* Premier version      
        System.out.println("Opérande 1 : ");
        float op1 = input.nextFloat();
        
        System.out.println("L'opérateur : ");
        String operateur = input.next();
        
        System.out.println("Opérande 2 : ");
        float op2 = input.nextFloat();      
        
        
        System.out.println("Résultat : " + calculatrice.Calculer(op1, op2, operateur));
        */
        System.out.print("Capital placé : ");
        float capitalP = input.nextFloat();  
        
        System.out.print("Capital acquis : ");
        float capitalA = input.nextFloat();      
        
        System.out.print("Durée du placement : ");
        float duree = input.nextFloat();      
                
        
        System.out.println("Un capital de " + capitalP + "€ placé en debut de période pendant " + duree + " ans s'élève à " + capitalA + "€");
        System.out.println("Le bénéfice annuel est de " + calculatrice.Soustraire(capitalA, capitalP)/duree + "% soit un taux annuel équivalent de " +
        calculatrice.Diviser(capitalA, capitalP)*100 + "%.");
        
    }
    
}
