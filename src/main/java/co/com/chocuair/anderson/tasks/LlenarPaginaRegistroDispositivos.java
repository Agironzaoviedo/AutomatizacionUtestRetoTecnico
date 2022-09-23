package co.com.chocuair.anderson.tasks;

import co.com.chocuair.anderson.model.DatosDeUtest;
import co.com.chocuair.anderson.userinterface.PaginaDeRegistroDireccion;
import co.com.chocuair.anderson.userinterface.PaginaDeRegistroDispositivos;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import org.openqa.selenium.Keys;

import java.util.List;

import static co.com.chocuair.anderson.userinterface.PaginaDeRegistroDispositivos.*;

public class LlenarPaginaRegistroDispositivos implements Task {
    List<DatosDeUtest> datosDeUtests;

    public static LlenarPaginaRegistroDispositivos llenarPagina(List<DatosDeUtest> datosDeUtests) {
        return Tasks.instrumented(LlenarPaginaRegistroDispositivos.class,datosDeUtests);
    }


    public LlenarPaginaRegistroDispositivos(List<DatosDeUtest> datosDeUtests) {
        this.datosDeUtests = datosDeUtests;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(CONTENEDOR_PC),
                Enter.theValue(datosDeUtests.get(0).getComputadorSo()).into(
                        COMPUTADOR).thenHit(Keys.ARROW_DOWN,Keys.ENTER),


                Click.on(CONTENEDOR_VERSION),
                Enter.theValue(datosDeUtests.get(0).getVersionComputador()).into(
                        VERSION).thenHit(Keys.ARROW_DOWN,Keys.ENTER),


                Click.on(CONTENEDOR_LENGUAJE),
                Enter.theValue(datosDeUtests.get(0).getLenguajeComputador()).into(
                        LENGUAJES).thenHit(Keys.ARROW_DOWN,Keys.ENTER),


                Click.on(CONTENEDOR_DISPOSITIVO_MOVIL),
                Enter.theValue(datosDeUtests.get(0).getDispositivoMovil()).into(
                        DISPOSITIVO_MOVIL).thenHit(Keys.ARROW_DOWN,Keys.ENTER),


                Click.on(CONTENEDOR_MODELO),
                Enter.theValue(datosDeUtests.get(0).getModeloDispositivoMovil()).into(
                        MODELO).thenHit(Keys.ARROW_DOWN,Keys.ENTER),


                Click.on(CONTENEDOR_SO),
                Enter.theValue(datosDeUtests.get(0).getSoDispositivoMovil()).into(
                        SISTEMA_OPERATIVO).thenHit(Keys.ARROW_DOWN,Keys.ENTER),


                Click.on(BOTON_lAST_STEP)

                );
    }
}
