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
import com.example.smartattendance.Model.Student;
import com.example.smartattendance.R;

import java.util.ArrayList;

public class StudentEntryAdapter extends RecyclerView.Adapter<StudentEntryAdapter.ViewHolder>{

    ArrayList<Student> list;
    Context context;

    public StudentEntryAdapter(ArrayList<Student> list, Context context) {
        this.list = list;
        this.context = context;
    }
    @NonNull
    @Override
    public StudentEntryAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.students_entry, parent,false);
        return new ViewHolder(view);
    }


    @Override
    public void onBindViewHolder(@NonNull StudentEntryAdapter.ViewHolder holder, int position) {
        Log.i("Tag:", String.valueOf(list.get(0)));
        Student student = list.get(position);
        holder.studentName.setText(student.getName());
        holder.rollNumber.setText(student.getRollNo());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView studentName, rollNumber;
        ImageView checkmark;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            studentName = itemView.findViewById(R.id.name);
            rollNumber = itemView.findViewById(R.id.rollNo);
            checkmark = itemView.findViewById(R.id.checkMark);

        }

    }
}
