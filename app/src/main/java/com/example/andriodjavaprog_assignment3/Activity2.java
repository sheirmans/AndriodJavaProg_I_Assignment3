package com.example.andriodjavaprog_assignment3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class Activity2 extends AppCompatActivity {
    private Button buttonHome = null;
    private Button buttonActivity3 = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

// Initialize widgets
        this.buttonHome = (Button)findViewById(R.id.buttonHome);
        this.buttonActivity3 = (Button)findViewById(R.id.buttonActivity3);

        // Create button callbacks
        this.buttonHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("Testing Button Home", "Home Fired");
                Intent intent = new Intent(Activity2.this,
                        com.example.andriodjavaprog_assignment3.MainActivity.class);
                startActivity(intent);

                }
        });

        this.buttonActivity3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("Testing Button Home", "Home Fired");
                Intent intent = new Intent(Activity2.this,
                        com.example.andriodjavaprog_assignment3.Activity3.class);
                startActivity(intent);

            }
        });
    }
}

