package com.cg.bookmyshow.service;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.cg.bookmyshow.Helper.Helper;
import com.cg.bookmyshow.model.Data;

import java.io.IOException;
import java.util.*;
import java.util.stream.Collectors;

@Service
public class DataHandlingService {
    public List<Data> datas = new ArrayList<Data>();

    public void save(MultipartFile file) {

        try {
            datas = Helper.convertExcelToListOfData(file.getInputStream());
            
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    //Get Theatres
    public List<String> getTheatersInCity(String city){
        List<String> theatre = new ArrayList<>();

        List<Data> temp = datas.stream().filter(e->e.getCityName().equals(city)).collect(Collectors.toList());

        for(int i=0;i<temp.size();i++){
            if(!theatre.contains(temp.get(i).getTheatreName()))
                theatre.add(temp.get(i).getTheatreName());
        }
        return theatre;
    }

    //Get Theatres Playing a Particular Movie
    public List<String> getTheatersPlayingMovie(String movie){
        List<String> theatre = new ArrayList<String>();
        List<Data> temp = datas.stream().filter(e->e.getMovieName().startsWith(movie)).collect(Collectors.toList());

        for(int i=0;i<temp.size();i++){
            if(!theatre.contains(temp.get(i).getMovieName()))
                theatre.add(temp.get(i).getTheatreName());
        }
        return theatre;
    }

    //Get Movies Playing at a Particular Theatre
    public List<String> getMoviesPlayingAtTheatre(String theatre){
        List<String> movies = new ArrayList<String>();
        List<Data> temp = datas.stream().filter(e->e.getTheatreName().equals(theatre)).collect(Collectors.toList());

        for(int i=0;i<temp.size();i++){
            movies.add(temp.get(i).getMovieName());
        }
        return movies;
    }

    //Get Movies Playing in All Theatres in a Particular City
    public Map<String,List<String>> getMoviesPlayinginCity(String city){
        Map<String,List<String>> theatreAndMovie = new HashMap<String,List<String>>();
        List<Data> temp = datas.stream().filter(e->e.getCityName().equals(city)).collect(Collectors.toList());

        for(int i=0;i<temp.size();i++){
            if(theatreAndMovie.containsKey(temp.get(i).getTheatreName())){
                theatreAndMovie.get(temp.get(i).getTheatreName()).add(temp.get(i).getMovieName());
            }
            else{
                theatreAndMovie.put(temp.get(i).getTheatreName(),new ArrayList<String>());
                theatreAndMovie.get(temp.get(i).getTheatreName()).add(temp.get(i).getMovieName());
            }
        }
        return theatreAndMovie;
    }

    //Get Show Timings for a particular movie in particular theatre
    public List<String> getShowTimings(String theatre,String movie){
        List<String> showTimes = new ArrayList<String>();
        List<Data> temp = datas.stream().filter(e->e.getTheatreName().equals(theatre)).filter(m->m.getMovieName().startsWith(movie)).collect(Collectors.toList());

        for(int i=0;i<temp.size();i++){
            showTimes.add(temp.get(i).getShowTimes());
        }
        return showTimes;
    }

    //Get List of Movies above a certain rating
    public List<String> getMoviesAboveCertainRating(Double rating){
        List<String> movies = new ArrayList<String>();
        List<Data> temp = datas.stream().filter(e->e.getMovieRating()>rating).collect(Collectors.toList());

        for(int i=0;i<temp.size();i++){
            if(!movies.contains(temp.get(i).getMovieName()))
                movies.add(temp.get(i).getMovieName());
        }
        return movies;
    }


}
