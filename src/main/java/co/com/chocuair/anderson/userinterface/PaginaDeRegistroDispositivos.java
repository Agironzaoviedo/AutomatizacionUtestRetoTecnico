package co.com.chocuair.anderson.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PaginaDeRegistroDispositivos {

    public static final Target CONTENEDOR_PC=
            Target.the("Se ingresa al contenedor de computadores").
                    located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/div[1]/div[3]/div[1]/div[1]/div[2]/div"));
    public static final Target COMPUTADOR=
            Target.the("Se ingresa el sistema operativo del computador en el contenedor").
                    located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/div[1]/div[3]/div[1]/div[1]/div[2]/div/input[1]"));

    public static final Target CONTENEDOR_VERSION=
            Target.the("Se ingresa al contenedor de versiones").
                    located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/div[1]/div[3]/div[1]/div[2]/div[2]/div"));
    public static final Target VERSION=
            Target.the("Se ingresa la version en el contenedor").
                    located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/div[1]/div[3]/div[1]/div[2]/div[2]/div/input[1]"));
    public static final Target CONTENEDOR_LENGUAJE=
            Target.the("Se ingresa al contenedor de lenguajes").
                    located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/div[1]/div[3]/div[1]/div[3]/div[2]/div"));
    public static final Target LENGUAJES=
            Target.the("Se ingresa el lenguaje en el contenedor").
                    located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/div[1]/div[3]/div[1]/div[3]/div[2]/div/input[1]"));
    public static final Target CONTENEDOR_DISPOSITIVO_MOVIL=
            Target.the("Se ingresa al contenedor de dispositivos moviles").
                    located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/div[1]/div[3]/div[2]/div[1]/div[2]/div"));
    public static final Target DISPOSITIVO_MOVIL=
            Target.the("Se ingresa el dispositivo movil en el contenedor").
                    located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/div[1]/div[3]/div[2]/div[1]/div[2]/div/input[1]"));
    public static final Target CONTENEDOR_MODELO=
            Target.the("Se ingresa al contenedor de modelo del dispositivo movil").
                    located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/div[1]/div[3]/div[2]/div[2]/div[2]/div"));
    public static final Target MODELO=
            Target.the("Se ingresa el modelo del dispositivo movil en el contenedor").
                    located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/div[1]/div[3]/div[2]/div[2]/div[2]/div/input[1]"));
    public static final Target CONTENEDOR_SO=
            Target.the("Se ingresa al contenedor de sistemas operativos").
                    located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/div[1]/div[3]/div[2]/div[3]/div[2]/div"));
    public static final Target SISTEMA_OPERATIVO=
            Target.the("Se ingresa el sistema operativo movil en el contenedor").
                    located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/div[1]/div[3]/div[2]/div[3]/div[2]/div/input[1]"));

    public static final Target  BOTON_lAST_STEP=
            Target.the("Boton para el ultimo paso").
                    located(By.xpath("//a[@class='btn btn-blue pull-right']"));
}
