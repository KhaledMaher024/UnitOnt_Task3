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
public class Media {

    private String title;
    private String releaseDate;
    private Category category;
    private String producer;
    private String director;
    private int duration;
    private double rating;
    private double IMDBRating;
    private ArrayList<Actor> actors;
    private String language;
    private String poster;

   

    public Media() {
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public void setIMDBRating(double IMDBRating) {
        this.IMDBRating = IMDBRating;
    }

    public void setActors(ArrayList<Actor> actors) {
        this.actors = actors;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public void setPoster(String poster) {
        this.poster = poster;
    }

    public static class MediaBuilder {

        private String title;
        private String releaseDate;
        private Category category;
        private String producer;
        private String director;
        private int duration;
        private double rating;
        private double IMDBRating;
        private ArrayList<Actor> actors;
        private String language;
        private String poster;

        public MediaBuilder() {
            this.title = "no Title";
            this.releaseDate = "no Release Date";
            this.category = Category.Action;
            this.producer = "No Producer";
            this.director = "No Director";
            this.duration = 0;
            this.rating = 0.0;
            this.IMDBRating = 0;
            this.actors = null;
            this.language = "No Language";
            this.poster = "No Poster";
        }

        

        public String getTitle() {
            return title;
        }

        public String getReleaseDate() {
            return releaseDate;
        }

        public Category getCategory() {
            return category;
        }

        public String getProducer() {
            return producer;
        }

        public String getDirector() {
            return director;
        }

        public int getDuration() {
            return duration;
        }

        public double getRating() {
            return rating;
        }

        public double getIMDBRating() {
            return IMDBRating;
        }

        public ArrayList<Actor> getActors() {
            return actors;
        }

        public String getLanguage() {
            return language;
        }

        public String getPoster() {
            return poster;
        }

        public MediaBuilder setReleaseDate(String releaseDate) {
            this.releaseDate = releaseDate;
            return this;

        }
        public MediaBuilder setTitle(String title) {
            this.title = title;
            return this;

        }

        public MediaBuilder setCategory(Category category) {
            this.category = category;
            return this;

        }

        public MediaBuilder setProducer(String producer) {
            this.producer = producer;
            return this;

        }

        public MediaBuilder setDirector(String director) {
            this.director = director;
            return this;

        }

        public MediaBuilder setDuration(int duration) {
            this.duration = duration;
            return this;

        }

        public MediaBuilder setRating(double rating) {
            this.rating = rating;
            return this;

        }

        public MediaBuilder setIMDBRating(double IMDBRating) {
            this.IMDBRating = IMDBRating;
            return this;

        }

        public MediaBuilder setActors(ArrayList<Actor> actors) {
            this.actors = actors;
            return this;

        }

        public MediaBuilder setLanguage(String language) {
            this.language = language;
            return this;

        }

        public MediaBuilder setPoster(String poster) {
            this.poster = poster;
            return this;
        }
        

        public Media build() {
            Media media = new Media();
            media.title = this.title;
            media.releaseDate = this.releaseDate;
            media.category = this.category;
            media.producer = this.producer;
            media.duration = this.duration;
            media.rating = this.rating;
            media.IMDBRating = this.IMDBRating;
            media.director = this.director;
            media.actors = this.actors;
            media.language = this.language;
            media.poster = this.poster;

            return media;
        }
    }

    @Override
    public String toString() {
        return "Media { " + "title = " + title + " , releaseDate = " + releaseDate + " , category = " + category + " , producer = " + producer + " , director = " + director + " , duration = " + duration + " , rating = " + rating + " , IMDBRating = " + IMDBRating + " , actors = " + actors + " , language = " + language + " , poster = " + poster + '}';
    }

    public String getTitle() {
        return title;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public Category getCategory() {
        return category;
    }

    public String getProducer() {
        return producer;
    }

    public String getDirector() {
        return director;
    }

    public int getDuration() {
        return duration;
    }

    public double getRating() {
        return rating;
    }

    public double getIMDBRating() {
        return IMDBRating;
    }

    public ArrayList<Actor> getActors() {
        return actors;
    }

    public String getLanguage() {
        return language;
    }

    public String getPoster() {
        return poster;
    }

}
