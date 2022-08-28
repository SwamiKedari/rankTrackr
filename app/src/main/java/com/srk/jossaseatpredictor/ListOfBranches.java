package com.srk.jossaseatpredictor;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.app.ActionBar;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.SearchView;
import android.widget.TextView;
import android.widget.Toast;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class ListOfBranches extends AppCompatActivity {
    public ArrayAdapter<String> b;
    public String selectedCollege;
    public String Type;
    private int check=0;
    private ArrayList<String> filteredlist;
    private ArrayList<String> a;
    private adapter2 adapter;
    @SuppressLint("ResourceAsColor")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_of_branches);

        //ListView hg=(ListView) findViewById(R.id.availableColleges);

        Intent t=getIntent();
        String examName=t.getStringExtra("examName");

        String category=t.getStringExtra("category");
        String collegeType=t.getStringExtra("collegeType");
        String seatPool=t.getStringExtra("seatPool");
        int rank=t.getIntExtra("rank",0);
         a=college1.classifyBydata(examName,category,rank,collegeType,seatPool);
         college1.Sort(a,0,a.size()-1);
        if(a.isEmpty()){
        String text="Sorry , No Match Found ! :(";
        int duration = Toast.LENGTH_SHORT;
        Toast toast=Toast.makeText(this,text,duration);
        toast.show();
        }
        else{
            String to="The numbers are opening rank and closing rank respectively ! ";
            for(int i=0;i<1;i++){
                Toast toast1=Toast.makeText(this,to,Toast.LENGTH_SHORT);
                toast1.show();}

        }

       /* TextView textView=(TextView)findViewById(R.id.avaiColleges);
        textView.setText("Category: "+category+"\n"+"College Type: "+collegeType);*/
        RecyclerView r=findViewById(R.id.listOfSeats);
        adapter=new adapter2(a);
        r.setAdapter(adapter);
        LinearLayoutManager layoutManager=new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false);
        r.setLayoutManager(layoutManager);
        adapter2.setListener(new adapter2.Listener() {
            @Override
            public void onClick(int p) {
                Intent i=new Intent(ListOfBranches.this,CollegeDetails.class);
                if(check==0){
                i.putExtra("selectedCollege",a.get(p));
                }
                else{
                    i.putExtra("selectedCollege",filteredlist.get(p));
                }
                startActivity(i);

            }
        });


         /*b=new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,a);
        hg.setAdapter(b);
        AdapterView.OnItemClickListener listener=new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String r = parent.getItemAtPosition(position).toString();
                String[] collegename = r.split("\n");
                selectedCollege=collegename[0];
                Intent t = getIntent();
                Type = t.getStringExtra("collegeType");
                Intent i = new Intent(ListOfBranches.this, CollegeDetails.class);
                i.putExtra("selectedCollege", selectedCollege);
                i.putExtra("collegeType",Type);
                ListOfBranches.this.startActivity(i);

            }

        };
        hg.setOnItemClickListener(listener);*/

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
                b.getFilter().filter(newText);
                return false;
            }
        });
        return super.onCreateOptionsMenu(menu);
    }*/

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
        filteredlist = new ArrayList<>();

        // running a for loop to compare elements.
        for (String item : a) {
            // checking if the entered string matched with any item of our recycler view.
            if (item.toLowerCase().contains(text.toLowerCase())) {
                // if the item is matched we are
                // adding it to our filtered list.
                filteredlist.add(item);
            }
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

