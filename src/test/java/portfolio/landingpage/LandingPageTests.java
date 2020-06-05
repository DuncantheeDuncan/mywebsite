// package portfolio.landingpage;

// import org.junit.Test;
// import org.junit.jupiter.api.DisplayName;

// import java.util.ArrayList;
// import java.util.List;

// import static org.junit.Assert.assertEquals;


// public class LandingPageTests {
//     private String ExpectedMessage;
//     private String ActualMessage;



//     @DisplayName("splitting string from the user input")
//     @Test
//     public void splittingTheStringFromUserInput() {
//         LandingPage lp = new LandingPage();

//         List<String> ActualMessage =  lp.splitToArray("  Software developer, Inspector ,Teacher,UIX Designer");
//         List<String> ExpectedMessage = new ArrayList<>();

//         ExpectedMessage.add("Software developer");
//         ExpectedMessage.add("Inspector");
//         ExpectedMessage.add("Teacher");
//         ExpectedMessage.add("UIX Designer");

//         assertEquals(ExpectedMessage.toString(),ActualMessage.toString());

//     }


//     @DisplayName("returning skills to be displayed in landing page")
//     @Test
//     public void shouldReturnSkills(){
//         LandingPage lp = new LandingPage();

//         String skills = "Accounting , Doctor, Internal Audit";
//         ActualMessage = lp.addSkills(skills);

//         List<String> ExpectedMessage;
//         ExpectedMessage= new ArrayList<>();
//         ExpectedMessage.add("Accounting");
//         ExpectedMessage.add("Doctor");
//         ExpectedMessage.add("Internal Audit");

//         assertEquals(ExpectedMessage.toString(),ActualMessage);

//         // must return an error message
//         skills = "accountant Teacher";

//         ActualMessage = lp.addSkills(skills);
//         this.ExpectedMessage = "Enter at least two skills";
//         assertEquals(this.ExpectedMessage,ActualMessage);
//     }
// }
