package co.com.chocuair.anderson.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PaginaDeRegistroDireccion  {

    public static final Target CIUDAD=
            Target.the("Se ingresa la cuidad del usuario").
                    located(By.id("city"));

    public static final Target COD_POSTAL=
            Target.the("Se ingresa eel codigo postal del usuario").
                    located(By.id("zip"));

    public static final Target CONTENEDOR_PAIS=
            Target.the("Se ingresa al contenedor de paises").
                    located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/form/div[1]/div[3]/div[1]/div[4]/div[2]/div/div"));
    public static final Target PAIS=
            Target.the("Se escoge el pais del usuario").
                    located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/form/div[1]/div[3]/div[1]/div[4]/div[2]/div/div/input[1]"));
    public static final Target PAIS_COLOMBIA=
            Target.the("Se escoge el pais de colombia").
                    located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/form/div[1]/div[3]/div[1]/div[4]/div[2]/div/div/ul/li/div[3]/span/div"));

    public static final Target  BOTON_DIVICES=
            Target.the("Boton para el siguiente campo").
                    located(By.xpath("//a[@class='btn btn-blue pull-right']"));

}
