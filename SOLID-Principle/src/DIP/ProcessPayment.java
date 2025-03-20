package DIP;

public class ProcessPayment {
    PaymentMethod method;

    public ProcessPayment(PaymentMethod method) {
        this.method = method;
    }

    public String ProcessPayment(double amount) {
        return method.payMethod(amount);
    }
}
