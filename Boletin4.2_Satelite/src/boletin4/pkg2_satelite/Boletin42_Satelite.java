/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin4.pkg2_satelite;

/**
 *
 * @author lvazquezdorna
 */
public class Boletin42_Satelite {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // testeo de satelite
        
        //satelite creado con el constructor por defecto
        Satelite satelite1= new Satelite();
        satelite1.verPosicion();
        
        //satelite creado con el constructor con parametros
            Satelite luna= new Satelite(3500,3474,348000);
           
           luna.verPosicion();
            
    }
    
}
