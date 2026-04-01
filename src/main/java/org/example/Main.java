package org.example;
import model.*;
import model.constants.Colour;
import service.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Meat meat = new Meat ((byte) 5, 100.0);
        Apple appleRed = new Apple ((byte) 10, 50.0, Colour.RED);
        Apple appleGreen = new Apple ((byte) 8, 60.0, Colour.GREEN);

        Food[] products = {meat, appleRed, appleGreen};

        ShoppingCart cart = new ShoppingCart(products);

        System.out.println("Общая сумма товаров без скидки: " + cart.getSumWithoutDiscount());
        System.out.println("Общая сумма товаров со скидкой: " + cart.getSumWithDiscount());
        System.out.println("Сумма всех вегетарианских продуктов без скидки: " + cart.getSumVegetarianWithoutDiscount());
    }
}