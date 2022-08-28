package com.srk.jossaseatpredictor;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;

import android.app.*;

import android.app.ActionBar;
import android.content.DialogInterface;
import android.os.Bundle;
import android.content.Intent;
import android.view.*;
import android.widget.Toast;

import java.io.FileNotFoundException;
import java.io.IOException;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /*String message="This is not the official App of JoSAA\n\nWe have tried our best to verify the data\n\nWe are not liable for any kind of mistake or error in the information";
        if(college1.i==0){
        for(int i=0;i<4;i++){
            Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
        }
        college1.i++;}*/
        try {
            college1.collegeBranchList=college1.getDataOf(getAssets().open("collegeBranches.txt"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            college1.quota=college1.getDataOf(getAssets().open("quota1.txt"));
        }
        catch (IOException e){
            e.printStackTrace();
        }
        try {
            college1.colleges=college1.getDataOf(getAssets().open("collegeName.txt"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            college1.categoryList=college1.getDataOf(getAssets().open("category.txt"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            college1.genderList=college1.getDataOf(getAssets().open("gender.txt"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            college1.closingRankList=college1.getDataOfInteger(getAssets().open("closingRank.txt"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            college1.openingRankList=college1.getDataOfInteger(getAssets().open("openingRank.txt"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            college1.branchNameList=college1.getDataOf(getAssets().open("branchNameList.txt"));
        } catch (IOException e) {
            e.printStackTrace();
        }





    }

    public void onClickCutOff(View v){
        Intent i=new Intent(this, MainActivity2.class);
        startActivity(i);
    }
    public void onClickCollege(View v){
        Intent i=new Intent(this,CollegeActivity.class);

        startActivity(i);
    }
    public void onClickBranch(View v){
        Intent i=new Intent(this,BranchActivity.class);
        startActivity(i);
    }
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.menu,menu);
        return super.onCreateOptionsMenu(menu);
    }
    public boolean onOptionsItemSelected(MenuItem item ){
        switch(item.getItemId()){
            case R.id.shareButton:
                Intent a=new Intent(Intent.ACTION_SEND);
                a.setType("text/plain");
                a.putExtra(Intent.EXTRA_TEXT,"Download the JoSAA Seat Predictor App available on Playstore");
                Intent b=Intent.createChooser(a,"Send Message via........");
                startActivity(b);
                return true;
            case R.id.creator:
                Intent v=new Intent(this,aboutUs.class);
                startActivity(v);
            default:
                return super.onOptionsItemSelected(item);

        }
    }

    public void onBackPressed() {


            // Otherwise, ask user if he wants to leave :)
            new androidx.appcompat.app.AlertDialog.Builder(this)
                    .setTitle("Really Exit?")
                    .setMessage("Are you sure you want to exit?")
                    .setNegativeButton(android.R.string.no, null)
                    .setPositiveButton(android.R.string.yes, new DialogInterface.OnClickListener() {

                        public void onClick(DialogInterface arg0, int arg1) {
                            MainActivity.super.onBackPressed();
                        }
                    }).create().show();

    }
}