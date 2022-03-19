package prueba.tecnica.task;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SendKeys;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.Keys;
import prueba.tecnica.userinterface.RegisterStep3;

public class Step3 implements Task {
    public static Step3 onThePage(){
        return Tasks.instrumented(Step3.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor){
        actor.attemptsTo(
                Click.on(RegisterStep3.SELECT_COMPUTER),
                Click.on(RegisterStep3.OPTION_COMPUTER),
                Click.on(RegisterStep3.SELECT_VERSION),
                Click.on(RegisterStep3.OPTION_VERSION),
                Click.on(RegisterStep3.SELECT_LANGUAGE),
                Click.on(RegisterStep3.OPTION_LANGUAGE),
                Click.on(RegisterStep3.SELECT_MOBILE_DEVICE),
                WaitUntil.the(RegisterStep3.OPTION_MOBILE_DEVICE, WebElementStateMatchers.isVisible()).forNoMoreThan(10).seconds(),
                Click.on(RegisterStep3.OPTION_MOBILE_DEVICE),
                Click.on(RegisterStep3.SELECT_MODEL),
                WaitUntil.the(RegisterStep3.OPTION_MODEL, WebElementStateMatchers.isVisible()).forNoMoreThan(10).seconds(),
                Click.on(RegisterStep3.OPTION_MODEL),
                Click.on(RegisterStep3.SELECT_OS),
                WaitUntil.the(RegisterStep3.OPTION_OS, WebElementStateMatchers.isVisible()).forNoMoreThan(10).seconds(),
                Click.on(RegisterStep3.OPTION_OS),
                Click.on(RegisterStep3.BUTTON_NEXT)
        );
    }
}
