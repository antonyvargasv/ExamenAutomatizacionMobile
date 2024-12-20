package com.nttdata.steps;

import com.nttdata.screens.MyCartScreen;

public class MyCartSteps {
    MyCartScreen myCartScreen;

    public boolean validateContador() {
        return myCartScreen.valorContador();
    }
}
