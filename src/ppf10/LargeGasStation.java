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
public class LargeGasStation extends GasStation implements CoffeeService{

    public LargeGasStation(double gasprice, String name, int valNumber) {
        super(gasprice, name, valNumber);
    }

    @Override
    public double getCoffeePrice() {
        return getGasPrice();
    }

    @Override
    public void setCoffeePrice(double p) {
        setGasPrice(p);
    }

    @Override
    public double getCoffeeTotal( int coffees){
        return getGasTotal(coffees);
    }
}
