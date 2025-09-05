package com.afs.tdd;

public class Location {

    private int x;
    private int y;
    private Direction direction;

    public Location(int x, int y, Direction direction) {
        this.x = x;
        this.y = y;
        this.direction = direction;
    }

    public int getLocationY() {
        return this.y;
    }

    public int getLocationX() {
        return this.x;
    }

    public Direction getDirection() {
        return this.direction;
    }

    public void setX(int newX){
        this.x = newX;
    }

    public void setY(int newY){
        this.y = newY;
    }

    public void setDirection(Direction newDirection){
        this.direction = newDirection;
    }
}

