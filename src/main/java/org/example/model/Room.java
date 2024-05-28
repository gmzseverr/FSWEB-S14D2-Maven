package org.example.model;

public class Room {
    private Carpet carpet;
    private Ceiling ceiling;
    private Lamp lamp;
    private Wall[] walls;
    private Wall wall1;
    private Wall wall2;
    private Wall wall3;
    private Wall wall4;

    public Room(Carpet carpet, Ceiling ceiling, Lamp lamp, Wall wall1, Wall wall2, Wall wall4, Wall wall3) {
        this.carpet = carpet;
        this.ceiling = ceiling;
        this.lamp = lamp;
        this.wall1 = wall1;
        this.wall2 = wall2;
        this.wall4 = wall4;
        this.wall3 = wall3;
    }

}
