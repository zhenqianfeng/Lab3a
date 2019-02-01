package com.concordia.cejv669.lab3a;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Button b = findViewById(R.id.btn_rtn1);

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                EditText et1 = findViewById(R.id.txt_rtn);
                String rtnmsg = et1.getText().toString();

                Intent data = new Intent();
                data.putExtra("returnKey1", rtnmsg);

                setResult(RESULT_OK, data);
                //       super.finish();
                Main2Activity.this.finish();
            }
        });




    }
}
