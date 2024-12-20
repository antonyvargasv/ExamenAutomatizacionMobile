package com.nttdata.screens;

import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;

import static org.ehcache.impl.internal.executor.ExecutorUtil.waitFor;

public class DetalleProductoScreen {

    @AndroidFindBy(xpath = "//android.widget.ImageView[@content-desc=\"Increase item quantity\"]")
    private WebElement btnContador;

    @AndroidFindBy(xpath = "//android.widget.Button[@content-desc=\"Tap to add product to cart\"]")
    private WebElement btnAddToCart;

    @AndroidFindBy(xpath = "//android.widget.ImageView[@content-desc=\"Displays number of items in your cart\"]")
    private WebElement cartProducts;

    public void increaseProducts(String UNIDADES){
        for (int i = 1; i< Integer.parseInt(UNIDADES); i++){
            btnContador.click();
            System.out.println(i);
        }
    }


    public void addToCart(){
        btnAddToCart.click();
    }

    public void cartProducts(){
        cartProducts.click();
    }


}
