package org.bulatnig.plonko;

import org.joda.time.DateTime;

import java.util.Date;

public class Book {

    String id;
    String title;
    private Date createdDate = new Date();
    private DateTime createdDateTime = new DateTime();

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
}
