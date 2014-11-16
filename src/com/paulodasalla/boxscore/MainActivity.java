package com.paulodasalla.boxscore;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends ActionBarActivity implements View.OnClickListener {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		Button btn1 = (Button) findViewById(R.id.btnDisplayMessage);
		btn1.setOnClickListener(this);
		
		Button btn2 = (Button) findViewById(R.id.btnDisplayScore);
		btn2.setOnClickListener(this);
		
		Button btn3 = (Button) findViewById(R.id.btnDisplayStandings);
		btn3.setOnClickListener(this);
		
		
	}

	@Override
	public void onClick(View v) {
		if (v.getId() == R.id.btnDisplayMessage){
			Toast.makeText(this, "Loading...", Toast.LENGTH_LONG)
			.show();
		}else if(v.getId() == R.id.btnDisplayScore){
			Toast.makeText(this, "Loading...", Toast.LENGTH_LONG)
			.show();
		
	}else if(v.getId() == R.id.btnDisplayStandings){
		Toast.makeText(this, "Loading...", Toast.LENGTH_LONG)
		.show();
	
	}
}
}

	
		
	


