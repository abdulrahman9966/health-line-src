package com.rahman.line;
import java.util.ArrayList;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class hospitals extends ListActivity {

	public ArrayList<Hospital> hospitals;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		try {
		HospitalsRepository repository = new HospitalsRepository(getApplicationContext());
		hospitals = repository.hospitals;
		
		String names[] = new String[hospitals.size()];
		for(int i=0;i<names.length; i++) {
			names[i] = hospitals.get(i).name;
		}

		setListAdapter(new ArrayAdapter(this, R.layout.hospitals,names));

		ListView listView = getListView();
		listView.setTextFilterEnabled(true);

		listView.setOnItemClickListener(new OnItemClickListener() {
			public void onItemClick(AdapterView parent, View view, int position, long id) {

			    // When clicked, show a toast with the TextView text
			    Toast.makeText(getApplicationContext(),	Integer.toString(position), Toast.LENGTH_LONG).show();
			    		
			    Intent select = new Intent(getApplicationContext(), detailhosp.class);
	            select.putExtra("ID", position);
			    startActivity(select);
			}
		});
		} catch (Exception e) {
			Toast.makeText(getApplicationContext(),	e.getClass().toString(), Toast.LENGTH_SHORT).show();
		}
	}

}