package fr.commercial;

public class Main {
    public static void main(String[] args) {

    Commercial commercial = new Commercial(10000);
    commercial.addProduct("Apple", 10, 15);
    commercial.buyProduct("apple", 10);
    commercial.sellProduct("apple", 5);
    commercial.results();
    }
}
