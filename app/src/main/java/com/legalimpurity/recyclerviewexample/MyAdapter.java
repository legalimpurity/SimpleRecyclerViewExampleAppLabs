package com.legalimpurity.recyclerviewexample;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.Adapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

public class MyAdapter extends Adapter<MyAdapter.MyViewHolder> {

    private ArrayList<String> studentName;
    private ArrayList<String> studentClass;

    MyAdapter(ArrayList<String> studentName, ArrayList<String> studentClass)
    {
     this.studentClass = studentClass;
     this.studentName = studentName;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View v =
        LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.item_simple_list_view_item
                        ,viewGroup,
                        false);
        return new MyAdapter.MyViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder myViewHolder, int i) {
        myViewHolder.studentClass.setText(studentClass.get(i));
        myViewHolder.studentName.setText(studentName.get(i));
    }

    @Override
    public int getItemCount() {
        return studentName.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder
    {

        public TextView studentName;
        public TextView studentClass;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            studentName = itemView.findViewById(R.id.student_name);
            studentClass = itemView.findViewById(R.id.student_class);
        }
    }
}
