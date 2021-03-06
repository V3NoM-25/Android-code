package com.example.spinner;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends Activity implements
AdapterView.OnItemSelectedListener {

	String[] college = { "KKW", "MET", "NDMVP", "MIT", "SIT",  };

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		Spinner spin = (Spinner) findViewById(R.id.spinner1);
		spin.setOnItemSelectedListener(this);
		
		ArrayAdapter aa = new ArrayAdapter(this,android.R.layout.simple_spinner_item,college);
		aa.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
		
		spin.setAdapter(aa);
		
	}

	public void onItemSelected(AdapterView<?> arg0, View arg1, int position,long id) {
		Toast.makeText(getApplicationContext(),college[position] ,Toast.LENGTH_LONG).show();
	}

	public void onNothingSelected(AdapterView<?> arg0) {
		// TODO Auto-generated method stub
		
	}

}
