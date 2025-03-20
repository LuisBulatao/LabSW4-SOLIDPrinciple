package ISP;

import ISP.Interface.MakeCall;
import ISP.Interface.SendSMS;

public class BasicPhone implements MakeCall, SendSMS {

    @Override
    public String makeCall() {
        return "The Basic Phone can make a call";
    }

    @Override
    public String sendSMS() {
        return "The Basic Phone can send a message";
    }

}
