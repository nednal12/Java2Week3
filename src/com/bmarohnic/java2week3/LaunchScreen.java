package com.bmarohnic.java2week3;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;



public class LaunchScreen extends Activity{

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		setContentView(R.layout.activity_launch);
	}
  
	/* (non-Javadoc)
	 * @see android.app.Activity#onCreateOptionsMenu(android.view.Menu)
	 */
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
//		MenuInflater inflater = getMenuInflater();
//	    inflater.inflate(R.menu.main_activity_actions, menu);
		return true;
	}
	
	
	   
	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// TODO Auto-generated method stub
		switch (item.getItemId())
		{
        case R.id.action_web:
        	Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://8coupons.com"));
    		startActivity(intent);
            return true;
        case R.id.action_search:
        	Intent mainActivity = new Intent(this, MainActivity.class);
    		startActivity(mainActivity);
            return true;
        default:
            return super.onOptionsItemSelected(item);
		}
	}

	public void searchClick(View view) {

		Intent mainActivity = new Intent(this, MainActivity.class);
		
		startActivity(mainActivity);
	}
	
	public void implicitClick(View view) {

		Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://8coupons.com"));
		
		startActivity(intent);
	}
}
