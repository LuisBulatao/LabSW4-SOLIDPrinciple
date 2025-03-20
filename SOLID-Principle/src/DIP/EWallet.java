package DIP;

public class EWallet implements PaymentMethod {

    @Override
    public String payMethod(double amount) {
        return "You are paying using EWallet and the amount is " + amount;
    }
}
