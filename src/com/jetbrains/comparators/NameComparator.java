package com.jetbrains.comparators;

import com.jetbrains.City;

import java.util.Comparator;

/**
 * Created based on LaunchCode code
 */
public class NameComparator implements Comparator<City>, java.io.Serializable {

    @Override
    public int compare(City o1, City o2) {
        // Note: refer to the City class' equals method to determine whether this Comparator's orderings are consistent.
        return o1.getName().compareTo(o2.getName());
    }

    // compareTo is a method that the String class has because the String class implements the Comparable interface.
    // String's compareTo method compares Strings lexicographically based on the Unicode values of the characters.
    // Iterable documentation says that compareTo "Returns a negative integer, zero, or a positive integer ...
            // ... as this object is less than, equal to, or greater than the specified object. "
    // For String, compareTo's result is negative if the first String "lexicographically precedes the argument string"

}
