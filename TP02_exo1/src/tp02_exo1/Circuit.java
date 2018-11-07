/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp02_exo1;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author CHINOISERIZ
 */
public class Circuit {
    
    private Voiture voiture1;
    private Voiture voiture2;
    private List<Tronçon> tronçons;
    
    public Circuit(){
        voiture1 = new Voiture("V1", 100, 30, 40, 30);
        voiture2 = new Voiture("V2", 90, 25, 45, 25);
        tronçons = new ArrayList();        
        // <editor-fold defaultstate="collapsed" desc="Tracé du circuit">
        tronçons.add(Tronçon.debut);
        tronçons.add(Tronçon.ligne_droite);
        tronçons.add(Tronçon.ligne_droite);
        tronçons.add(Tronçon.virage);
        tronçons.add(Tronçon.virage);
        tronçons.add(Tronçon.ligne_droite);
        tronçons.add(Tronçon.virage);
        tronçons.add(Tronçon.virage);
        tronçons.add(Tronçon.ligne_droite);
        tronçons.add(Tronçon.ligne_droite);
        tronçons.add(Tronçon.virage);
        tronçons.add(Tronçon.virage);
        tronçons.add(Tronçon.ligne_droite);
        tronçons.add(Tronçon.fin);
        // </editor-fold>
    }
    
    // <editor-fold defaultstate="collapsed" desc="Fct Classement">
    public void Classement(Tronçon tronçon){        
        // Trouve la voiture en tête
        if (voiture1.Get_Vitesse() < voiture2.Get_Vitesse()){
            System.out.println(voiture1.Get_Nom() + " roule à " + voiture1.Get_Vitesse() + "km/h");
            System.out.println(voiture2.Get_Nom() + " roule à " + voiture2.Get_Vitesse() + "km/h");
            System.out.println(voiture2.Get_Nom() + " est en tête de la course\n");
        }
        else{
            System.out.println(voiture1.Get_Nom() + " roule à " + voiture1.Get_Vitesse() + "km/h");
            System.out.println(voiture2.Get_Nom() + " roule à " + voiture2.Get_Vitesse() + "km/h");            
            System.out.println(voiture1.Get_Nom() + " est en tête de la course\n");            
        }        
    }
    // </editor-fold>

    public void Commencer(){
        for (Tronçon tronçon : tronçons){
            // Tracé du circuit : début
            if (tronçon == Tronçon.debut){
                System.out.println("La course va commencer !\n");
            }            
            // Tracé du circuit : ligne droite
            else if (tronçon == Tronçon.ligne_droite){
                System.out.println("Il y a une " + tronçon);
                voiture1.Acceleration();
                voiture2.Acceleration();
                Classement(tronçon);
            }
            // Tracé du circuit : virage
            else if (tronçon == Tronçon.virage){
                System.out.println("Il y a un " + tronçon);                
                voiture1.Deceleration();
                voiture2.Deceleration();
                Classement(tronçon);
            }
            // Tracé du circuit : fin
            else{
                if (voiture1.Get_Vitesse() < voiture2.Get_Vitesse()){
                    System.out.println(voiture2.Get_Nom() + " a gagné la course !");
                }
                else{
                    System.out.println(voiture1.Get_Nom() + " a gagné la course !");            
                }                
            }
        }    
    }    
}
