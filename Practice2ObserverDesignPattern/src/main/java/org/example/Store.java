package org.example;

import org.example.Observable.IphoneObservableImpl;
import org.example.Observable.StocksObservable;
import org.example.Observer.EmailAlertObserverImpl;
import org.example.Observer.MobileAlertObserverImpl;
import org.example.Observer.NotificationAlertObserver;

public class Store {
    public  static void main(String args[]){
        StocksObservable iphoneStockObservable = new IphoneObservableImpl();
        NotificationAlertObserver observer1 = new EmailAlertObserverImpl("abc@gmail.com", iphoneStockObservable);
        NotificationAlertObserver observer2 = new EmailAlertObserverImpl("cde@gmail.com" , iphoneStockObservable);
        NotificationAlertObserver observer3 = new MobileAlertObserverImpl("xyz@gmail.com", iphoneStockObservable);
        iphoneStockObservable.add(observer1);
        iphoneStockObservable.add(observer2);
        iphoneStockObservable.add(observer3);

        iphoneStockObservable.setStockCount(10);
    }
}
