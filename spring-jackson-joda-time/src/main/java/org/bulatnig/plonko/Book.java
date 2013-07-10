package org.bulatnig.plonko;

import org.joda.time.DateTime;
import org.joda.time.LocalDate;
import org.joda.time.LocalDateTime;
import org.joda.time.LocalTime;

import java.util.Date;

public class Book {

    String id;
    String title;
    private Date createdDate = new Date();
    private DateTime createdDateTime = new DateTime();
    private LocalDate createdLocalDate = new LocalDate();
    private LocalTime createdLocalTime = new LocalTime();
    private LocalDateTime createdLocalDateTime = new LocalDateTime();

    public Book() {
    }

    public Book(String id, String title) {
        this.id = id;
        this.title = title;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public DateTime getCreatedDateTime() {
        return createdDateTime;
    }

    public LocalDate getCreatedLocalDate() {
        return createdLocalDate;
    }

    public LocalTime getCreatedLocalTime() {
        return createdLocalTime;
    }

    public LocalDateTime getCreatedLocalDateTime() {
        return createdLocalDateTime;
    }
}
