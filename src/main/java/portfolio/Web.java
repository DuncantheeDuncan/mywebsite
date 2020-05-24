package portfolio;

import spark.ModelAndView;
import spark.template.handlebars.HandlebarsTemplateEngine;

import java.util.HashMap;
import java.util.Map;

import static spark.Spark.*;


public class Web {

    static int getHerokuAssignedPort() {// must check the port the problem might be here..
        ProcessBuilder processBuilder = new ProcessBuilder();
        if (processBuilder.environment().get("PORT") != null) {
            return Integer.parseInt(processBuilder.environment().get("PORT"));
        }
        return 4567; //return default port if heroku-port isn't set (i.e. on localhost)
    }

    public String names(){//checking purposes
        Map<String, String> name = new HashMap<>();
        for(int i=0;i<10;i++){

            name.put("ID "+i,"number: ".concat(String.valueOf(i)));
        }


        return String.valueOf(name);
    }
    public static void main(String[] args) {
        Web wb = new Web();
        port(8080);
        staticFiles.location("/public");
        getHerokuAssignedPort();
        

        get("/",(req,res) ->{

            Map<String, Object>model = new HashMap<>();
            Map<String, Object> mapp = new HashMap<>();

            mapp.put("Number",wb.names());
            model.put("counter",mapp);

            return new HandlebarsTemplateEngine()
                    .render(new ModelAndView(model,"index.handlebars"));
        });
    }
}
