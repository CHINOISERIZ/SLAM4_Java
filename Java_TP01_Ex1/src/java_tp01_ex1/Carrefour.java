
package java_tp01_ex1;

import java.util.Random;


public class Carrefour {
    /* Un carrefour contient des routes et des voitures */
    
    private Route[] routes;
    private Voiture voiture;
    
    public Carrefour(){   
        int i = 0;
        
        /* Initialisation d'un tableau représentant les routes */        
        routes = new Route[4];      
        /* Foreach de routes, initialise : un état de feu, et une route */
        for(Route route : routes){
            Feu feu = new Feu(Etat.Vert);
            if (i % 2 != 0){
                feu.Set_Etat(Etat.Rouge);
            }
            route = new Route(i+1, feu);
            routes[i] = route;
            i++;
        }
    }
    
    // <editor-fold defaultstate="collapsed" desc="Fcts utilitaire">
    public void Nb_Voitures(){
        int nbVoitures = 0;
        /* Foreach de routes */
        for (Route route : routes){
            /* Nombre de voiture sur chaque route */
            System.out.println("Route n°" + route.Get_Numero() + " : " + route.Get_Size());
            nbVoitures += route.Get_Size();
        }
        System.out.println("Il y a " + nbVoitures + " voitures dans le carrefour !\n");
    }    
    public int Get_Nb_Voitures(){
        /* Cette fct similaire à Nb_Voitures me permet juste de récupérer nbVoitures */
        int nbVoitures = 0;
        for (Route route : routes){
            nbVoitures += route.Get_Size();
        }
        return nbVoitures;
    }
    
    public void Gestion_Etat(){   
        /* Foreach de routes inversant les états des feux */
        for(Route route : routes){
            if(route.Get_Etat() == Etat.Vert) {
                route.Set_Etat(Etat.Rouge);
            }
            else {
                route.Set_Etat(Etat.Vert);
            }
        }
    }
    // </editor-fold>

        
    public void Gestion_Route(){
        Random rand = new Random();        
        Nb_Voitures();
        
        /* Foreach de routes */
        for (Route route : routes){
            int nombreAleatoire = rand.nextInt((4 - 1) + 1) + 1;
            /* Affichage des cas des états */
            switch(route.Get_Etat()){
            // <editor-fold defaultstate="collapsed" desc="feu vert">
            case Vert:
                System.out.print("La route n°" + route.Get_Numero() + " est " + route.Get_Etat() + ", ");
                /* Exception, plus de voiture */
                if (route.Get_Size() != 0){
                    /* Exception, plus de voiture retirée que existante */
                    if(nombreAleatoire > route.Get_Size()){
                        nombreAleatoire = route.Get_Size();
                        System.out.println("les dernières voitures sont passées"); 
                    }
                    else{
                        System.out.println(nombreAleatoire + " voitures ont réussi à passer"); 
                    }                    
                    /* Supprime les voitures de façon aléatoire */
                    for (int i = 0; i < nombreAleatoire; i++){
                        route.Retirer_Voiture();
                    }
                }
                else{
                    System.out.println(" il n'y a plus de voiture");
                }
                break;
                // </editor-fold>
            // <editor-fold defaultstate="collapsed" desc="feu rouge">
            case Rouge:
                System.out.print("La route n°" + route.Get_Numero() + " est " + route.Get_Etat() + ", ");
                /* Exception, plus de voiture */
                if (route.Get_Size() != 0){
                    System.out.println("les voitures se stoppent.");                    
                }
                else{
                    System.out.println(" il n'y a plus de voiture");
                }
                break;
            }
            // </editor-fold>
        }     
        Gestion_Etat();
        System.out.println("");
    }
}
