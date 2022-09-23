package co.com.chocuair.anderson.questions;

import co.com.chocuair.anderson.model.DatosDeUtest;
import co.com.chocuair.anderson.userinterface.PaginaDeRegistroFinal;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import java.util.List;

public class Responder  implements Question<Boolean> {
    List<DatosDeUtest> datosDeUtests;

    public Responder(List<DatosDeUtest> datosDeUtests) {
        this.datosDeUtests = datosDeUtests;
    }

    public static Responder repuestaDatos(List<DatosDeUtest> datosDeUtests) {

        return new Responder(datosDeUtests);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        String texto_boton= Text.of(PaginaDeRegistroFinal.BOTON_SETUP).viewedBy(actor).asString();
        if(texto_boton.equals(datosDeUtests.get(0).textoFinal)){
            return true;
        }else{
            return false;
        }

    }
}
