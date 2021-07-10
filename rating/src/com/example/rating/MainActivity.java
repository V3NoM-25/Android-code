package com.example.rating;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.RatingBar;
import android.widget.Toast;

public class MainActivity extends Activity {
	RatingBar rb;
	Button b1;
	
	protected void onCreate(Bundle savedInstanceState) 
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	
		rb=(RatingBar)findViewById(R.id.ratingBar1);
		b1=(Button)findViewById(R.id.button1);
		
		b1.setOnClickListener(new OnClickListener()
		{
			public void onClick(View arg0) 
			{
				
				String val=String.valueOf(rb.getRating());
				
				Toast.makeText(getApplicationContext(),"Value="+val, Toast.LENGTH_SHORT).show();
			}
			
		});
	}
	
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_main, menu);
		return true;
	}

}
