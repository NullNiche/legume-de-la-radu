package com.nullniche.legumedelaradu;


import java.util.Dictionary;

/**
 * Created by Tudor on 2/5/2018.
 */

public class VegetableMenu {

    private Dictionary<String,String> vegDict;


    public void AddVegetable(String name, String price){
        vegDict.put(name, price);
    }

    public VegetableMenu(){

    }

}
