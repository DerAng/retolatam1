package co.com.choucair.certification.retolatam1.tasks;

import co.com.choucair.certification.retolatam1.userinterface.ClicPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class Clic implements Task {


    public static Clic theOptions() {

        return Tasks.instrumented(Clic.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(

                Click.on(ClicPage.MIS_VIAJES),
                Click.on(ClicPage.INGRESA_DATOS_VIAJE),
                Click.on(ClicPage.DONDE_ENCONTRARLOS)

        );
        
    }
}
