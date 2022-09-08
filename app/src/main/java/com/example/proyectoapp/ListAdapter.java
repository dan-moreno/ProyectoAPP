package com.example.proyectoapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

public class ListAdapter extends RecyclerView.Adapter<ListAdapter.ViewHolder> {
    private List<ListElement> mDataSet;
    private LayoutInflater mInflater;
    private Context context;

    public ListAdapter(List<ListElement> mDataSet, Context context) {
        this.mDataSet = mDataSet;
        this.mInflater = LayoutInflater.from(context);
        this.context = context;
    }

    @Override
    public int getItemCount() {return mDataSet.size();}

    @Override
    public ListAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType){
        View view = mInflater.inflate(R.layout.list_element, null);
        return new ListAdapter.ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(final ListAdapter.ViewHolder holder, final int position){
        holder.bindData(mDataSet.get(position));
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        ImageView iconImage;
        TextView name, professor, grade;

        ViewHolder(View itemView){
            super(itemView);
            iconImage = itemView.findViewById(R.id.iconImageView);
            name = itemView.findViewById(R.id.nameTextView);
            professor = itemView.findViewById(R.id.professorTextView);
            grade = itemView.findViewById(R.id.gradeTextView);
        }

        void bindData(final ListElement item){
            name.setText(item.getName());
            professor.setText(item.getProfessor());
            grade.setText(item.getGrade());
        }
    }
}
