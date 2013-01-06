package org.example.blore_metro;


import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.content.Intent;

public class MainActivity extends Activity implements OnClickListener {


	@Override
	public void onClick(View v)
	{
		
		switch(v.getId()){
		
		case R.id.calcfare_button:
			Intent i=new Intent(this,Calculatefare.class);
			startActivity(i);
			break;
		case R.id.exit_button:
			finish();
			break;
		}
	}
		
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		View calcfareButton=findViewById(R.id.calcfare_button);
		calcfareButton.setOnClickListener(this);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_main, menu);
		return true;
	}

}
