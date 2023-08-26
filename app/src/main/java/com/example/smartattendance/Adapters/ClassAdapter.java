package com.example.smartattendance.Adapters;


import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.smartattendance.AttendanceActivity;
import com.example.smartattendance.Model.Classes;
import com.example.smartattendance.R;

import java.util.ArrayList;

public class ClassAdapter extends RecyclerView.Adapter<ClassAdapter.ViewHolder>{

    ArrayList<Classes> list;
    Context context;

    public ClassAdapter(ArrayList<Classes> list, Context context) {
        this.list = list;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.text_view_classes, parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Log.i("Tag:", String.valueOf(list.get(0)));

        Classes classes = list.get(position);
        holder.className.setText(classes.getClassName());
        holder.subjectName.setText(classes.getSubjectName());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context, AttendanceActivity.class);
                intent.putExtra("className", classes.getClassName());
                intent.putExtra("subjectName",classes.getSubjectName());
                context.startActivity(intent);
            }
        });

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView className, subjectName;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            className = itemView.findViewById(R.id.classes);
            subjectName = itemView.findViewById(R.id.subject);

        }
    }
}

