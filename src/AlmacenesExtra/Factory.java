/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AlmacenesExtra;

public class Factory {
    
    private int codeFactory;
    private String nameFactory;
    private int amount=0;
    private Object products;
    
    public Factory(int codeFactory, String nameFactory, int amount, Object products) {
        this.codeFactory = codeFactory;
        this.nameFactory = nameFactory;
        this.amount = amount;
        this.products = products;
    }

    public int getCodeFactory() {
        return codeFactory;
    }

    public void setCodeFactory(int codeFactory) {
        this.codeFactory = codeFactory;
    }

    public String getNameFactory() {
        return nameFactory;
    }

    public void setNameFactory(String nameFactory) {
        this.nameFactory = nameFactory;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public Object getProducts() {
        return products;
    }

    public void setProducts(Object products) {
        this.products = products;
    }


    public String toString() {
        return "The factory is" + "code factory :" + codeFactory + ", name factory:" + nameFactory + ", amount:" + amount + ", products:" + products ;
    }
    
    


    
    
    
}
