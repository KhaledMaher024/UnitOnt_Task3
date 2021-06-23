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
public class Movie extends Media {

    private int watched;
    private double watchTime;

    public static class MovieBuider extends Media.MediaBuilder {

        private int watched;
        private double watchTime;

        @Override
        public Movie build() {
            Movie m = new Movie();
            m.setTitle(this.getTitle());
            m.setReleaseDate(this.getReleaseDate());
            m.setCategory(this.getCategory());
            m.setProducer(this.getPoster());
            m.setDirector(this.getDirector());
            m.setDuration(this.getDuration());
            m.setRating(this.getRating());
            m.setIMDBRating(this.getIMDBRating());
            m.setActors(this.getActors());
            m.setLanguage(this.getLanguage());
            m.setPoster(this.getPoster());
            m.watched = this.watched;
            m.watchTime = this.watchTime;

            return m;
        }

        public MovieBuider withTitle(String title) {
            return (MovieBuider) super.setTitle(title);

        }

        public MovieBuider withWatched(int watched) {
            this.watched = watched;
            return this;

        }

        public MovieBuider withWatchTime(double watchTime) {
            this.watchTime = watchTime;
            return this;
        }

        public MovieBuider withPoster(String poster) {
            return (MovieBuider) super.setPoster(poster);
        }

        public MovieBuider withLanguage(String language) {
            return (MovieBuider) super.setLanguage(language);
        }

        public MovieBuider withActors(ArrayList<Actor> actors) {
            return (MovieBuider) super.setActors(actors);
        }

        public MovieBuider withIMDBRating(double IMDBRating) {
            return (MovieBuider) super.setIMDBRating(IMDBRating);
        }

        public MovieBuider withRating(double rating) {
            return (MovieBuider) super.setRating(rating);
        }

        public MovieBuider withDuration(int duration) {
            return (MovieBuider) super.setDuration(duration);
        }

        public MovieBuider withDirector(String director) {
            return (MovieBuider) super.setDirector(director);
        }

        public MovieBuider withtProducer(String producer) {
            return (MovieBuider) super.setProducer(producer);
        }

        public MovieBuider withCategory(Category category) {
            return (MovieBuider) super.setCategory(category);
        }

        public MovieBuider withReleaseDate(String releaseDate) {
            return (MovieBuider) super.setReleaseDate(releaseDate);
        }

        @Override
        public String getPoster() {
            return super.getPoster();
        }

        @Override
        public String getLanguage() {
            return super.getLanguage();
        }

        @Override
        public ArrayList<Actor> getActors() {
            return super.getActors();
        }

        @Override
        public double getIMDBRating() {
            return super.getIMDBRating();
        }

        @Override
        public double getRating() {
            return super.getRating();
        }

        @Override
        public int getDuration() {
            return super.getDuration();
        }

        @Override
        public String getDirector() {
            return super.getDirector();
        }

        @Override
        public String getProducer() {
            return super.getProducer();
        }

        @Override
        public Category getCategory() {
            return super.getCategory();
        }

        @Override
        public String getReleaseDate() {
            return super.getReleaseDate();
        }

        @Override
        public String getTitle() {
            return super.getTitle();
        }

        @Override
        public MediaBuilder setTitle(String title) {
            return super.setTitle(title);
        }

    }

    @Override
    public String toString() {
        return super.toString() + " , watched = " + watched + " , watch Time = " + watchTime;
    }

}
