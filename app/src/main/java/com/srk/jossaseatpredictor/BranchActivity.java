package com.srk.jossaseatpredictor;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.app.ActionBar;
import android.app.Activity;
import android.content.*;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.content.Intent;
import android.widget.SearchView;
import android.widget.Toast;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class BranchActivity extends AppCompatActivity {
    ArrayAdapter<String> a;
    ArrayList<String> filteredlist;
    private int in=0;

    public adapter1 adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_branch);




        /*ListView t = (ListView) findViewById(R.id.branches);
         a = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, college1.branchNameList);
        t.setAdapter(a);*/
        RecyclerView r=findViewById(R.id.branchList);
        LinearLayoutManager l=new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false);
        r.setLayoutManager(l);


        adapter=new adapter1(college1.branchNameList);
        r.setAdapter(adapter);


        adapter1.setListener(new adapter1.Listener() {
            @Override
            public void onClick(int p) {
                Intent i=new Intent(BranchActivity.this,CollegeByBranch.class);
                i.putExtra("number",p);
                String a=null;
                if(in==0){
                    a=college1.branchNameList.get(p);
                }
                else{
                    a=filteredlist.get(p);
                }
                i.putExtra("branchName",a);
                startActivity(i);

            }
        });

    }


    public boolean onCreateOptionsMenu(Menu menu) {
        // below line is to get our inflater
        //MenuInflater inflater = getMenuInflater();
        getMenuInflater().inflate(R.menu.menu1,menu);

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
                in=1;
                filter(newText);
                return false;
            }
        });
        return true;
    }

    private void filter(String text) {
        // creating a new array list to filter our data.
         filteredlist = new ArrayList<>();


        // running a for loop to compare elements.
        for (String item : college1.branchNameList) {
            // checking if the entered string matched with any item of our recycler view.
            if (item.toLowerCase().contains(text.toLowerCase())) {
                // if the item is matched we are
                // adding it to our filtered list.

                filteredlist.add(item);}

        }
        /*if (filteredlist.isEmpty()) {
            // if no item is added in filtered list we are
            // displaying a toast message as no data found.
            Toast.makeText(this, "No Data Found..", Toast.LENGTH_SHORT).show();
        } else {
            // at last we are passing that filtered
            // list to our adapter class.
            adapter.filterList(filteredlist);
        }*/
        adapter.filterList(filteredlist);
    }

}


