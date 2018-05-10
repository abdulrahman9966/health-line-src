package com.rahman.line;

import com.rahman.line.R;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class MyAdapter extends BaseAdapter {
	private Context context;
	private final String[] iconl;

	public MyAdapter(Context context, String[] iconl) {
		this.context = context;
		this.iconl = iconl;
	}

	public View getView(int position, View convertView, ViewGroup parent) {

		LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

		View gridView;

		if (convertView == null) {

			gridView = new View(context);

			gridView = inflater.inflate(R.layout.iconl, null);

			TextView textView = (TextView) gridView.findViewById(R.id.label);
			
			textView.setText(iconl[position]);

			ImageView imgl = (ImageView) gridView .findViewById(R.id.imgl);

			String selic = iconl[position];

			if (selic.equals("Ambulances")) {
				imgl.setImageResource(R.drawable.ambulance);
			} else if (selic.equals("Blood Banks")) {
				imgl.setImageResource(R.drawable.blood);
			} else if (selic.equals("Chemist 24h")) {
				imgl.setImageResource(R.drawable.chemist);
			} else if (selic.equals("Hospitals")) {
				imgl.setImageResource(R.drawable.hospital);
			} else if (selic.equals("Rehabilitation Centeres")) {
				imgl.setImageResource(R.drawable.rehab);
			} else if (selic.equals("Geriatric Care")) {
				imgl.setImageResource(R.drawable.geriatic);
			} else if (selic.equals("Ophd 24h")) {
				imgl.setImageResource(R.drawable.opd);
			} else if (selic.equals("Oxygen Supply")) {
				imgl.setImageResource(R.drawable.oxygen);
			} else if (selic.equals("MRI Centeres")) {
				imgl.setImageResource(R.drawable.mri);
			}  else if (selic.equals("Nearby Hospitals")) {
				imgl.setImageResource(R.drawable.nearb);
			} 
			

		} else {
			gridView = (View) convertView;
		}

		return gridView;
	}

	@Override
	public int getCount() {
		return iconl.length;
	}

	@Override
	public Object getItem(int position) {
		return null;
	}

	@Override
	public long getItemId(int position) {
		return 0;
	}

}