package org.example.model;

public class Bedroom {
    private String name;
    private Ceiling ceiling;
    private Lamp lamp;
    private Bed bed;
    private Carpet carpet;
    private Wardrobe wardrobe;
    private Wall wall1;
    private Wall wall2;
    private Wall wall3;
    private Wall wall4;


    public Bedroom(String name, Ceiling ceiling,
                   Lamp lamp, Bed bed, Carpet carpet,
                   Wardrobe wardrobe, Wall wall1,
                   Wall wall3, Wall wall2, Wall wall4) {
        this.name = name;
        this.ceiling = ceiling;
        this.lamp = lamp;
        this.bed = bed;
        this.carpet = carpet;
        this.wardrobe = wardrobe;
        this.wall1 = wall1;
        this.wall3 = wall3;
        this.wall2 = wall2;
        this.wall4 = wall4;
    }

    public String getName() {
        return name;
    }

    public Ceiling getCeiling() {
        return ceiling;
    }

    public Lamp getLamp() {
        return lamp;
    }

    public Bed getBed() {
        return bed;
    }

    public Carpet getCarpet() {
        return carpet;
    }

    public Wardrobe getWardrobe() {
        return wardrobe;
    }

    public Wall getWall1() {
        return wall1;
    }

    public Wall getWall2() {
        return wall2;
    }

    public Wall getWall3() {
        return wall3;
    }

    public Wall getWall4() {
        return wall4;
    }
}
