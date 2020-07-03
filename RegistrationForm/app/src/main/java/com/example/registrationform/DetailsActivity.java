package com.example.registrationform;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class DetailsActivity extends AppCompatActivity {
TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);
        tv=findViewById(R.id.textView);
        String s = getIntent().getStringExtra("name");
        String s1 = getIntent().getStringExtra("roll");
        String s2 = getIntent().getStringExtra("phone");
        String s3 = getIntent().getStringExtra("email");
        String s4 = getIntent().getStringExtra("password");
        String s5 = getIntent().getStringExtra("gender");
        String s6 = getIntent().getStringExtra("branch");
        tv.setText("name :"+s+"\n"+"roll no :"+s1+"\n"+"phone no :"+s2+"\n"+"email :"+s3+"\n"+"password :"+s4+"\n"+"Gender :"+s5+"\n"+"Branch :"+s6);
    }
}