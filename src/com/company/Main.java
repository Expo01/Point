package com.company;

public class Main {

    public static void main(String[] args) {
        Point first = new Point(6,5);
        Point second = new Point(3,1);
        System.out.println("first point distance to zero = " + first.distance());
        System.out.println("first point distance to specified location = " + first.distance(2,2));
        System.out.println("first point distance to second Point object = " + first.distance(second));
        System.out.println("second point distance to specified location = " + second.distance(2,2));
        Point emptyPoint = new Point();
        System.out.println("Empty point distance to zero = " + emptyPoint.distance());
    }
}
