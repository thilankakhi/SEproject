package com.example.seproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    private Button signup_button;
    private Button signin_button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        signup_button = (Button) findViewById(R.id.signup_bt);
        signin_button = (Button) findViewById(R.id.signin_bt);

        signup_button.setOnClickListener(this);
        signin_button.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.signin_bt:
                Intent intent1 = new Intent(this, MainMenu.class);
                startActivity(intent1);
                break;
            case R.id.signup_bt:
                Intent intent2 = new Intent(this, Signup.class);
                startActivity(intent2);
                break;
        }
    }
}
