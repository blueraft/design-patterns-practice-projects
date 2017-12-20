package model;


import model.media.AbstractMedia;
import model.media.*;

public class Main {

    private static iPod nano = new iPod("John");
    private static Movie m1 = new Movie("Dunkirk (2017)", "Christopher Nolan", "Drama",  107);
    private static Song s1 = new Song("Writing's on the Wall", "Sam Smith", "Ballad", 3.02);
    private static Photo p1 = new Photo("Moonrise", "Ansel Adams", "Landscape", "Yosemite");
    private static Movie m2 = new Movie("Ex Machina (2017)", "Christopher Nolan", "Drama",  107);
    private static Movie m3 = new Movie("Moonlight", "John Doe", "Ballad", 3.02);
    private static Photo p2 = new Photo("Sunset", "Ansel Adams", "Landscape", "Yosemite");


    public static void main(String[] args) {

       // adding the media to ipod
        nano.addMovies(m1);
        nano.addMovies(m2);
        nano.addMovies(m3);
        nano.addPhotos(p1);
        nano.addPhotos(p2);
        nano.addSongs(s1);
        System.out.println(nano.getName() +"'s iPod contains: ");

        for (AbstractMedia m : nano) {
            System.out.println(m);
        }
    }


}