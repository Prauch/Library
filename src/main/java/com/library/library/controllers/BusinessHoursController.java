/*package com.library.library.controllers;

import com.library.library.models.BusinessHours;
import com.library.library.models.Library;
import com.library.library.repositories.BusinessHoursRepository;
import com.library.library.repositories.LibraryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

public class BusinessHoursController {

    @Autowired
    BusinessHoursRepository businessHoursRepository;

    @Autowired
    LibraryRepository libraryRepository;

    @GetMapping("/api/bhours/{libraryId}")
    public List<BusinessHours> findBusinessHoursOf(@PathVariable Long libraryId)
    {
        return businessHoursRepository.findByLibrary(libraryId);
    }

    @PostMapping("/api/bhours/{libraryId}")
    public void createBusinessHours(@RequestBody BusinessHours bHours, @PathVariable Long libraryId)
    {
        BusinessHours newBusinessHours = new BusinessHours();
        newBusinessHours.setCloseTime(bHours.getCloseTime());
        newBusinessHours.setOpenTime(bHours.getOpenTime());
        newBusinessHours.setDayOfTheWeek(bHours.getDayOfTheWeek());
        Library library = libraryRepository.findById(libraryId).get();
        newBusinessHours.setLibraryNumber(library.getLibraryNumber());

        businessHoursRepository.save(newBusinessHours);

    }


}
*/