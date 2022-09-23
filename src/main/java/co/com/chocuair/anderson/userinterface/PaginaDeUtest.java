package co.com.chocuair.anderson.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

@DefaultUrl("https://utest.com/")
public class PaginaDeUtest extends PageObject {
    public static final Target JOIN_TODAY_BUTON=
            Target.the("boton de Utest para iniciar registro").
                    located(By.xpath("/html/body/ui-view/unauthenticated-container/div/div/unauthenticated-header/div/div[3]/ul[2]/li[2]/a"));
}

