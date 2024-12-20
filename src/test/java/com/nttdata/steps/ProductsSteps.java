package com.nttdata.steps;

import com.nttdata.screens.ProductsScreen;
import org.junit.Assert;

public class ProductsSteps {
    ProductsScreen productsScreen;

    public void validateApp() {
        Assert.assertTrue("Visibilidad de título products", productsScreen.isProductDisplayed());
    }

    public void validateProducts() {
        Assert.assertTrue("Visibilidad de los productos en galería", productsScreen.isListProductDisplayed());
    }


}
