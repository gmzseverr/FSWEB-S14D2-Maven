package org.example.model;
import org.example.model.enums.LampType;

public class Lamp {
    private LampType style;
    private boolean battery;
    private int globRating;


    public Lamp(int globRating, boolean battery, LampType style) {
        this.globRating = globRating;
        this.battery = battery;
        this.style = style;
    }



    public LampType getStyle() {
        return style;
    }

    public int getGlobRating() {
        return globRating;
    }

    public boolean isBattery() {
        return battery;
    }

    public void turnOn(){

        System.out.println("Lamp is being turned on.");
    }

    @Override
    public String toString() {
        return "Lamp{" +
                "style=" + style +
                ", battery=" + battery +
                ", globRating=" + globRating +
                '}';
    }
}
