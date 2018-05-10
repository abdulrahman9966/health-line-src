package com.rahman.line;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;

import android.content.Context;

public class HospitalsRepository {
	
	public ArrayList<Hospital> hospitals;
	public HospitalsRepository(Context context) throws FileNotFoundException, IOException, ClassNotFoundException
	{
		String strLine;
		Hospital hospital;
		hospitals = new ArrayList<Hospital>();
		InputStream is = context.getResources().openRawResource(R.raw.hospitals);
		BufferedReader br = new BufferedReader(new InputStreamReader(is));
		while ((strLine = (br.readLine())) != null) {
			String[] details = strLine.split(";");
			hospital = new Hospital();
			hospital.name = details[0];
			hospital.cat = details[1];
			hospital.disc = details[2];
			hospital.phone = details[3];
			hospital.website = details[4];
			hospital.address = details[5];
			
			
			hospitals.add(hospital);
		}
		is.close();
		br.close();
	}
}
