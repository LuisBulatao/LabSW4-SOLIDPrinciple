package DIP;

public class test {
    public static void main(String[]args){

        ProcessPayment eWallet = new ProcessPayment(new EWallet());
        ProcessPayment creditCard = new ProcessPayment(new CreditCard());
        ProcessPayment cash = new ProcessPayment(new Cash());

        System.out.println(eWallet.ProcessPayment(500));
        System.out.println(creditCard.ProcessPayment(500));
        System.out.println(cash.ProcessPayment(500));
    }
}
