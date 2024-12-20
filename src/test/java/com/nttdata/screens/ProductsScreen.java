package com.nttdata.screens;

import io.appium.java_client.pagefactory.AndroidFindBy;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;




public class ProductsScreen extends PageObject {
   //@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id=\"com.saucelabs.mydemoapp.android:id/productTV\"]")
    @AndroidFindBy(id = "com.saucelabs.mydemoapp.android:id/productTV")
    private WebElement lblProducts;

    public boolean isProductDisplayed() {
        System.out.println("ejecutando***");
        waitFor(ExpectedConditions.visibilityOf(lblProducts));
        return lblProducts.isEnabled();
    }


}
