package com.example.tms_security;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class Adapter extends RecyclerView.Adapter<Adapter.ViewHolder>{
    ArrayList<Model> arrayList;
    Context context;

    public Adapter(ArrayList<Model> arrayList, Context context) {
        this.arrayList = arrayList;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(context).inflate(R.layout.list,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        Model model=arrayList.get(position);

        holder.id.setText(model.getVisitor_Id());
        holder.name.setText(model.getGuest_full_name());
        holder.d_no.setText(model.getDoor_No());
       // holder.date.setText(model.getGuest_Date());

    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder{

        TextView id,name,d_no;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            id=itemView.findViewById(R.id.vid);
            name=itemView.findViewById(R.id.vname);
            d_no=itemView.findViewById(R.id.Dno);
            //time=itemView.findViewById(R.id.txttime);

        }
    }
}
