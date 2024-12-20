package com.nttdata.steps;

import com.nttdata.screens.DetalleProductoScreen;

public class DetalleProductsSteps {
    DetalleProductoScreen detalleProductoScreen;
    public void selectProduct(String UNIDADES, String PRODUCTO) {
        detalleProductoScreen.increaseProducts(UNIDADES);
    }
    public void addToCart(){
        detalleProductoScreen.addToCart();
    }

    public void cartProductsClic(){
        detalleProductoScreen.cartProducts();
    }

}
