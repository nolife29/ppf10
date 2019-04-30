/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ppf10;

/**
 *
 * @author Ivo Martins
 */
public class Ppf10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        GasStation gas1 = new GasStation(1.52, "Speedy", 001);
        System.out.println("Total a pagar: " + gas1.getGasTotal(20));
    }

}
