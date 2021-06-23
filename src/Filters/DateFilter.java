/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Filters;

import java.util.ArrayList;
import task3.Models.Media;
import task3.Models.Movie;
import task3.Models.Series;

/**
 *
 * @author GP65
 */
public class DateFilter implements Filters.MediaFilter {

    String Date;

    public DateFilter(String Date) {
        this.Date = Date;
    }

    public String getDate() {
        return Date;
    }

    public void setDate(String Date) {
        this.Date = Date;
    }

    @Override
    public ArrayList<Media> filter(ArrayList<Media> medias) {
        ArrayList<Media> finalResult = new ArrayList<>();

        for (Media media : medias) {
            if (media.getReleaseDate().equals(getDate())) {
                finalResult.add(media);
            }
        }

        return finalResult;
    }

}
