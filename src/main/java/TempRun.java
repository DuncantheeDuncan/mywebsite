import exceptions.CheckNumberException;
import portfolio.Mapping;
import portfolio.aboutme.works.ProjectProcessor;



public class TempRun {

/**
to run the the app from terminal 
and performing CRUDE

*/


    public static void main(String[] args) throws CheckNumberException {

        Mapping mapping = new Mapping();



            new ProjectProcessor().projects(
                    "first project",
                    "one one one one one one one one one" +
                            "one one one one one one one one one one one one" +
                            "one one one one one one one one one one one one" +
                            "one one one one one one one one one one one one");


        new ProjectProcessor().projects(
                "second project",
                "onek onek one one one one one one one" +
                        "one one one one one one one one one one one one" +
                        "one one onek one one one one one one one one one" +
                        "one one one kone one one one one one one one one");



        System.out.println(mapping.getMap());
    }
}
