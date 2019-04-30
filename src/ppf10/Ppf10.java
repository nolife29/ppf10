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
        System.out.println("Estação de gás");
        GasStation gas1 = new GasStation(1.52, "Speedy", 001);
        System.out.println("Total a pagar: " + gas1.getGasTotal(20));
        System.out.println("");
        
        System.out.println("Cafetaria");
        LargeGasStation cof1 = new LargeGasStation(0.6, "Cantinho", 002);
        System.out.println("Preço inicial: " + cof1.getCoffeePrice());
        cof1.setCoffeePrice(0.7);
        System.out.println("Novo preço: " + cof1.getCoffeePrice());
        System.out.println("Total a pagar: " + cof1.getCoffeeTotal(2));
        System.out.println("");
        
        System.out.println("Super Mercado");
        Supermarket market1 = new Supermarket(5, "Potatos Master", 003);
        System.out.println("Preço inicial: " + market1.getPotatoesPrice());
        market1.setPotatoesPrice(4.5);
        System.out.println("Novo preço: " + market1.getPotatoesPrice());
        System.out.println("Total a pagar: " + market1.getMarketTotal(2));
        System.out.println("");
        
        System.out.println("Hyper Mercado");
        HiperMarket hyper1 = new HiperMarket(1.5, 0.6, 1.42, 5, "HyperT", 004);
        System.out.println("Total annual: " + hyper1.computeMonthlyPayment(10, 2));
        System.out.println("Total coffee: "+ hyper1.getCoffeeTotal(2));
        System.out.println("Total gas: "+ hyper1.getGasTotal(10));
        System.out.println("Total potatoes: "+ hyper1.getMarketTotal(3));
    }

}
