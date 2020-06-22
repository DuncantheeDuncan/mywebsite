package portfolio.landingpage;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;


public class LandingPage {

    public final String menu = "Menu";
    public final String home = "Home";
    public final String about = "About";
    public final String service = "Services";
    public final String work = "Work";
    public final String contact = "Contact";
    public final String button = "Read More";
    public final String title = "I am Phumlani Mthembu";
    private List<String> skills = new ArrayList<>();


    public List<String> splitToArray(String split) {

    if (!split.contains(",")){
            return Collections.singletonList("Enter at least two skills");
        }else {

         String[] splitting = split.split(",");
        skills.addAll(Arrays.asList(splitting));

        return skills;
        }
    }



    public List<String> getSkills() {
      return skills;
    }




    



}
