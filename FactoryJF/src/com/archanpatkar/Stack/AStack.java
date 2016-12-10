package com.archanpatkar.Stack;

public class AStack implements Stack 
{
    @Override
    public void push(int val){
        System.out.println("Push of AStack val = " + val);
    }
    @Override
    public void pop()
    {
        System.out.println("Pop of ASstack");
    }
}
