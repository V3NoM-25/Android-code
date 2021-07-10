package com.example.toggleb;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;
import android.widget.ToggleButton;

public class ToggleBtn extends Activity {
	private ToggleButton t1, t2;  
	Button b1;
	@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_toggle_btn);
        t1=(ToggleButton)findViewById(R.id.toggleButton1);
        t2=(ToggleButton)findViewById(R.id.toggleButton1);
        b1=(Button)findViewById(R.id.button1);
        b1.setOnClickListener(new OnClickListener() {
			
			public void onClick(View arg0) {
				StringBuilder sb=new StringBuilder();
				
				sb.append("Toggle1:").append(t1.getText());
				sb.append("Toggle2:").append(t2.getText());
			    				
			    Toast.makeText(getApplicationContext(), sb.toString(),Toast.LENGTH_LONG).show(); 
			}
		});
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.toggle_btn, menu);
        return true;
    }
    
}
