package portfolio.works;


import org.junit.Test;
import org.junit.jupiter.api.DisplayName;
import portfolio.aboutme.works.Projects;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;


public class ProjectTests {
    private String expectedMessage;
    private String actualMessage;

    @Test
    @DisplayName("setting the project title")
    public void setTitle() {
        String title = "title titLe";
        Projects projects = new Projects();

        actualMessage = projects.title(title);
        expectedMessage = "Title Title";

        assertEquals(expectedMessage, actualMessage);
        assertTrue(actualMessage.contains(expectedMessage));

    }

    @Test
    @DisplayName("record the project description")
    public void setDescription() {
        Projects projects = new Projects();
        String description = "qwerty qwerty qwerty qwerty qwerty qwerty qwerty" +
                "qwerty qwerty qwerty qwerty qwerty qwerty qwerty qwerty qwerty" +
                "qwerty qwerty qwerty qwerty qwerty qwerty qwerty qwerty qwerty" +
                "qwerty qwerty qwerty qwerty qwerty qwerty qwerty qwerty qwerty" +
                "qwerty qwerty qwerty qwerty qwerty qwerty qwerty qwerty qwerty" +
                "qwerty qwerty qwerty qwerty qwerty qwerty qwerty qwerty qwerty";

        actualMessage = String.valueOf(projects.description(description));
        expectedMessage = description;
        assertEquals(expectedMessage,actualMessage);


    }

    @Test
    @DisplayName("should be able to add projects")
    public void addProjects() {

        Projects projects = new Projects();

//        projects.myWorks("greet in java", "dfghjkliuytfgliduyghvbskjghsvghfsgfgshsfhgfgf");

    }


}
