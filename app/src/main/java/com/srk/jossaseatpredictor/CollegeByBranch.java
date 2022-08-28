package com.srk.jossaseatpredictor;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ActionBar;
import android.app.Activity;
import android.os.Bundle;
import android.content.Intent;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Spinner;
import android.view.View;
import android.widget.Toast;

import java.util.*;


public class CollegeByBranch extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_college_by_branch);

    }

    public void onClickShow1(View V){
        Intent t=getIntent();
        String k=t.getStringExtra("branchName");
        Intent i=new Intent(this,AvailableCollegeByBranch.class);
        Spinner s1=(Spinner)findViewById(R.id.exams1);
        String examName=s1.getSelectedItem().toString();
        Spinner s2=(Spinner)findViewById(R.id.category1);
        String category=s2.getSelectedItem().toString();
        Spinner s3=(Spinner)findViewById(R.id.collegeType1);
        String collegeType=s3.getSelectedItem().toString();
        Spinner s4=(Spinner)findViewById(R.id.seatPool1);
        String seatPool=s4.getSelectedItem().toString();
        EditText mer=(EditText) findViewById(R.id.meritRank1);
        int rank=0;
        if(mer.getText().length()!=0){
            rank=Integer.parseInt((mer.getText().toString()));}
        else{
            String s="Please enter your rank!";
            int ve= Toast.LENGTH_LONG;
            Toast re=Toast.makeText(this,s,ve);
            re.show();

        }

        i.putExtra("branch",k);
        i.putExtra("examName",examName);
        i.putExtra("category",category);
        i.putExtra("collegeType",collegeType);
        i.putExtra("seatPool",seatPool);
        i.putExtra("rank",rank);
        if(mer.getText().length()!=0){
        startActivity(i);}
    }
}