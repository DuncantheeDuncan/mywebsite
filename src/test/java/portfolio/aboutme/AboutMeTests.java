package portfolio.aboutme;

import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

import static org.junit.Assert.assertEquals;

public class AboutMeTests {

    private String EXPECTED;
    private String ACTUAL;

    @DisplayName("making sure it's capitalise every first letter after a full stop (.)")
    @Test
    public void mustCapitaliseAfterAFullStop(){
        AboutMe aboutMe = new AboutMe();

        String text = "making. sure. it's. capitalise. every. first. letter. after. a full stop.";

        ACTUAL = aboutMe.capitaliseFirstLetter(text);
        EXPECTED ="Making. Sure. It's. Capitalise. Every. First. Letter. After. A full stop.";

        assertEquals(EXPECTED,ACTUAL);


        text = "phumlani./ phumlan#.# #&*@). jack.  jabulani.madlokovu.sthembiso";

        ACTUAL = aboutMe.capitaliseFirstLetter(text);
        EXPECTED ="Phumlani. / phumlan#. # #&*@). Jack. Jabulani. Madlokovu. Sthembiso.";

        assertEquals(EXPECTED,ACTUAL);

    }
}
