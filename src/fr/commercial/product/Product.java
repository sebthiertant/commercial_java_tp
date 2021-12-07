package fr.commercial.product;

public class Product {

    private String name;
    private float buyingPrice;
    private float sellingPrice;
    private int stock;
    private String description;


    // CONSTRUCTORS
    public Product(String name, float buyingPrice, float sellingPrice) {
        this.name = name;
        this.buyingPrice = buyingPrice;
        this.sellingPrice = sellingPrice;
        this.stock = 0;
        this.description = "No description";
    }

    public Product(String name, float buyingPrice, float sellingPrice, int stock) {
        this.name = name;
        this.buyingPrice = buyingPrice;
        this.sellingPrice = sellingPrice;
        this.stock = stock;
        this.description = "No description";
    }

    public Product(String name, float buyingPrice, float sellingPrice, int stock, String description) {
        this.name = name;
        this.buyingPrice = buyingPrice;
        this.sellingPrice = sellingPrice;
        this.stock = stock;
        this.description = description;
    }

    // GETTERS & SETTERS

    public String getName() {
        return name;
    }

    public float getBuyingPrice() {
        return buyingPrice;
    }

    public float getSellingPrice() {
        return sellingPrice;
    }

    public int getStock() {
        return stock;
    }

    public void addStock(int value) {
        this.stock += value;
    }

    public void pullStock(int value) {
        this.stock -= value;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    // METHODS
    public void displayDescription(){
        System.out.println(getDescription());
    }


}