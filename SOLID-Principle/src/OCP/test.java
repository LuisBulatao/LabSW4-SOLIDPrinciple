package OCP;

public class test {
    public static void main(String []args){
        Customer student = new Customer("King", new Student());
        Customer senior = new Customer("Queen", new Senior());
        Customer regular = new Customer("Arthur", new Regular());

        System.out.println(student.getName() + " Student Discount: " + student.applyDiscount(500));
        System.out.println(senior.getName() + " Senior Discount: " + senior.applyDiscount(500));
        System.out.println(regular.getName() + " Regular: " + regular.applyDiscount(500));
    }
}

