package com.company;

/**
 * Created by justin on 5/22/2014.
 */
public class DogDoor {

    private boolean open;

    public DogDoor() {
        this.open = false;
    }

    public void open() {
        System.out.println("The dog door opens.");
    }

    public void close() {
        System.out.println("The dog door closes.");
    }

}
