package prueba.tecnica.task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import prueba.tecnica.userinterface.HomePage;


public class GoToLogin implements Task {
    public static GoToLogin LoginPage(){
        return Tasks.instrumented(GoToLogin.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(HomePage.LOGIN_BUTTON));
    }
}