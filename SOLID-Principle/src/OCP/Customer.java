package OCP;

public class Customer {

    private String name;
    private DiscountCalculate type;
    public Customer(String name, DiscountCalculate discount) {
        this.name = name;
        this.type = discount;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double applyDiscount(double amount){
        return amount - type.calculateDiscount(amount);
    }
}
