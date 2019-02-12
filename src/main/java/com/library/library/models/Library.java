package com.library.library.models;



import javax.persistence.*;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "Libraries")
public class Library {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "library_id")
    private Long libraryId;

    private String name;

    private Long libraryNumber;

    private String address;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getLibraryId() {
        return libraryId;
    }

    public void setLibraryId(Long libraryId) {
        this.libraryId = libraryId;
    }

    public Long getLibraryNumber() {
        return libraryNumber;
    }

    public void setLibraryNumber(Long libraryNumber) {
        this.libraryNumber = libraryNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Library library = (Library) o;
        return Objects.equals(libraryId, library.libraryId) &&
                Objects.equals(name, library.name) &&
                Objects.equals(libraryNumber, library.libraryNumber) &&
                Objects.equals(address, library.address);
    }

    @Override
    public int hashCode() {
        return Objects.hash(libraryId, name, libraryNumber, address);
    }
}
