package com.cg.bookmyshow.service;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.cg.bookmyshow.model.Data;

@SpringBootTest
public class DataHandlingServiceTest {

    @Autowired
    DataHandlingService dataService;
    
    @Test
    void testGetMoviesPlayingAtTheatre() {
        List<Data> dummyData = new ArrayList<Data>();
        dummyData.add(new Data("Pune", "PVR Pune" , "Avatar: way of water", "Sam Worthington, Zoe Saldana", 7.7, "9:00-12:30"));
        dummyData.add(new Data("Pune", "Fun Cinemas Pune" , "John Wick : Chapter 5", "Keanu Reeves, Scott Adkins", 7.9, "1:00-14:30"));
        dummyData.add(new Data("Kolkata", "Fun Cinemas Kolkata" , "Top Gun : Maverick", "Tom Cruise, Miles Teller", 8.3, "15:00-18:00"));
        dummyData.add(new Data("Kolkata", "Eyelex Kolkata" , "Avatar: way of water", "Sam Worthington, Zoe Saldana", 7.7, "1:00-14:30"));
        dummyData.add(new Data("Mumbai", "PVR Mumbai" , "Top Gun : Maverick", "Tom Cruise, Miles Teller", 8.3, "15:00-18:00"));
        dummyData.add(new Data("Mumbai", "Eyelex Mumbai" , "John Wick : Chapter 5", "Keanu Reeves, Scott Adkins", 7.9, "9:00-12:30"));
        
    
        
        this.dataService.datas = dummyData;

        List<String> resultData = this.dataService.getMoviesPlayingAtTheatre("PVR Mumbai");

        assertThat(resultData).hasSize(1).contains("Top Gun : Maverick");
    }

    @Test
    void testGetMoviesPlayinginCity() {
        List<Data> dummyData = new ArrayList<Data>();
        dummyData.add(new Data("Pune", "PVR Pune" , "Avatar: way of water", "Sam Worthington, Zoe Saldana", 7.7, "9:00-12:30"));
        dummyData.add(new Data("Pune", "Fun Cinemas Pune" , "John Wick : Chapter 5", "Keanu Reeves, Scott Adkins", 7.9, "1:00-14:30"));
        dummyData.add(new Data("Kolkata", "Fun Cinemas Kolkata" , "Top Gun : Maverick", "Tom Cruise, Miles Teller", 8.3, "15:00-18:00"));
        dummyData.add(new Data("Kolkata", "Eyelex Kolkata" , "Avatar: way of water", "Sam Worthington, Zoe Saldana", 7.7, "1:00-14:30"));
        dummyData.add(new Data("Mumbai", "PVR Mumbai" , "Top Gun : Maverick", "Tom Cruise, Miles Teller", 8.3, "15:00-18:00"));
        dummyData.add(new Data("Mumbai", "Eyelex Mumbai" , "John Wick : Chapter 5", "Keanu Reeves, Scott Adkins", 7.9, "9:00-12:30"));
        
    
        
        this.dataService.datas = dummyData;

        Map<String,List<String>> resultData = this.dataService.getMoviesPlayinginCity("Mumbai");
        List<String> dummyMovieName1 = java.util.Arrays.asList("Top Gun : Maverick");
        List<String> dummyMovieName2 = java.util.Arrays.asList("John Wick : Chapter 5");
        
        assertThat(resultData).hasSize(2).extractingByKey("PVR Mumbai").isEqualTo(dummyMovieName1);
        assertThat(resultData).hasSize(2).extractingByKey("Eyelex Mumbai").isEqualTo(dummyMovieName2);
    }

    @Test
    void testGetShowTimings() {
        List<Data> dummyData = new ArrayList<Data>();
        dummyData.add(new Data("Pune", "PVR Pune" , "Avatar: way of water", "Sam Worthington, Zoe Saldana", 7.7, "9:00-12:30"));
        dummyData.add(new Data("Pune", "Fun Cinemas Pune" , "John Wick : Chapter 5", "Keanu Reeves, Scott Adkins", 7.9, "1:00-14:30"));
        dummyData.add(new Data("Kolkata", "Fun Cinemas Kolkata" , "Top Gun : Maverick", "Tom Cruise, Miles Teller", 8.3, "15:00-18:00"));
        dummyData.add(new Data("Kolkata", "Eyelex Kolkata" , "Avatar: way of water", "Sam Worthington, Zoe Saldana", 7.7, "1:00-14:30"));
        dummyData.add(new Data("Mumbai", "PVR Mumbai" , "Top Gun : Maverick", "Tom Cruise, Miles Teller", 8.3, "15:00-18:00"));
        dummyData.add(new Data("Mumbai", "Eyelex Mumbai" , "John Wick : Chapter 5", "Keanu Reeves, Scott Adkins", 7.9, "9:00-12:30"));
        
    
        
        this.dataService.datas = dummyData;
        List<String> resultData = this.dataService.getShowTimings("PVR Pune", "Avatar: way of water");

        assertThat(resultData).hasSize(1).contains("9:00-12:30");
    }

