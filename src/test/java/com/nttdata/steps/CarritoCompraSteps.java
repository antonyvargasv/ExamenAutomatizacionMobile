package com.nttdata.steps;

import com.nttdata.screens.ProductsScreen;
import org.junit.Assert;

public class CarritoCompraSteps {
    ProductsScreen productsScreenScreen;


    public void validateApp()  {
        Assert.assertTrue("Visibilidad de título products",productsScreenScreen.isProductDisplayed());
    }

    public void validateProducts()  {
        Assert.assertTrue("Visibilidad de título products",productsScreenScreen.isProductDisplayed());
    }


    public void addProduct(String PRODUCTO) {
        productsScreenScreen.selectProduct(PRODUCTO);
    }
}
