package com.cg.bookmyshow.model;

import java.time.LocalDate;
import java.util.Arrays;

public class Ticket {
	
	private String ticketId;
    private String bookingId;
    private String movieName;
    private LocalDate Date;
    private String theatreName;
    private String address;
    private String screenName;
    private int[] seats;
	public String getTicketId() {
		return ticketId;
	}
	public void setTicketId(String ticketId) {
		this.ticketId = ticketId;
	}
	public String getBookingId() {
		return bookingId;
	}
	public void setBookingId(String bookingId) {
		this.bookingId = bookingId;
	}
	public String getMovieName() {
		return movieName;
	}
	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}
	public LocalDate getDate() {
		return Date;
	}
	public void setDate(LocalDate date) {
		Date = date;
	}
	public String getTheatreName() {
		return theatreName;
	}
	public void setTheatreName(String theatreName) {
		this.theatreName = theatreName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getScreenName() {
		return screenName;
	}
	public void setScreenName(String screenName) {
		this.screenName = screenName;
	}
	public int[] getSeats() {
		return seats;
	}
	public void setSeats(int[] seats) {
		this.seats = seats;
	}
	@Override
	public String toString() {
		return "Ticket [ticketId=" + ticketId + ", bookingId=" + bookingId + ", movieName=" + movieName + ", Date="
				+ Date + ", theatreName=" + theatreName + ", address=" + address + ", screenName=" + screenName
				+ ", seats=" + Arrays.toString(seats) + "]";
	}
    
    

    

}
