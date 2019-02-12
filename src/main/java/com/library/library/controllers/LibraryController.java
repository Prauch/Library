package com.library.library.controllers;

import com.library.library.models.Library;
import com.library.library.repositories.LibraryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class LibraryController {

    @Autowired
    LibraryRepository libraryRepository;

    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping("/api/library/")
    public List<Library> findAll()
    {
        return libraryRepository.findAll();
    }

    @GetMapping("api/library/{id}")
    public Library findById(@PathVariable Long id)
    {
        return libraryRepository.findById(id).get();
    }


    @PostMapping("api/library/")
    public Library createLibrary(@RequestBody Library library)
    {
        Library newLibrary = new Library();
        newLibrary.setAddress(library.getAddress());
        newLibrary.setLibraryNumber(library.getLibraryNumber());
        newLibrary.setName(library.getName());
        return libraryRepository.save(newLibrary);
    }

}
