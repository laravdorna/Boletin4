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
public class Satelite {
    //ATRIBUTOS

    private double meridiano;
    private double paralelo;//FALTABA EL PUNTO Y COMA ;
    private double distanciaTerra;

    //CONSTRUCTORES
    public Satelite() {

        meridiano = paralelo = distanciaTerra = 0;
    }

    public Satelite(double m, double p, double d) {//EN LOS METODOS NO VA ;

        meridiano = m;
        paralelo = p;
        distanciaTerra = d;

    }

    //toString
    public void verPosicion() {

        System.out.println("o satelite atopase no paralelo " + paralelo + " meridiano " + meridiano + " a unha distancia da terra " + distanciaTerra);
        //hay que usar las comillas rectas"" y poner + antes y despues de cualquier atributo
        // “ o satelite atopase no paralelo “ paralelo + “meridiano ” + meridiano “ a unha distancia da terra “ +“ distanciaTerra 

    }

}
