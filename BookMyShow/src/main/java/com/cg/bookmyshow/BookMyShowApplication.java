package com.cg.bookmyshow;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.cg.bookmyshow.model.City;
import com.cg.bookmyshow.model.Theater;
import com.cg.bookmyshow.service.TheatreService;

import java.util.*;
@SpringBootApplication
public class BookMyShowApplication {

	public static void main(String[] args) {
		SpringApplication.run(BookMyShowApplication.class, args);
		// City city = new City();
        // city.setCityId("C001");
        // city.setCityName("New York");
        // city.setCityAddress("123 Main Street");

        // // Create a list to store theaters
        // List<Theater> theaters = new ArrayList<>();

        // // Create and add theaters to the list
        // Theater theatre1 = new Theater();
        // theatre1.setTheaterId("T001");
        // theatre1.setTheaterName("ABC Theatre");
        // theatre1.setTheaterAddress("456 Broadway");
        // theatre1.setCity(city);
        // theaters.add(theatre1);

        // Theater theatre2 = new Theater();
        // theatre2.setTheaterId("T002");
        // theatre2.setTheaterName("XYZ Theatre");
        // theatre2.setTheaterAddress("789 Elm Street");
        // theatre2.setCity(city);
        // theaters.add(theatre2);
	
        // TheatreService ts = new TheatreService();
        // ts.getTheatersInCity("New York",theaters);
	}
	
	

}
