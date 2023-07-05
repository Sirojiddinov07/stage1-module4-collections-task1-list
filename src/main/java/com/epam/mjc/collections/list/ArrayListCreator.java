package com.epam.mjc.collections.list;

import java.util.ArrayList;
import java.util.List;

public class ArrayListCreator {
    public ArrayList<String> createArrayList(List<String> sourceList) {
        ArrayList<String> rest = new ArrayList<>();
        int i = 1;
        for (String str : sourceList) {
            if (i++ % 3 == 0) {
                rest.add(str);
                rest.add(str);
            }
        }
        return rest;
    }
}