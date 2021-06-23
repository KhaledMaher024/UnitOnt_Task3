/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Filters;
import task3.Models.Movie;
import task3.Models.Series;
import task3.Models.Media;
import java.util.ArrayList;

/**
 *
 * @author GP65
 */
public interface MediaFilter {
    public ArrayList<Media> filter(ArrayList<Media> medias); 
}
