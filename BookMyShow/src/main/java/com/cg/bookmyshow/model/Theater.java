package com.cg.bookmyshow.model;

import java.util.List;

public class Theater {

	private String theaterId;
	private String theaterName;
	private String theaterAddress;
	private City city;
	private List<Movies> movie;
	
	public List<Movies> getMovie() {
		return movie;
	}
	public void setMovie(List<Movies> movie) {
		this.movie = movie;
	}
	public City getCity() {
		return city;
	}
	public void setCity(City city) {
		this.city = city;
	}
	public String getTheaterId() {
		return theaterId;
	}
	public void setTheaterId(String theatreId) {
		this.theaterId = theatreId;
	}
	public String getTheaterName() {
		return theaterName;
	}
	public void setTheaterName(String theatreName) {
		this.theaterName = theatreName;
	}
	public String getTheaterAddress() {
		return theaterAddress;
	}
	public void setTheaterAddress(String theatreAddress) {
		this.theaterAddress = theatreAddress;
	}
	@Override
	public String toString() {
		return "Theater [theaterId=" + theaterId + ", theaterName=" + theaterName + ", theaterAddress=" + theaterAddress
				+ ", city=" + city + ", movie=" + movie + "]";
	}
	 
	 
}
