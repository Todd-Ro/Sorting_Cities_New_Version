package com.jetbrains.comparators;

import com.jetbrains.City;

import java.util.Comparator;

/**
 * Created based on LaunchCode educational materials
 */
public class PopulationComparator implements Comparator<City>, java.io.Serializable {

    @Override
    public int compare(City o1, City o2) {
        // Note: refer to the City class' equals method to determine whether this Comparator's orderings are consistent.
        Integer pop1 = o1.getPopulation();
        Integer pop2 = o2.getPopulation();
        return pop1.compareTo(pop2);
    }

}
