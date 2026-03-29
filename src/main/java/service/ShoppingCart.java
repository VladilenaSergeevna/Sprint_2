package service;

import model.Food;

public class ShoppingCart {

    private Food[] cart;

    public ShoppingCart(Food[] cart) {
        this.cart = cart;
    }

    public double getSumWithoutDiscount () {

        double sum = 0;

        for (int i = 0; i < cart.length; i++) {
            if (cart[i].getDiscount() == 0) {
                sum = sum + cart[i].getPrice() * cart[i].getAmount();
            }
        }

        return sum;

    }

    public double getSumWithDiscount () {

        double sum = 0;

        for (int i = 0; i < cart.length; i++) {
            if (cart[i].getDiscount() != 0) {
                sum = sum + cart[i].getPrice() * cart[i].getAmount();
            }
        }

        return sum;

    }

    public double getSumVegetarianWithoutDiscount () {

        double sum = 0;

        for (int i = 0; i < cart.length; i++) {
            if (cart[i].getDiscount() == 0 && cart[i].isVegetarian()) {
                sum = sum + cart[i].getPrice() * cart[i].getAmount();
            }
        }

        return sum;

    }
}
