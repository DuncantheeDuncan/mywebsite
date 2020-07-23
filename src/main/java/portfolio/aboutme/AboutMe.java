package portfolio.aboutme;


import toolbox.ToolBox;

public class AboutMe extends ToolBox {

    public String addAboutMySelf(String aboutMe) {
//TODO this method is incomplete
        String text = capitaliseFirstLetter(aboutMe);

        return text;
    }

    public String capitaliseFirstLetter(String capitalise) {
        String[] splitting = capitalise.split("\\.");
        String con = "";
        for (String S : splitting) {

            String trim = S.trim();

            con += " " + trim.substring(0, 1).toUpperCase() + trim.substring(1).toLowerCase().concat(".");

        }

        return con.trim();
    }

}
