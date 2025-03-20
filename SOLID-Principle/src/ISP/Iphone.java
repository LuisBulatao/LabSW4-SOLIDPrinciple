package ISP;

import ISP.Interface.BrowseWeb;
import ISP.Interface.MakeCall;
import ISP.Interface.SendSMS;
import ISP.Interface.TakePicture;

public class Iphone implements MakeCall, SendSMS, BrowseWeb, TakePicture {
    @Override
    public String browseWeb() {
        return "The Iphone can browse a web";
    }

    @Override
    public String makeCall() {
        return "The Iphone can make a call";
    }

    @Override
    public String sendSMS() {
        return "The Iphone can send a message";
    }

    @Override
    public String takePicture() {
        return "The Iphone can take a picture";
    }
}
