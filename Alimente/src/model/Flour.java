package model;

public class Flour implements Aliment{
    private final String name;
    private final int price;

    public Flour(String name, int price)
    {
        this.price = price;
        this.name = name;
    }

    @Override
    public int getPrice()
    {
        return price;
    }

    @Override
    public String toString() { return name + " -> " + price;}
}
