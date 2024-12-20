package com.nttdata.stepsdefinitions;

import com.nttdata.steps.DetalleProductsSteps;
import com.nttdata.steps.MyCartSteps;
import io.cucumber.java.en.Then;
import net.serenitybdd.annotations.Steps;
import org.junit.Assert;

public class MyCartStepsDefs {
    @Steps
    MyCartSteps myCartSteps;
    DetalleProductsSteps detalleProductsSteps;

    @Then("valido el carrito de compra actualice correctamente")
    public void validoElCarritoDeCompraActualiceCorrectamente() {
        Assert.assertTrue("Visibilidad de título products", myCartSteps.validateContador());
    }
}
