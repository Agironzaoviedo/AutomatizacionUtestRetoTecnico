package co.com.chocuair.anderson.tasks;

import co.com.chocuair.anderson.model.DatosDeUtest;
import co.com.chocuair.anderson.userinterface.PaginaDeRegistroPersonal;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;

import java.util.List;

import static co.com.chocuair.anderson.userinterface.PaginaDeRegistroPersonal.*;

public class LlenarPaginaRegistroPersonal implements Task {

    private List<DatosDeUtest> datosDeUtests;

    public LlenarPaginaRegistroPersonal(List<DatosDeUtest> datosDeUtests) {
        this.datosDeUtests = datosDeUtests;
    }

    public static LlenarPaginaRegistroPersonal llenarPagina(List<DatosDeUtest> datosDeUtests) {
        return Tasks.instrumented(LlenarPaginaRegistroPersonal.class, datosDeUtests);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue(datosDeUtests.get(0).getNombre()).into(NOMBRE),
                Enter.theValue(datosDeUtests.get(0).getApellido()).into(APELLIDO),
                Enter.theValue(datosDeUtests.get(0).getCorreo()).into(CORREO),
                SelectFromOptions.byVisibleText(datosDeUtests.get(0).getNacimientoMes()).from(NACIEMIENTO_MES),
                SelectFromOptions.byVisibleText(datosDeUtests.get(0).getNacimientoDia()).from(NACIEMIENTO_DIA),
                SelectFromOptions.byVisibleText(datosDeUtests.get(0).getNacimientoAnio()).from(NACIEMIENTO_ANIO),
                Click.on(BOTON_LOCATION));
    }
}
