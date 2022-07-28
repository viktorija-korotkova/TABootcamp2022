package com.bootcampexcercise.module8.activity;

import java.util.HashSet;
import java.util.Set;

public class SetActivity {

    public static void main(String[] args) {
        //TODO: 1 - Type code to create a set of names.

        HashSet names = new HashSet();

        //Also try adding a few duplicate entries to this set.
        //TODO: 2 - Call print method to print the set passed as its parameter.

        names.add("Vasya");
        names.add("John");
        names.add("Marta");
        names.add("Vasya");

        System.out.println("Names hashmap content : ");
        SetActivity act = new SetActivity();
        act.print(names);
    }
    void print(Set set) {
        //TODO: 3 - Type code to print this set
        //Notice the order in which elements get printed.
        for (Object names : set) {
            System.out.println(names.toString());
        }
    }
}
