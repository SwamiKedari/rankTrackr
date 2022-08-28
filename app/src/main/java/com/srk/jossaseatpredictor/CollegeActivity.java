package com.srk.jossaseatpredictor;

import android.app.ActionBar;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.app.ListActivity;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.*;

import android.widget.ListView;
import android.widget.SearchView;
import android.widget.Spinner;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class CollegeActivity extends AppCompatActivity {
    public String name;
    public String type;
    public ArrayAdapter<String> listAdapter;
    public ArrayList<String> ve=null;
    private ArrayList<String> filteredlist;
    private List<String> data;
    private int check =0;
    public adapter1 a=null;
    private int check1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_colleges);






    }
    public void onClickShow2(View v) throws IOException {
        Spinner s=(Spinner)findViewById(R.id.collegeType2);

         ve=college1.getDataOf(getAssets().open("collegeNameList.txt"));
        college1.collegeNameList=ve;
         //listAdapter=null;
         a=null;

        String t=s.getSelectedItem().toString();
        check1=1;

        if(t.equals("All")){
         //listAdapter=new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,ve);
            data=ve;
            a=new adapter1(ve);}
        else if(t.equals("IITs")){
             //listAdapter=new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,ve.subList(0,23));
            data=ve.subList(0,23);
            a=new adapter1( ve.subList(0,23));

        }
        else if(t.equals("NITs")){
            //listAdapter=new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,ve.subList(24,55));
            data=ve.subList(23,55);
            a=new adapter1( ve.subList(23,55));
        }
        else if(t.equals("IIITs")){
            //listAdapter=new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,ve.subList(56,81));
            data=ve.subList(55,81);
            a=new adapter1(ve.subList(55,81));
        }
        else{
            //listAdapter=new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,ve.subList(82,114));
            data=ve.subList(81,114);
            a=new adapter1(ve.subList(81,114));
        }
        //stView k = (ListView)findViewById(R.id.collegelist);0
        RecyclerView k= findViewById(R.id.textList);
        LinearLayoutManager linearLayoutManager=new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false);
        k.setLayoutManager(linearLayoutManager);

        k.setAdapter(a);

        adapter1.setListener(new adapter1.Listener() {
            @Override
            public void onClick(int p) {
                Intent i=new Intent(CollegeActivity.this,CollegeDetails.class);
                if(check==0){
                i.putExtra("selectedCollege",data.get(p));
                startActivity(i);}
                else{
                    i.putExtra("selectedCollege",filteredlist.get(p));
                    startActivity(i);
                }

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
                filter(newText);
                check=1;
                return false;
            }
        });
        return true;
    }

    private void filter(String text) {
        // creating a new array list to filter our data.
        if(check1==1){
         filteredlist = new ArrayList<>();

        // running a for loop to compare elements.
        for (String item : data) {
            // checking if the entered string matched with any item of our recycler view.
            if (item.toLowerCase().contains(text.toLowerCase())) {
                // if the item is matched we are
                // adding it to our filtered list.
                filteredlist.add(item);
            }
        }
        a.filterList(filteredlist);
        /*if (filteredlist.isEmpty()) {
            // if no item is added in filtered list we are
            // displaying a toast message as no data found.
            Toast.makeText(this, "No Data Found..", Toast.LENGTH_SHORT).show();
        } else {
            // at last we are passing that filtered
            // list to our adapter class.
            a.filterList(filteredlist);
        }*/
    }}


}





/* AdapterView.OnItemClickListener l= new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String r=parent.getItemAtPosition(position).toString();
                Spinner g=(Spinner)findViewById(R.id.collegeType2);
                 type=g.getSelectedItem().toString();
                String[] collegename=r.split("\n");
                name=collegename[0];
                Intent i=new Intent(CollegeActivity.this,CollegeDetails.class);
                i.putExtra("selectedCollege",collegename[0]);
                i.putExtra("collegeType",type);
                CollegeActivity.this.startActivity(i);


            }
        };
        k.setOnItemClickListener(l);*/








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
                listAdapter.getFilter().filter(newText);
                return false;
            }
        });
        return super.onCreateOptionsMenu(menu);
    }*/