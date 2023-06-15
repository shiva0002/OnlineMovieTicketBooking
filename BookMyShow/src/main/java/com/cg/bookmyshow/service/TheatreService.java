package com.cg.bookmyshow.service;

import java.util.*;

import com.cg.bookmyshow.model.City;
import com.cg.bookmyshow.model.Movies;
import com.cg.bookmyshow.model.Theater;

public class TheatreService {

	
	public List<Theater> getTheatersInCity(String cityName,List<Theater> theaters) {
	    List<Theater> theatersInCity = new ArrayList<>();

	    for (Theater theatre : theaters) {
	        if (theatre.getCity().getCityName().equalsIgnoreCase(cityName)) {
	            theatersInCity.add(theatre);
	        }
	    }

	    return theatersInCity;
	}
	
	public List<Theater> getTheatersPlayingMovie(String movieName,List<Theater> theaters) {
	    List<Theater> theatersPlayingMovie = new ArrayList<>();

	    for (Theater theater : theaters) {
	        List<Movies> movies = theater.getMovie();
	        for (Movies movie : movies) {
	            if (movie.getMovieName().equalsIgnoreCase(movieName)) {
	                theatersPlayingMovie.add(theater);
	                break; 
	            }
	        }
	    }

	    return theatersPlayingMovie;
	}
	
	
	public List<Movies> getMoviesPlayedInTheater(String theaterName, List<Theater> theaters) {
	    List<Movies> moviesPlayedInTheater = new ArrayList<>();

	    for (Theater theater : theaters) {
	        if (theater.getTheaterName().equalsIgnoreCase(theaterName)) {
	            List<Movies> movies = theater.getMovie();
	            moviesPlayedInTheater.addAll(movies);
	            break; 
	        }
	    }

	    return moviesPlayedInTheater;
	}

	
	public Set<Movies> getMoviesPlayedInCity(String cityName, List<Theater> theaters) {
	    Set<Movies> moviesPlayedInCity = new HashSet<>();

	    for (Theater theater : theaters) {
	        City city = theater.getCity();
	        if (city.getCityName().equalsIgnoreCase(cityName)) {
	            List<Movies> movies = theater.getMovie();
	            moviesPlayedInCity.addAll(movies);
	        }
	    }

	    return moviesPlayedInCity;
	}
}
