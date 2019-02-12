package com.library.library.repositories;


import com.library.library.models.Library;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LibraryRepository extends JpaRepository<Library, Long> {

    Library findByLibraryNumber(Long libraryNumber);

}
