package portfolio;

import spark.ModelAndView;
import spark.template.handlebars.HandlebarsTemplateEngine;

import java.util.HashMap;
import java.util.Map;

import static spark.Spark.get;
import static spark.Spark.port;



public class Web {

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
