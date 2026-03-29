package model;

public abstract class Food implements Discountable {
    protected byte amount;
    protected double price;
    protected boolean isVegetarian;

    public double getPrice () {
        return price;
    }

    public boolean isVegetarian () {
        return isVegetarian;
    }

    public byte getAmount () {
        return amount;
    }

}
