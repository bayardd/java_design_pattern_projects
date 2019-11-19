package com.strategy.pattern.ducks;

//Interface implements a strategy which concrete classes will implement.
//implement as many classes as desirer which contains logic which will be reused per duck object. 
//Think composition, the duck object will contain a specific type of QuachStrategy when implemented.
/*
    I will create objects with which implement this interface. These objects determine the different features associated
    with this specifc behavior

    Ex: FlyStrategy
    classes:
        cannotFlyStrategy
        poorFlyStrategy
        mediumFlyStrategy
        goodFlyStrategy
        extremeFlyStrategy

    Or:
    interface (behavior) QuackBehavior
    classes:
        UnbelieveblyLoudBehavior
        LoudQuackBehavior
        QuietQuackBehavior
        CannotQuackBehavior

    Using this methodology, the main duck class itself never has to change, and its subclasses may reuse the behaviors again and again
    without repeating code, it is clean. Additionally, if we ever need to modify a certain behavior, the parent class never has to be 
    touched, the classes which implement the behavior may be modified instead.

    ****** The subclasses will inherit the behavior of the parent class. We need to give the parent the ability to call the 
    methods of hte concrete classes of the interface. 
*/
public interface QuackBehavior{
    public String quack(); 
}