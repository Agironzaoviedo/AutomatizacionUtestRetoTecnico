package co.com.choucair.anderson.stepdefinitions;

import co.com.chocuair.anderson.model.DatosDeUtest;
import co.com.chocuair.anderson.questions.Responder;
import co.com.chocuair.anderson.tasks.*;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;

public class RetoUtestStepDefinitions {


    @Before
    public void setStage(){
        OnStage.setTheStage(new OnlineCast());

    }

    @Given("^Anderson desea registrarse en la pagina de Utest$")
    public void andersonDeseaRegistrarseEnLaPaginaDeUtest() {
        OnStage.theActorCalled("Anderson").attemptsTo(AbrirPagina.PaginaUtest());

    }

    @When("^ingrese todos los campos requeridos$")
    public void ingreseTodosLosCamposRequeridos(List<DatosDeUtest> datosDeUtests) {
        OnStage.theActorInTheSpotlight().attemptsTo(LlenarPaginaRegistroPersonal.llenarPagina(datosDeUtests),
                LlenarPaginaRegistroDireccion.llenarPagina(datosDeUtests),
                LlenarPaginaRegistroDispositivos.llenarPagina(datosDeUtests),
                LlenarPaginaRegistroFinal.llenarPagina(datosDeUtests)
        );

    }

    @Then("^se completara el registro de manera satisfactoria$")
    public void seCompletaraElRegistroDeManeraSatisfactoria(List<DatosDeUtest> datosDeUtests) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Responder.repuestaDatos(datosDeUtests)));

    }

}
