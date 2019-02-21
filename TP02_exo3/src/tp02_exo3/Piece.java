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
public class Piece {

    private Couleur couleur;
    private Type type;
    
    public Piece(Couleur couleur, Type type){
        this.couleur = couleur;
        this.type = type;
    }
    
    public Type Get_Type(){
        return this.type;
    }
}
