package com.nttdata.stepsdefinitions;

import com.nttdata.steps.DetalleProductsSteps;
import com.nttdata.steps.ProductsSteps;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.annotations.Steps;

public class DetalleProductosStepsDefs {
    @Steps
    DetalleProductsSteps detalleProductsSteps;
    @When("agrego {string} del siguiente producto {string}")
    public void agregoDelSiguienteProducto(String UNIDADES, String PRODUCTO) {
        System.out.println(UNIDADES+"-Aquii" + PRODUCTO);
       detalleProductsSteps.selectProduct(UNIDADES, PRODUCTO);
        detalleProductsSteps.validarIngresoDetalle();
       detalleProductsSteps.increaseProducts(UNIDADES);
       detalleProductsSteps.btnaddCartClic();
       detalleProductsSteps.cartProductsClic();
    }



}
