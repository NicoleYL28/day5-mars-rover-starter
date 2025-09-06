package com.afs.tdd;

import javax.swing.plaf.basic.BasicArrowButton;
import java.util.Arrays;
import java.util.List;

public class MarsRover {
    
    private Location location;

    public MarsRover(Location location) {
        this.location = location;
    }

    public Location getLocation() {
        return this.location;
    }

    public void executeCommand(Command command) {
        switch (command) {
            case M: move(); break;
            case L: turnLeft(); break;
            case R: turnRight(); break;
        }
    }

    public void move() {
        switch (this.location.getDirection()) {
            case N: this.location.setY(this.location.getLocationY()+1); break;
            case E: this.location.setX(this.location.getLocationX()+1); break;
            case S: this.location.setY(this.location.getLocationY()-1); break;
            case W: this.location.setX(this.location.getLocationX()-1); break;
        }
    }

    public void turnLeft() {
        switch (this.location.getDirection()) {
            case N: this.location.setDirection(Direction.W);
        };
    }

    public void turnRight() {

    }





}
