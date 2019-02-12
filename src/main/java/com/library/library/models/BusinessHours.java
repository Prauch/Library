/*
package com.library.library.models;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

@Entity
public class BusinessHours implements Serializable {

    @EmbeddedId
    private BusinessHoursId id;

    private String openTime;

    private String closeTime;

    private WeekDay dayOfTheWeek;

    private Long libraryNumber;

    public BusinessHoursId getId() {
        return id;
    }

    public void setId(BusinessHoursId id) {
        this.id = id;
    }

    public String getOpenTime() {
        return openTime;
    }

    public void setOpenTime(String openTime) {
        this.openTime = openTime;
    }

    public String getCloseTime() {
        return closeTime;
    }

    public void setCloseTime(String closeTime) {
        this.closeTime = closeTime;
    }

    public WeekDay getDayOfTheWeek() {
        return dayOfTheWeek;
    }

    public void setDayOfTheWeek(WeekDay dayOfTheWeek) {
        this.dayOfTheWeek = dayOfTheWeek;
    }

    public Long getLibraryNumber() {
        return libraryNumber;
    }

    public void setLibraryNumber(Long libraryNumber) {
        this.libraryNumber = libraryNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BusinessHours that = (BusinessHours) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(openTime, that.openTime) &&
                Objects.equals(closeTime, that.closeTime) &&
                dayOfTheWeek == that.dayOfTheWeek &&
                Objects.equals(libraryNumber, that.libraryNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, openTime, closeTime, dayOfTheWeek, libraryNumber);
    }
}
*/