package prueba.tecnica.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;


public class RegisterStep3 extends PageObject{
    public static final Target SELECT_COMPUTER = Target.the("select user computer operative system").located(By.xpath("//*[@id=\"web-device\"]/div[1]/div[2]/div"));
    public static final Target OPTION_COMPUTER = Target.the("option user computer operative system").located(By.cssSelector(".ui-select-bootstrap .ui-select-choices-row.active > span"));
    public static final Target SELECT_VERSION = Target.the("select user version operative system").located(By.xpath("//*[@id=\"web-device\"]/div[2]/div[2]/div"));
    public static final Target OPTION_VERSION = Target.the("option user version of operative system").located(By.cssSelector(".ui-select-bootstrap .ui-select-choices-row.active > span"));
    public static final Target SELECT_LANGUAGE = Target.the("select user computer language").located(By.xpath("//*[@id=\"web-device\"]/div[3]/div[2]/div"));
    public static final Target OPTION_LANGUAGE = Target.the("option user computer language").located(By.cssSelector(".ui-select-bootstrap .ui-select-choices-row:nth-child(40) > span"));
    public static final Target SELECT_MOBILE_DEVICE = Target.the("select user mobile brand").located(By.xpath("//*[@id=\"mobile-device\"]/div[1]/div[2]/div"));
    public static final Target OPTION_MOBILE_DEVICE = Target.the("option user mobile brand").located(By.cssSelector(".ui-select-bootstrap .ui-select-choices-row:nth-child(5) > span"));
    public static final Target SELECT_MODEL = Target.the("select user model mobile").located(By.xpath("//*[@id=\"mobile-device\"]/div[2]/div[2]/div"));
    public static final Target OPTION_MODEL = Target.the("option user model mobile").located(By.cssSelector(".ui-select-bootstrap .ui-select-choices-row:nth-child(15) > span"));
    public static final Target SELECT_OS = Target.the("select user operative system mobile").located(By.xpath("//*[@id=\"mobile-device\"]/div[3]/div[2]/div"));
    public static final Target OPTION_OS = Target.the("option user operative system mobile").located(By.cssSelector(".ui-select-bootstrap .ui-select-choices-row:nth-child(12) > span"));
    public static final Target BUTTON_NEXT = Target.the("next step button").located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/div[2]/div/a"));
}