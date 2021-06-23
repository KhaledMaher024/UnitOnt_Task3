/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task3.Models;

import Filters.CategoryFilter;
import Filters.Filter;
import java.util.ArrayList;

/**
 *
 * @author GP65
 */
public class Task3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

       ArrayList<Media> movies = new ArrayList<>();
       Series m = new Series.SeriesBuilder()
               .withTitle("Saw 1")
               .withCategory(Category.Horror)
               .withDuration(55).build();
       Series m2 = new Series.SeriesBuilder()
               .withTitle("Saw 2")
               .withCategory(Category.Adventure)
               .withDuration(45).build();
       
       
       Series m3 = new Series.SeriesBuilder()
               .withTitle("Saw")
               .withCategory(Category.Horror)
               .withDuration(75).build();
       
       
       Series m4 = new Series.SeriesBuilder()
               .withTitle("Saw")
               .withCategory(Category.Horror)
               .withDuration(50).build();
       
       
       movies.add(m);
       movies.add(m2);
       movies.add(m3);
       movies.add(m4);
       
       CategoryFilter cat = new CategoryFilter(Category.Horror);
       
       ArrayList<Media> horroMovies =  cat.filter(movies);
        for (Media horroMovy : horroMovies) {
            System.out.println(horroMovy.toString());
            System.out.println("-------------------------------------");
        }
        
       
        
    }
    
}
