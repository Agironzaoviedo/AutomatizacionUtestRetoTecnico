package co.com.chocuair.anderson.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PaginaDeRegistroFinal {

    public static final Target CONTRASENIA=
            Target.the("Se ingresa la constrasenia del usuario").
                    located(By.id("password"));
    public static final Target  CONFIRMAR_CONTRASENIA=
            Target.the("Se confirma la constrasenia del usuario").
                    located(By.id("confirmPassword"));

    public static final Target  CHECK_STAY_INFORMED=
            Target.the("Se chulea para mantener infomado").
                    located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/form/div[4]/label/span"));

    public static final Target  CHECK_TERMINOS=
            Target.the("Se chulea para acpetar los terminos y condiciones").
                    located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/form/div[5]/label/span[1]"));

    public static final Target  CHECK_PRIVACIDAD=
            Target.the("Se chulea para aceptar politicas de privacidad y seguridad").
                    located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/form/div[6]/label/span[1]"));

    public static final Target  BOTON_SETUP=
            Target.the("Boton finalizar registro").
                    located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/div/div/a"));

}
