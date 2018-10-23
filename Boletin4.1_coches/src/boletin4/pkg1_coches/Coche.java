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
public class Coche {

    //ATRIBUTOS
    private int velocidade;

    //CONSTRUCTORES
    public Coche() {
        this.velocidade = 0;
    }

    //METODOS DE ACCESO
    public int getVelocidade() {
        return velocidade;
    }

    //METODOS DE CALCULO
    public void acelerar(int valor) {
        //incrementa a velocidade na cantidade valor
        this.velocidade = valor + this.velocidade;

    }

    public void frenar(int menos) {
        //diminue a velocidade na cantidade menos.
        this.velocidade = this.velocidade - menos;

    }

}
