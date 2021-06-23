/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import static Controllers.MovieController.favMovies;
import static Controllers.MovieController.movies;
import java.util.ArrayList;
import java.util.Scanner;
import task3.Models.*;

/**
 *
 * @author GP65
 */
public class SeriesController extends MediaController {

    public static final ArrayList<Series> series = new ArrayList<>();
    public static final ArrayList<Series> favSeries = new ArrayList<>();

    @Override
    public void saveMedia(Media m) {
        series.add((Series) m);
        System.out.println("series[" + m.getTitle() + "] has been added to the Series List");
    }

    @Override
    public void updateMedia(String title) {
        Series s = serarch(title);
        if (s != null) {
            Scanner sc = new Scanner(System.in);
            System.out.println("please enter the series seasons");
            int seasons = sc.nextInt();
            if (seasons >= 1 && seasons < 50) {
                s.setSeasons(seasons);
                System.out.println("seasons has been updated successfully!!");
            } else {
                System.out.println("Series seasons should be more than 1 and less than 50");
            }
        }
    }

    @Override
    public void addToFavorite(String title) {
        Series searchedSeries = this.serarch(title);
        if (searchedSeries != null) {
            favSeries.add(searchedSeries);
        } else {
            System.out.println("the Series doesnt Exist , please Try Again");
        }
    }

    @Override
    public void validateInfo() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void listMedia() {
        if (series.size() != 0) {
            int counter = 0;
            for (Series ser : series) {
                System.out.println(counter + ". " + ser.toString());
            }
            System.out.println("------------------------------------------------------------------------");
        } else {
            System.out.println("there is No Series yet");
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

    public Series serarch(String title) {
        for (Series ser : series) {
            if (ser.getTitle().equalsIgnoreCase(title)) {
                return ser;
            }
        }
        return null;
    }

}
