package com.strategy.pattern.ducks.behaviors.quacking;

import com.strategy.pattern.ducks.QuackBehavior;

public class QuietQuackBehavior implements QuackBehavior{

   public String quack(){
       return "gwahh gwahh gwahh... What was that?";
   }


}