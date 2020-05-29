package finalProject.shop;

import finalProject.util.FileHandler;

import java.io.PrintWriter;

public class DimensionalProduct extends Product {
    private double width;
    private double length;

    public DimensionalProduct(int id, String name, String description, double price, double width, double length) {
        super(id, name, description, price);
        this.width = width;
        this.length = length;
    }

    @Override
    double calcPay() {
        return width * length * getPrice();
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }
    @Override
    public String toReadable() {
        return "Dimensional Product"  + super.toReadable() + "\n\twidth = " + width + "\n\tlenght = " + length + "\n\tcalculated price = " + calcPay() + "\n=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-";
    }
    @Override
    public String toString() {
        return super.toString() + width + "," + length + ",D";
    }
}
