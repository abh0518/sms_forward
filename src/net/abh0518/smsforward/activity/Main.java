package net.abh0518.smsforward.activity;

import net.abh0518.smsforward.R;
import net.abh0518.smsforward.cofiguration.Configuration;
import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Main extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		
		refresh();
		
		 final Button btn_save = (Button) findViewById(R.id.btn_save);
		 btn_save.setOnClickListener(new View.OnClickListener() {
	         public void onClick(View v) {
	             // Perform action on click
	        	 Main.this.save();
	         }
	     });
		
		 final Button btn_refresh = (Button) findViewById(R.id.btn_refresh);
		 btn_refresh.setOnClickListener(new View.OnClickListener() {
	         public void onClick(View v) {
	             // Perform action on click
	        	 Main.this.refresh();
	         }
	     });
		 
		return true;
	}
	
	public void refresh(){
		Log.d(this.getClass().toString(), "refresh");
		Configuration config = new Configuration(Main.this);
	   	String phoneNumber = config.getPhoneNumber();
	   	TextView textView = (TextView)this.findViewById(R.id.input_phonenumber);
	   	textView.setText(phoneNumber);
	}
	
	public void save(){
		Log.d(this.getClass().toString(), "save");
		TextView textView = (TextView)this.findViewById(R.id.input_phonenumber);
	   	String phoneNumber = (String) textView.getText().toString();
	   	Configuration config = new Configuration(Main.this);
	   	config.setPhoneNumber(phoneNumber);
	}

}
