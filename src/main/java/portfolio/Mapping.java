package portfolio;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Mapping {

    public static List<String> projectList = new ArrayList<>();


    private Map<String, List<String>> map = new HashMap<>();
    public Map<String, List<String>> getMap() {

        // adding elements from different pages

        map.put("projects",projectList);
        return map;
    }




}
