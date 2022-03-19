package prueba.tecnica.task;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Clear;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.Wait;
import net.serenitybdd.screenplay.waits.WaitUntil;
import prueba.tecnica.userinterface.RegisterStep2;
import prueba.tecnica.userinterface.RegisterStep3;

public class Step2 implements Task {
    private String strCity;
    private String strZipCode;

    public Step2(String strCity, String strZipCode){
        this.strCity = strCity;
        this.strZipCode = strZipCode;
    }
    public static Step2 onThePage(String strCity, String strZipCode){
        return Tasks.instrumented(Step2.class, strCity, strZipCode);
    }

    @Override
    public <T extends Actor> void performAs(T actor){
        actor.attemptsTo(
                Enter.theValue(strZipCode).into(RegisterStep2.INPUT_ZIP_CODE),
                Clear.field(RegisterStep2.INPUT_CITY),
                Enter.theValue(strCity).into(RegisterStep2.INPUT_CITY),
                WaitUntil.the(RegisterStep2.INPUT_CITY, WebElementStateMatchers.hasValue(strCity)).forNoMoreThan(3).seconds(),
                Click.on(RegisterStep2.BUTTON_NEXT)
        );
    }
}
