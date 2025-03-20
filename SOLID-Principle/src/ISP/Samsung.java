package ISP;

import ISP.Interface.BrowseWeb;
import ISP.Interface.MakeCall;
import ISP.Interface.SendSMS;
import ISP.Interface.TakePicture;

public class Samsung implements MakeCall, SendSMS, BrowseWeb, TakePicture {
    @Override
    public String browseWeb() {
        return "The Samsung can browse a web";
    }

    @Override
    public String makeCall() {
        return "The Samsung can make a call";
    }

    @Override
    public String sendSMS() {
        return "The Samsung can send a message";
    }

    @Override
    public String takePicture() {
        return "The Samsung can take a picture";
    }
}