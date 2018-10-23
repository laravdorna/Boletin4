/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin4.pkg3_calculadoracir;

import java.util.Scanner;

/**
 *
 * @author lvazquezdorna
 */
public class Boletin43_CalculadoraCir {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // comprobar que calcula bien el area y perimetro del circulo
        
        Scanner teclado=new Scanner(System.in);
        
        Circulo circulo1= new Circulo();
        
        
        //pide por teclado el radio y lo guarda en el radio del circulo 1
        System.out.println("Que radio tiene el circulo que quieres calcular?");
        circulo1.setRadio(teclado.nextDouble());
        
        circulo1.calcularArea();
        circulo1.calcularLonxitude();
    }
    
}
