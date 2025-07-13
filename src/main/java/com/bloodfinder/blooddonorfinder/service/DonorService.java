package com.bloodfinder.blooddonorfinder.service;

import com.bloodfinder.blooddonorfinder.model.Donor;
import com.bloodfinder.blooddonorfinder.repository.DonorRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DonorService {

    private final DonorRepository donorRepository;

    public DonorService(DonorRepository donorRepository) {
        this.donorRepository = donorRepository;
    }

    public List<Donor> findMatchingDonors(String bloodGroup, String city) {
        return donorRepository.findByBloodGroupAndCityAndAvailable(bloodGroup, city, true);
    }

    public Donor saveDonor(Donor donor) {
        return donorRepository.save(donor);
    }
}
