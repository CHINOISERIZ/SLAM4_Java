
package java_tp01_ex2;

import java.util.Scanner;

public class JeuDeDe {
    
    private int objectif;
    private int nbJoueur;
    private int gain;
    private Joueur[] joueurs;

    public JeuDeDe(int objectif, int nbJoueur){
        this.objectif = objectif;     
        this.nbJoueur = nbJoueur;
        joueurs = new Joueur[nbJoueur];
    }   
    
    /* Demande le nom de chaque joueur et le conserve dans le tableau joueurs */
    // <editor-fold defaultstate="collapsed" desc="Joueur">
    public void Gestion_Joueur(){
        Scanner input = new Scanner(System.in);
        int i = 0;        
        System.out.println("\nSaisissez vos noms de joueur : ");
        /* Foreach de joueurs, pour demander le nom de chaque joueurs */
        for (Joueur joueur : joueurs){
            System.out.print("-> ");
            String nom = input.next();
            joueur = new Joueur(nom);
            joueur.Set_Nom(nom);
            joueurs[i] = joueur;
            i++;
        }
    }
    // </editor-fold>
    
    /* Demande pour chaque joueur sa mise, actualise le nombre de jeton, et le gain */
    // <editor-fold defaultstate="collapsed" desc="Mise">
    public void Gestion_Mise(){
        Scanner input = new Scanner(System.in);
        int gain = 0;
        
        /* Foreach de joueurs, pour demander la mise */
        for (Joueur joueur : joueurs){
            int nbJeton = joueur.Get_NbJeton();
            System.out.println("\n" + joueur.Get_Nom() + ", vous avez " + joueur.Get_NbJeton() + " jetons, combien voulez-vous en miser ?");
            System.out.print("-> ");            
            int mise = input.nextInt();
            /* Exception valeur trop haute */
            if (mise > joueur.Get_NbJeton()){
                System.out.println("Vous n'avez plus assez de jeton, mise le maximum");
                mise = joueur.Get_NbJeton();
            }
            /* Actualisation du nbJeton + gain */
            nbJeton -= mise;
            joueur.Set_NbJeton(nbJeton);
            gain += mise;
        }
        this.gain = gain;        
    }
    // </editor-fold>
    
    /* Fct fin de jeu si joueur possède 0 jeton ou moins */
    // <editor-fold defaultstate="collapsed" desc="Fin">
    public boolean Fin(){
        boolean a = true;
        for (Joueur joueur : joueurs){
            if(joueur.Get_NbJeton() <= 0){
                a = false;
            }            
        }
        return a;
    }
    // </editor-fold>
        
    /* Cette fonction va nous permettre de déterminer le(s) gagnant(s) grâce à 2 tableaux :
    -> gagnants, il va conserver le joueur qui est entrain de gagné grâce à un système de 
    comparaison basé sur Math.abs. Tous les résultats seront forcément positifs, et celui 
    étant le plus proche ou égal à 0 gagne
    -> resultat, il va prendre le gagnant final*/
    // <editor-fold defaultstate="collapsed" desc="TrouverLesGagnants">
    public Joueur[] TrouverLesGagnants()
    {
        int distanceDuGagnant = 0;
        int distanceDuJoueur = 0;
        
        Joueur[] gagnants = new Joueur[joueurs.length];
        int index = 0;
        for(Joueur joueur : joueurs)
        {
            //Pas encore de gagnant
            if(index == 0)
            {
                //On dit que le premier joueur est considéré comme le gagnant temporaire
                gagnants[index++] = joueur;
            }
            else
            {
                distanceDuGagnant = Math.abs(gagnants[index-1].Get_Score() - 7);
                distanceDuJoueur = Math.abs(joueur.Get_Score() - 7);
                
                //Si egalite, il y a plusieurs gagnant
                if(distanceDuGagnant == distanceDuJoueur)
                {
                    gagnants[index++] = joueur;
                }
                //Si score du joueur est plus petit que score du gagnant, alors joueur est le gagnant
                else if(distanceDuJoueur < distanceDuGagnant)
                {
                    index = 0;
                    gagnants[index++] = joueur;
                }
            }
        }
        
        Joueur[] resultat = new Joueur[index];
        // 2 cas possible d'après le tableau gagnants: soit il y a qu'un seul gagnant (else if), soit il y en a plusieurs (if)
        for(int i = 0; i < index; i++)
        {
            resultat[i] = gagnants[i];
        }
        
        return resultat;
    }
    // </editor-fold>
    
    public void JeuCommence(){
        Gestion_Mise();
        int[] joueurGagnant = new int[nbJoueur];
        /* chaque joueur dans joueurs va appeler la fct Lance_De */
        for (int i = 0; i < nbJoueur; i++){
            joueurs[i].Lance_De();
        }       
        
        Joueur[] gagnants = TrouverLesGagnants();
        // Divise le gain en fonction du nombre de gagnant
        this.gain /= gagnants.length;
        // Affiche le(s) gagnant(s) grâce à TrouverLesGagnants qui retourne le tableau résultat
        for (Joueur gagnant : gagnants){
            System.out.println("\n!!! " + gagnant.Get_Nom() + " a gagné ce tour et remporte donc le gain de " + gain + " !!!");
            gagnant.Set_NbJeton(gagnant.Get_NbJeton()+gain);
        }
        
    }

}
