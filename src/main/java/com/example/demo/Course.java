package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Date;

@Entity
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @NotNull
    @Size(min = 4)
    private String content;

    @NotNull
    @Size(min = 3)
    private String sentby;

    @NotNull
    @Size(min = 10)
    private String imageurl;

    @NotNull
    @Min(3)
    private Date posteddate;

    public long getid() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String get() {
        return content;
    }

    public void content(String content) {
        this.content = content;
    }

    public String getsentby() {
        return sentby;
    }

    public void setsentby(String setsentby) {
        this.sentby = setsentby;
    }

    public String getimageurl() {
        return imageurl;
    }

    public void setimageurl(String imageurl) {
        this.imageurl = imageurl;
    }

    public Date posteddate() {
        return posteddate;
    }

    public void setposteddate(Date posteddate) {
        this.posteddate = posteddate;
    }
}
