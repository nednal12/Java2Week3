package com.bmarohnic.java2week3;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;

public class NextActivity extends Activity{

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
	
	@Override
	public void finish() {
	    Intent data = new Intent();
	    data.putExtra("keyA", "Value for keyA");
	    data.putExtra("keyB", "Value for keyB");
	    setResult(RESULT_OK, data);
	    super.finish();
	}
	
}
