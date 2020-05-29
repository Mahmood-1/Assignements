package finalProject.shop;

public class WeightedProduct extends Product {
    private double weight;

    public WeightedProduct(int id, String name, String description, double price, double weigth) {
        super(id, name, description, price);
        this.weight = weigth;
    }
    @Override
    double calcPay() {
        return weight * getPrice();
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public String toReadable() {
        return "Weigthed Product" + super.toReadable() + "\n\tweigth = " + weight + "\n\tcalculated price = " + calcPay() + "\n=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-";
    }

    @Override
    public String toString() {
        return super.toString() + weight + ",W";
    }
}
