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
public class TitleFilter implements Filters.MediaFilter {

    String title;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public TitleFilter(String title) {
        this.title = title;
    }

    @Override
    public ArrayList<Media> filter(ArrayList<Media> medias) {
        ArrayList<Media> finalResult = new ArrayList<>();

        for (Media media : medias) {
            if (media.getTitle().equalsIgnoreCase(getTitle())) {
                finalResult.add(media);
            }
        }

        return finalResult;
    }

}
