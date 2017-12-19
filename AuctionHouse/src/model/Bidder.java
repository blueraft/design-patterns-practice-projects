package model;

import java.util.Observable;
import java.util.Observer;
import java.util.Random;

public class Bidder implements Observer {

    private String name;
    private Double personalBid;
    private Double maxBid;
    private Double currentBid;

    public Bidder(String name, Double maxBid){
        this.name = name;
        this.personalBid = 0.0;
        this.maxBid = maxBid;
    }

    public String getName() {
        return name;
    }

    public Double getPersonalBid() {
        return personalBid;
    }

    public Double getMaxBid() {
        return maxBid;
    }

    public Double getCurrentBid() {
        return currentBid;
    }

    public void makeBid(Double currentBid){
        Random rn = new Random();
        Double tempBid = personalBid;
        tempBid = currentBid+rn.nextInt(10);
        while (tempBid > maxBid){
            tempBid = currentBid+rn.nextInt(10);
        }
        personalBid = tempBid;
    }

    @Override
    public void update(Observable o, Object arg) {
        Double bid = (Double) arg;
        if (bid < maxBid){
            makeBid(bid);
        }
        else {
            System.out.println("I can't bid any higher!");
        }
    }
}
