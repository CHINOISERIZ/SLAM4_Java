/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp02_exo1;

/**
 *
 * @author CHINOISERIZ
 */
public class Voiture {
    
    private String nom;
    private float vitesse;
    private float vitesseMax;
    private float vitesseMin;
    private float acceleration;
    private float deceleration;
    
    public Voiture(String nom, float vitesseMax, float vitesseMin, float acceleration, float deceleration){
        this.nom = nom;
        // Au début du circuit la vitesse des deux voitures est de 0km/h
        this.vitesse = 0;
        this.vitesseMax = vitesseMax;
        this.vitesseMin = vitesseMin;
        this.acceleration= acceleration;
        this.deceleration = deceleration;
    }
    
    public void Acceleration(){        
        vitesse += acceleration;
        // La vitesse de la voiture ne peut pas dépasser la vitesseMax
        if (vitesse > vitesseMax){
            vitesse = vitesseMax;
        }
    }
    
    public void Deceleration(){   
        // Il ne faut pas oublier que la décélération est en pourcentage
        vitesse = vitesse * (1 - deceleration/100);
        // La vitesse de la voiture ne peut pas être en dessous de la vitesseMin
        if (vitesse < vitesseMin){
            vitesse = vitesseMin;
        }
    }    
    
    public float Get_Vitesse(){
        return vitesse;
    }
    public String Get_Nom(){
        return nom;
    }
}
