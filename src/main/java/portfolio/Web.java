package portfolio;

import portfolio.landingpage.LandingPage;
import spark.ModelAndView;
import spark.template.handlebars.HandlebarsTemplateEngine;

import java.util.HashMap;
import java.util.Map;

import static spark.Spark.*;


public class Web {

    public static void main(String[] args) {
        Web wb = new Web();
        LandingPage lp = new LandingPage();

        // port(8080);
        staticFiles.location("/public");
        port(getHerokuAssignedPort());


        get("/", (req, res) -> {

            Map<String, Object> model = new HashMap<>();
            Map<String, Object> mapp = new HashMap<>();


            mapp.put("Number", wb.names());

//            rendering
            model.put("menu", lp.menu);
            model.put("home", lp.home);
            model.put("about", lp.about);
            model.put("service", lp.service);
            model.put("work", lp.work);
            model.put("contact", lp.contact);
            model.put("title",lp.title);
            model.put("readmore", lp.button);

            lp.splitToArray("Web Developer, Web Designer, Front end Developer");//FIXME// fix hard coding!!
            model.put("skills", lp.getSkills());


            return new HandlebarsTemplateEngine()
                    .render(new ModelAndView(model, "index.handlebars"));
        });
    }




    static int getHerokuAssignedPort() {// must check the port the problem might be here..
        ProcessBuilder processBuilder = new ProcessBuilder();
        if (processBuilder.environment().get("PORT") != null) {
            return Integer.parseInt(processBuilder.environment().get("PORT"));
        }
        return 4567; //return default port if heroku-port isn't set (i.e. on localhost)
    }

    public String names() {//checking
        Map<String, String> name = new HashMap<>();
        for (int i = 0; i < 10; i++) {

            name.put("ID " + i, "number: ".concat(String.valueOf(i)));
        }
        return String.valueOf(name);
    }


}
