package prueba.tecnica.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;


public class RegisterStep4 extends PageObject{
    public static final Target INPUT_PASSWORD = Target.the("where do we write the user password").located(By.id("password"));
    public static final Target INPUT_CONFIRM_PASSWORD = Target.the("where do we write the user same password to confirm").located(By.id("confirmPassword"));
    public static final Target CHECK_CONDITIONS = Target.the("where the user accepts terms and conditions").located(By.id("termOfUse"));
    public static final Target CHECK_PRIVACY = Target.the("where the user accepts privacy policy").located(By.id("privacySetting"));
    public static final Target BUTTON_NEXT = Target.the("next step button").located(By.xpath("//*[@id=\"laddaBtn\"]"));
}
