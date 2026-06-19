package com.training.Service;

import org.springframework.stereotype.Component;

@Component
public class NotificationService {
    public void sendnotification(String name){
        System.out.println("You have registered Successfully "+name);
    }
}
