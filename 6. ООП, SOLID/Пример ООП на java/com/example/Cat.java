package com.example;

import baseObjects.Animal;

/**
 * Created by developer on 01/08/16.
 */
public class Cat extends Animal {

    public String getName(){
        return super.getName() == null ? getClass().getSimpleName() : super.getName();
    }

    @Override
    public void voice() {
        String speach = " say: meow";
        System.out.println(getName() + speach);
    }

    public void catchMouse(){
        System.out.println("Caught mouse.");
    }
}
