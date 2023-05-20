package com.example.mymodules;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tvAP;
    TextView tvIP;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvAP = findViewById(R.id.textViewAP);
        tvIP = findViewById(R.id.textViewIP);

        tvAP.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ModuleDetailActivity.class);
                intent.putExtra("Module Code:","C346");
                intent.putExtra("Module Name:","Android Programming");
                intent.putExtra("Academic Year:","2020");
                intent.putExtra("Semester:","1");
                intent.putExtra("Module Credit:","4");
                intent.putExtra("Venue:","W66M");
                startActivity(intent);







            }
        });
        tvIP.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ModuleDetailActivity.class);
                intent.putExtra("Module Code:","C349");
                intent.putExtra("Module Name:","Ipad Programming");
                intent.putExtra("Academic Year:","2021");
                intent.putExtra("Semester:","2");
                intent.putExtra("Module Credit:","6");
                intent.putExtra("Venue:","E63A");
                startActivity(intent);

            }
        });


    }
}