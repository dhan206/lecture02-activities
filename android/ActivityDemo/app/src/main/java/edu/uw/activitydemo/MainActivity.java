package edu.uw.activitydemo;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity"; // Used as a tag for log messages, makes it easier to fined during debugging
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = (Button)findViewById(R.id.button); //returns view, so must cast to Button
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.v(TAG, "Button clicked");
            }
        });

        Log.v(TAG, "onCreate called");
    }

    @Override
    protected void onResume() {
        super.onResume();

        // System.out.println("onResume"); THIS WILL NOT WORK!
        Log.v(TAG, "onResume called"); // Equivalent to system.out, Log.verbose logs. Only for debugging never leave them for production or homework
    }

    @Override
    protected void onStart() {
        super.onStart();


        Log.v(TAG, "onStart called");
    }

    @Override
    protected void onStop() {
        super.onStop();

        Log.v(TAG, "onStop called");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();

        Log.v(TAG, "onDestroy called");
    }

}