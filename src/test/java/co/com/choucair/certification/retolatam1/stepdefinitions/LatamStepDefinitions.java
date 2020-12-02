package co.com.choucair.certification.retolatam1.stepdefinitions;

import co.com.choucair.certification.retolatam1.questions.Answer;
import co.com.choucair.certification.retolatam1.tasks.Clic;
import co.com.choucair.certification.retolatam1.tasks.OpenUp;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class LatamStepDefinitions {

    @Before
    public void setStage(){
        OnStage.setTheStage(new OnlineCast());
    }


    @Given("^que Rose quiere validar la longitud del codigo de reserva$")
    public void queRoseQuiereValidarLaLongitudDelCodigoDeReserva() {

        OnStage.theActorCalled("Rose").wasAbleTo(OpenUp.thePage());

    }

    @When("^ella ingresa al enlace mis viajes, da clic en ingresa con los datos de su viaje y finalmente abre el enlcace donde encontrarlos$")
    public void ellaIngresaAlEnlaceMisViajesDaClicEnIngresaConLosDatosDeSuViajeYFinalmenteAbreElEnlcaceDondeEncontrarlos() {

        OnStage.theActorInTheSpotlight().attemptsTo(Clic.theOptions());

    }

    @Then("^ella valida que la longitud del codigo reserva es (\\d+) caracteres$")
    public void ellaValidaQueLaLongitudDelCodigoReservaEsCaracteres(int size) {

        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Answer.theCode(size)));

    }




}
