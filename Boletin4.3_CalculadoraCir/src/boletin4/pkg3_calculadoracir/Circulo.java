/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin4.pkg3_calculadoracir;

/**
 *
 * @author lvazquezdorna
 */
public class Circulo {

    //ATRIBUTOS
    private double radio;
  private final double PI = 3.14;

    //CONSTRUCTORES
    public Circulo() {
    }

    public Circulo(double radio) {
        this.radio = radio;
    }
    //METODOS DE ACCESO

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    //METODOS DE CALCULO
//    calcularArea : Non recibe nada e devolve o valor da área . Para calcular radio ^ 2 
//    utiliza a clase Math e o método pow (….)
    
    public void calcularArea(){
        double area;
        
        area= 2*this.PI*Math.pow(this.radio, this.radio);
        System.out.println("El area del circulo de radio "+this.radio+" es de "+area);
    
    }
    
//    *  calcularLonxitude : Non recibe nada e devolve o valor da lonxitude da circunferenciasç
    public void calcularLonxitude(){
    double lonxitude;
    
    lonxitude=2*this.PI*radio;
       System.out.println("El perimetro  de la circunferencia de radio "+this.radio+" es de "+lonxitude);
    
    }
}
