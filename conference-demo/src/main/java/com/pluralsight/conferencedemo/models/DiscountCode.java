package com.pluralsight.conferencedemo.models;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

//CREATE TABLE discount_codes
//        (
//        discount_code_id SERIAL PRIMARY KEY,
//        discount_code    varchar(20)   NOT NULL,
//        discount_name    varchar(30)   NOT NULL,
//        discount_type    varchar(1)    NOT NULL,
//        discount_amount  numeric(8, 2) NOT NULL
//        );
public class DiscountCode {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "discount_code_id")
    private int DiscCodeId;

    @Column(name = "discount_code")
    private String DiscountCode;

    @Column(name = "discount_name")
    private String lastName;

    @Column(name = "discount_type")
    private String discountType;

    @Column(name = "discount_amount")
    private String discountAmount;

    public DiscountCode() {
    }

    public int getDiscCodeId() {
        return DiscCodeId;
    }

    public void setDiscCodeId(int discCodeId) {
        DiscCodeId = discCodeId;
    }

    public String getDiscountCode() {
        return DiscountCode;
    }

    public void setDiscountCode(String discountCode) {
        DiscountCode = discountCode;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getDiscountType() {
        return discountType;
    }

    public void setDiscountType(String discountType) {
        this.discountType = discountType;
    }

    public String getDiscountAmount() {
        return discountAmount;
    }

    public void setDiscountAmount(String discountAmount) {
        this.discountAmount = discountAmount;
    }
}
