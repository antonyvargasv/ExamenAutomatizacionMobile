package com.nttdata.steps;

import com.nttdata.screens.DetalleProductoScreen;
import com.nttdata.screens.MyCartScreen;
import org.junit.Assert;

public class DetalleProductsSteps {
    DetalleProductoScreen detalleProductoScreen;

    public void selectProduct(String UNIDADES, String PRODUCTO) {
        detalleProductoScreen.selectProduct(UNIDADES, PRODUCTO);
    }

    public void increaseProducts(String UNIDADES) {
        detalleProductoScreen.increaseProducts(UNIDADES);
    }

    public void btnaddCartClic() {
        detalleProductoScreen.addCard();
    }

    public void cartProductsClic() {
        detalleProductoScreen.cartProducts();
    }

    public void validarIngresoDetalle() {
        Assert.assertTrue("Visibilidad al detalle de los productos", detalleProductoScreen.validarIngresoAlDetalle());
    }


}
