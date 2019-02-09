/*
 * CSE41246 - Android Java Fundamentals
 * Fall 2019
 * Assignment #3
 * Szeto, Sheirman
 */

package com.example.andriodjavaprog_assignment3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button buttonActivity2 = null;
    private Button buttonActivity3 = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

// Initialize widgets
        this.buttonActivity2 = (Button)findViewById(R.id.buttonActivity2);
        this.buttonActivity3 = (Button)findViewById(R.id.buttonActivity3);

        // Create button callbacks
        this.buttonActivity2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("Testing Button Activity 2", "Activity 2 Fired");
 /*               Intent intent = new Intent(MainActivity.this,
                        com.example.andriodjavaprog_assignment3.Activity2.class);
                startActivity(intent);
 */           }
        });

        this.buttonActivity3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("Testing Button Activity 3", "Activity 3 Fired");
 /*               Intent intent = new Intent(MainActivity.this,
                        com.example.andriodjavaprog_assignment3.Activity3.class);
                startActivity(intent);
 */           }
        });


    }
}
