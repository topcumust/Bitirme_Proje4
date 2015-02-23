package com.example.register;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Random;



public class random extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.random);

        final Button stop=(Button ) findViewById(R.id.button1);
        final Button back=(Button ) findViewById(R.id.button2);

        final Intent intent= new Intent(this,Home.class);

        //final TextView sonuc= (TextView) findViewById(R.id.textView);
        //EditText sonu=(EditText)findViewById(R.id.sonuc);
        int i=0;

        int Text[];

        boolean flag=true;
        int  count=0;
        ArrayList<TextView> text = new ArrayList<TextView>();

        String  rand="";
        while(flag)
        {
            text.add((TextView)findViewById(R.id.text_son));

            Random randomnum = new Random();
            int rnumber=randomnum.nextInt();
            rand=String.valueOf(rnumber)+rand;
            text.get(i).setText(rand);
            count++;

            if(count==20) {
                flag = false;
            }
        }

        stop.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                back.setVisibility(View.VISIBLE);
            }
        });
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Bundle bundle =new Bundle();
                intent.putExtras(bundle);
                startActivity(intent);
            }
        });




    }
}
