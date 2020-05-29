package ass1;

public class Rectangle {
    private double width = 1;
    private double height = 1;
    private static int numberOfObjects = 0;

    public Rectangle(){
        numberOfObjects++;
    }

    public Rectangle(double width, double height) {
        if(height >= 0)
        this.height = height;
        if(width >= 0)
        this.width = width;
        numberOfObjects++;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getArea() {
        double area = this.height * this.width;
        return area;
    }

    public double getPerimeter() {
        double Perimeter = 2 * (this.height + this.width);
        return Perimeter;
    }

    public static int getNumberOfObjects() {
        return numberOfObjects;
    }

}
