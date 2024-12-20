package com.nttdata.screens;

import io.appium.java_client.pagefactory.AndroidFindBy;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class MyCartScreen extends PageObject {


    @AndroidFindBy(xpath = "//android.widget.TextView[@resource-id=\"com.saucelabs.mydemoapp.android:id/cartTV\"]")
    private WebElement contadorCart;

    @AndroidFindBy(xpath = "//android.widget.TextView[@resource-id=\"com.saucelabs.mydemoapp.android:id/noTV\"]")
    private WebElement lblCantUnidades;


    public boolean valorContador() {
        waitFor(ExpectedConditions.visibilityOf(contadorCart));
        String contador = contadorCart.getText();
        String cantUnidades = lblCantUnidades.getText();
        return contador.equals(cantUnidades);
    }

}
