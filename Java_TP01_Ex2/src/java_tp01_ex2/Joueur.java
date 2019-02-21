
package java_tp01_ex2;

import java.util.Random;

public class Joueur {
    /* Un joueur possède un nom, on peut associer à ce joueur :
        des dés, des jetons, et un score
    */
    
    private De[] des;
    private String nom;
    private int nbJeton;
    private int score;
    
    public Joueur(String nom){
        this.nom = nom;
        this.nbJeton = 100;
        des = new De[2];       
        this.score = 0;
    }
    
    public void Lance_De(){
        Random rand = new Random();
        int i = 0;            
        /* Foreach de des */
        System.out.println("\n" + nom + " lance les dés est obtient : ");
        for(De de : des){
            /* Donne une valeur aléatoire à chaque initialition d'un dé */
            int nombreAleatoire = rand.nextInt((6 - 1) + 1) + 1;
            de = new De(nombreAleatoire);
            des[i] = de;
            this.score += nombreAleatoire;
            System.out.println(nombreAleatoire);
            i++;
        }
        System.out.println("Pour un total de " + this.score);        
    }    
    
    // <editor-fold defaultstate="collapsed" desc="Getter&Setter">
    public int Get_Score(){
        for (De de : des){
            this.score = de.Get_De();
        }
        return this.score;
    }
    
    public String Get_Nom(){
        return this.nom;
    }
    public void Set_Nom(String nom){
        this.nom = nom;
    }    
    
    public int Get_NbJeton(){
        return this.nbJeton;
    }   
    public void Set_NbJeton(int nbJeton){
        this.nbJeton = nbJeton;
    }
// </editor-fold>    
}


