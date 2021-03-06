package model;

public class Salt implements Aliment{
    private final String name;
    private final int price;

    public Salt(String name, int price)
    {
        this.price = price;
        this.name = name;
    }

    @Override
    public boolean equals(Aliment aliment)
    {
        return name.equals(aliment.getName());
    }

    @Override
    public String getName(){return name;}

    @Override
    public int getPrice()
    {
        return price;
    }

    @Override
    public String toString() { return name + " -> " + price;}
}
