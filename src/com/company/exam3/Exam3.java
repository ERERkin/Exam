package com.company.exam3;

import java.util.ArrayList;

public class Exam3 {
    public static void main(String[] args) {
        Backpack backpack1 = new Backpack();
        Backpack backpack2 = new Backpack();
        Backpack backpack3 = new Backpack();
        for(int i = 0; i < 20; i++){
            backpack1.addCircle(new Apple());
        }
        backpack1.addCylindrical(new Cola());
        backpack1.addPlane(new Book());
        for (int i = 0; i < 50; i++){
            backpack2.addCircle(new TennisBall());
        }
        backpack2.addCylindrical(new WaterBattle());
        backpack2.addPlane(new Package());
        for(int i = 0; i < 10; i++){
            backpack3.addCircle(new Apple());
        }
        for (int i = 0; i < 3; i++){
            backpack3.addCircle(new TennisBall());
        }
        backpack3.addPlane(new Package());
        backpack3.addCylindrical(new Cola());
    }
}

class Backpack{
    private ArrayList<Cylindrical> cylindricales = new ArrayList<>();
    private ArrayList<Circle> circles = new ArrayList<>();
    private ArrayList<Plane> planes = new ArrayList<>();

    void addCylindrical(Cylindrical cylindrical){
        cylindricales.add(cylindrical);
    }

    void addCircle(Circle circle){
        circles.add(circle);
    }

    void addPlane(Plane plane){
        planes.add(plane);
    }

    public ArrayList<Cylindrical> getCylindricales() {
        return cylindricales;
    }

    public ArrayList<Circle> getCircles() {
        return circles;
    }

    public ArrayList<Plane> getPlanes() {
        return planes;
    }
}

abstract class Cylindrical{}

abstract  class Circle{}

abstract class Plane{}

class Apple extends Circle{}

class TennisBall extends Circle{}

class Cola extends Cylindrical{}

class WaterBattle extends Cylindrical{}

class Book extends Plane{}

class Package extends Plane{}