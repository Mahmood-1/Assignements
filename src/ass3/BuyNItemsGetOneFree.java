package ass3;

public class BuyNItemsGetOneFree implements DiscountPolicy{

    private final int n;

    public BuyNItemsGetOneFree(int n) {
        this.n = n;
    }

    @Override
    public double computeDiscount(int count, double itemCost) {    
        return (count / n) * itemCost;
    }

}