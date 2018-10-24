/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin4.pkg4_restaurantegallego;

/**
 *
 * @author lvazquezdorna
 */
public class PolboConPatacas {

    //ATRIBUTOS
    private double kPatacas;
    private double kPolbo;

    //CONSTRUCTORES
    public PolboConPatacas() {
    }

    public PolboConPatacas(int kPatacas, int kPolbo) {
        this.kPatacas = kPatacas;
        this.kPolbo = kPolbo;
    }

    //METODOS DE ACCESO
    public double getkPatacas() {
        return kPatacas;
    }

    public void setkPatacas(int kPatacas) {
        this.kPatacas = kPatacas;
    }

    public double getkPolbo() {
        return kPolbo;
    }

    public void setkPolbo(int kPolbo) {
        this.kPolbo = kPolbo;
    }

    //METODO DE MUESTRA
    @Override
    public String toString() {
        return "PolboConPatacas{" + "kPatacas=" + kPatacas + ", kPolbo=" + kPolbo + '}';
    }

    //METODOS DE CALCULO
    // Engade x kg de polbo a os xa existentes
    public void añadirKPolbo(int kilos) {
        this.kPolbo = kilos + this.kPolbo;

    }

    // Engade x kg de patacas  
    public void añadirKPatacas(int kilos) {
        this.kPatacas = kilos + this.kPatacas;

    }

    // Amosa por pantalla os kg de polbo que ten no almacen e de patacas
    public void mostrarPolbo() {
        System.out.println("No almacen quedan " + this.kPolbo + "kg de polbo.");
    }

    public void mostrarPatacas() {
        System.out.println("No almacen quean " + this.kPatacas + "kg de patacas");
    }

    //por cada 3 persoas , restaurante utiliza 2 kg de polbo e 1 de patacas.
    //sin bucle
    public int calcularClientes() {
        int clientes = 0;
        clientes = (int) (3 * this.kPolbo * this.kPatacas / 2);
        return clientes;
    }
    //mismo calculo con bucle
    public int calcularClientesBucle() {
        int clientes = 0;
        while ((this.kPolbo - 2 >= 0) && (this.kPatacas >= 1)) {
            clientes = clientes + 3;
            this.kPolbo = this.kPolbo - 2;
            this.kPatacas = this.kPatacas - 1;

        }
        return clientes;
    }

}
