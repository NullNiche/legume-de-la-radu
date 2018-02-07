package com.nullniche.legumedelaradu;

/**
 * Created by Tudor on 2/5/2018.
 */

public class VegetableOrder {

    public String clientName;
    public String vegetableName;
    public float quantity;

    public VegetableOrder(){

    }

    public VegetableOrder(String startClientName, String startVegetableName, float startQuantity){

        this.clientName = startClientName;
        this.vegetableName = startVegetableName;
        this.quantity = startQuantity;


    }
}
