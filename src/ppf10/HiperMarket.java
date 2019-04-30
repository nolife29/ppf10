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
public class HiperMarket extends Supermarket implements HipermarketService {

    private double annualRate;
    private double coffeePrice;
    private double gasPrice;

    public HiperMarket(double annualRate, double coffeePrice, double gasPrice, double potatoesPrice, String name, int valNumber) {
        super(potatoesPrice, name, valNumber);
        this.annualRate = annualRate;
        this.coffeePrice = coffeePrice;
        this.gasPrice = gasPrice;
    }

    @Override
    public double getAnnualRate() {
        return this.annualRate;
    }

    @Override
    public void setAnnualRate(double r) {
        this.annualRate = r;
    }

    @Override
    public double computeMonthlyPayment(double ammount, int months) {
        return TotalAnnual(ammount, months);
    }

    @Override
    public double getCoffeePrice() {
        return this.coffeePrice;
    }

    @Override
    public void setCoffeePrice(double p) {
        this.coffeePrice = p;
    }

    @Override
    public double getCoffeeTotal(int coffees) {
        return TotalR(coffees, this.coffeePrice);
    }

    @Override
    public double getGasPrice() {
        return this.gasPrice;
    }

    @Override
    public void setGasPrice(double p) {
        this.gasPrice = p;
    }

    @Override
    public double getGasTotal(double litros) {
        return TotalR(litros, this.gasPrice);
    }

    public double TotalAnnual(double ammount, int months) {
        double total = getAnnualRate() * ammount / months;
        return total;
    }

    public double TotalR(double number, double price) {
        double total = number * price;
        return total;
    }

}
