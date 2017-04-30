package com.course.example.selectiondemo;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class SelectionDemo extends Activity implements OnClickListener {
    
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTheme(android.R.style.Theme_Dialog);  
        setContentView(R.layout.main);
        
     // Set up listeners for all the buttons
        Button continueButton = (Button)findViewById(R.id.first_button);
        continueButton.setOnClickListener(this);
        Button newButton = (Button)findViewById(R.id.second_button);
        newButton.setOnClickListener(this);
        Button aboutButton = (Button)findViewById(R.id.third_button);
        aboutButton.setOnClickListener(this);
        Button exitButton = (Button)findViewById(R.id.exit_button);
        exitButton.setOnClickListener(this);
        
    }
    
    public void onClick(View v) {
        switch (v.getId()) { 
        case R.id.first_button:
        	Intent i1 = new Intent(this, ListDemo.class);
            startActivity(i1);
           break;
      
        case R.id.second_button:
        	Intent i2 = new Intent(this, SpinnerDemo.class);
            startActivity(i2);
           break;
       
        case R.id.third_button:
        	Intent i3 = new Intent(this, GridDemo.class);
            startActivity(i3);
           break;
        case R.id.exit_button:
           finish();
           break;
        }
     }
     
    
}