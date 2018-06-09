package com.jetbrains.comparators;

import com.jetbrains.City;

import java.util.Comparator;

/**
 * Created based on LaunchCode educational materials
 */
public class StateComparator implements Comparator<City>, java.io.Serializable {

    @Override
    public int compare(City o1, City o2) {
        // Note: this comparator imposes orderings that are inconsistent with equals.
        return o1.getState().compareTo(o2.getState());
    }

}
