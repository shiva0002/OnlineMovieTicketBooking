package com.cg.bookmyshow.model;

public class BookingInfo {
	private String userId;
	private String bookingId;

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getBookingId() {
		return bookingId;
	}

	public void setBookingId(String bookingId) {
		this.bookingId = bookingId;
	}

	@Override
	public String toString() {
		return "BookingInfo [userId=" + userId + ", bookingId=" + bookingId + "]";
	}

}
