package DIP;

public class Cash implements PaymentMethod {
    @Override
    public String payMethod(double amount) {
        return "You are paying in Cash and the amount is " + amount;
    }
}
