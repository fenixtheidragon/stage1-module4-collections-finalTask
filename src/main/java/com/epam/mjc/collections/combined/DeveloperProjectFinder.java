package com.epam.mjc.collections.combined;

import java.util.*;
import java.util.stream.Collectors;

public class DeveloperProjectFinder {
    public List<String> findDeveloperProject(Map<String, Set<String>> projects, String developer) {
        return  projects.entrySet().stream().
                filter(a -> a.getValue().contains(developer)).
                map(Map.Entry::getKey).
                sorted(new sortByLongestAndAlphabeticallyReverse()).
                collect(Collectors.toCollection(ArrayList<String>::new));

    }
}

class sortByLongestAndAlphabeticallyReverse implements Comparator<String> {
    @Override
    public int compare(String s1, String s2) {
        if (s1.length() < s2.length()) {
            return 1;
        } else if (s1.length() > s2.length()) {
            return -1;
        } else {
            return s2.compareTo(s1);
        }
    }
}
