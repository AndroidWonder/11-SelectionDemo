/*
 * This Activity class extends ListActivity, a wrapper class of Activity.
 * It makes creating a selection list easier. The UI used a <ListView> widget.
 * The <ListView> must be given the name 'list'
 */

package com.course.example.selectiondemo;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class ListDemo extends Activity implements AdapterView.OnItemClickListener {

	private TextView selection;
	private ListView listview;

	private final String[] items = { "one", "two", "three", "four",
			"five", "six","seven",
			"eight", "nine", "ten" };

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.list);

		selection=(TextView)findViewById(R.id.selection);
		listview = (ListView)findViewById(R.id.list);
		listview.setOnItemClickListener(this);              //attach listener

		ArrayAdapter<String> aa = new ArrayAdapter<String>(
				this,
				android.R.layout.simple_list_item_1,     //Android supplied List item format
				items);
		listview.setAdapter(aa);    //connect ArrayAdapter to <ListView>
	}

	public void onItemClick(AdapterView<?> parent, View v, int position, long id) {

		String text = " position:" + position + "  " + items[position];
		selection.setText(text);
	}

}

