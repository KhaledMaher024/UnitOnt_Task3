/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import static Controllers.SeriesController.series;
import java.util.ArrayList;
import java.util.Scanner;
import task3.Models.*;

/**
 *
 * @author GP65
 */
public class MovieController extends MediaController {

    public static final ArrayList<Movie> movies = new ArrayList<>();
    public static final ArrayList<Movie> favMovies = new ArrayList<>();

    @Override
    public void saveMedia(Media m) {
        movies.add((Movie) m);
        System.out.println("Movie[" + m.getTitle() + "] has been added to the Series List");
    }

    @Override
    public void updateMedia(String title) {
        Movie m = serarch(title);
        if (m != null) {
            Scanner sc = new Scanner(System.in);
            System.out.println("please enter the movie duration ");
            int duration = sc.nextInt();
            if(duration >=20 && duration<1000){
                m.setDuration(duration);
                System.out.println("duration has been ypdated successfully!!");
            }else{
                System.out.println("movie duration should be more than 20 and less than 1000");
            }
        }

    }

    @Override
    public void addToFavorite(String title) {
        Movie searchedMovie = this.serarch(title);
        if (searchedMovie != null) {
            favMovies.add(searchedMovie);
        } else {
            System.out.println("the Movie doesnt Exist , please Try Again");
        }
    }

    @Override
    public void validateInfo() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void listMedia() {
        if (movies.size() != 0) {
            int counter = 0;
            for (Movie movie : movies) {
                System.out.println(counter + ". " + movie.toString());
            }
            System.out.println("------------------------------------------------------------------------");
        } else {
            System.out.println("there is No Movies yet");
        }
    }

    @Override
    public void readfromFile() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void writeToFile() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Movie serarch(String title) {
        for (Movie mov : movies) {
            if (mov.getTitle().equalsIgnoreCase(title)) {
                return mov;
            }
        }
        return null;
    }
}
