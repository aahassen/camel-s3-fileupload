package com.javakia.microservice.api.service;

import org.springframework.stereotype.Service;

import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Message;
@Service
public class SMSServiceTwilio implements SMSService{
    // Find your Account Sid and Token at twilio.com/console
    public static final String ACCOUNT_SID = "ACff14cd22e3c47bc7c1c97347a9c84191";
    public static final String AUTH_TOKEN = "c49c096071946f761cf81aad814a9348";

    public String sendSMS() {
        Twilio.init(ACCOUNT_SID, AUTH_TOKEN);
        Message message = Message.creator(
                new com.twilio.type.PhoneNumber("+12029976259"),
                new com.twilio.type.PhoneNumber("+12408235630"),
                "SMS service is live")
           .create();

        return message.getSid();
    }
}
