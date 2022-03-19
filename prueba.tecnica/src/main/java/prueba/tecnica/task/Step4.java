package prueba.tecnica.task;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import prueba.tecnica.userinterface.RegisterStep4;

public class Step4 implements Task {
    private String strPassword;
    private String strConfirmPassword;

    public Step4(String strPassword, String strConfirmPassword){
        this.strPassword = strPassword;
        this.strConfirmPassword = strConfirmPassword;
    }
    public static Step4 onThePage(String strPassword, String strConfirmPassword){
        return Tasks.instrumented(Step4.class, strPassword, strConfirmPassword);
    }

    @Override
    public <T extends Actor> void performAs(T actor){
        actor.attemptsTo(
                Enter.theValue(strPassword).into(RegisterStep4.INPUT_PASSWORD),
                Enter.theValue(strConfirmPassword).into(RegisterStep4.INPUT_CONFIRM_PASSWORD),
                Click.on(RegisterStep4.CHECK_CONDITIONS),
                Click.on(RegisterStep4.CHECK_PRIVACY),
                Click.on(RegisterStep4.BUTTON_NEXT)
        );
    }
}
