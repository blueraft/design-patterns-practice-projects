package model.media;

import java.util.Iterator;

public abstract class AbstractMedia{

    protected String name;
    protected String creator;
    protected String genre;

    public AbstractMedia(String name, String creator, String genre) {
        this.name = name;
        this.creator = creator;
        this.genre = genre;
    }

    // getters
    public String getName() { return name; }
    public String getCreator() { return creator; }
    public String getGenre() { return genre; }

    @Override
    public String toString() {
        String simpleName = this.getClass().getSimpleName();
        switch (simpleName) {
            case "Movie":
                return ("A Movie named " + name + " by: " + creator);
            case "Photo":
                return ("A Photo named " + name + " by: " + creator);
            case "Song":
                return ("A Song named " + name + " by: " + creator);
        }
        return null;
    }
}