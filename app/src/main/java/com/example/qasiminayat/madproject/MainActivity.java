package com.example.qasiminayat.madproject;

import android.app.ProgressDialog;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

import org.w3c.dom.Text;

import static com.example.qasiminayat.madproject.R.id.LoginLink;

public class MainActivity extends AppCompatActivity  implements View.OnClickListener{

    private Button buttonRegister;
    private EditText editTextemail;
    private EditText editTextpassword;
    private TextView textViewsigninlink;

    private ProgressDialog progressDialog;

    private FirebaseAuth firebaseAuth;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        /*requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);*/
        setContentView(R.layout.activity_main);


        firebaseAuth = FirebaseAuth.getInstance();


        if(firebaseAuth.getCurrentUser() != null)
        {

            finish();
            startActivity(new Intent(getApplicationContext(), ProfileActivity.class));

        }

        progressDialog = new ProgressDialog(this);

        buttonRegister = (Button) this.findViewById(R.id.B_Login);

        editTextemail = (EditText) this.findViewById(R.id.ET_Email);
        editTextpassword= (EditText) this.findViewById(R.id.ET_Password);

        textViewsigninlink = (TextView) this.findViewById(LoginLink);


        buttonRegister.setOnClickListener(this);
        textViewsigninlink.setOnClickListener(this);

    }



    private void registerUser()
    {
        String email = editTextemail.getText().toString().trim();
        String password = editTextpassword.getText().toString().trim();


        if(TextUtils.isEmpty(email))
        {
            Toast.makeText(this, "Please enter email" , Toast.LENGTH_SHORT).show();
            return;

        }

        if(TextUtils.isEmpty(password))
        {
            Toast.makeText(this, "Please enter password" , Toast.LENGTH_SHORT).show();
            return;

        }






        progressDialog.setMessage("Registering User...");
        progressDialog.show();

        firebaseAuth.createUserWithEmailAndPassword(email,password).addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
            @Override
            public void onComplete(@NonNull Task<AuthResult> task) {
                if(task.isSuccessful())

                {
                    Toast.makeText(MainActivity.this, "Registered Successfully", Toast.LENGTH_SHORT).show();
                    finish();
                    startActivity(new Intent(getApplicationContext(), ProfileActivity.class));
                }
                else
                {
                    Toast.makeText(MainActivity.this, "Could not Register. Please try again", Toast.LENGTH_SHORT).show();


                }

                progressDialog.dismiss();
            }
        });

    }






    @Override
    public void onClick(View view) {

        if(view == buttonRegister)
        {
            registerUser();
        }

        if(view == textViewsigninlink)
        {
            startActivity(new Intent(this, LoginActivity.class));

        }

    }
}
