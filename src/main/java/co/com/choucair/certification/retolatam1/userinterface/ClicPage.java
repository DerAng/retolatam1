package co.com.choucair.certification.retolatam1.userinterface;


import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ClicPage {


    public static final Target MIS_VIAJES = Target.the("link mis viajes").located(By.linkText("Mis viajes"));
    public static final Target INGRESA_DATOS_VIAJE = Target.the("link mis viajes").located(By.id("tab_search_order"));
    public static final Target DONDE_ENCONTRARLOS = Target.the("link mis viajes").located(By.id("undefined-dialog-open"));
}
