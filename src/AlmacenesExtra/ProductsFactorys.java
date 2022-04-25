/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AlmacenesExtra;

import com.sun.org.apache.bcel.internal.generic.SWITCH;

/**
 *
 * @author Usuario
 */
public class ProductsFactorys {
    
    private int code;
    private String name;
    private String typeMaterial;
    private int totalValue;
    private int cant;

    public ProductsFactorys(int code, String name, String typeMaterial, int totalValue, int cant) {
        this.code = code;
        this.name = name;
        this.typeMaterial = typeMaterial;
        this.totalValue = totalValue;
        this.cant = cant;
    }

    
    public int getCant() {
        return cant;
    }

    public void setCant(int cant) {
        this.cant = cant;
    }
    
    

    public int getTotalValue() {
        return totalValue;
    }

    public void setTotalValue(int totalValue) {
        this.totalValue = totalValue;
    }

    
   
    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTypeMaterial() {
        return typeMaterial;
    }

    public void setTypeMaterial(String typeMaterial) {
        this.typeMaterial = typeMaterial;
    }


    public String toString() {
        return "Products of the factorys:" + "code:" + code + ", name:" + name + ", type material:" + typeMaterial + "\n";
    }
     
}
