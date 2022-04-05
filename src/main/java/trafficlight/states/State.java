package trafficlight.states;

//TODO implement a part of the pattern here
//subject


import observer.subject;

public abstract class State extends subject {



    public abstract State getNextState();

    public abstract String getColor();

    public String getSting(){
        return getColor();
    }


}