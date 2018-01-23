package com.example.ryanmahjour.cut;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.content.Intent;


public class login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

    }

    public void loguserIn(View view)
    {
        Intent intent = new Intent(login.this, home.class);
        startActivity(intent);
    }

    public void signUp(View view)
        {
            Intent intent = new Intent(login.this, signup.class);
            startActivity(intent);
        }

}
