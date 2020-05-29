package ass3;

public class BulkDiscount implements DiscountPolicy {
    private final int minimum;
    private final double percent;
    
    public BulkDiscount(int minimum, double percent) {
        this.minimum = minimum;
        this.percent = percent;
    }

    
    @Override
    public double computeDiscount(int count, double itemCost) {
        double sum = count * itemCost;
        if(sum >= minimum) {
            return percent * sum;
        }
        return 0;
    }


}