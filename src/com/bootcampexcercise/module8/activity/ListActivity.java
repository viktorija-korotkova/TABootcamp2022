package com.bootcampexcercise.module8.activity;

import java.util.ArrayList;
import java.util.List;



public class ListActivity {
    public static void main(String[] args) {
        //TODO: 1 - Type code to create a list of names. Use ArrayList.
        ArrayList list = new ArrayList();
        list.add("Dana");
        list.add("Vasya");
        list.add("Darya");
        list.add("Gektor");
        list.add("Vasya");

        //TODO: 2 - Call print method to print the list passed as its parameter.
        ListActivity activity = new ListActivity();
        activity.print(list);
        activity.printFirst(list);
        activity.printLast(list);
    }

    void print(List list)
    {
        //TODO: 3 - Type code to print this list
        //Notice the order in which elements get printed.
        System.out.println("List content:");
        for (Object names : list) {
            System.out.println(names.toString());
        }
    }

    void printFirst(List list)
    {
        //TODO: 3 - Type code to print this list
        //Notice the order in which elements get printed.
        System.out.println("List first item:");
        System.out.println(list.get(0));
    }

    void printLast(List list)
    {
        //TODO: 3 - Type code to print this list
        //Notice the order in which elements get printed.
        System.out.println("List last item:");
        System.out.println(list.get(list.size() - 1));
    }
}