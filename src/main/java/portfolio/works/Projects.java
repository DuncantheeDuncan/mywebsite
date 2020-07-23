package portfolio.works;


import toolbox.ToolBox;

public class Projects {
    ToolBox tool = new ToolBox();

    public String title(String title) {
        return tool.capitaliseFirstLetter(title);
    }

    public StringBuilder description(String description) {
        StringBuilder sb = new StringBuilder();

        sb.append(description);

        return sb;
    }


}
