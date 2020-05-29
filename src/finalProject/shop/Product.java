package finalProject.shop;


import finalProject.util.FileHandler;

import java.io.File;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public abstract class Product {
    private int id;
    private String name;
    private String description;
    private double price;

    public Product(int id, String name, String description, double price) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.price = price;
    }

    abstract double calcPay();

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return id + "," + name + "," + description + "," + price + ",";
    }

    public static List<Product> readAll() {
        List<Product> products = new ArrayList();
        Scanner reader = FileHandler.read();
        while (reader.hasNext()) {
            String line = reader.nextLine();
            String[] words = line.split(",");
            if(words[words.length - 1].equals("W")) {
                products.add(new WeightedProduct(Integer.parseInt(words[0]),words[1],words[2],Double.parseDouble(words[3]),Double.parseDouble(words[4])));
            } else {
                products.add(new DimensionalProduct(Integer.parseInt(words[0]),words[1],words[2],Double.parseDouble(words[3]),Double.parseDouble(words[4]),Double.parseDouble(words[5])));
            }
        }
        return products;
    }

    public static void writeAll(List<Product> products) {
        PrintWriter writer = FileHandler.write();
        for (Product product : products) {
            writer.println(product.toString());
        }
        writer.close();
    }

    public String toReadable() {
        return  "id = " + getId() + "\n\tname = " + getName() + "\n\tdesc = " + getDescription() + "\n\tprice = " + getPrice();
    }

}
