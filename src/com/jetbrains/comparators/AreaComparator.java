package com.jetbrains.comparators;

import com.jetbrains.City;

import java.util.Comparator;

/**
 * Created based on LaunchCode educational materials
 */
public class AreaComparator implements Comparator<City>, java.io.Serializable {

    @Override
    public int compare(City o1, City o2) {
        // Note: this comparator imposes orderings that are inconsistent with equals.
        Double area1 = o1.getArea();
        Double area2 = o2.getArea();
        return area1.compareTo(area2);
    }

}
