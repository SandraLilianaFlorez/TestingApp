package prueba.tecnica.task;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import prueba.tecnica.userinterface.RegisterStep1;

public class Step1 implements Task {
    private String strFirstName;
    private String strLastName;
    private String strEmail;
    private String strBirthMonth;
    private String strBirthDay;
    private String strBirthYear;

    public Step1(String strFirstName, String strLastName, String strEmail, String strBirthMonth, String strBirthDay, String strBirthYear){
        this.strFirstName = strFirstName;
        this.strLastName = strLastName;
        this.strEmail = strEmail;
        this.strBirthMonth = strBirthMonth;
        this.strBirthDay = strBirthDay;
        this.strBirthYear = strBirthYear;
    }
    public static Step1 onThePage(String strFirstName, String strLastName, String strEmail, String strBirthMonth, String strBirthDay, String strBirthYear){
        return Tasks.instrumented(Step1.class, strFirstName, strLastName, strEmail, strBirthMonth, strBirthDay, strBirthYear);
    }

    @Override
    public <T extends Actor> void performAs(T actor){
        actor.attemptsTo(
                Enter.theValue(strFirstName).into(RegisterStep1.INPUT_FIRST_NAME),
                Enter.theValue(strLastName).into(RegisterStep1.INPUT_LAST_NAME),
                Enter.theValue(strEmail).into(RegisterStep1.INPUT_EMAIL),
                SelectFromOptions.byVisibleText(strBirthMonth).from(RegisterStep1.SELECT_BIRTH_MONTH),
                SelectFromOptions.byVisibleText(strBirthDay).from(RegisterStep1.SELECT_BIRTH_DAY),
                SelectFromOptions.byVisibleText(strBirthYear).from(RegisterStep1.SELECT_BIRTH_YEAR),
                Click.on(RegisterStep1.BUTTON_NEXT)
        );
    }
}
