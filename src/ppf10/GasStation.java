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
public class GasStation extends Company implements GasService {

    private double gasprice;

    public GasStation(double gasprice, String name, int valNumber) {
        super(name, valNumber);
        this.gasprice = gasprice;
    }

    /**
     *
     * @return retorna o valor do preço do gás
     */
    @Override
    public double getGasPrice() {
        return this.gasprice;
    }

    /**
     *
     * @param p novo valor do preço do gás
     */
    @Override
    public void setGasPrice(double p) {
        this.gasprice = p;
    }

    @Override
    public double getGasTotal(double litros) {
        return totalGas(litros);
    }

    /**
     *
     * @param litros número de litros requeridos
     * @return retorna o preço dos litros de acordo com o preço pré definido
     */
    public double totalGas(double litros) {
        double total = litros * getGasPrice();
        return total;
    }
}
