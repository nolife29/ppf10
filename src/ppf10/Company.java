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
public class Company{

    private String name;
    private int vatNumber;

    public Company(String name, int valNumber) {
        this.name = name;
        this.vatNumber = valNumber;
    }

    /**
     * 
     * @return retorna a variavel name
     */
    public String getName() {
        return name;
    }

    /**
     * 
     * @return retorna a variavel vatNumber
     */
    public int getVatNumber() {
        return vatNumber;
    }

    /**
     * 
     * @param name nome da empresa
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 
     * @param vatNumber numero de contribuinte
     */
    public void setVatNumber(int vatNumber) {
        this.vatNumber = vatNumber;
    }

}
