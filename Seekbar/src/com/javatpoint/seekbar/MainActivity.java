package com.javatpoint.seekbar;
import android.os.Bundle;  
import android.app.Activity;  
import android.widget.SeekBar;  
import android.widget.SeekBar.OnSeekBarChangeListener;  
import android.widget.TextView;
import android.widget.Toast;  
public class MainActivity extends Activity implements OnSeekBarChangeListener{  
   
	SeekBar sb1;  
	TextView t1;
   
    protected void onCreate(Bundle savedInstanceState) {  
        super.onCreate(savedInstanceState);  
        setContentView(R.layout.activity_main);  
          
        sb1=(SeekBar)findViewById(R.id.seekBar1);  
        t1=(TextView)findViewById(R.id.textView1);
        //sb1.setOnSeekBarChangeListener(this); 
        sb1.setOnSeekBarChangeListener(new OnSeekBarChangeListener() {
			
			public void onStopTrackingTouch(SeekBar arg0) 
			{
				
				Toast.makeText(getApplicationContext(),"stopped!", Toast.LENGTH_SHORT).show();  
			}
			
			public void onStartTrackingTouch(SeekBar arg0) 
			{
				
				Toast.makeText(getApplicationContext(),"started!", Toast.LENGTH_SHORT).show();   
			}
			
			public void onProgressChanged(SeekBar arg0, int arg1, boolean arg2) 
			{
				
			  // Toast.makeText(getApplicationContext(),"progress: "+arg1, Toast.LENGTH_SHORT).show();  
				String val=String.valueOf(arg1);
				t1.setText(val);
			}
		});
      }

	@Override
	public void onProgressChanged(SeekBar arg0, int arg1, boolean arg2) {
		// TODO Auto-generated method stub
		Toast.makeText(getApplicationContext(),"progress: "+arg1, Toast.LENGTH_SHORT).show();  
	}

	@Override
	public void onStartTrackingTouch(SeekBar arg0) {
		// TODO Auto-generated method stub
		Toast.makeText(getApplicationContext(),"started!", Toast.LENGTH_SHORT).show(); 	
	}

	@Override
	public void onStopTrackingTouch(SeekBar arg0) {
		// TODO Auto-generated method stub
		Toast.makeText(getApplicationContext(),"stopped!", Toast.LENGTH_SHORT).show();  
	}
	}
    
    
	

	