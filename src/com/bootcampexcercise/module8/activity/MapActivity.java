package com.bootcampexcercise.module8.activity;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapActivity {

    public static void main(String[] args) {
        //1 - Type code to create a HashMap of key value pair
        //where key is id of type String and value is a name
        //2 - Call print method to print the map passed as its parameter.
        HashMap map = new HashMap();
        map.put("1", "Dana");
        map.put("2", "Gektor");
        map.put("3", "Darya");
        map.put("4", "Viktor");

        MapActivity activity = new MapActivity();

        System.out.println(map.get("1"));
        System.out.println(map.get("2"));

        activity.print(map);

    }

    void print(Map map)
    {
        //3 - Type code to print this map
        Set keySet = map.keySet();

        System.out.println("*************************************");
        System.out.println("Key\tValue");
        Iterator it = keySet.iterator();
        while (it.hasNext()) {
            String key = (String) it.next();
            System.out.println(key + "\t" + map.get(key));
        }

        System.out.println("*************************************");
    }
}
