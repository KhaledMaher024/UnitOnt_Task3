/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task3.Models;

/**
 *
 * @author GP65
 */
public class Actor {
    private String name ;
    private String gender ; 
    private String nationality ; 
    private String image ; 

    public Actor() {
    }

    public Actor(String name, String gender, String nationality, String image) {
        this.name = name;
        this.gender = gender;
        this.nationality = nationality;
        this.image = image;
    }

    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
    
    
}
