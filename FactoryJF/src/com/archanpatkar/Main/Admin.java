package com.archanpatkar.Main;

import com.archanpatkar.Props.QoS;
import com.archanpatkar.Stack.Stack;
import com.archanpatkar.Factory.StackFactory;

public class Admin {

    public static void main(String[] args) 
    {
        System.out.println("Entering Main");
        System.out.println("Welcome to Factory");   
        Client(StackFactory.getStack());
        System.out.println("Leaving Main");
    }

    static void Client(Stack a)
    {
        a.push(10);
        a.pop();
        a.push(120);
        a.push(670);
    }
    
}


