package portfolio.landingpage;


import java.util.ArrayList;
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
            return "Enter at least two skills";
        }else {

         String[] splitting = split.split(",");
         for (String S : splitting){
         skills.add(S.trim());

        }
        //FIXME-/- hard cording just for Temp.

        skills.add("Web Developer,");
        skills.add("Web Designer,");
        skills.add("Front end Developer");

        return skills;
        }
    }



    public List<String> getSkills() {
      return skills;
    }




    



}