package com.afs.tdd;

import javax.swing.plaf.basic.BasicArrowButton;

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
            case M: move();
            case L: turnLeft();
            case R: turnRight();
        }
    }

    public void move() {
        switch (this.location.getDirection()) {
            case N: this.location.setY(this.location.getLocationY()+1);
            case E: ;
            case S: ;
            case W: ;
        }
    }

    public void turnLeft() {
        switch (this.location.getDirection()) {
            case N: ;
            case E: ;
            case S: ;
            case W: ;
        }
    }

    public void turnRight() {
        switch (this.location.getDirection()) {
            case N: ;
            case E: ;
            case S: ;
            case W: ;
        }
    }





}
