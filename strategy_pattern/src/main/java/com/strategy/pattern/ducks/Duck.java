package com.strategy.pattern.ducks;

public class Duck{

    protected QuackBehavior quackType;

    public Duck(){
        System.out.println("Duck has been spawned :)");
    }

    public String tryToQuack(){
        return quackType.quack();
    }

}