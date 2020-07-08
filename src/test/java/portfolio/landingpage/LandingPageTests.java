package portfolio.landingpage;

import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;


public class LandingPageTests {
    private String ExpectedMessage;
    private String ActualMessage;


    @DisplayName("splitting string from the user input")
    @Test
    public void splittingTheStringFromUserInput() {
        LandingPage lp = new LandingPage();

        ActualMessage = lp.splitToArray("  Software developer, Inspector ,Teacher,UIX Designer");
        ExpectedMessage ="Software developer,Inspector,Teacher,UIX Designer";


        assertEquals(ExpectedMessage, ActualMessage);
        assertTrue(ExpectedMessage.contains(ActualMessage));

    }


    @DisplayName("returning skills to be displayed in landing page")
    @Test
    public void shouldReturnSkills() {
        LandingPage lp = new LandingPage();

        String skills = "Accounting , Doctor, Internal Audit";
        ActualMessage = lp.splitToArray(skills);
        ExpectedMessage ="Accounting,Doctor,Internal Audit";

        assertEquals(ExpectedMessage,ActualMessage);

        // must return an error message
        skills = "accountant Teacher";

        ActualMessage =lp.splitToArray(skills);
        ExpectedMessage = "Enter at least two skills";

        assertEquals(ExpectedMessage, ActualMessage);
    }
}
