package com.singhla.lakshay.decrypt_philanthrophy;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Lakshay Singhla on 03-Feb-18.
 */

public class NgoListAdapter extends RecyclerView.Adapter<NgoListAdapter.MyViewHolder> {

    private ArrayList<NGO_Detail> list ;
    static Context context;

    public static class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView name,des,tar,id;
        public ImageView img, pay;

        public MyViewHolder(View view) {
            super(view);
            id = (TextView) view.findViewById(R.id.ngo_id);
            name = (TextView) view.findViewById(R.id.ngo_name);
            des = (TextView) view.findViewById(R.id.description);
            tar = (TextView) view.findViewById(R.id.target);
            img = (ImageView) view.findViewById(R.id.prf_img);
            pay = (ImageView) view.findViewById(R.id.pay);
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent i = new Intent(context,NGODetailActivity.class);
                    context.startActivity(i);
                }
            });
            pay.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent i = new Intent(context,PayActivity.class);
                    context.startActivity(i);
                }
            });

        }
    }


    public NgoListAdapter(ArrayList<NGO_Detail> list ,Context context) {
        this.list = list;
        this.context = context;
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.ngo_list_item, parent, false);
        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        NGO_Detail detail = list.get(position);
        holder.name.setText(detail.getName());
        holder.id.setText(detail.getId()+"");
        holder.des.setText(detail.getDescription());
        holder.tar.setText(detail.getTarget()+"");

        //Link Img here
    }
}
