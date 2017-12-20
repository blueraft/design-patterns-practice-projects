package model;

import model.media.AbstractMedia;
import model.media.Movie;
import model.media.Photo;
import model.media.Song;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;

public class iPod implements Iterable<AbstractMedia>{

    private String name;

    private Collection<Movie> movies;
    private Collection<Photo> photos;
    private Collection<Song> songs;

    public iPod(String name) {
        this.name = name;
        movies = new LinkedList<>();
        songs = new LinkedList<>();
        photos = new LinkedList<>();

    }

    // getters & setters
    public String getName() { return name; }

    public Collection<Movie> getMovies() {
        return movies;
    }

    public Collection<Photo> getPhotos() {
        return photos;
    }

    public Collection<Song> getSongs() {
        return songs;
    }

    public void addMovies(Movie movie) { movies.add(movie);
    }

    public void addPhotos(Photo photo) {
        photos.add(photo);
    }

    public void addSongs(Song song) {
        songs.add(song);
    }


    @Override
    public Iterator<AbstractMedia> iterator() {
        return new MediaIterator();
    }

    //new private class to iterate through all the items in the ipod
    private class MediaIterator implements Iterator<AbstractMedia> {
        Iterator moviesIterator = movies.iterator();
        Iterator songsIterator = songs.iterator();
        Iterator photoIterator = photos.iterator();

        //using the hasNext() function in Collections interface
        @Override
        public boolean hasNext() {
            return moviesIterator.hasNext() || songsIterator.hasNext() || photoIterator.hasNext();
        }

        //iterating through all the elements in each list
        @Override
        public AbstractMedia next() {
            AbstractMedia m;
            if (moviesIterator.hasNext()){ m = (AbstractMedia) moviesIterator.next();}
            else if (songsIterator.hasNext()){ m = (AbstractMedia) songsIterator.next();}
            else if (photoIterator.hasNext()){ m = (AbstractMedia) photoIterator.next();}
            else {return null;}
            return m;
        }
    }
}