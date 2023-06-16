package com.cg.bookmyshow.Controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.cg.bookmyshow.Helper.Input;
import com.cg.bookmyshow.service.DataHandlingService;

@RestController
@RequestMapping("/moviebookingsystem")
public class MainController {

    @Autowired
    private DataHandlingService dataService;

    @GetMapping("/success")
    public String success(){
        return "Success";
    }
    @PostMapping("/theatres/{city}")
    public List<String> getAllTheatresinCity(@RequestParam("file") MultipartFile file,@PathVariable("city") String city) {
        
        this.dataService.save(file);
        return this.dataService.getTheatersInCity(city);
    }

    @PostMapping("/theatres/movie/{movie}")
    public List<String> getAllTheatresPlayingMovie(@RequestParam("file") MultipartFile file,@PathVariable("movie") String movie) {
        
        this.dataService.save(file);
        return this.dataService.getTheatersPlayingMovie(movie.toLowerCase());
    }

    @PostMapping("/movies/theatre/{theatre}")
    public List<String> getAllMoviesPlayingAtTheatre(@RequestParam("file") MultipartFile file,@PathVariable("theatre") String theatre) {
        
        this.dataService.save(file);
        return this.dataService.getMoviesPlayingAtTheatre(theatre.toLowerCase());
    }

    @PostMapping("/movies/alltheatre/city/{city}")
    public Map<String,List<String>> getMoviesPlayingAtAllTheatreinCity(@RequestParam("file") MultipartFile file,@PathVariable("city") String city) {
        
        this.dataService.save(file);
        return this.dataService.getMoviesPlayinginCity(city.toLowerCase());
    }

    @PostMapping("/showTimes")
    public List<String> getShowTimings(@RequestParam("file") MultipartFile file,@RequestHeader("theatreName") String theatre,@RequestHeader("movieName") String movie) {
        this.dataService.save(file);
        return this.dataService.getShowTimings(theatre.toLowerCase(),movie.toLowerCase());
    }

}
