package prueba.tecnica.task;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import prueba.tecnica.userinterface.LoginPage;
import prueba.tecnica.userinterface.RegisterStep4;

public class Login implements Task {
    private String strEmail;
    private String strPassword;

    public Login(String strEmail, String strPassword){
        this.strEmail = strEmail;
        this.strPassword = strPassword;
    }
    public static Login onThePage(String strEmail, String strPassword){
        return Tasks.instrumented(Login.class, strEmail, strPassword);
    }

    @Override
    public <T extends Actor> void performAs(T actor){
        actor.attemptsTo(
                Enter.theValue(strEmail).into(LoginPage.INPUT_EMAIL),
                Enter.theValue(strPassword).into(LoginPage.INPUT_PASSWORD),
                Click.on(RegisterStep4.CHECK_CONDITIONS),
                Click.on(RegisterStep4.CHECK_PRIVACY),
                Click.on(RegisterStep4.BUTTON_NEXT)
        );
    }
}
