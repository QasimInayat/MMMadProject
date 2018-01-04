package com.example.qasiminayat.madproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.CookieSyncManager;
import android.widget.Button;

public class Testing extends AppCompatActivity implements View.OnClickListener{


    private Button buttonGrocy;
    private Button buttonCosmetics;
    private Button buttonStationary;
    private Button buttonDrugs;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_testing);



        buttonGrocy = (Button) this.findViewById(R.id.Button_Products);
        buttonCosmetics = (Button) this.findViewById(R.id.Button_Costmetics);
        buttonStationary = (Button) this.findViewById(R.id.Button_Stationary);
        buttonDrugs = (Button) this.findViewById(R.id.Button_Drugs);



        buttonGrocy.setOnClickListener(this);
        buttonCosmetics.setOnClickListener(this);
        buttonStationary.setOnClickListener(this);
        buttonDrugs.setOnClickListener(this);



    }

    @Override
    public void onClick(View view) {

        if(view == buttonGrocy)
        {
            startActivity(new Intent(this, MenuActivity.class));
        }

        if(view == buttonCosmetics)
        {
            startActivity(new Intent(this, CostmeticsActivity.class));
        }

        if(view == buttonStationary)
        {
            startActivity(new Intent(this, StationaryActivity.class));
        }

        if(view == buttonDrugs)
        {
            startActivity(new Intent(this, DrugsActivity.class));
        }

    }
}
