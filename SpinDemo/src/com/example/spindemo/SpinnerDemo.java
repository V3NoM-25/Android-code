package com.example.spindemo;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class SpinnerDemo extends Activity implements OnItemSelectedListener{
	String[] college = { "KKW", "MET", "NDMVP", "MIT", "SIT",  };
	private Object android;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spinner_demo);
        
      Spinner s1=(Spinner)findViewById(R.layout.activity_spinner_demo);
    		  s1.setOnItemSelectedListener(this);
    		  int objects;
			ArrayAdapter aa = new ArrayAdapter(this.android.R);
    		  
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.spinner_demo, menu);
        return true;
    }


	@Override
	public void onItemSelected(AdapterView<?> arg0, View arg1, int arg2,
			long arg3) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void onNothingSelected(AdapterView<?> arg0) {
		// TODO Auto-generated method stub
		
	}
    
}
