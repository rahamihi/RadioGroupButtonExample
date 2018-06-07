package com.example.mamun.radiogroupbuttonexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TabHost;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private RadioGroup radiogp1;
    private RadioButton cameleyatea,blackcoffee,greentea,chinaspecialtea,selectedButton;
    private Button submit;
    private int getSelected;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        radiogp1 = (RadioGroup) findViewById(R.id.radiogp1);
        submit = (Button) findViewById(R.id.submit);


        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getSelected = radiogp1.getCheckedRadioButtonId();
                selectedButton = (RadioButton) findViewById(getSelected);

                Toast.makeText(getApplicationContext(),selectedButton.getText().toString(), Toast.LENGTH_LONG).show();

            }
        });


    }
}
