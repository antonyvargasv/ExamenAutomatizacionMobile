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
    @AndroidFindBy(id = "com.saucelabs.mydemoapp.android:id/productRV")
    private WebElement listProducts;

    public boolean isProductDisplayed() {
        waitFor(ExpectedConditions.visibilityOf(lblProducts));
        return lblProducts.isEnabled();
    }

    public boolean isListProductDisplayed() {
        waitFor(ExpectedConditions.visibilityOf(listProducts));
        return listProducts.isEnabled();
    }


}
