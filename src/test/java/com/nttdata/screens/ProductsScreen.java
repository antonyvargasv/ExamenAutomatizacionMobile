package com.nttdata.screens;

import io.appium.java_client.pagefactory.AndroidFindBy;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.lang.annotation.Target;
import java.time.Duration;


public class ProductsScreen extends PageObject {

    //@AndroidFindBy(xpath = "//android.widget.ImageView[@content-desc=\"Displays number of items in your cart\"]")
    @AndroidFindBy(id = "com.saucelabs.mydemoapp.android:id/productTV")
    private WebElement lblProducts;
    @AndroidFindBy(xpath = "com.saucelabs.mydemoapp.android:id/productRV")
    private WebElement listProducts;

    @AndroidFindBy(xpath = "//android.widget.ImageView[@content-desc=\"Sauce Labs Backpack\"]")
    private WebElement itemProduct01;

    @AndroidFindBy(xpath = "//android.widget.ImageView[@content-desc=\"Sauce Labs Bolt T-Shirt\"]")
    private WebElement itemProduct02;

    @AndroidFindBy(xpath = "//android.widget.ImageView[@content-desc=\"Sauce Labs Bike Light\"]")
    private WebElement itemProduct03;



    public boolean isProductDisplayed() {
        waitFor(ExpectedConditions.visibilityOf(lblProducts));
        return lblProducts.isEnabled();
    }

    public boolean isListProductDisplayed() {
        waitFor(ExpectedConditions.visibilityOf(listProducts));
        return listProducts.isEnabled();
    }

    public void selectProduct(String UNIDADES, String PRODUCTO) {

        switch (PRODUCTO){
            case "Sauce Labs Backpack":
                itemProduct01.click();
                System.out.println("producto no encontrado Sauce Labs Backpack"+ UNIDADES + PRODUCTO);
                break;
            case "Sauce Labs Bolt - T-Shirt":
                itemProduct02.click();
                System.out.println("producto no encontrado Sauce Labs Bolt - T-Shirt"+ UNIDADES + PRODUCTO);
                break;
            case "Sauce Labs Bike Light":
                itemProduct03.click();
                System.out.println("producto no encontrado02"+ UNIDADES + PRODUCTO);
                break;
            default:
                System.out.println("no hay producto"+ UNIDADES + PRODUCTO);
                break;
        }

    }




}
