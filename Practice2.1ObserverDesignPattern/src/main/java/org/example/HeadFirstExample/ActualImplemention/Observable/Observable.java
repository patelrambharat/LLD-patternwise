package org.example.HeadFirstExample.ActualImplemention.Observable;
import org.example.HeadFirstExample.ActualImplemention.Observer.Observer;


public interface Observable {
    public void registerObserver(Observer observer);

    public void removeObserver(Observer observer);

    public void notifyObserver();
}
