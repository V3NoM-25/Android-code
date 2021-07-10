package com.example.timepicker1;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;
import android.widget.TimePicker;

public class MainActivity extends Activity {
	TextView tv;
	TimePicker t1;
	Button b1;
	
		protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		tv=(TextView)findViewById(R.id.textView1);
		t1=(TimePicker)findViewById(R.id.timePicker1);
		b1=(Button)findViewById(R.id.button1);
		
		t1.setIs24HourView(true);
		
		tv.setText(getCurrentTime());
		
	 		b1.setOnClickListener(new OnClickListener()
	 		{
			
			public void onClick(View view) 
			{
				 tv.setText(getCurrentTime());
			}
		});
	}

	public String getCurrentTime()
	{
		String c1="Current Time: "+t1.getCurrentHour()+":"+t1.getCurrentMinute();
	   	return c1;
	}
	
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_main, menu);
		return true;
	}

}
