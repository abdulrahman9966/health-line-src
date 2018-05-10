package com.rahman.line;
import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class detailhosp extends Activity {
	
	 @Override
	    protected void onCreate(Bundle savedInstanceState) {
	        super.onCreate(savedInstanceState);
	        setContentView(R.layout.detailshosp);
	        
	        try{
	        	int id= 0;
	        	Bundle extras = getIntent().getExtras();
	        	if(extras != null) {
	        		id = extras.getInt("ID");
	        	}
	        	HospitalsRepository rep = new HospitalsRepository(getApplicationContext());
	        	Hospital hospital = rep.hospitals.get(id);
	        	TextView nameView = (TextView)findViewById(R.id.detail_name);
	        	nameView.setText("Name     :"+hospital.name);
	        	TextView catView = (TextView)findViewById(R.id.detail_cat);
	        	catView.setText("Category     :"+hospital.cat);
	        	TextView discView = (TextView)findViewById(R.id.detail_disc);
	        	discView.setText("Discipline     :"+hospital.disc);
	        	TextView phoneView = (TextView)findViewById(R.id.detail_phone);
	        	phoneView.setText("Phone No :"+hospital.phone);
	        	TextView websiteView = (TextView)findViewById(R.id.detail_website);
	        	websiteView.setText("Website :"+hospital.website);
	        	TextView addressView = (TextView)findViewById(R.id.detail_address);
	        	addressView.setText("Address :"+hospital.address);
	        	
	        }catch(Exception e) {
	        	Toast.makeText(getApplicationContext(),	e.getClass().toString(), Toast.LENGTH_SHORT).show();
	        }
	 }
}