/*public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.menu1,menu);
        MenuItem menuItem=menu.findItem(R.id.search);
        SearchView searchView=(SearchView)menuItem.getActionView();
        searchView.setQueryHint("Type here to search");

        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                a.getFilter().filter(newText);
                return false;
            }
        });
        return super.onCreateOptionsMenu(menu);
    }*/

        /*AdapterView.OnItemClickListener listener = new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent i = new Intent(BranchActivity.this,CollegeByBranch.class);
                String branch=parent.getItemAtPosition(position).toString();
                i.putExtra("branch",branch);
                startActivity(i);*/
                /*if (position == 0) {
                    i.putExtra("CollegeIndex",0);
                    startActivity(i);
                }
                else if(position==1){
                    i.putExtra("CollegeIndex",1);
                    startActivity(i);
                }
                else if(position==2){
                    i.putExtra("CollegeIndex",2);
                    startActivity(i);
                }
                else if(position==3){
                    i.putExtra("CollegeIndex",3);
                    startActivity(i);
                }
                else if(position==4){
                    i.putExtra("CollegeIndex",4);
                    startActivity(i);
                }
                else if(position==5){
                    i.putExtra("CollegeIndex",5);
                    startActivity(i);
                }
                else if(position==6){
                    i.putExtra("CollegeIndex",6);
                    startActivity(i);
                }
                else if(position==7){
                    i.putExtra("CollegeIndex",7);
                    startActivity(i);
                }
                else if(position==8){
                    i.putExtra("CollegeIndex",8);
                    startActivity(i);
                }
                else if(position==9){
                    i.putExtra("CollegeIndex",9);
                    startActivity(i);
                }
                else if(position==10){
                    i.putExtra("CollegeIndex",10);
                    startActivity(i);
                }
                else if(position==11){
                    i.putExtra("CollegeIndex",11);
                    startActivity(i);
                }
                else if(position==12){
                    i.putExtra("CollegeIndex",12);
                    startActivity(i);
                }
                else if(position==13){
                    i.putExtra("CollegeIndex",13);
                    startActivity(i);
                }
                else if(position==14){
                    i.putExtra("CollegeIndex",14);
                    startActivity(i);
                }
                else if(position==15){
                    i.putExtra("CollegeIndex",15);
                    startActivity(i);
                }
                else if(position==16){
                    i.putExtra("CollegeIndex",16);
                    startActivity(i);
                }
                else if(position==17){
                    i.putExtra("CollegeIndex",17);
                    startActivity(i);
                }
                else if(position==18){
                    i.putExtra("CollegeIndex",18);
                    startActivity(i);
                }
                else if(position==19){
                    i.putExtra("CollegeIndex",19);
                    startActivity(i);
                }
                else if(position==20){
                    i.putExtra("CollegeIndex",20);
                    startActivity(i);
                }
                else if(position==21){
                    i.putExtra("CollegeIndex",21);
                    startActivity(i);
                }
                else if(position==22){
                    i.putExtra("CollegeIndex",22);
                    startActivity(i);
                }
                else if(position==23){
                    i.putExtra("CollegeIndex",23);
                    startActivity(i);
                }
                else if(position==24){
                    i.putExtra("CollegeIndex",24);
                    startActivity(i);
                }
                else if(position==25){
                    i.putExtra("CollegeIndex",25);
                    startActivity(i);
                }
                else if(position==26){
                    i.putExtra("CollegeIndex",26);
                    startActivity(i);
                }
                else if(position==27){
                    i.putExtra("CollegeIndex",27);
                    startActivity(i);
                }
                else if(position==28){
                    i.putExtra("CollegeIndex",28);
                    startActivity(i);
                }
                else if(position==29){
                    i.putExtra("CollegeIndex",29);
                    startActivity(i);
                }
                else if(position==30){
                    i.putExtra("CollegeIndex",30);
                    startActivity(i);
                }
                else if(position==31){
                    i.putExtra("CollegeIndex",31);
                    startActivity(i);
                }
                else if(position==32){
                    i.putExtra("CollegeIndex",32);
                    startActivity(i);
                }
                else if(position==33){
                    i.putExtra("CollegeIndex",33);
                    startActivity(i);
                }
                else if(position==34){
                    i.putExtra("CollegeIndex",34);
                    startActivity(i);
                }
                else if(position==35){
                    i.putExtra("CollegeIndex",35);
                    startActivity(i);
                }
                else if(position==36){
                    i.putExtra("CollegeIndex",36);
                    startActivity(i);
                }
                else if(position==37){
                    i.putExtra("CollegeIndex",37);
                    startActivity(i);
                }
                else if(position==38){
                    i.putExtra("CollegeIndex",38);
                    startActivity(i);
                }
                else if(position==39){
                    i.putExtra("CollegeIndex",39);
                    startActivity(i);
                }
                else if(position==40){
                    i.putExtra("CollegeIndex",40);
                    startActivity(i);
                }
                else if(position==41){
                    i.putExtra("CollegeIndex",41);
                    startActivity(i);
                }
                else if(position==42){
                    i.putExtra("CollegeIndex",42);
                    startActivity(i);
                }
                else if(position==43){
                    i.putExtra("CollegeIndex",43);
                    startActivity(i);
                }
                else {
                    i.putExtra("CollegeIndex",44);
                    startActivity(i);
                }



            }

        };
        t.setOnItemClickListener(listener);*/