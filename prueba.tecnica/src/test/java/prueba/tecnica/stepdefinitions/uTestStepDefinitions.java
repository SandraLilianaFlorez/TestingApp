package prueba.tecnica.stepdefinitions;
import cucumber.api.java.en.When;
import org.jetbrains.annotations.NotNull;
import prueba.tecnica.model.uTestData;
import prueba.tecnica.task.*;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;

public class uTestStepDefinitions {
    @Before
    public void setStage(){
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^than Sandra wants to register$")
    public void GivenThanSandraWantsToRegister(@NotNull List <uTestData> uTestDataList) throws Exception {
        OnStage.theActorCalled("Sandra").wasAbleTo(OpenPage.thePage(), GoToRegister.RegisterPage(), Step1.onThePage(
                uTestDataList.get(0).getStrFirstName(),
                uTestDataList.get(0).getStrLastName(),
                uTestDataList.get(0).getStrEmail(),
                uTestDataList.get(0).getStrBirthMonth(),
                uTestDataList.get(0).getStrBirthDay(),
                uTestDataList.get(0).getStrBirthYear()
        ), Step2.onThePage(
                uTestDataList.get(0).getStrCity(),
                uTestDataList.get(0).getStrZipCode()
        ), Step3.onThePage(), Step4.onThePage(
                uTestDataList.get(0).getStrPassword(),
                uTestDataList.get(0).getStrConfirmPassword()
        ));
    }

    @When("^Sandra has created and user, she wants to login$")
    public void sandraHasCreatedAndUserSheWantsToLogin(List <uTestData> uTestDataList) throws Exception {
        OnStage.theActorInTheSpotlight().attemptsTo(OpenPage.thePage(), GoToLogin.LoginPage(), Login.onThePage(
                uTestDataList.get(0).getStrEmail(),
                uTestDataList.get(0).getStrPassword()
        ));
    }
}
