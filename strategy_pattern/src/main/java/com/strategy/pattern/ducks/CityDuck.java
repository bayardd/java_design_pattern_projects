package com.strategy.pattern.ducks;

import com.strategy.pattern.ducks.behaviors.quacking.QuietQuackBehavior;;

class CityDuck extends Duck{

    public CityDuck(){
        super();

        System.out.println("City Duck has been spawned to wreak havok ");

        quackType = new QuietQuackBehavior();
    }

    

}