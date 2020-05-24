import exceptions.CheckNumberException;
import portfolio.Mapping;
import portfolio.aboutme.works.ProjectProcessor;



public class TempRun {


static int getHerokuAssignedPort() {
        ProcessBuilder processBuilder = new ProcessBuilder();
        if (processBuilder.environment().get("PORT") != null) {
            return Integer.parseInt(processBuilder.environment().get("PORT"));
        }
        return 4567; //return default port if heroku-port isn't set (i.e. on localhost)
    }


    public static void main(String[] args) throws CheckNumberException {

        Mapping mapping = new Mapping();

staticFiles.location("/public");
        getHerokuAssignedPort();

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
