import exceptions.CheckNumberException;
import portfolio.Mapping;
import portfolio.aboutme.AboutMe;
import portfolio.works.ProjectProcessor;
import portfolio.landingpage.LandingPage;


public class TempRun {

/**
to run the the app from terminal 
and performing CRUDE

*/


    public static void main(String[] args) throws CheckNumberException {

        LandingPage landingPage = new LandingPage();
        Mapping mapping = new Mapping();

        // out putting about my self
        AboutMe aboutMe = new AboutMe();
        System.out.println("about me paragraph\n"+
                aboutMe.addAboutMySelf(
                        "jshbcdjhsbdchds." +
                                "sdfkjsdhfjsdhfkjhdsf" +
                                "fjshkfjsjhfsjf.s" +
                                "dfsdfjshdfkjshfjkhdf.sdjshfjshdfs" +
                                "dfkjshdfjhfsdfmnvbcxv.jdfhsfihjj"
                )
        );

        // out putting Skills
        System.out.println("SKills\n"+landingPage.splitToArray("Web Developer,Web Designer,Front end Developer"));


        //TODO - DO NOT DELETE CODE BELOW IT'S WORKING..
        //out putting works

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
