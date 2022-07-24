package com.pluralsight.conferencedemo.models;

import javax.persistence.*;

@Entity
@Table(name = "attendee")
public class Attendee {

//    CREATE TABLE attendees
//            (
//                    attendee_id  SERIAL PRIMARY KEY,
//                    first_name   varchar(30) NOT NULL,
//    last_name    varchar(30) NOT NULL,
//    title        varchar(40) NULL,
//    company      varchar(50) NULL,
//    email        varchar(80) NOT NULL,
//    phone_number varchar(20) NULL
//);

    //    INSERT INTO attendees (attendee_id,first_name,last_name,title,company,email,phone_number)
//    VALUES (1,'Sergio','Amigos','Senior Java Developer','Microware Software','Sergio.Amigos@gmail.com', 9804224200),
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "attendee_id")
    private int attendeeId;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "title")
    private String title;

    @Column(name = "company")
    private String company;

    @Column(name = "email")
    private String email;

    @Column(name = "phone_number")
    private String phoneNo;

    public Attendee() {
    }

    public int getAttendeeId() {
        return attendeeId;
    }

    public void setAttendeeId(int attendeeId) {
        this.attendeeId = attendeeId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }
}
