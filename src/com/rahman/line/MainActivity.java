package com.rahman.line;


import com.rahman.line.R;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.TextView;
import android.widget.Toast;
import android.view.View;
import android.widget.AdapterView.OnItemClickListener;

public class MainActivity extends Activity {

	GridView gridView;

	static final String[] Items = new String[] { "Ambulances", "Blood Banks","Chemist 24h", "Hospitals","Rehabilitation Centeres","Geriatric Care","Ophd 24h","Oxygen Supply","MRI Centeres","Nearby Hospitals" };

	@Override
	public void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);

		gridView = (GridView) findViewById(R.id.gridView);

		gridView.setAdapter(new MyAdapter(this, Items));

		gridView.setOnItemClickListener(new OnItemClickListener() {
			public void onItemClick(AdapterView<?> parent, View v,
					int position, long id) {
				switch(position)
                {
                    case 0:
                        Intent am = new Intent(MainActivity.this, ambulances.class);
                       
                        startActivity(am);
                        break;
                    case 1:
                        Intent bl = new Intent(getApplicationContext(), blood.class);
                        
                        startActivity(bl);
                        break;
                    case 2:
                        Intent ch = new Intent(getApplicationContext(), chemist.class);
                       
                        startActivity(ch);
                        break;
                    case 3:
                        Intent hs = new Intent(getApplicationContext(), hospitals.class);
                      
                        startActivity(hs);
                        break;
                    case 4:
                        Intent rb = new Intent(getApplicationContext(), rehab.class);
                        
                        startActivity(rb);
                        break;
                    case 5:
                        Intent ge = new Intent(getApplicationContext(), geriatric.class);
               
                        startActivity(ge);
                        break;
                    case 6:
                        Intent op = new Intent(getApplicationContext(), ophd.class);
                         
                        startActivity(op);
                        break;
                    
                    
                    
                    case 7:
                        Intent ox = new Intent(getApplicationContext(), oxygen.class);
                   
                        startActivity(ox);
                        break;
                    case 8:
                        Intent mr = new Intent(getApplicationContext(), mri.class);
                         
                        startActivity(mr);
                        break;
                    case 9:
                   	 Intent map = new Intent("android.intent.action.VIEW", Uri.parse("geo:0,0?q=hospitals+near+me"));
                        startActivity(map);
                       break;
              

                    //and so on for other activities.
                    default:
                        break;
                }
				
				
			} 	
		});

	}

}