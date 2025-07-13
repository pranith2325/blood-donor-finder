package com.bloodfinder.blooddonorfinder.repository;

import com.bloodfinder.blooddonorfinder.model.Donor;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface DonorRepository extends JpaRepository<Donor, Long> {
    List<Donor> findByBloodGroupAndCityAndAvailable(String bloodGroup, String city, boolean available);
}
