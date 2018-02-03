package com.singhla.lakshay.decrypt_philanthrophy;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Lakshay Singhla on 03-Feb-18.
 */

public class ListAdapter extends RecyclerView.Adapter<ListAdapter.MyViewHolder> {

    public static class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView name,des,tar,id;
        public ImageView img, pay;
        //public LinearLayout elementView;
        public MyViewHolder(View view) {
            super(view);
            id = (TextView) view.findViewById(R.id.ngo_id);
            name = (TextView) view.findViewById(R.id.ngo_name);
            des = (TextView) view.findViewById(R.id.description);
            tar = (TextView) view.findViewById(R.id.target);
            img = (ImageView) view.findViewById(R.id.prf_img);
            pay = (ImageView) view.findViewById(R.id.pay);
            
            //elementView =(LinearLayout) view.findViewById(R.id.element_view);
        }
    }

    private ArrayList<NGO_Detail> list ;

    public ListAdapter(ArrayList<NGO_Detail> list) {
        this.list = list;
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item, parent, false);
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
