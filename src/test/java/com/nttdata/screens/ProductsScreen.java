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
    private WebElement itemProduct;

    public boolean isProductDisplayed() {
        waitFor(ExpectedConditions.visibilityOf(lblProducts));
        return lblProducts.isEnabled();
    }

    public boolean isListProductDisplayed() {
        waitFor(ExpectedConditions.visibilityOf(listProducts));
        return listProducts.isEnabled();
    }

    public static Target selectProduct(String PRODUCTO) {


    }




    //Productos:
    //idlistaproductos com.saucelabs.mydemoapp.android:id/productRV
    //androidx.recyclerview.widget.RecyclerView[@content-desc="Displays all products of catalog"]

    //android.widget.ImageView[@content-desc="Sauce Labs Backpack"]
    //android.widget.ImageView[@content-desc="Sauce Labs Bolt T-Shirt"]
    //android.widget.ImageView[@content-desc="Sauce Labs Bike Light"]
    //android.widget.TextView[@resource-id="com.saucelabs.mydemoapp.android:id/noTV"]



}
