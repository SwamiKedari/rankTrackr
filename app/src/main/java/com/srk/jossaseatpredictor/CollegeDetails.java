package com.srk.jossaseatpredictor;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.app.ActionBar;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.SearchView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

import java.io.IOException;
import java.util.ArrayList;

public class CollegeDetails extends AppCompatActivity {
    private ArrayList<String> filteredlist;
    private ArrayList<String> details;
    private adapter4 a;
    private int check=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_college_details);

        Intent i=getIntent();
        String k=i.getStringExtra("selectedCollege");
        String name=k.split("\n")[0];

        TextView n=(TextView)findViewById(R.id.collegeName);
        n.setText(name);



    }











    public void onClickShow3(View view){

        Intent i=getIntent();
        String ro="The numbers are opening rank and closing rank respectively !";
        Toast.makeText(this, ro, Toast.LENGTH_SHORT).show();
        check=1;
        String k=i.getStringExtra("selectedCollege");
        String name=k.split("\n")[0];


        Spinner s1=(Spinner)findViewById(R.id.seatcategory);
        String seatPool=s1.getSelectedItem().toString();
        Spinner s2=(Spinner) findViewById(R.id.category);
        String category=s2.getSelectedItem().toString();
         details=college1.collegeDetails(name,seatPool,category);
        college1.Sort(details,0,details.size()-1);
        RecyclerView r=findViewById(R.id.branchListOfColleges);
        a=new adapter4(details);
        r.setAdapter(a);
        LinearLayoutManager linearLayoutManager=new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false);
        r.setLayoutManager(linearLayoutManager);
        adapter4.setListener(new adapter4.Listener() {
            @Override
            public void onClick(int p) {




            }
        });


    }
    public boolean onCreateOptionsMenu(Menu menu) {
        // below line is to get our inflater
        //MenuInflater inflater = getMenuInflater();

            getMenuInflater().inflate(R.menu.menu1, menu);

            // inside inflater we are inflating our menu file.
            //inflater.inflate(R.menu.search_menu, menu);

            // below line is to get our menu item.
            MenuItem searchItem = menu.findItem(R.id.search);

            // getting search view of our item.
            SearchView searchView = (SearchView) searchItem.getActionView();

            // below line is to call set on query text listener method.

            searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
                @Override
                public boolean onQueryTextSubmit(String query) {
                    return false;
                }

                @Override
                public boolean onQueryTextChange(String newText) {
                    // inside on query text change method we are
                    // calling a method to filter our recycler view.

                    filter(newText);
                    return false;
                }
            });


        return true;}

    private void filter(String text) {
        // creating a new array list to filter our data.
        if(check==1){
        filteredlist = new ArrayList<>();


        // running a for loop to compare elements.
        for (String item : details) {
            // checking if the entered string matched with any item of our recycler view.
            if (item.toLowerCase().contains(text.toLowerCase())) {
                // if the item is matched we are
                // adding it to our filtered list.


                filteredlist.add(item);}

        }

        a.filterList(filteredlist);}
    }

}