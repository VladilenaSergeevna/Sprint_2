package model;

import model.constants.Colour;
import model.constants.Discount;

public class Apple extends Food implements Discountable {

    private String colour;

    public Apple (byte amount, double price, String colour) {
        this.amount = amount;
        this.price = price;
        this.colour = colour;
        isVegetarian = true;
    }

    @Override
    public byte getDiscount() {
        if (colour.equals(Colour.RED)) {
            return Discount.DISCOUNT_60;
        } else {
            return Discount.DISCOUNT_0;
        }
    }
}
