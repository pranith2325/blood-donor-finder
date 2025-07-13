package com.bloodfinder.blooddonorfinder.service;

import org.springframework.stereotype.Service;

@Service
public class SmsService {

    public void sendSMS(String phoneNumber, String message) {
        // 🧪 SIMULATED SMS (No API call)
        System.out.println("📩 [SIMULATED SMS] To: " + phoneNumber + " | Message: " + message);
    }
}
