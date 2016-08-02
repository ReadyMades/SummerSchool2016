package com.example;

import baseObjects.Animal;

/**
 * Created by developer on 01/08/16.
 */
public class Tiger extends Animal {

    public String getName(){
        return super.getName() == null ? getClass().getSimpleName() : super.getName();
    }

    @Override
    public void voice() {
        String speach = " say: rrrrrrr....";
        System.out.println(getName() + speach);
    }

    public void sing(){
        System.out.println("Singing: touch my tralala...");
    }
}
