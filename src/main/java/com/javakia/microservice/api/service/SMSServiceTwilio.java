package com.javakia.microservice.api.service;

import org.springframework.stereotype.Service;

import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Message;
@Service
public class SMSServiceTwilio implements SMSService{
    // Find your Account Sid and Token at twilio.com/console
    public static final String ACCOUNT_SID = "XXXXXXXXXXXXXXX";
    public static final String AUTH_TOKEN = "XXXXXXXXXXXXXXX";

    @Override
    public Message sendSMS() {
        Twilio.init(ACCOUNT_SID, AUTH_TOKEN);
        Message message = Message.creator(
                new com.twilio.type.PhoneNumber("+XXXXXXXXXX"),
                new com.twilio.type.PhoneNumber("+XXXXXXXXXX"),
                "Teaching is The new learning")
           .create();

        return message;
    }
}
