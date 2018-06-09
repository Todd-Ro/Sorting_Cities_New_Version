package com.jetbrains;

//import com.jetbrains.comparators.NameComparator;

import java.util.Arrays;
//import java.util.Comparator;
import java.util.Formatter;
import java.util.Locale;

/**
 * Created based on LaunchCode sources
 */

public class City {

    private String name;
    private String state;
    private int population;
    private double area;

    public City(String name, String state, int population, double area) {
        this.name = name;
        this.state = state;
        this.population = population;
        this.area = area;
    }

    public static String getTableHeader() {

        StringBuilder sb = new StringBuilder();
        Formatter formatter = new Formatter(sb, Locale.US);
        formatter.format("%1$-20s%2$-24s%3$-12s%4$-10s", "City", "State", "Population", "Area (sq mi)");
        String row1 = sb.toString();

        char[] chars = new char[66];
        Arrays.fill(chars, '+');
        String row2 = new String(chars);

        return row1 + "\n" + row2;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        Formatter formatter = new Formatter(sb, Locale.US);
        formatter.format("%1$-20s%2$-24s%3$12s%4$10s", name, state, population, area);

        return sb.toString();
    }

    public String getName() {
        return name;
    }

    public String getState() {
        return state;
    }

    public int getPopulation() {
        return population;
    }

    public double getArea() {
        return area;
    }

    @Override
    public boolean equals(Object other){
        if (other == null) return false;
        if (other == this) return true;
        if (!(other instanceof City))return false;
        City otherMyClass = (City)other;
        return (name.compareTo(otherMyClass.getName())==0);
    }
}
