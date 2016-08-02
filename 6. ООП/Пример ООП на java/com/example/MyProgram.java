package com.example;

import java.util.ArrayList;
import java.util.List;

import baseObjects.Animal;
import baseObjects.IAnimal;

/**
 * Created by developer on 01/08/16.
 */
public class MyProgram {
    public static void main(String[] Args){
        System.out.println("Hello, world!");

        Tiger tiger = new Tiger();
        //tiger.setmName("Pasha");
        Cat cat = new Cat();
        List<IAnimal> animals = new ArrayList<>();
        animals.add(cat);
        animals.add(tiger);
        //Animal animal = tiger;
        //tiger.voice();
        //tiger.sing();
        for (IAnimal animal : animals) {
            animal.voice();
        }
    }
}
