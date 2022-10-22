package tentamen20131024.two;

import java.util.HashSet;
import java.util.Set;

public abstract class Observable {
    boolean changed = false;
    Set<Observer> observers = new HashSet<>();

    public void addObserver(Observer observer) {
        observers.add(observer);

    }

    protected void setChanged() {
        changed = true;
    }

    public void notifyObservers() {
        for (Observer o : observers) {
            // o.update(this);
        }

    }

}
