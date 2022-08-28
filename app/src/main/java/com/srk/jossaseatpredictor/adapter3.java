package com.srk.jossaseatpredictor;

import android.annotation.SuppressLint;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class adapter3 extends RecyclerView.Adapter<adapter3.ViewHolder>{
    private List<String> data=new ArrayList<>();
    private static adapter3.Listener listener;
    public  static interface Listener{
        public void onClick(int p);
    }
    public adapter3(List<String> a){
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

    public static  void setListener(adapter3.Listener l){
        listener=l;
    }
    public adapter3.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType){

        CardView cv=(CardView) LayoutInflater.from(parent.getContext()).inflate(R.layout.cardview3,parent,false);
        return new adapter3.ViewHolder(cv);

    }
    public void onBindViewHolder(adapter3.ViewHolder holder , @SuppressLint("RecyclerView") int position){
        String[] strings=data.get(position).split("\n");
        CardView c=holder.cardView;
        TextView t=(TextView) c.findViewById(R.id.collgenameofbranchcard);
        TextView f=(TextView) c.findViewById(R.id.openingrankofbranchcard);
        TextView g=(TextView) c.findViewById(R.id.closingrankofbranchcard);
        TextView q=c.findViewById(R.id.quota);
        if(strings.length==4){
            t.setText(strings[0]);
            q.setText(strings[1]);
            f.setText(strings[2]);
            g.setText(strings[3]);
        }
        else{
        String head=strings[0];
        t.setText(head);
        f.setText(strings[2]);
        g.setText(strings[3]);}
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
