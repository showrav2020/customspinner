package com.example.sppinarfile;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {

    private Spinner spinner;
    private String[] countryNames;
    int[] flags = {R.drawable.bangladesh, R.drawable.chaina, R.drawable.england, R.drawable.india, R.drawable.mayanmar};

    private boolean first = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        countryNames = getResources().getStringArray(R.array.country_name);
        spinner = findViewById(R.id.spnID);
        CustomAdapter customAdapter = new CustomAdapter(this, countryNames, flags);
        spinner.setAdapter(customAdapter);

        //add listener
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });



    }
}