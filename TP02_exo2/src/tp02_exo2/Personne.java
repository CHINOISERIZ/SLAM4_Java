/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp02_exo2;

/**
 *
 * @author CHINOISERIZ
 */
public class Personne {
    
    private String nom;
    private Statut statut;
    
    public Personne(){}
    public Personne(String nom){
        this.nom = nom;
    }
    
    public String Get_Nom(){
        return this.nom;
    }
    public Statut Get_Statut(){
        return this.statut;
    }
    public void Set_Statut(Statut statut){
        this.statut = statut;
    }
}
