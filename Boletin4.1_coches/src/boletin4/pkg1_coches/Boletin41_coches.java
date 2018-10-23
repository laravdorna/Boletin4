/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin4.pkg1_coches;

/**
 *
 * @author lvazquezdorna
 */
public class Boletin41_coches {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // probar que o programa se executa ben .dandolle os valores que precises.

        //crear el objeto 
        Coche coche1 = new Coche();

        //acelerar y frenar 
        coche1.acelerar(40);
        System.out.println("Velocidad del coche " + coche1.getVelocidade());
        coche1.frenar(20);
        System.out.println("Velocidad del coche " + coche1.getVelocidade());
        coche1.frenar(20);
        System.out.println("Velocidad del coche " + coche1.getVelocidade());
    }

}
