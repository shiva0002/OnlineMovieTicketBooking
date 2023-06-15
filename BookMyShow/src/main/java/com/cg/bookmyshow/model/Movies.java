package com.cg.bookmyshow.model;

import java.time.LocalTime;

public class Movies {
	
	private String movieId;
	private String movieName;
	private LocalTime MovieDuration;
	public String getMovieId() {
		return movieId;
	}
	public void setMovieId(String movieId) {
		this.movieId = movieId;
	}
	public String getMovieName() {
		return movieName;
	}
	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}
	public LocalTime getMovieDuration() {
		return MovieDuration;
	}
	public void setMovieDuration(LocalTime movieDuration) {
		MovieDuration = movieDuration;
	}
	@Override
	public String toString() {
		return "Movies [movieId=" + movieId + ", movieName=" + movieName + ", MovieDuration=" + MovieDuration + "]";
	}
	

}
