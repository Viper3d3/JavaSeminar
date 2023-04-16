package Seminar6;

public class Laptop {
    public Brand brand;
    public Color color;


    public Laptop(Brand brand, Color color){
        this.brand = brand;
        this.color = color;


    }

    @Override
    public String toString() {
        return String.format(" Фирма = %s, Цвет = %s",brand,color);
    }
}
