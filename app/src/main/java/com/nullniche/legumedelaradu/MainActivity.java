package com.nullniche.legumedelaradu;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.HashMap;
import java.util.Map;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void SendClassToDB(View view){
        //send something to db
        // Write a message to the database
        FirebaseDatabase database = FirebaseDatabase.getInstance();
        DatabaseReference rootRef = database.getReference();

        rootRef.child("_orders").setValue(new VegetableOrder("Ali","Burger",2));
        //Map<String,VegetableOrder> vegetableOrders = new HashMap<>();
        //vegetableOrders.put("first order",new VegetableOrder("Tudor","Carrot",2));
        //vegetableOrders.put("second order",new VegetableOrder("Ali","Burger",2));

        //DatabaseReference vegMenuRef = database.getReference("_vegetableMenu");
        //DatabaseReference orders = database.getReference("_orders");

        //VegetableMenu vegetableMenu = new VegetableMenu();

    }
}
