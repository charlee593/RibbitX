package com.teamtreehouse.ribbit;

import android.app.Application;

import com.parse.Parse;

public class RibbitApplication extends Application {
	
	@Override
	public void onCreate() { 
		super.onCreate();
        Parse.initialize(this, "qwMKM0BASF5UkMQPdRX54KWp3cpCTHbsONlkPUNQ", "Tc4qXUxnnhTcYAGKWgV4rgPS483HGN4W9PTd0fws");
    }
}
