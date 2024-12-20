package com.nttdata.screens;

import io.appium.java_client.pagefactory.AndroidFindBy;
import net.serenitybdd.core.pages.PageObject;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;

import static org.ehcache.impl.internal.executor.ExecutorUtil.waitFor;

public class DetalleProductoScreen extends PageObject {

    @AndroidFindBy(xpath = "//android.widget.ImageView[@content-desc=\"Increase item quantity\"]")
    private WebElement btnContador;

    @AndroidFindBy(xpath = "//android.widget.Button[@content-desc=\"Tap to add product to cart\"]")
    private WebElement btnAddToCart;

    @AndroidFindBy(xpath = "//android.widget.ImageView[@content-desc=\"Displays number of items in your cart\"]")
    private WebElement cartProducts;
    @AndroidFindBy(xpath = "//android.widget.ImageView[@content-desc=\"Sauce Labs Backpack\"]")
    private WebElement itemProduct01;

    @AndroidFindBy(xpath = "//android.widget.ImageView[@content-desc=\"Sauce Labs Bolt T-Shirt\"]")
    private WebElement itemProduct02;

    @AndroidFindBy(xpath = "//android.widget.ImageView[@content-desc=\"Sauce Labs Fleece Jacket\"]")
    private WebElement itemProduct03;


    public void selectProduct(String UNIDADES, String PRODUCTO) {
        switch (PRODUCTO) {
            case "Sauce Labs Backpack":
                itemProduct01.click();
                break;
            case "Sauce Labs Bolt - T-Shirt":
                itemProduct02.click();
                break;
            case "Sauce Labs Bike Light":
                itemProduct03.click();
                break;
            default:
                break;
        }

    }

    public void increaseProducts(String UNIDADES) {
        waitFor(ExpectedConditions.visibilityOf(btnContador));
        for (int i = 1; i < Integer.parseInt(UNIDADES); i++) {
            btnContador.click();
        }
    }

    public void addCard() {
        waitFor(ExpectedConditions.visibilityOf(btnAddToCart));
        btnAddToCart.click();
    }


    public void cartProducts() {
        waitFor(ExpectedConditions.visibilityOf(cartProducts));
        cartProducts.click();
    }


    public boolean validarIngresoAlDetalle() {
        waitFor(ExpectedConditions.visibilityOf(btnAddToCart));
        return btnAddToCart.isEnabled();
    }
}
