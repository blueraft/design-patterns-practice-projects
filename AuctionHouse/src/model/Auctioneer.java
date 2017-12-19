package model;

import java.util.Observable;

public class Auctioneer extends Observable{

    private String name;
    private Double currentBid;

    public Auctioneer(String name){
        this.name = name;
        currentBid = 0.0;
    }

    public String getName() {
        return name;
    }

    public Double getCurrentBid() {
        return currentBid;
    }

    public void acceptBid(Double bid){
        if (bid > currentBid){
            currentBid = bid;
            setChanged();
            notifyObservers(bid);
        }
        else {
            System.out.println("That bid isn't larger than the current bid!");
        }
    }

}
