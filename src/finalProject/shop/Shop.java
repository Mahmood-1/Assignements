package finalProject.shop;

import java.util.InputMismatchException;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Shop {

    public static Scanner IN= new Scanner(System.in);

    public final static List<Product> products = Product.readAll();

    public static void main(String[] args) {
        IN.useLocale(Locale.US);
        Shop.menu();
    }


    public static void menu() {
        System.out.println("1- Show All products");
        System.out.println("2-Add product");
        System.out.println("3-Delete product");
        System.out.println("4-Edit product");
        System.out.println("5-Calculate Total");
        System.out.println("6-Save data");
        System.out.println("7-Exit ");

        int input = validatedIntRead("Plaese enter your choice >> ");
        switch (input) {
            case 1:
                printAll();
                break;
            case 2:
                addProduct();
                System.out.println("Product added successfully...");
                break;
            case 3:
                int number = validatedIntRead("Please Enter Id >> ");
                int i = 0;
                int size = products.size();
                while (size > i && products.size() > 0) {
                    if (products.get(i).getId() == number) {
                        products.remove(i);
                    } else {
                        i++;
                    }
                }
                break;
            case 4:
                    editProduct();
                break;
            case 5:
                double sum = 0;
                for(Product product : products)
                    sum += product.calcPay();
                System.out.println("sum = " + sum);
                break;
            case 6:
                Product.writeAll(products);
                break;
            case 7:
                System.exit(0);
            default:
                System.err.println("Please Enter a valid value...");
        }
        menu();
    }

    public static void addProduct() {
        products.add(getProduct());
    }

    public static void printAll() {
        boolean check = true;
            if (isD()) {
                for (Product produt : products) {
                    if (produt instanceof DimensionalProduct)
                        System.out.println(produt.toReadable());
                }
                check = false;
                Shop.menu();
            }else {
                    for(Product produt : products) {
                        if (produt instanceof WeightedProduct)
                            System.out.println(produt.toReadable());
                    }
                    check = false;
                    Shop.menu();
        }
    }

    public static boolean isD() {
        System.out.print("Choose type (w/d) >> ");
        String choice = IN.next();
        choice.toLowerCase();
        switch(choice) {
            case "d" : return true;
            case "w" : return false;
            default:
                System.err.println("Please Enter a valid value...");
                return isD();
        }
    }

    public static int validatedIntRead(String statment) {
        try {
            System.out.print(statment);
          return IN.nextInt();
        }catch (NumberFormatException | InputMismatchException e) {
            System.out.println("Invalid choice");
            IN = new Scanner(System.in);
            IN.useLocale(Locale.US);
            return validatedIntRead(statment);
        }
    }

    public static double validatedDoubleRead(String statment) {
        try {
            System.out.print(statment);
            return IN.nextDouble();
        }catch (InputMismatchException e) {
            System.out.println("Invalid choice");
            IN = new Scanner(System.in);
            IN.useLocale(Locale.US);
            return validatedDoubleRead(statment);
        }
    }

    public static Product getProduct() {
        boolean isD = isD();
        int id = validatedIntRead("Please Enter id >> ");
        System.out.print("Please Enter Name >> ");
        String name = IN.next();
        System.out.print("Please Enter Description >> ");
        String desc = new Scanner(System.in).nextLine();
        double price = validatedDoubleRead("Please Enter Price >> ");
        if (isD) {
            double width = validatedDoubleRead("Please Enter Width >> ");
            double length = validatedDoubleRead("Please Enter length >> ");
            return new DimensionalProduct(id,name,desc,price,width,length);
        }else{
            double weight = validatedDoubleRead("Please Enter weight >> ");
            return new WeightedProduct(id,name,desc,price,weight);
        }
    }
    public static void editProduct() {
        int id = validatedIntRead("Please enter an id to edit >> ");
        for(int i = 0; i < products.size(); i++)
            if(products.get(i).getId() == id) {
                System.out.println(products.get(i).toString());
            }
        Product newProduct = getProduct();
        for(int i = 0; i < products.size(); i++)
            if(products.get(i).getId() == id)
                products.set(i, newProduct);

    }
}
