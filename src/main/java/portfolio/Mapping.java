package portfolio;

import java.util.*;

public class Mapping {

    public static List<String> projectList = new ArrayList<>();
    public static StringBuilder sb = new StringBuilder();


    private Map<String, List<String>> map = new HashMap<>();

    public Map<String, List<String>> getMap() {

        // adding elements from different pages

        map.put("aboutme", Collections.singletonList(sb.toString()));
        map.put("projects",projectList);
        return map;
    }




}
