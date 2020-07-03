package com.example.registrationform;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
EditText roll,name,phone,email,pass;
RadioButton male,female,cse,ece,mech,civil,bba;
String gender,branch;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        roll=findViewById(R.id.editTextTextPersonName4);
        name=findViewById(R.id.editTextTextPersonName5);
        phone=findViewById(R.id.editTextPhone);
        email=findViewById(R.id.editTextTextEmailAddress);
        pass=findViewById(R.id.editTextTextPassword);
        male=findViewById(R.id.radioButton);
        female=findViewById(R.id.radioButton2);
        cse=findViewById(R.id.radioButton3);
        ece=findViewById(R.id.radioButton4);
        mech=findViewById(R.id.radioButton5);
        civil=findViewById(R.id.radioButton6);
        bba=findViewById(R.id.radioButton7);
    }

    public void submit(View view) {
        String data_name=name.getText().toString();
        String data_roll=roll.getText().toString();
        String data_phone=phone.getText().toString();
        String data_email=email.getText().toString();
        String data_pass=pass.getText().toString();
        if(male.isChecked()){
            gender=male.getText().toString();
        }
        if(female.isChecked()){
            gender=female.getText().toString();
        }
        if (cse.isChecked()){
            branch=cse.getText().toString();
        }
        if (ece.isChecked()){
            branch=ece.getText().toString();
        }
        if (mech.isChecked()){
            branch=mech.getText().toString();
        }
        if (civil.isChecked()){
            branch=civil.getText().toString();
        }
        if (bba.isChecked()){
            branch=bba.getText().toString();
        }

        if(data_name.isEmpty()||data_roll.isEmpty()||data_phone.isEmpty()||data_email.isEmpty()||data_pass.isEmpty()||gender.isEmpty()||branch.isEmpty()){
            Toast.makeText(this, "Please Enter the Form Details", Toast.LENGTH_SHORT).show();
        }
        else{
            Intent i = new Intent(MainActivity.this,DetailsActivity.class);
            i.putExtra("name",data_name);
            i.putExtra("roll",data_roll);
            i.putExtra("phone",data_phone);
            i.putExtra("email",data_email);
            i.putExtra("password",data_pass);
            i.putExtra("gender",gender);
            i.putExtra("branch",branch);
            startActivity(i);
        }
    }
}