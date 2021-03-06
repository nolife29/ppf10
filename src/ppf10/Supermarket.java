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
public class Supermarket extends Company implements MarketService {

    private double potatoesPrice;

    public Supermarket(double potatoesPrice, String name, int valNumber) {
        super(name, valNumber);
        this.potatoesPrice = potatoesPrice;
    }

    @Override
    public double getPotatoesPrice() {
        return potatoesPrice;
    }

    @Override
    public void setPotatoesPrice(double potatoesPrice) {
        this.potatoesPrice = potatoesPrice;
    }

    @Override
    public double getMarketTotal(double kilos) {
        return Total(kilos);
    }

    public double Total(double kilos) {
        double total = kilos * getPotatoesPrice();
        return total;
    }
}
