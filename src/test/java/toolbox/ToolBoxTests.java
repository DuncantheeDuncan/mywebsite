package toolbox;


import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

import static org.junit.Assert.*;

public class ToolBoxTests {

    private String expectedMessage;
    private  String actualMessage;

    @Test

    @DisplayName("checking if description is not less than 30 words and not more than 350")
    public void shouldFindMaxAndMin(){
        ToolBox toolBox =new ToolBox();

        String description = "qwerty qwerty qwerty qwerty qwerty" +
                "qwerty qwerty qwerty qwerty qwerty" +
                "qwerty qwerty qwerty qwerty qwerty" +
                "qwerty qwerty qwerty qwerty qwerty" +
                "qwerty qwerty qwerty qwerty qwerty" +
                "qwerty qwerty qwerty qwerty qwerty" +
                "qwerty qwerty qwerty qwerty qwerty" +
                "qwerty qwerty qwerty qwerty qwerty" +
                "qwerty qwerty qwerty qwerty qwerty" +
                "qwerty qwerty qwerty qwerty qwerty";

        expectedMessage = String.valueOf(false);
        actualMessage = String.valueOf(toolBox.isParagraphGreaterOrSmaller(description));

        assertEquals(expectedMessage,actualMessage);
        assertTrue(expectedMessage.contains(actualMessage));



        description = "qwerty qwerty qwerty qwerty qwerty" +
                "qwerty qwerty qwerty qwerty qwerty" +
                "qwerty qwerty qwerty qwerty qwerty" +
                "qwerty qwerty qwerty qwerty qwerty" +
                "qwerty qwerty qwerty qwerty qwerty" +
                "qwerty qwerty qwerty qwerty qwerty" +
                "qwerty qwerty qwerty qwerty qwerty" +
                "qwerty qwerty qwerty qwerty qwerty" +
                "qwerty qwerty qwerty qwerty qwerty" +
                "qwerty qwerty qwerty qwerty qwerty" +
                "qwerty qwerty qwerty qwerty qwerty" +
                "qwerty qwerty qwerty qwerty qwerty" +
                "qwerty qwerty qwerty qwerty qwerty" +
                "qwerty qwerty qwerty qwerty qwerty" +
                "qwerty qwerty qwerty qwerty qwerty" +
                "qwerty qwerty qwerty qwerty qwerty" +
                "qwerty qwerty qwerty qwerty qwerty" +
                "qwerty qwerty qwerty qwerty qwerty" +
                "qwerty qwerty qwerty qwerty qwerty";

        expectedMessage = String.valueOf(true);
        actualMessage = String.valueOf(toolBox.isParagraphGreaterOrSmaller(description));


        assertEquals(expectedMessage,actualMessage);
        assertTrue(expectedMessage.contains(actualMessage));


    }
}
