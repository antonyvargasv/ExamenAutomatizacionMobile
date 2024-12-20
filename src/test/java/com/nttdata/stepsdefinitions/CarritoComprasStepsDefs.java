package com.nttdata.stepsdefinitions;

import com.nttdata.steps.CarritoCompraSteps;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.annotations.Steps;

public class CarritoComprasStepsDefs {
    @Steps
    CarritoCompraSteps carritoCompraSteps;

    @Given("estoy en la aplicación de SauceLabs")
    public void estoyEnLaAplicacionDeSauceLabs() throws InterruptedException {
        carritoCompraSteps.validateApp();
    }

    @And("valido que carguen correctamente los productos en la galeria")
    public void validoQueCarguenCorrectamenteLosProductosEnLaGaleria() {
        carritoCompraSteps.validateProducts();
    }


    @When("agrego {string} del siguiente producto {string}")
    public void agregoDelSiguienteProducto(String UNIDADES, String PRODUCTO) {
        carritoCompraSteps.addProduct(PRODUCTO);
    }

    @Then("valido el carrito de compra actualice correctamente")
    public void validoElCarritoDeCompraActualiceCorrectamente() {

    }
}
