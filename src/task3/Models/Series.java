/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task3.Models;

import java.util.ArrayList;

/**
 *
 * @author GP65
 */
public class Series extends Media {

    private int seasons;

    public void setSeasons(int seasons) {
        this.seasons = seasons;
    }

    

    public Series() {
    }

    public static class SeriesBuilder extends Media.MediaBuilder {

        private int seasons;

        public SeriesBuilder withTitle(String title) {
            return (SeriesBuilder) super.setTitle(title);
        }

        public SeriesBuilder withPoster(String poster) {
            return (SeriesBuilder) super.setPoster(poster);
        }

        public SeriesBuilder withLanguage(String language) {
            return (SeriesBuilder) super.setLanguage(language); 
        }

        public SeriesBuilder withActors(ArrayList<Actor> actors) {
            return (SeriesBuilder) super.setActors(actors); //To change body of generated methods, choose Tools | Templates.
        }

        public SeriesBuilder withIMDBRating(double IMDBRating) {
            return (SeriesBuilder) super.setIMDBRating(IMDBRating); //To change body of generated methods, choose Tools | Templates.
        }

        public SeriesBuilder withRating(double rating) {
            return (SeriesBuilder) super.setRating(rating); //To change body of generated methods, choose Tools | Templates.
        }

        public SeriesBuilder withDuration(int duration) {
            return (SeriesBuilder) super.setDuration(duration); //To change body of generated methods, choose Tools | Templates.
        }

        public SeriesBuilder withDirector(String director) {
            return (SeriesBuilder) super.setDirector(director); //To change body of generated methods, choose Tools | Templates.
        }

        public SeriesBuilder withProducer(String producer) {
            return (SeriesBuilder) super.setProducer(producer); //To change body of generated methods, choose Tools | Templates.
        }

        public SeriesBuilder withCategory(Category category) {
            return (SeriesBuilder) super.setCategory(category); //To change body of generated methods, choose Tools | Templates.
        }

        public SeriesBuilder withReleaseDate(String releaseDate) {
            return (SeriesBuilder) super.setReleaseDate(releaseDate); //To change body of generated methods, choose Tools | Templates.
        }

        public SeriesBuilder() {
            super();
            this.seasons = 0;
        }

        public SeriesBuilder withSeasons(int seasons) {
            this.seasons = seasons;
            return this;
        }

        
        public Series build() {
            Series s = new Series();
            s.setTitle(this.getTitle());
            s.setReleaseDate(this.getReleaseDate());
            s.setCategory(this.getCategory());
            s.setProducer(this.getPoster());
            s.setDirector(this.getDirector());
            s.setDuration(this.getDuration());
            s.setRating(this.getRating());
            s.setIMDBRating(this.getIMDBRating());
            s.setActors(this.getActors());
            s.setLanguage(this.getLanguage());
            s.setPoster(this.getPoster());
            s.seasons = this.seasons;

            return s;
        }

    }

    @Override
    public String toString() {
        return super.toString() + " , seasons = " + seasons;
    }

}
