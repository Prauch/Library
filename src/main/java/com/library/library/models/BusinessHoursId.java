package com.library.library.models;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class BusinessHoursId implements Serializable {

    @ManyToOne
    @JoinColumn(name = "FK_library_id")
    private Library library;

    @Column(name = "week_day")
    private WeekDay weekDay;


    public WeekDay getWeekDay() {
        return weekDay;
    }

    public void setWeekDay(WeekDay weekDay) {
        this.weekDay = weekDay;
    }

    public Library getLibrary() {
        return library;
    }

    public void setLibrary(Library library) {
        this.library = library;
    }
}
