package net.abh0518.smsforward.cofiguration;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;

public class Configuration {
	
	private static final String PREFS_NAME = "setting";
	private SharedPreferences sharedPreferences;
	
	public Configuration(Context context){
		this.sharedPreferences = context.getSharedPreferences(PREFS_NAME, 0);
	}
	
	public void setPhoneNumber(String phoneNumber){
		Editor editor = this.sharedPreferences.edit();
		editor.putString("phoneNumber", phoneNumber);
		editor.commit();
	}
	
	public String getPhoneNumber(){
		return this.sharedPreferences.getString("phoneNumber", "");
	}

}
