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




public class adapter2 extends RecyclerView.Adapter<adapter2.ViewHolder>{
    private List<String> data=new ArrayList<>();
    private static Listener listener;
    public  static interface Listener{
        public void onClick(int p);
    }
    public adapter2(List<String> a){
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
    public adapter2.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType){

        CardView cv=(CardView) LayoutInflater.from(parent.getContext()).inflate(R.layout.cardview2,parent,false);
        return new ViewHolder(cv);

    }
    public void onBindViewHolder(ViewHolder holder , @SuppressLint("RecyclerView") int position){
        String[] strings=data.get(position).split("\n");
        CardView c=holder.cardView;
        TextView t=(TextView) c.findViewById(R.id.collgenameofcard);
        t.setText(strings[0]);
        TextView u=c.findViewById(R.id.branchnameofcard);
        u.setText(strings[1]);
        TextView f=c.findViewById(R.id.openingrankofcard);
        f.setText(strings[2]);
        TextView g=c.findViewById(R.id.closingrankofcard);
        g.setText(strings[3]);
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
