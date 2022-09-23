package co.com.chocuair.anderson.tasks;

import co.com.chocuair.anderson.userinterface.PaginaDeUtest;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Open;

public class AbrirPagina implements Task {


    public PaginaDeUtest paginaUtest;
    public static AbrirPagina PaginaUtest() {
        return Tasks.instrumented(AbrirPagina.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Open.browserOn(paginaUtest),
                Click.on(PaginaDeUtest.JOIN_TODAY_BUTON)
        );

    }
}
