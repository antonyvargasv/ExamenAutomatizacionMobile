package com.nttdata.stepsdefinitions;

import com.nttdata.steps.MyCartSteps;
import io.cucumber.java.en.Then;
import net.serenitybdd.annotations.Steps;

public class MyCartStepsDefs {
    @Steps
    MyCartSteps myCartSteps;
    @Then("valido el carrito de compra actualice correctamente")
    public void validoElCarritoDeCompraActualiceCorrectamente() {
        myCartSteps.validateContador();
    }
}