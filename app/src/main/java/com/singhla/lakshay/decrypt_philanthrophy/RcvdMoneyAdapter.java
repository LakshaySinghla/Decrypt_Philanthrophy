package com.singhla.lakshay.decrypt_philanthrophy;

import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Lakshay Singhla on 21-Mar-18.
 */

public class RcvdMoneyAdapter extends RecyclerView.Adapter<RcvdMoneyAdapter.MyViewHolder> {

    public static class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView name, amt;

        public MyViewHolder(View view) {
            super(view);
            amt = (TextView) view.findViewById(R.id.amount);
            name = (TextView) view.findViewById(R.id.name);

        }
    }

    ArrayList<NGO_Detail> list = new ArrayList<>();

    public RcvdMoneyAdapter(ArrayList<NGO_Detail> list){
        this.list=list;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.rcvd_list_item, parent, false);
        return new MyViewHolder(itemView);
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        holder.name.setText( list.get(position).getName() );
        holder.amt.setText( list.get(position).getTarget() + "" );
    }
}
