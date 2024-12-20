package com.nttdata.stepsdefinitions;

import com.nttdata.steps.ProductsSteps;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.annotations.Steps;

public class ProductsStepsDefs {
    @Steps
    ProductsSteps carritoCompraSteps;

    @Given("estoy en la aplicación de SauceLabs")
    public void estoyEnLaAplicacionDeSauceLabs()  {
        carritoCompraSteps.validateApp();
    }

    @And("valido que carguen correctamente los productos en la galeria")
    public void validoQueCarguenCorrectamenteLosProductosEnLaGaleria() {
        carritoCompraSteps.validateProducts();
    }


}
