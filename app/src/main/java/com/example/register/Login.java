package com.example.register;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;

public class Login extends Activity {


@Override
protected void onCreate(Bundle savedInstanceState) {
	// TODO Auto-generated method stub
	super.onCreate(savedInstanceState);
	setContentView(R.layout.activity_main);

    //final DatabaseHandler db = new DatabaseHandler(this);

	final Intent intent = new Intent(this, Home.class);
	final Intent intent2 = new Intent(this, MainActivity.class);
	
	Button submit = (Button) findViewById(R.id.submit);
	Button get_new_account = (Button) findViewById(R.id.create_New_Account);
    final TextView error_message=(TextView)findViewById(R.id.error_message);

	submit.setOnClickListener(new View.OnClickListener() {
		
		@Override
		public void onClick(View v) {

			Bundle bundle = new Bundle();



			EditText username = (EditText) findViewById(R.id.editTex_Username);
			EditText password = (EditText) findViewById(R.id.editText_Password);
			String userName = username.getText().toString();
			String userPassword = password.getText().toString();


            boolean flag=false;

            Bundle data=getIntent().getExtras();
            ArrayList<String> userlist=new ArrayList<String>();
            ArrayList<String> passlist=new ArrayList<String>();
            userlist=data.getStringArrayList("userlist");
            passlist=data.getStringArrayList("passlist");
            int len=userlist.size();

            for (int i=0;i<len;i++){
                if(userlist.get(i) ==userName && passlist.get(i) ==userPassword){
                    flag=true;
                }
            }

            if(flag)
            {
                bundle.putString("userName", userName);
                bundle.putString("userPassword", userPassword);
                intent.putExtras(bundle);
                startActivity(intent);
                System.out.println("Dogru");
            }
            else{
                error_message.setText("Hatali giris tekrar  deneyiniz");
            }

		}
	});
			
			
	get_new_account.setOnClickListener(new View.OnClickListener() {
		
		@Override
		public void onClick(View v) {
			// TODO Auto-generated method stub
			startActivity(intent2);
		}
	});	
	
	
}
}
