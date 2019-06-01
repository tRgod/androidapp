package com.example.myapplication;


import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.widget.RecyclerView;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

public class ShopAdapter extends RecyclerView.Adapter <ShopAdapter.MyViewHolder> {
    Context context;
    ArrayList<Catagory>Catagoty;

    public  ShopAdapter (Context c, ArrayList<Catagory >p)
    {
        context=c;
        Catagoty=p;
    }
    @Nullable
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int i) {
        return new MyViewHolder(LayoutInflater.from(context).inflate(R.layout.shopview, parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder myViewHolder, int position) {
       myViewHolder.decription.setText(Catagoty.get(position).getDiscription());
       myViewHolder.price.setText(Catagoty.get(position).getPrice());
       myViewHolder.name.setText(Catagoty.get(position).getName());
       myViewHolder.Catagory.setText(Catagoty.get(position).getCatagory());

    }

    @Override
    public int getItemCount() {
        return Catagoty.size();
    }

    class  MyViewHolder extends RecyclerView.ViewHolder
    {
        TextView Catagory, name, price, decription;

        public MyViewHolder( View itemView) {
            super(itemView);
            Catagory=(TextView) itemView.findViewById(R.id.Catagory);
            name= (TextView) itemView.findViewById(R.id.Name);
            price=(TextView) itemView.findViewById(R.id.Price);
            decription=(TextView) itemView.findViewById(R.id.Discription);
        }
    }
}
