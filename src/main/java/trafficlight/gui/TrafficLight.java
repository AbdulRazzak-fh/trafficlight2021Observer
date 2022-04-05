package trafficlight.gui;
//observer

import observer.Observer;

import java.awt.*;

public class TrafficLight extends Light implements Observer {

    TrafficLight(Color color) {
        super(color);
    }

    public void turnOn(boolean a) {
        isOn = a;
        repaint();
    }

    public boolean isOn() {
        return isOn;
    }


    //TODO implement a part of the pattern here
    public void update() {
        turnOn(!isOn);
    }
}
