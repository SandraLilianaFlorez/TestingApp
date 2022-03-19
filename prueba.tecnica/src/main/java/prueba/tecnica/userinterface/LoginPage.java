package prueba.tecnica.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;


public class LoginPage extends PageObject{
    public static final Target INPUT_EMAIL = Target.the("where do we write the username").located(By.id("username"));
    public static final Target INPUT_PASSWORD = Target.the("where do we write the user password").located(By.id("password"));
    public static final Target BUTTON_NEXT = Target.the("login button").located(By.id("kc-login"));
}
