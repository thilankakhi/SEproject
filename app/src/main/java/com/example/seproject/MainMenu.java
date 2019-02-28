package com.example.seproject;


import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;


public class MainMenu extends AppCompatActivity {


    private TextView viewCurrentLocation;
    private TextView viewExpectedTimes;
    private TextView viewTrainSchedule;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);


        viewCurrentLocation = (TextView)findViewById(R.id.view_c_location);
        viewExpectedTimes = (TextView)findViewById(R.id.view_expected_times);
        viewTrainSchedule = (TextView)findViewById(R.id.view_train_schedule);

        viewCurrentLocation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openViewCurrentLocation();
            }
        });

        viewExpectedTimes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openViewExpectedTimes();
            }
        });

        viewTrainSchedule.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openViewTrainSchedule();
            }
        });

    }

    public void openViewTrainSchedule(){
        Intent intent = new Intent(this, ViewTrainSchedule.class);
        startActivity(intent);
    }

    public  void openViewCurrentLocation(){
        Intent intent = new Intent(this, View_v.class);
        startActivity(intent);
    }

    public void openViewExpectedTimes(){
        Intent intent = new Intent(this, View_v.class);
        startActivity(intent);
    }
}
