package com.example.register;

import android.app.Activity;
import android.content.ContentValues;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.ArrayList;


public class MainActivity extends Activity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.register);

        //final DatabaseHandler db = new DatabaseHandler(this);
        final ArrayList<String> userselected  = new  ArrayList<String>();
        final ArrayList<String> passwordselected  = new  ArrayList<String>();
        final int noOfElement = userselected.size();

		final Intent intent = new Intent(this, Home.class);
        final Intent intent2 = new Intent(this, Login.class);
		final Button signup = (Button) findViewById(R.id.button1);
		
		signup.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {

				Bundle bundle = new Bundle();
                Bundle bundle2= new Bundle();

				EditText username = (EditText) findViewById(R.id.editText_register_username);
				EditText password = (EditText) findViewById(R.id.editText_register_password);
				String userName = username.getText().toString();
				String userPassword = password.getText().toString();


                ArrayList<String> userlist=new ArrayList<String>();
                ArrayList<String> passlist=new ArrayList<String>();
                userlist.add(userName);
                passlist.add(userPassword);
                bundle2.putStringArrayList("userlist",userlist);
                bundle2.putStringArrayList("passlist",passlist);
                intent2.putExtras(bundle2);


				bundle.putString("userName", userName);
				bundle.putString("userPassword", userPassword);
				intent.putExtras(bundle);
				startActivity(intent);
			
			}
		});

	}


	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
