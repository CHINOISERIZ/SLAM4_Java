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
public class Facture extends Document{
    
    public Facture(){}
    public Facture(Mode mode) {
        super(mode, Type.facture);
    }
    
}
