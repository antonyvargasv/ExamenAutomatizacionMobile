package com.nttdata.steps;

import com.nttdata.screens.DetalleProductoScreen;

public class DetalleProductsSteps {
    DetalleProductoScreen detalleProductoScreen;
    public void selectProduct(String UNIDADES, String PRODUCTO) {
        System.out.println(UNIDADES+"-Aquiisteps" + PRODUCTO);
        detalleProductoScreen.selectProduct(UNIDADES, PRODUCTO);
    }
    public void increaseProducts(String UNIDADES){
        detalleProductoScreen.increaseProducts(UNIDADES);
    }

    public void btnaddCartClic(){
        detalleProductoScreen.addCard();
    }
    public void cartProductsClic(){
        detalleProductoScreen.cartProducts();
    }

}
