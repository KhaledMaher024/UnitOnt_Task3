/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Filters;

import java.util.ArrayList;
import java.util.Optional;
import java.util.stream.Stream;
import task3.Models.Movie;
import task3.Models.Media;
import task3.Models.Series;
import task3.Models.Category;

/**
 *
 * @author GP65
 */
public class CategoryFilter implements Filters.MediaFilter {

    Category category;

    public CategoryFilter(Category category) {
        this.category = category;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    @Override
    public ArrayList<Media> filter(ArrayList<Media> medias) {
       
        ArrayList<Media> finalResult = new ArrayList<>();

        for (Media media : medias) {
            if (media.getCategory() == getCategory()) {
                finalResult.add(media);
            }
        }

        return finalResult;
    }

   

}
