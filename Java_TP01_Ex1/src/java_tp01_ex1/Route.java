
package java_tp01_ex1;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;


public class Route {
    /* Une route est représentée par un numéro, et il possède un feu */
    
    private int numero;
    private Feu feu;
    private Queue<Voiture> voitures;
    
    public Route(int numero, Feu feu){
        Random rand = new Random();
        this.numero = numero;
        this.feu = feu;
        
        int nombreAleatoire = rand.nextInt((10 - 5) + 1) + 5;
        /* Initialisation d'un tableau de type FIFO */ 
        voitures = new LinkedList<>();
        /* For allant jusqu'à nombreAleatoire, initialise : une voiture */
        for (int i = 0; i < nombreAleatoire; i++){
            Voiture voiture = new Voiture(i+1);
            voitures.add(voiture);                       
        }
    }
    
    public void Retirer_Voiture(){
        /* Système du first in first out */
        this.voitures.poll();        
    }
    
    // <editor-fold defaultstate="collapsed" desc="Getter&Setter">
    public int Get_Numero(){
        return this.numero;
    }    
    public int Get_Size(){
        return voitures.size();
    }
    public Etat Get_Etat(){
        return this.feu.Get_Etat();
    }
    public void Set_Etat(Etat etat){
        this.feu.Set_Etat(etat);
    }
    // </editor-fold>
}
