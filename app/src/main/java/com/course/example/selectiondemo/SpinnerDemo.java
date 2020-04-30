package com.course.example.selectiondemo;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class SpinnerDemo extends Activity implements OnItemSelectedListener {
	private TextView selection;
	private final String[] items = { "Android", "Java", "Python", "C",
			"PHP", "C++","C#", "Javascript", "GO", "Swift" };

	@Override
	public void onCreate(Bundle icicle) {
		super.onCreate(icicle);
		setContentView(R.layout.spinner);
		selection = (TextView) findViewById(R.id.selection);

		Spinner spin = (Spinner) findViewById(R.id.spinner);
		spin.setOnItemSelectedListener(this);   //set listener

		//Create an ArrayAdapter and a default spinner layout 
		ArrayAdapter<String> aa = new ArrayAdapter<String>(
				this,
				android.R.layout.simple_spinner_item,  
				items);

		//Specify the layout to use when the list of choices appears
		aa.setDropDownViewResource(
		   android.R.layout.simple_spinner_dropdown_item);  
		spin.setAdapter(aa);  //connect ArrayAdapter to <Spinner>
	}

	//listener methods for callbacks 
	public void onItemSelected(AdapterView<?> parent, View v, int position,
			long id) {
		selection.setText(items[position]);
		Toast.makeText(this, "Spinner item selected " + items[position], Toast.LENGTH_LONG).show();
	}

	public void onNothingSelected(AdapterView<?> parent) {
		selection.setText("");
	}
}//class
