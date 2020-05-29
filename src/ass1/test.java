package ass1;


public class test {
    public static void main(String[] args) {
        Rectangle rect1 = new Rectangle(40.0, 4);
        Rectangle rect2 = new Rectangle(35.9, 3.5);
        Rectangle rect3 = new Rectangle();
        System.out.println("Rect1 : \n\tArea : " + rect1.getArea() + "\n\tPriemeter : " + rect1.getPerimeter()
                + "\n\tWidth : " + rect1.getWidth() + "\n\tHieght : " + rect1.getHeight());


        System.out.println("Rect2 : \n\tArea : " + rect2.getArea() + "\n\tPriemeter : " + rect2.getPerimeter()
                + "\n\tWidth : " + rect2.getWidth() + "\n\tHieght : " + rect2.getHeight());


        System.out.println("Rect3 : \n\tArea : " + rect3.getArea() + "\n\tPriemeter : " + rect3.getPerimeter()
                + "\n\tWidth : " + rect3.getWidth() + "\n\tHieght : " + rect3.getHeight());
        System.out.println("\n\nnumber of objects : " + Rectangle.getNumberOfObjects());
    }
}