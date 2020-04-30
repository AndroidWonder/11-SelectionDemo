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
import android.widget.Toast;


public class GridDemo extends Activity implements OnItemClickListener {

	private TextView selection;
	private final String[] items = { "Android", "Java", "Python", "C",
			"PHP", "C++","C#", "Javascript", "GO", "Swift" };

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
		Toast.makeText(this, "Grid item selected " + items[position], Toast.LENGTH_LONG).show();
	}
	
}// class
