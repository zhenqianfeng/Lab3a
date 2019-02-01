package com.concordia.cejv669.lab3a;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button b1 = findViewById(R.id.btn_showmsg1);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), Main2Activity.class);
                startActivityForResult(i,1);
            }
        });

        Button b2 = findViewById(R.id.btn_showmsg2);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), Main2Activity.class);
                startActivityForResult(i,2);
            }
        });

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {

        TextView t1 = findViewById(R.id.lbl_msg1);
        TextView t2 = findViewById(R.id.lbl_msg2);
        String s = "";
        if (resultCode == RESULT_OK && requestCode == 1) {
            if (data.hasExtra("returnKey1")) {
                s = data.getExtras().getString("returnKey1");
                t1.setText("Hello "+s);
                t2.setText("");
            }
        }

        if (resultCode == RESULT_OK && requestCode == 2) {
            if (data.hasExtra("returnKey1")) {
                s = data.getExtras().getString("returnKey1");
                t2.setText("Bye " +s);
                t1.setText("");
            }
        }
//            if (data.hasExtra("returnKey1")) {
//                Toast.makeText(this, data.getExtras().getString("returnKey1"),
//                        Toast.LENGTH_SHORT).show();
//            }

    }
}
