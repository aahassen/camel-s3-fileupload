package com.javakia.microservice.api.message;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.javakia.microservice.api.service.SMSService;

@RestController
public class SMSController {

	@Autowired
	private SMSService smsService;

	@RequestMapping("/sendSMS")
	public String sendSMS() {
		return smsService.sendSMS();
	}

}
