package com.pluralsight.conferencedemo.models;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
//CREATE TABLE attendee_tickets
//        (
//        attendee_ticket_id SERIAL PRIMARY KEY,
//        attendee_id        integer       NOT NULL REFERENCES attendees (attendee_id),
//        ticket_price_id    integer       NOT NULL REFERENCES ticket_prices (ticket_price_id),
//        discount_code_id   integer       NULL REFERENCES discount_codes (discount_code_id),
//        net_price          numeric(8, 2) NOT NULL
//        );

public class AttendeeTickets {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "attendee_id")
    private int attendeeId;

    @Column(name = "ticket_price_id")
    private String ticketPriceId;

    @Column(name = "discount_code_id")
    private String discountCodeId;

    @Column(name = "net_price")
    private String netPrice;

    public AttendeeTickets() {
    }

    public int getAttendeeId() {
        return attendeeId;
    }

    public void setAttendeeId(int attendeeId) {
        this.attendeeId = attendeeId;
    }

    public String getTicketPriceId() {
        return ticketPriceId;
    }

    public void setTicketPriceId(String ticketPriceId) {
        this.ticketPriceId = ticketPriceId;
    }

    public String getDiscountCodeId() {
        return discountCodeId;
    }

    public void setDiscountCodeId(String discountCodeId) {
        this.discountCodeId = discountCodeId;
    }

    public String getNetPrice() {
        return netPrice;
    }

    public void setNetPrice(String netPrice) {
        this.netPrice = netPrice;
    }
}
