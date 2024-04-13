package org.example.Observer;

import org.example.Observable.StocksObservable;

public class MobileAlertObserverImpl implements NotificationAlertObserver{
    String userName;
    StocksObservable observable;

    public MobileAlertObserverImpl(String emailId, StocksObservable observable){
        this.observable = observable;
        this.userName = emailId;
    }
    @Override
    public  void update(){
        sendMsgOnMobile(userName, "product is in stock hurry up!");
    }
    private void sendMsgOnMobile(String userName, String msg){
        System.out.println("mail send to : " + userName);
        //send the actual email to the end user
    }

}
