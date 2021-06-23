/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Filters;

import java.util.ArrayList;
import task3.Models.Media;

/**
 *
 * @author GP65
 */
public class Filter {

    MediaFilter mediaFilter;

    public Filter(MediaFilter mediaFilter) {
        this.mediaFilter = mediaFilter;
    }

    public Filter() {
        this.mediaFilter = new TitleFilter("no Title");

    }

    public void setFilter(MediaFilter mediaFilter) {
        this.mediaFilter = mediaFilter;
    }

    public ArrayList<Media> filterList(ArrayList<Media> medias) {
        return mediaFilter.filter(medias);
    }
}
