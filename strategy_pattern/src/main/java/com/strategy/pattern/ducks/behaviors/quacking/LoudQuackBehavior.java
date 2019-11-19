package com.strategy.pattern.ducks.behaviors.quacking;

import com.strategy.pattern.ducks.QuackBehavior;

public class LoudQuackBehavior implements QuackBehavior{

   public String quack(){
       return "GWAH GWAHH GWAHH!!! My god what is that noise???!?!?!?!";
   }
}

