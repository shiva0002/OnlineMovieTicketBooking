package com.cg.bookmyshow.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Data {

    private String cityName;
    private String theatreName;
    private String movieName;
    private String actors;
    private double movieRating;
    private String showTimes;

}
