
package java_tp01_ex1;


public class Java_TP01_Ex1 {
    /* 
        CONSIGNE : programme qui gère un carrefour en croix
        Sur chaque route arrive une voiture, 
        si le feu est vert la voiture passe, 
        si il est rouge la voiture stope, 
        les feux tricolores changent tant qu'il reste des voitures qui ne sont pas passées
    */
    
    public static void main(String[] args) {
        
        Carrefour carrefour = new Carrefour();
        int cycle = 0;
        
        // While pour boucler tant qu'il reste des voitures dans le carrefour
        while (carrefour.Get_Nb_Voitures() != 0){
            carrefour.Gestion_Route();
            cycle++;
        } 
        
        System.out.println("\nLe carrefour est vide après " + cycle + " cycles !");
    }  
}
