package observer;


import trafficlight.gui.TrafficLight;


import java.util.ArrayList;
import java.util.List;



public class subject  {

    private List<TrafficLight> observers = new ArrayList<TrafficLight>();
    public void notifyObservers()
    {
        for (TrafficLight observer : observers)
        {
            observer.update();
        }
    }
    public void addObserver(TrafficLight observer)
    {
        observers.add(observer);
    }
    public void removeObservers(TrafficLight observer)
    {
        observers.remove(observer);
    }
}
