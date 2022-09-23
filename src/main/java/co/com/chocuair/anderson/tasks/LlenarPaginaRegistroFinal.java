package co.com.chocuair.anderson.tasks;

import co.com.chocuair.anderson.model.DatosDeUtest;
import co.com.chocuair.anderson.userinterface.PaginaDeRegistroDispositivos;
import co.com.chocuair.anderson.userinterface.PaginaDeRegistroFinal;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import net.serenitybdd.screenplay.actions.PerformActions;
import org.openqa.selenium.Keys;

import java.util.List;

import static co.com.chocuair.anderson.userinterface.PaginaDeRegistroFinal.*;

public class LlenarPaginaRegistroFinal implements Task {

    List<DatosDeUtest> datosDeUtests;

    public LlenarPaginaRegistroFinal(List<DatosDeUtest> datosDeUtests) {
        this.datosDeUtests = datosDeUtests;
    }

    public static LlenarPaginaRegistroFinal llenarPagina(List<DatosDeUtest> datosDeUtests) {
        return Tasks.instrumented(LlenarPaginaRegistroFinal.class,datosDeUtests);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(datosDeUtests.get(0).getContrasenia()).into(CONTRASENIA),
                Enter.theValue(datosDeUtests.get(0).getConfirmarContrasenia()).into(CONFIRMAR_CONTRASENIA),
                Click.on(CHECK_STAY_INFORMED),
                Click.on(CHECK_TERMINOS),
                Click.on(CHECK_PRIVACIDAD),
                Click.on(BOTON_SETUP)

        );

    }
}
