package com.cg.bookmyshow.model;

import java.util.Arrays;

public class Screen {

	private String screenId;
	private String screenName;
	private boolean[] seats;
	public String getScreenId() {
		return screenId;
	}
	public void setScreenId(String screenId) {
		this.screenId = screenId;
	}
	public String getScreeneName() {
		return screenName;
	}
	public void setScreeneName(String screenName) {
		this.screenName = screenName;
	}
	public boolean[] getSeats() {
		return seats;
	}
	public void setSeats(boolean[] seats) {
		this.seats = seats;
	}
	@Override
	public String toString() {
		return "Screen [screenId=" + screenId + ", screeneName=" + screenName + ", seats=" + Arrays.toString(seats)
				+ "]";
	}

}
