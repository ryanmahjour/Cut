package com.example.ryanmahjour.cut;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.text.Layout;
import android.view.MenuItem;
import android.widget.Button;
import android.view.View.OnClickListener;
import android.view.View;
import android.widget.LinearLayout;


public class weighing extends AppCompatActivity {

    private Button buttonDone;
    private Button buttonTracker;
    private LinearLayout nutritionSummary;
    private LinearLayout spinner;
    private LinearLayout okayPerson;
    private LinearLayout youMeasured;
    private LinearLayout weighingTitle;
    private LinearLayout weighedTitle;
    private LinearLayout donePopup;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonDone = (Button) findViewById(R.id.doneButton);
        buttonTracker = (Button) findViewById(R.id.trackerButton);
        nutritionSummary = (LinearLayout) findViewById(R.id.nutritionsummary);
        spinner = (LinearLayout) findViewById(R.id.spinner);
        okayPerson = (LinearLayout) findViewById(R.id.okayPerson);
        youMeasured = (LinearLayout) findViewById(R.id.youMeasured);
        weighingTitle = (LinearLayout) findViewById(R.id.weighingTitle);
        weighedTitle = (LinearLayout) findViewById(R.id.weighedTitle);
        donePopup = (LinearLayout) findViewById(R.id.donePopup);


        // create click listener
        OnClickListener oclBtnDone = new OnClickListener() {
            @Override
            public void onClick(View v) {
                // change text of the TextView (tvOut)
                buttonDone.setVisibility(View.GONE);
                buttonTracker.setVisibility(View.VISIBLE);
                okayPerson.setVisibility(View.GONE);
                youMeasured.setVisibility(View.VISIBLE);
                weighingTitle.setVisibility(View.GONE);
                weighedTitle.setVisibility(View.VISIBLE);
                spinner.setVisibility(View.GONE);
                nutritionSummary.setVisibility(View.VISIBLE);
            }
        };

        // assign click listener to the DONE button (buttonDone)
        buttonDone.setOnClickListener(oclBtnDone);

        OnClickListener oclBtnTracker = new OnClickListener() {
            @Override
            public void onClick(View v) {
                // change text of the TextView (tvOut)
                donePopup.setVisibility(View.VISIBLE);
            }
        };

        // assign click listener to the Add to Tracker button (buttonTracker)
        buttonTracker.setOnClickListener(oclBtnTracker);


        BottomNavigationView bottomNavigationView = (BottomNavigationView)
                findViewById(R.id.bottom_navigation);

        bottomNavigationView.setOnNavigationItemSelectedListener(
                new BottomNavigationView.OnNavigationItemSelectedListener() {
                    @Override
                    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                        switch (item.getItemId()) {
                            case R.id.action_home:
                                System.out.println("Home");
                                break;
                            case R.id.action_metrics:
                                System.out.println("Metrics");
                                break;
                            case R.id.action_settings:
                                System.out.println("Settings");
                                break;

                        }
                        return true;
                    }
                });
    }


    public void backToHome(View view)
    {
        Intent intent = new Intent(weighing.this, home.class);
        startActivity(intent);
    }
}

