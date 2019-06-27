package com.edicoding.picodiploma.recyclerview.adapter;

import android.media.Image;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.edicoding.picodiploma.recyclerview.R;
import com.edicoding.picodiploma.recyclerview.model.Student;

import java.util.ArrayList;

public class ListStudentAdapter extends RecyclerView.Adapter<ListStudentAdapter.CategoryViewHolder> {
    private ArrayList<Student> listStudent;
    private OnItemClickCallback onItemClickCallback;

    public  void setOnItemClickCallback(OnItemClickCallback onItemClickCallback){
        this.onItemClickCallback = onItemClickCallback;
    }
    public ListStudentAdapter(ArrayList<Student> list){
        this.listStudent = list;
    }

    @NonNull
    @Override
    public CategoryViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_row_student, parent, false);
        return new CategoryViewHolder(view);
    }

    @Override
    public int getItemCount() {
        return listStudent.size();
    }

    @Override
    public void onBindViewHolder(@NonNull final CategoryViewHolder holder, int position) {
        Student student = listStudent.get(position);

        Glide.with(holder.itemView.getContext())
                .load(student.getPhoto())
                .apply(RequestOptions.overrideOf(55,55))
                .into(holder.imgPhoto);

        holder.tvName.setText(student.getName());
        holder.tvKelas.setText(student.getKelas());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onItemClickCallback.onItemClicked(listStudent.get(holder.getAdapterPosition()));
            }
        });
    }
    public class CategoryViewHolder extends RecyclerView.ViewHolder {
        ImageView imgPhoto;
        TextView tvName, tvKelas;

        public CategoryViewHolder(@NonNull View itemView) {
            super(itemView);
            imgPhoto = itemView.findViewById(R.id.img_item_photo);
            tvName = itemView.findViewById(R.id.rv_item_name);
            tvKelas = itemView.findViewById(R.id.rv_item_class);
        }
    }

    public interface OnItemClickCallback{
        void onItemClicked(Student data);
    }
}
