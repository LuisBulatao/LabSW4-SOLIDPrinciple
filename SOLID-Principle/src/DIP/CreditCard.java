package DIP;

public class CreditCard implements PaymentMethod {
    @Override
    public String payMethod(double amount) {
        return "You are paying using CreditCard and the amount is " + amount;
    }
}
