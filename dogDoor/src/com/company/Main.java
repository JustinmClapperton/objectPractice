package com.company;

public class Main {

    public static void main(String[] args) {
    DogDoor door = new DogDoor();
	Remote remote = new Remote(door);
    remote.pressButton();
        while(door.isOpen() == true);

    for(int i = 0;i<10;i++){
        remote.pressButton();
    }
    }
}
