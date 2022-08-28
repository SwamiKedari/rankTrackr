package com.srk.jossaseatpredictor;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.content.Intent;
import android.widget.EditText;
import android.widget.Spinner;
import android.app.*;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

    }
    public void onClickShow(View v){
        Intent i=new Intent(this,ListOfBranches.class);
        Spinner s1=(Spinner)findViewById(R.id.exams);
        String examName=(String)s1.getSelectedItem();
        Spinner s2=(Spinner)findViewById(R.id.category);
        String category=(String)s2.getSelectedItem();
        Spinner s3=(Spinner)findViewById(R.id.collegeType);
        String collegeType=(String)s3.getSelectedItem();
        Spinner s4=(Spinner)findViewById(R.id.seatPool);
        String seatPool=(String)s4.getSelectedItem();
        EditText a=(EditText) findViewById(R.id.meritRank);
        int q=0;
        if(a.getText().length()!=0){
         q=Integer.parseInt((a.getText().toString()));}
        else{
            String s="Please enter your rank!";
            int k= Toast.LENGTH_LONG;
            Toast re=Toast.makeText(this,s,k);
            re.show();

        }
        i.putExtra("examName",examName);
        i.putExtra("category",category);
        i.putExtra("collegeType",collegeType);
        i.putExtra("seatPool",seatPool);
        i.putExtra("rank",q);

        if(a.getText().length()!=0){
        startActivity(i);}
    }
}