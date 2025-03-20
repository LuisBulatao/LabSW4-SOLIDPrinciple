package OCP;

public class Senior implements DiscountCalculate {
    @Override
    public double calculateDiscount(double amount) {
        return amount * 0.10;
    }
}
