package com.nttdata.stepsdefinitions;

import com.nttdata.steps.CarritoCompraSteps;
import io.cucumber.java.en.Given;
import net.serenitybdd.annotations.Steps;

public class CarritoComprasStepsDefs {
    @Steps
    CarritoCompraSteps carritoCompraSteps;
    @Given("estoy en la aplicación de SauceLabs")
    public void estoyEnLaAplicaciónDeSauceLabs() {
        carritoCompraSteps.pageProducts();
    }
}
