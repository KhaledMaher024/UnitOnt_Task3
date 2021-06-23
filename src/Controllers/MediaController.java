/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;
import task3.Models.*;

/**
 *
 * @author GP65
 */
public abstract class MediaController {
    public abstract void saveMedia(Media m);
    public abstract void updateMedia(String title);
    public abstract void addToFavorite(String title);
    public abstract void validateInfo();
    public abstract void listMedia();
    public abstract void readfromFile();
    public abstract void writeToFile();
    
}
