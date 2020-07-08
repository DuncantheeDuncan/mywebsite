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
    private String skills ="";


    public String splitToArray(String splitSkills) {

    if (!splitSkills.contains(",")){
            return "Enter at least two skills";
        }else {

         String[] splitting = splitSkills.split(",");

         for (String S: splitting){

             skills += S.trim() +",";
         }

        return skills.substring(0, skills.length() -1);
        }
    }



    public String getSkills() {
      return skills;
    }




    



}
