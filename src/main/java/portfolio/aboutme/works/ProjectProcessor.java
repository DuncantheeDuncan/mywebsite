package portfolio.aboutme.works;

import exceptions.CheckNumberException;

import portfolio.Mapping;
import toolbox.ToolBox;

import java.util.HashMap;
import java.util.Map;

public class ProjectProcessor {

    public void projects(String title, String description) throws CheckNumberException {
        Projects projects = new Projects();
        ToolBox tool = new ToolBox();
        Map<String, String> addProjects = new HashMap<>();

        if (!tool.hasNumber(title)) {
            if (!tool.isParagraphGreaterOrSmaller(description)) {

                addProjects.put(projects.title(title), String.valueOf(projects.description(description)));
                Mapping.projectList.add(String.valueOf(addProjects));

            } else {
                throw new CheckNumberException("You must have no less than 30 words and not more than 350 words");
            }

        } else {
            throw new CheckNumberException("Strictly, a title (".concat(title).concat(") cannot include a number. try writing int words"));
        }
    }
}
