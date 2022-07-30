package com.bootcampexcercise.module10.activity5;

import java.util.HashMap;

public class ElectronicItemDetails {
    public static void main(String[] args) {
        HashMap<String, Double> map = new HashMap<String, Double>();

        map.put("TV", 2000.0);
        map.put("Refrigerator", 300.0);
        map.put("Washing Machine", 200.0);
        map.put("Laptop", 3000.0);

        System.out.println("Price of TV is: " + returnPriceOfItem(map, "TV"));
    }

    public static double returnPriceOfItem(HashMap<String, Double> itemHashMap, String name) {
        return itemHashMap.get(name);
    }
}
