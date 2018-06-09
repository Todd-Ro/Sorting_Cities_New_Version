package com.jetbrains;

import com.jetbrains.comparators.CompoundComparator;
import com.jetbrains.comparators.NameComparator;
import com.jetbrains.comparators.PopulationComparator;
import com.jetbrains.comparators.StateComparator;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<City> cities = CityData.loadData();

        // TODO - Use different comparators here
        NameComparator comparator = new NameComparator();
        cities.sort(comparator);
        printCities(cities);
        System.out.println("\n"+"\n");

        CompoundComparator comparator2 = new CompoundComparator();
        comparator2.add(new StateComparator());
        cities.sort(comparator2);
        printCities(cities);
        System.out.println("\n"+"\n");

        comparator2.add(new PopulationComparator());
        cities.sort(comparator2);
        printCities(cities);
    }

    private static void printCities(ArrayList<City> cities) {

        System.out.println(City.getTableHeader());

        for(City c: cities) {
            System.out.println(c);
        }

    }
}
