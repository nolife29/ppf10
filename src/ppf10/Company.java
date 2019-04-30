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
    private int valNumber;

    public Company(String name, int valNumber) {
        this.name = name;
        this.valNumber = valNumber;
    }

    public String getName() {
        return name;
    }

    public int getValNumber() {
        return valNumber;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setValNumber(int valNumber) {
        this.valNumber = valNumber;
    }

}
