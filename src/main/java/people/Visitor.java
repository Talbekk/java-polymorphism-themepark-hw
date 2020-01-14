package people;

import attractions.Attraction;
import attractions.Dodgems;

import java.util.ArrayList;

public class Visitor {

    private int age;
    private double height;
    private double money;
    private ArrayList<Attraction> attractionsVisited;

    public Visitor(int age, double height, double money) {
        this.age = age;
        this.height = height;
        this.money = money;
        this.attractionsVisited = new ArrayList<>();
    }

    public int getAge() {
        return age;
    }

    public double getHeight() {
        return height;
    }

    public double getMoney() {
        return money;
    }

    public ArrayList<Attraction> getAttractionsVisited() {
        ArrayList<Attraction> attractionsList = new ArrayList<>(this.attractionsVisited);
        return attractionsList;
    }

    public void addAttraction(Attraction item) {
        this.attractionsVisited.add(item);
    }
}
