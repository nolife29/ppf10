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
public interface MarketService {

    public double getPotatoesPrice();

    public void setPotatoesPrice(double p);

    public double getMarketTotal(double kilos);
}
