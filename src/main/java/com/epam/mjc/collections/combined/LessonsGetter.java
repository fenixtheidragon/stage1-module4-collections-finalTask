package com.epam.mjc.collections.combined;

import java.util.*;

public class LessonsGetter {
    public Set<String> getLessons(Map<String, List<String>> timetable) {
        HashSet<String> timetableAsHashSet = new HashSet<>();
        timetable.values().forEach(timetableAsHashSet::addAll);
        return timetableAsHashSet;       
    }
}
