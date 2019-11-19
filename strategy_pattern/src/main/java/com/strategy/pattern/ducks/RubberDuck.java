package com.strategy.pattern.ducks;

import com.strategy.pattern.ducks.behaviors.quacking.LoudQuackBehavior;

public class RubberDuck extends Duck{

    public RubberDuck(){
        super();

        System.out.println("The Rubber Duck has spawned in and eliminated all enemies ");

        quackType = new LoudQuackBehavior();

    }

}   