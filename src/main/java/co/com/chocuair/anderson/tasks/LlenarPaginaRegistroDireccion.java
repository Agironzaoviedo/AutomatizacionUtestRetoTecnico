package co.com.chocuair.anderson.tasks;

import co.com.chocuair.anderson.model.DatosDeUtest;
import co.com.chocuair.anderson.userinterface.PaginaDeRegistroDireccion;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import java.util.List;

import static co.com.chocuair.anderson.userinterface.PaginaDeRegistroDireccion.*;

public class LlenarPaginaRegistroDireccion implements Task {

    List<DatosDeUtest> datosDeUtests;

    public LlenarPaginaRegistroDireccion(List<DatosDeUtest> datosDeUtests) {
        this.datosDeUtests = datosDeUtests;
    }

    public static LlenarPaginaRegistroDireccion llenarPagina(List<DatosDeUtest> datosDeUtests) {
        return Tasks.instrumented(LlenarPaginaRegistroDireccion.class,datosDeUtests);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(Enter.theValue(datosDeUtests.get(0).getCiudad()).into(CIUDAD),
                Hit.the(Keys.ARROW_DOWN).into(CIUDAD),
                Hit.the(Keys.ENTER).into(CIUDAD),

                Enter.theValue(datosDeUtests.get(0).getCodPostal()).into(COD_POSTAL),

                Click.on(CONTENEDOR_PAIS),
                Enter.theValue(datosDeUtests.get(0).getPais()).into(PAIS),
                Click.on(PAIS_COLOMBIA),


                Click.on(BOTON_DIVICES)
                );

    }
}
