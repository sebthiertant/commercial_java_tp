package fr.commercial;

import fr.commercial.product.Product;

import java.util.ArrayList;

public class Commercial {
    private long balance;
    private ArrayList<Product> productsArrayList;

    // CONSTRUCTOR
    public Commercial(long balance) {
        this.balance = balance;
        this.productsArrayList = new ArrayList<Product>();
    }

    // GETTERS
    public long getBalance(){
        return this.balance;
    }

    public ArrayList<Product> getProductsArrayList(){
        return this.productsArrayList;
    }

    // METHODS
    public void addProduct(String name, float buyingPrice, float sellingPrice){
        Product product = new Product(name, buyingPrice, sellingPrice);
        this.productsArrayList.add(product);
        System.out.println("The product " + name + " has been added.");
    }

    public void buyProduct(String name, int quantity){
        for (Product product : productsArrayList){
            if (product.getName().equalsIgnoreCase(name)) {
                product.addStock(quantity);
                this.balance -= product.getBuyingPrice() * quantity;
                System.out.println("The stock of product " + product.getName() + " has been increased from " + quantity + ". The total stock is now " + product.getStock() + ".");
            } else {
                System.out.println("The product " + name + " is not found");
            }
        }
    }

    public void sellProduct(String name, int quantity){
        for (Product product : productsArrayList){
            if (product.getName().equalsIgnoreCase(name)) {
                product.pullStock(quantity);
                this.balance += product.getSellingPrice() * quantity;
                System.out.println("The stock of product " + product.getName() + " has been decreased from " + quantity + ". The total stock is now " + product.getStock() + ".");
            } else {
                System.out.println("The product " + name + " is not found");
            }
        }
    }

    public void results(){
        System.out.println("The balance of the market is " + getBalance() + "€");
    }
}
