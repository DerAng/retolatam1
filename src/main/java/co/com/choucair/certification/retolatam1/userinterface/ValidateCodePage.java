package co.com.choucair.certification.retolatam1.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ValidateCodePage {

    public static final Target CODIGO_RESERVA = Target.the("Codigo de reserva").located(By.xpath("//button[contains (@class, 'sc-plVHf iKxGrl sc-prqHV gLlDTH ') and contains(@aria-label,'digo de reserva.')]"));
}
