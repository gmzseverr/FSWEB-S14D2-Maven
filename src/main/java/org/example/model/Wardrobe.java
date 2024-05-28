package org.example.model;


public class Wardrobe {
    private int width;
    private int height;
    private double weight;

    public Wardrobe(double weight, int height, int width) {
        this.weight = weight;
        this.height = height;
        this.width = width;
    }

    public int getWidth() {
        return width;
    }

    public double getWeight() {
        return weight;
    }

    public int getHeight() {
        return height;
    }

    public void add(){
        System.out.println("Wardrobe added into Bedroom.");
    }
}
