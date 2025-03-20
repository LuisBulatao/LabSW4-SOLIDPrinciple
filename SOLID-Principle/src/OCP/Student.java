package OCP;

public class Student implements DiscountCalculate {
    @Override
    public double calculateDiscount(double amount) {
        return amount * 0.5;
    }
}
