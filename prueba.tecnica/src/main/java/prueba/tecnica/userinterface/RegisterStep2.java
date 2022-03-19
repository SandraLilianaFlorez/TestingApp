package prueba.tecnica.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;


public class RegisterStep2 extends PageObject{
    public static final Target INPUT_CITY = Target.the("where do we write the user city location").located(By.id("city"));
    public static final Target INPUT_ZIP_CODE = Target.the("where do we write the user zip code").located(By.id("zip"));
    public static final Target BUTTON_NEXT = Target.the("next step button").located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[2]/div/a"));
}
