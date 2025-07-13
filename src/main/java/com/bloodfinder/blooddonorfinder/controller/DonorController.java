package com.bloodfinder.blooddonorfinder.controller;

import com.bloodfinder.blooddonorfinder.model.Donor;
import com.bloodfinder.blooddonorfinder.service.DonorService;
import com.bloodfinder.blooddonorfinder.service.SmsService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DonorController {

    private final DonorService donorService;
    private final SmsService smsService;

    public DonorController(DonorService donorService, SmsService smsService) {
        this.donorService = donorService;
        this.smsService = smsService;
    }
    @PostMapping("/add-donor")
    public String addDonor(@RequestBody Donor donor) {
        donorService.saveDonor(donor);
        return "Donor added successfully!";
    }


    @PostMapping("/request")
    public String handleBloodRequest(@RequestParam String name,
                                     @RequestParam String bloodGroup,
                                     @RequestParam String city,
                                     @RequestParam String location) {
        List<Donor> donors = donorService.findMatchingDonors(bloodGroup, city);

        String message = "Urgent blood request from " + name +
                         " at " + location + ", " + city + ". Needed blood group: " + bloodGroup;

        for (Donor d : donors) {
            smsService.sendSMS(d.getPhoneNumber(), message);
        }

        return "Request submitted. Matching donors notified via SMS.";
    }
}
