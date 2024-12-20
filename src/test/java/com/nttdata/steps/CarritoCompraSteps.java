package com.nttdata.steps;

import com.nttdata.screens.ProductsScreen;
import org.junit.Assert;

public class CarritoCompraSteps {
    ProductsScreen productsScreenScreen;
    public void pageProducts(){
        Assert.assertTrue("Visibilidad de título products",productsScreenScreen.isProductDisplayed());
    }
}
