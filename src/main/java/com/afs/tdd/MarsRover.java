package com.afs.tdd;

import javax.swing.plaf.basic.BasicArrowButton;
import java.util.Arrays;
import java.util.List;

public class MarsRover {
    
    private final Location location;
    private final List<Direction> directions = Arrays.asList(Direction.values());

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
            case B: moveBack(); break;
        }
    }

    public String executeCommand(String batchCommand) {
        String[] commands = batchCommand.split("");
        StringBuilder report = new StringBuilder();
        for(String c: commands){
            executeCommand(Command.valueOf(c));
            report.append(this.location.generateReport());
        }
        return report.toString();
    }

    public void move() {
        switch (this.location.getDirection()) {
            case N: this.location.setY(this.location.getLocationY()+1); break;
            case E: this.location.setX(this.location.getLocationX()+1); break;
            case S: this.location.setY(this.location.getLocationY()-1); break;
            case W: this.location.setX(this.location.getLocationX()-1); break;
        }
    }

    public void moveBack() {
        switch (this.location.getDirection()) {
            case N: this.location.setY(this.location.getLocationY()-1); break;
            case E: this.location.setX(this.location.getLocationX()-1); break;
            case S: this.location.setY(this.location.getLocationY()+1); break;
            case W: this.location.setX(this.location.getLocationX()+1); break;
        }
    }

    public void turnLeft() {
        int indexOfCurrentDirection = directions.indexOf(this.location.getDirection());
        int newDirectionIndex = (indexOfCurrentDirection - 1 + directions.size())%directions.size();
        this.location.setDirection(directions.get(newDirectionIndex));
    }

    public void turnRight() {
        int indexOfCurrentDirection = directions.indexOf(this.location.getDirection());
        int newDirectionIndex = (indexOfCurrentDirection + 1 + directions.size())%directions.size();
        this.location.setDirection(directions.get(newDirectionIndex));
    }





}
