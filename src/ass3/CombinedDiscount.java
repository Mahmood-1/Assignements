package ass3;

public class CombinedDiscount implements DiscountPolicy {

    private final DiscountPolicy discount1;
    private final DiscountPolicy discount2;

    public CombinedDiscount(final DiscountPolicy discount1, final DiscountPolicy discount2) {
        this.discount1 = discount1;
        this.discount2 = discount2;
    }

    @Override
    public double computeDiscount(int count, double itemCost) {
        final double dis1 = discount1.computeDiscount(count, itemCost);
        final double dis2 = discount2.computeDiscount(count, itemCost);
        return Math.max(dis1, dis2);
    }


}