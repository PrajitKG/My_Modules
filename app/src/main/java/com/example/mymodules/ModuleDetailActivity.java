package com.example.mymodules;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class ModuleDetailActivity extends AppCompatActivity {

    TextView tvAnswer;
    TextView tvAnswer2;

    TextView tvAnswer3;

    TextView tvAnswer4;

    TextView tvAnswer5;

    TextView tvAnswer6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_module_detail);

        tvAnswer = findViewById(R.id.textViewModCode);
        tvAnswer2 = findViewById(R.id.textViewModName);
        tvAnswer3 = findViewById(R.id.textViewAcadYr);
        tvAnswer4 = findViewById(R.id.textViewSem);
        tvAnswer5 = findViewById(R.id.textViewModCred);
        tvAnswer6 = findViewById(R.id.textViewVenue);
        Intent intentReceived = getIntent();
        String ModCode = intentReceived.getStringExtra("Module Code:");
        tvAnswer.setText("Module Code: " + ModCode);

        String ModName = intentReceived.getStringExtra("Module Name:");
        tvAnswer2.setText("Module Name: " + ModName);

        String AcadYr = intentReceived.getStringExtra("Academic Year:");
        tvAnswer3.setText("Academic Year: " + AcadYr);

        String Sem = intentReceived.getStringExtra("Semester:");
        tvAnswer4.setText("Semester: " + Sem);

        String ModCred = intentReceived.getStringExtra("Module Credit:");
        tvAnswer5.setText("Module Credit: " + ModCred);

        String Venue = intentReceived.getStringExtra("Venue:");
        tvAnswer6.setText("Venue: " + Venue);







    }
}