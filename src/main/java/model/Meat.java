package model;

public class Meat extends Food {

    public Meat (byte amount, double price) {
        this.amount = amount;
        this.price = price;
        isVegetarian = false;
    }

}
