/*
 * This Activity uses a <GridView> widget.
 */
package com.course.example.selectiondemo;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.TextView;


public class GridDemo extends Activity implements OnItemClickListener {

	private TextView selection;
	private final String[] items = { "one", "two", "three", "four",
			   "five", "six","seven", 
			   "eight", "nine", "ten" };

	@Override
	public void onCreate(Bundle icicle) {
		super.onCreate(icicle);
		setContentView(R.layout.grid);
		selection = (TextView) findViewById(R.id.selection);

		GridView gv = (GridView) findViewById(R.id.grid);
		gv.setOnItemClickListener(this);   //connect listener

		ArrayAdapter<String> aa = new ArrayAdapter<String>(
				this,
				android.R.layout.simple_list_item_1,    //Android supplied list item format
				items );

		gv.setAdapter(aa);                 //connect ArrayAdapter to <GridView>
	}

	public void onItemClick(AdapterView<?> parent, View v, int position, long id) {
		selection.setText(items[position]);
	}
	
}// class
