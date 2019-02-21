/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp02_exo3;

/**
 *
 * @author CHINOISERIZ
 */
public class Plateau {
    
    private Piece[] premiereLigne = new Piece[8];
    private Piece[] deuxiemeLigne = new Piece[8];
    private Piece[] troisiemeLigne = new Piece[8];
    private Piece[] quatriemeLigne = new Piece[8];
    private Piece[] cinquiemeLigne = new Piece[8];
    private Piece[] sixiemeLigne = new Piece[8];
    private Piece[] septiemeLigne = new Piece[8];
    private Piece[] huitiemeLigne = new Piece[8];
    
    public Plateau(){
        for(int i = 0; i<premiereLigne.length; i++){
            premiereLigne[i] = new Piece(Couleur.noir, Type.__);
            deuxiemeLigne[i] = new Piece(Couleur.noir, Type.__);
            troisiemeLigne[i] = new Piece(Couleur.noir, Type.__);
            quatriemeLigne[i] = new Piece(Couleur.noir, Type.__);
            cinquiemeLigne[i] = new Piece(Couleur.noir, Type.__);
            sixiemeLigne[i] = new Piece(Couleur.noir, Type.__);
            septiemeLigne[i] = new Piece(Couleur.noir, Type.__);
            huitiemeLigne[i] = new Piece(Couleur.noir, Type.__);
        }
    }
    
    public Piece[] Get_premiereLigne(){
        return premiereLigne;
    }
    public Piece[] Get_deuxiemeLigne(){
        return deuxiemeLigne;
    }
    public Piece[] Get_troisiemeLigne(){
        return troisiemeLigne;
    }
    public Piece[] Get_quatriemeLigne(){
        return quatriemeLigne;
    }
    public Piece[] Get_cinquiemeLigne(){
        return cinquiemeLigne;
    }
    public Piece[] Get_sixiemeLigne(){
        return sixiemeLigne;
    }
    public Piece[] Get_septiemeLigne(){
        return septiemeLigne;
    }
    public Piece[] Get_huitiemeLigne(){
        return huitiemeLigne;
    }
    
    public void Set_premiereLigne(Piece piece, int index){
        premiereLigne[index] = piece;
    }
    public void Set_deuxiemeLigne(Piece piece, int index){
        premiereLigne[index] = piece;
    }
    public void Set_troisiemeLigne(Piece piece, int index){
        premiereLigne[index] = piece;
    }
    public void Set_quatriemeLigne(Piece piece, int index){
        premiereLigne[index] = piece;
    }
    public void Set_cinquiemeLigne(Piece piece, int index){
        premiereLigne[index] = piece;
    }
    public void Set_sixiemeLigne(Piece piece, int index){
        premiereLigne[index] = piece;
    }
    public void Set_septiemeLigne(Piece piece, int index){
        premiereLigne[index] = piece;
    }
    public void Set_huitiemeLigne(Piece piece, int index){
        premiereLigne[index] = piece;
    }
    
    public void Afficher(){
        for(int i = 0; i<premiereLigne.length; i++){
            System.out.print(premiereLigne[i]);
        }
        System.out.println("");
        
        for(int i = 0; i<premiereLigne.length; i++){
            System.out.print(deuxiemeLigne[i]);            
        }
        System.out.println(""); 
        
        for(int i = 0; i<premiereLigne.length; i++){
            System.out.print(troisiemeLigne[i]);            
        }
        System.out.println("");  
        
        for(int i = 0; i<premiereLigne.length; i++){
            System.out.print(quatriemeLigne[i]);            
        }
        System.out.println("");
        
        for(int i = 0; i<premiereLigne.length; i++){
            System.out.print(cinquiemeLigne[i]);
        }
        System.out.println("");
        
        for(int i = 0; i<premiereLigne.length; i++){
            System.out.print(sixiemeLigne[i]);            
        }
        System.out.println("");
        
        for(int i = 0; i<premiereLigne.length; i++){
            System.out.print(septiemeLigne[i]);
        }
        System.out.println("");

        for(int i = 0; i<premiereLigne.length; i++){
            System.out.print(huitiemeLigne[i]);            
        }
    }
    
}
