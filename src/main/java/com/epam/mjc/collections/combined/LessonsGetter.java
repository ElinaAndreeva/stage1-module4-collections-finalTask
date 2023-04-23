package com.epam.mjc.collections.combined;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.HashSet;

public class LessonsGetter {
    public Set<String> getLessons(Map<String, List<String>> timetable) {
        HashSet<String> subjects = new HashSet<>();
        for (Map.Entry<String, List<String>> s : timetable.entrySet()) {
            subjects.addAll(s.getValue());
        }
        return subjects;
    }
}
