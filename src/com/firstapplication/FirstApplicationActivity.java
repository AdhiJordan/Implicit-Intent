package com.firstapplication;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class FirstApplicationActivity extends Activity {
    /** Called when the activity is first created. */
    
    private Button buttonone, buttontwo;
    private EditText textone, texttwo;
    
    String Url;
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        textone = (EditText)findViewById(R.id.editText1);
        texttwo = (EditText)findViewById(R.id.editText2);
        buttonone = (Button)findViewById(R.id.button1);
        buttonone.setOnClickListener(new OnClickListener(){

			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				String Url= textone.getText().toString();
				Intent i = new Intent(Intent.ACTION_VIEW);
				i.setData(Uri.parse(Url));
				startActivity(i);
			}
    });
        buttontwo.setOnClickListener(new OnClickListener(){

			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				String number=texttwo.getText().toString();  
                Intent hangup = new Intent(Intent.ACTION_CALL);  
                hangup.setData(Uri.parse("tel:"+number));  
                startActivity(hangup);
				
			}
        	
        });
}
}