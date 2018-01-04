package com.example.qasiminayat.madproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class ProfileActivity extends AppCompatActivity implements View.OnClickListener {

    private FirebaseAuth firebaseAuth;

    private TextView textViewUserEmail;
    private Button buttonLogout;

    private Button buttonshopping;
    private Button buttonCalculator;
    private Button buttonwishlist;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        firebaseAuth = FirebaseAuth.getInstance();

        if (firebaseAuth.getCurrentUser() == null) {
            finish();
            startActivity(new Intent(this, LoginActivity.class));
        }


        FirebaseUser user = firebaseAuth.getCurrentUser();

        textViewUserEmail = (TextView) this.findViewById(R.id.textViewUserEmail);
        textViewUserEmail.setText("" + user.getEmail());
        buttonLogout = (Button) this.findViewById(R.id.Button_Logout);


        buttonshopping = (Button) this.findViewById(R.id.ButtonShopping);
        buttonCalculator = (Button) this.findViewById(R.id.Button_Calculator);

        buttonwishlist = (Button) this.findViewById(R.id.Button_WishList);



        buttonLogout.setOnClickListener(this);

        buttonshopping.setOnClickListener(this);

        buttonCalculator.setOnClickListener(this);

        buttonwishlist.setOnClickListener(this);




    }

    @Override
    public void onClick(View view) {

        if (view == buttonLogout) {
            firebaseAuth.signOut();
            finish();
            startActivity(new Intent(this, LoginActivity.class));
        }

        if(view == buttonshopping)
        {
            startActivity(new Intent(this, Testing.class ));
        }


        if(view == buttonCalculator)
        {
            startActivity(new Intent(this, Calculator.class ));
        }


        if(view == buttonwishlist)
        {
            startActivity(new Intent(this, NotepadActivity.class ));
        }






    }


}