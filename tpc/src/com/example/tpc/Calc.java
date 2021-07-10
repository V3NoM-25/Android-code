package com.example.tpc;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class Calc extends Activity {  
	EditText t1,t2,t3;
	Button b1,b2,b3,b4;
	
//@override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calc);
        t1=(EditText)findviewById(R.id txt1);
        t2=(EditText)findviewById(R.id txt2);
        t3=(EditText)findviewById(R.id txt3);
        b1=(Button)findviewById(R.id sum);
        b2=(Button)findviewById()
        
           
        	
    }
    

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.calc, menu);
        return true;
    }
    
}
