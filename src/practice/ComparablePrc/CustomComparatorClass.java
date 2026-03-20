package practice.ComparablePrc;

import java.util.Comparator;

public class CustomComparatorClass implements Comparator<movie> {
    @Override
    public int compare(movie o1, movie o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
