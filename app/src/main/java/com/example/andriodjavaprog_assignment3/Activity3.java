package com.example.andriodjavaprog_assignment3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class Activity3 extends AppCompatActivity {
    private Button buttonHome = null;
    private Button buttonActivity2 = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_3);
// Initialize widgets
        this.buttonHome = (Button)findViewById(R.id.buttonHome);
        this.buttonActivity2 = (Button)findViewById(R.id.buttonActivity2);

        // Create button callbacks
        this.buttonHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("Testing Button Home", "Home Fired");
                Intent intent = new Intent(Activity3.this,
                        com.example.andriodjavaprog_assignment3.MainActivity.class);
                startActivity(intent);

            }
        });

        this.buttonActivity2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("Testing Button Home", "Home Fired");
                Intent intent = new Intent(Activity3.this,
                        com.example.andriodjavaprog_assignment3.Activity2.class);
                startActivity(intent);

            }
        });
    }
}

