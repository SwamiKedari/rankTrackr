package com.srk.jossaseatpredictor;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.*;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.view.*;
import android.widget.TextView;


import java.util.ArrayList;
import java.util.List;


public class adapter1 extends RecyclerView.Adapter<adapter1.ViewHolder>{
    private List<String> data=new ArrayList<>();
    private static Listener listener;
    public  static interface Listener{
        public void onClick(int p);
    }
    public adapter1(List<String> a){
        data=a;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder{
        private CardView cardView;
        public ViewHolder(CardView v){
            super(v);
            cardView=v;
        }

    }

    public void filterList(ArrayList<String> filterllist) {
        // below line is to add our filtered
        // list in our course array list.
        data = filterllist;
        // below line is to notify our adapter
        // as change in recycler view data.
        notifyDataSetChanged();
    }

    public static  void setListener(Listener l){
        listener=l;
    }
    public adapter1.ViewHolder onCreateViewHolder(ViewGroup parent,int viewType){

        CardView cv=(CardView) LayoutInflater.from(parent.getContext()).inflate(R.layout.cardview1,parent,false);
        return new ViewHolder(cv);

    }
    public void onBindViewHolder(ViewHolder holder , @SuppressLint("RecyclerView") int position){
        CardView c=holder.cardView;
        TextView t=(TextView) c.findViewById(R.id.cardText);
        t.setText(data.get(position));
        c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(listener!=null){
                    listener.onClick(position);
                }
            }
        });



    }
    public int getItemCount(){

        return data.size();
    }
}
