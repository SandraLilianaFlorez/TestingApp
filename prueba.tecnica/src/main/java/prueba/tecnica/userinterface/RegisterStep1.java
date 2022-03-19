package prueba.tecnica.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;


public class RegisterStep1 extends PageObject{
    public static final Target INPUT_FIRST_NAME = Target.the("where do we write the user first name").located(By.id("firstName"));
    public static final Target INPUT_LAST_NAME = Target.the("where do we write the user last name").located(By.id("lastName"));
    public static final Target INPUT_EMAIL = Target.the("where do we write the user email").located(By.id("email"));
    public static final Target SELECT_BIRTH_MONTH = Target.the("where do we select the user birth month").located(By.id("birthMonth"));
    public static final Target SELECT_BIRTH_DAY = Target.the("where do we select the user birth day").located(By.id("birthDay"));
    public static final Target SELECT_BIRTH_YEAR = Target.the("where do we select the user birth year").located(By.id("birthYear"));
    public static final Target BUTTON_NEXT = Target.the("next step button").located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[2]/a"));
}
