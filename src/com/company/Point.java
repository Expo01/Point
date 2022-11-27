package com.company;

public class Point {

    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Point() {

    }


    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public double distance(){
        return Math.sqrt(x * x + y *y);
    }

    public double distance(int x2, int y2){
        return Math.sqrt( (x2-x) * (x2-x) + (y2-y) * (y2-y) );
    }

    public double distance (Point newPoint){
        return Math.sqrt( (newPoint.getX() - x) * (newPoint.getX() - x) + (newPoint.getY() - y) * (newPoint.getY() - y) );
    }
}
