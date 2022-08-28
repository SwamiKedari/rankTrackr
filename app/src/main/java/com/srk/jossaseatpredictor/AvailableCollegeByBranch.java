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
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.SearchView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class AvailableCollegeByBranch extends AppCompatActivity {
    public String college;
    public String name;
    public ArrayAdapter<String> c;
    private adapter3 f;
    private ArrayList<String> filteredlist;
    private int in=0;
    private ArrayList<String> avaColleges;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_available_college_by_branch);


        Intent t=getIntent();
        String k=t.getStringExtra("branch");
        String examName=t.getStringExtra("examName");


        String category=t.getStringExtra("category");
        int rank=t.getIntExtra("rank",0);
        String collegeType=t.getStringExtra("collegeType");
        String seatPool=t.getStringExtra("seatPool");
         avaColleges=(college1.classifyByBranch(examName,category,rank,collegeType,seatPool,k));
         college1.Sort(avaColleges,0,avaColleges.size()-1);

        RecyclerView r=findViewById(R.id.listOfCollegesByBranch);
        f=new adapter3(avaColleges);
        r.setAdapter(f);
        LinearLayoutManager linearLayoutManager=new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false);
        r.setLayoutManager(linearLayoutManager);

        TextView text=(TextView)findViewById(R.id.branch);
        text.setText(k+" ("+collegeType+")");
        if(avaColleges.isEmpty()){
            String tex="Sorry , No Match Found ! :(";
            int dura=Toast.LENGTH_SHORT;
            Toast toa=Toast.makeText(this,tex,dura);
            toa.show();
        }
        else{
            String to="The numbers are opening rank and closing rank respectively ! ";

            for(int i=1;i<2;i++){
                Toast toast1=Toast.makeText(this,to,Toast.LENGTH_SHORT);
                toast1.show();}


        }

        adapter3.setListener(new adapter3.Listener() {
            @Override
            public void onClick(int p) {
                Intent i=new Intent(AvailableCollegeByBranch.this,CollegeDetails.class);
                if(in==0) {
                    i.putExtra("selectedCollege", avaColleges.get(p));
                }
                else{
                    i.putExtra("selectedCollege",filteredlist.get(p));
                }
                startActivity(i);
            }
        });

        /*AdapterView.OnItemClickListener listener=new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String r = parent.getItemAtPosition(position).toString();
                Intent t = getIntent();
                college = t.getStringExtra("collegeType");
                String[] collegename = r.split("\n");
                name=collegename[0];
                Intent i = new Intent(AvailableCollegeByBranch.this, CollegeDetails.class);
                i.putExtra("selectedCollege", collegename[0]);
                i.putExtra("collegeType", college);
                AvailableCollegeByBranch.this.startActivity(i);

            }

        };
        l.setOnItemClickListener(listener);*/

    }
   /* public boolean onCreateOptionsMenu(Menu menu){
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
                c.getFilter().filter(newText);
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
        for (String item : avaColleges) {
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
        f.filterList(filteredlist);
    }

}