package com.epam.mjc.collections.list;

import java.util.Comparator;
import java.util.List;

public class ListSorter {
    public void sort(List<String> sourceList) {
        sourceList.sort(new ListComparator());
    }
}

class ListComparator implements Comparator<String> {
    @Override
    public int compare(String a, String b) {
        int aInt = Integer.parseInt(a);
        int bInt = Integer.parseInt(b);
        if (aInt * aInt > bInt * bInt)
            return 1;
        else if (aInt * aInt < bInt * bInt)
            return -1;
        else
            return Integer.compare(aInt, bInt);
    }
}