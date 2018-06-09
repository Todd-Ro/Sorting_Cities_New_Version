package com.jetbrains.comparators;

import com.jetbrains.City;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * Created based on LaunchCode sources
 */
public class CompoundComparator implements Comparator<City>, java.io.Serializable {

    List<Comparator<City>> comparators = new ArrayList<>();

    public void add(Comparator<City> cityComparator) {
        comparators.add(cityComparator);
    }

    @Override
    public int compare(City o1, City o2) {
        // Note: Refer to the City class' equals method to determine whether this Comparator's orderings are consistent.
        int size = comparators.size();
        int currentIndex = 0;
        if (currentIndex < size) {
            int comparison = comparators.get(currentIndex).compare(o1, o2);
            if (comparison != 0) {
                return comparison;
            }
            else {
                if (currentIndex == size-1) {
                    return comparison;
                }
                else {
                    currentIndex++;
                    return compare(o1, o2, currentIndex, comparators);
                }
            }
        }
        else {
            return comparators.get(size-1).compare(o1, o2);
        }
    }

    private static int compare(City o1, City o2, int index, List<Comparator<City>> c){
        // Note: Refer to the City class' equals method to determine whether this Comparator's orderings are consistent.
        int size = c.size();
        int currentIndex = index;
        if (currentIndex < size) {
            int comparison = c.get(currentIndex).compare(o1, o2);
            if (comparison != 0) {
                return comparison;
            }
            else {
                if (currentIndex == size-1) {
                    return comparison;
                }
                else {
                    currentIndex++;
                    return compare(o1, o2, currentIndex, c);
                }
            }
        }
        else {
            return c.get(size-1).compare(o1, o2);
        }
    }


}