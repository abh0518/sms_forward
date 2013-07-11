package net.abh0518.smsforward.activity;

import net.abh0518.smsforward.R;
import net.abh0518.smsforward.R.layout;
import net.abh0518.smsforward.R.menu;
import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

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
		return true;
	}

}
