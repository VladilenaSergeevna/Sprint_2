package service;

import model.Food;

public class ShoppingCart {

    private Food[] cart;

    public ShoppingCart(Food[] cart) {
        this.cart = cart;
    }

    public double getSumWithoutDiscount () {

        double sum = 0;

        for (Food food : cart) {
            sum = sum + food.getPrice() * food.getAmount();
        }

        return sum;

    }

    public double getSumWithDiscount () {

        double discount = 0;

        double sum = 0;

        for (Food food : cart) {
            sum = sum + food.getPrice() * food.getAmount();
        }

        for (Food food : cart) {
            if (food.getDiscount() != 0) {
                discount = discount + food.getPrice() * food.getAmount() * (food.getDiscount() / 100);
            }
        }

        return sum - discount;

    }

    public double getSumVegetarianWithoutDiscount () {

        double sum = 0;

        for (Food food : cart) {
            if (food.isVegetarian()) {
                sum = sum + food.getPrice() * food.getAmount();
            }
        }

        return sum;

    }
}
