package ISP;
public class test {
    public static void main(String[]args) {
        BasicPhone nokia = new BasicPhone();
        Samsung samsung = new Samsung();
        Iphone iphone = new Iphone();

        //Basic Phone
        System.out.println(nokia.makeCall());
        System.out.println(nokia.sendSMS());

        System.out.println();

        //Samsung
        System.out.println(samsung.makeCall());
        System.out.println(samsung.sendSMS());
        System.out.println(samsung.browseWeb());
        System.out.println(samsung.takePicture());

        System.out.println();

        //Iphone
        System.out.println(iphone.makeCall());
        System.out.println(iphone.sendSMS());
        System.out.println(iphone.browseWeb());
        System.out.println(iphone.takePicture());

    }
}