    @Test
    void testGetTheatersInCity() {
        List<Data> dummyData = new ArrayList<Data>();
        dummyData.add(new Data("Pune", "PVR Pune" , "Avatar: way of water", "Sam Worthington, Zoe Saldana", 7.7, "9:00-12:30"));
        dummyData.add(new Data("Pune", "Fun Cinemas Pune" , "John Wick : Chapter 5", "Keanu Reeves, Scott Adkins", 7.9, "1:00-14:30"));
        dummyData.add(new Data("Kolkata", "Fun Cinemas Kolkata" , "Top Gun : Maverick", "Tom Cruise, Miles Teller", 8.3, "15:00-18:00"));
        dummyData.add(new Data("Kolkata", "Eyelex Kolkata" , "Avatar: way of water", "Sam Worthington, Zoe Saldana", 7.7, "1:00-14:30"));
        dummyData.add(new Data("Mumbai", "PVR Mumbai" , "Top Gun : Maverick", "Tom Cruise, Miles Teller", 8.3, "15:00-18:00"));
        dummyData.add(new Data("Mumbai", "Eyelex Mumbai" , "John Wick : Chapter 5", "Keanu Reeves, Scott Adkins", 7.9, "9:00-12:30"));
        
    
        
        this.dataService.datas = dummyData;

        List<String> resultData = this.dataService.getTheatersInCity("Pune");

        assertThat(resultData).hasSize(2).contains("PVR Pune").contains("Fun Cinemas Pune");
        
    }

    @Test
    void testGetTheatersPlayingMovie() {
        List<Data> dummyData = new ArrayList<Data>();
        dummyData.add(new Data("Pune", "PVR Pune" , "Avatar: way of water", "Sam Worthington, Zoe Saldana", 7.7, "9:00-12:30"));
        dummyData.add(new Data("Pune", "Fun Cinemas Pune" , "John Wick : Chapter 5", "Keanu Reeves, Scott Adkins", 7.9, "1:00-14:30"));
        dummyData.add(new Data("Kolkata", "Fun Cinemas Kolkata" , "Top Gun : Maverick", "Tom Cruise, Miles Teller", 8.3, "15:00-18:00"));
        dummyData.add(new Data("Kolkata", "Eyelex Kolkata" , "Avatar: way of water", "Sam Worthington, Zoe Saldana", 7.7, "1:00-14:30"));
        dummyData.add(new Data("Mumbai", "PVR Mumbai" , "Top Gun : Maverick", "Tom Cruise, Miles Teller", 8.3, "15:00-18:00"));
        dummyData.add(new Data("Mumbai", "Eyelex Mumbai" , "John Wick : Chapter 5", "Keanu Reeves, Scott Adkins", 7.9, "9:00-12:30"));
        
    
        
        this.dataService.datas = dummyData;
        List<String> resultData = this.dataService.getTheatersPlayingMovie("Avatar: way of water");

        assertThat(resultData).hasSize(2).contains("PVR Pune").contains("Eyelex Kolkata");
    }

    @Test
    void testGetMoviesAboveCertainRating() {
        List<Data> dummyData = new ArrayList<Data>();
        dummyData.add(new Data("Pune", "PVR Pune" , "Avatar: way of water", "Sam Worthington, Zoe Saldana", 7.7, "9:00-12:30"));
        dummyData.add(new Data("Pune", "Fun Cinemas Pune" , "John Wick : Chapter 5", "Keanu Reeves, Scott Adkins", 7.9, "1:00-14:30"));
        dummyData.add(new Data("Kolkata", "Fun Cinemas Kolkata" , "Top Gun : Maverick", "Tom Cruise, Miles Teller", 8.3, "15:00-18:00"));
        dummyData.add(new Data("Kolkata", "Eyelex Kolkata" , "Avatar: way of water", "Sam Worthington, Zoe Saldana", 7.7, "1:00-14:30"));
        dummyData.add(new Data("Mumbai", "PVR Mumbai" , "Top Gun : Maverick", "Tom Cruise, Miles Teller", 8.3, "15:00-18:00"));
        dummyData.add(new Data("Mumbai", "Eyelex Mumbai" , "John Wick : Chapter 5", "Keanu Reeves, Scott Adkins", 7.9, "9:00-12:30"));
        
    
        
        this.dataService.datas = dummyData;
        List<String> resultData = this.dataService.getMoviesAboveCertainRating(7.0);

        assertThat(resultData).hasSize(3).contains("Avatar: way of water").contains("John Wick : Chapter 5").contains("Top Gun : Maverick");
    }


}
