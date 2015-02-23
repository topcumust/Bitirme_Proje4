package com.example.register;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Home extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.home);
		Bundle data=getIntent().getExtras();
		TextView userName= (TextView)findViewById(R.id.textView2);		
		userName.setText(data.getString("userName"));

        final Intent intent_logout=new Intent(this,Login.class);

        final Button logout=(Button) findViewById(R.id.button3);
        final Button exit=(Button) findViewById(R.id.button1);

        final Intent intent2 = new Intent(Intent.ACTION_MAIN);

		final Button startexperiment=(Button) findViewById(R.id.button2);
        final Intent intent_exp=new Intent(this, random.class);
        if (getIntent().getBooleanExtra("EXIT", false)) {
            finish();
        }

        startexperiment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Bundle bundle=new Bundle();
                intent_exp.putExtras(bundle);
                startActivity(intent_exp);
            }
        });

        logout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Bundle bundle=new Bundle();
                intent_logout.putExtras(bundle);
                startActivity(intent_logout);

            }
        });

        exit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent2.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                intent2.putExtra("EXIT", true);
                intent2.addCategory(Intent.CATEGORY_HOME);
                startActivity(intent2);
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
