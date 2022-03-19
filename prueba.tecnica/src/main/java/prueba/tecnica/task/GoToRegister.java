package prueba.tecnica.task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import prueba.tecnica.userinterface.RegisterPage;


public class GoToRegister implements Task {
    public static GoToRegister RegisterPage(){
        return Tasks.instrumented(GoToRegister.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(RegisterPage.REGISTER_BUTTON));
    }
}