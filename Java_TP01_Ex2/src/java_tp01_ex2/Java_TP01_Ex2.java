
package java_tp01_ex2;

import java.util.Scanner;

public class Java_TP01_Ex2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Les joueurs misent, puis lancent deux dés, le joueur qui fait le score le plus proche de 7 avec les deux dés gagne la mise.\n");

        /* Nombre de joueur */
        System.out.println("Combien y a-t-il de joueur ?");
        System.out.print("-> ");
        int nbJoueur = input.nextInt();
        
        JeuDeDe jeuDeDe = new JeuDeDe(7, nbJoueur);    
        
        /* Choix des noms */
        jeuDeDe.Gestion_Joueur();
        
        /* Boucle while tant qu'aucun joueur possède 0 jeton ou moins != 0 */
        int i =0;
        while(jeuDeDe.Fin() == true){
            i++;
            System.out.println("\n------ Tour " + i + " ------");
            jeuDeDe.JeuCommence();
        }        
        System.out.println("\n------ Fin de la partie ------");
    }
    
}
