package com.example.qasiminayat.madproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ShoppingList extends AppCompatActivity implements View.OnClickListener {

    private Button buttonLogout;
    private Button button_Products;
    private Button button_Costmetics;
    private Button button_Stationary;
    private Button button_Drugs;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shopping_list);


        button_Products = (Button) this.findViewById(R.id.Button_Products);

        button_Costmetics = (Button) this.findViewById(R.id.Button_Costmetics);

        button_Stationary = (Button) this.findViewById(R.id.Button_Stationary);

        button_Drugs = (Button) this.findViewById(R.id.Button_Drugs);



        buttonLogout.setOnClickListener(this);
        button_Products.setOnClickListener(this);
        button_Costmetics.setOnClickListener(this);
        button_Stationary.setOnClickListener(this);
        button_Drugs.setOnClickListener(this);
    }



    @Override
    public void onClick(View view) {


        if(view == button_Products)
        {
            startActivity(new Intent(this, MenuActivity.class ));
        }

        if(view == button_Costmetics)
        {
            startActivity(new Intent(this, CostmeticsActivity.class ));
        }

        if(view == button_Stationary)
        {
            startActivity(new Intent(this, StationaryActivity.class ));
        }

        if(view == button_Drugs)
        {
            startActivity(new Intent(this, DrugsActivity.class ));
        }







    }
}
