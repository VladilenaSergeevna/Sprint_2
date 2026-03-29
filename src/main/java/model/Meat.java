package model;

import model.constants.Discount;

public class Meat extends Food implements Discountable {

    public Meat (byte amount, double price) {
        this.amount = amount;
        this.price = price;
        isVegetarian = false;
    }

    @Override
    public byte getDiscount() {
        return Discount.DISCOUNT_0;
    }
}
