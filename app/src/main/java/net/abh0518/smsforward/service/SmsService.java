package net.abh0518.smsforward.service;

import net.abh0518.smsforward.cofiguration.Configuration;
import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.telephony.SmsManager;

public class SmsService extends Service {
	
	private Configuration config = null;
	@Override
	public void onCreate() {
		// TODO Auto-generated method stub
		config = new Configuration(this.getApplicationContext());
		super.onCreate();
		
	}
	
	@Override
	public int onStartCommand(Intent intent, int flags, int startId) {
		// TODO Auto-generated method stub
		String msg = intent.getStringExtra("msg");
		
		String phoneNumber = config.getPhoneNumber();
		if( phoneNumber != null && !phoneNumber.isEmpty() ){
			sendSms(phoneNumber, msg);	
		}
		return super.onStartCommand(intent, flags, startId);
	}

	
	private void sendSms(String phoneNumber, String msg){
		SmsManager smsManager = SmsManager.getDefault();
		smsManager.sendTextMessage(phoneNumber, null, msg, null, null);
	}


	@Override
	public IBinder onBind(Intent intent) {
		// TODO Auto-generated method stub
		return null;
	}

}
