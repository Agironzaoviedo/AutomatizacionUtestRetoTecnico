package co.com.chocuair.anderson.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PaginaDeRegistroPersonal extends PageObject {
    public static final Target  NOMBRE=
            Target.the("Se ingresa el nombre del usuario").
                    located(By.id("firstName"));
    public static final Target  APELLIDO=
            Target.the("Se ingresa el apellido del usuario").
                    located(By.id("lastName"));
    public static final Target  CORREO=
            Target.the("Se ingresa el correo del usuario").
                    located(By.id("email"));
    public static final Target  NACIEMIENTO_MES=
            Target.the("Se ingresa el mes de nacimiento del usuario").
                    located(By.id("birthMonth"));
    public static final Target  NACIEMIENTO_DIA=
            Target.the("Se ingresa el dia de nacimiento del usuario").
                    located(By.id("birthDay"));
    public static final Target  NACIEMIENTO_ANIO=
            Target.the("Se ingresa el anio de nacimiento del usuario").
                    located(By.id("birthYear"));
    public static final Target  BOTON_LOCATION=
            Target.the("Boton para el siguiente campo").
                    located(By.xpath("//a[@class='btn btn-blue']"));

}
