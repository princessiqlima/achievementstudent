package com.edicoding.picodiploma.recyclerview.adapter;

import android.content.Context;
import android.content.Intent;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.edicoding.picodiploma.recyclerview.DetailActivity;
import com.edicoding.picodiploma.recyclerview.R;
import com.edicoding.picodiploma.recyclerview.model.Student;

import java.util.ArrayList;

public class CardViewStudentAdapter extends RecyclerView.Adapter<CardViewStudentAdapter.CardViewViewHolder>  {
    private ArrayList<Student> listStudent;

    public CardViewStudentAdapter(ArrayList<Student> list){
        this.listStudent = list;
    }
    @NonNull
    @Override
    public CardViewViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_cardview_student, parent, false);
        return new CardViewViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final CardViewViewHolder holder, final int position) {
        holder.bind(listStudent.get(position));
        holder.btnFavorite.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(holder.itemView.getContext(), "Favorite " +
                        listStudent.get(position).getName(), Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public int getItemCount() {
        return listStudent.size();
    }

    public class CardViewViewHolder extends RecyclerView.ViewHolder{
        ImageView imgPhoto;
        TextView tvName, tvKelas;
        Button btnDetail, btnFavorite;
        Student student;

        public CardViewViewHolder(@NonNull View itemView) {
            super(itemView);
            imgPhoto = itemView.findViewById(R.id.img_item_photo);
            tvName = itemView.findViewById(R.id.tv_item_name);
            tvKelas = itemView.findViewById(R.id.tv_item_kelas);
            btnDetail = itemView.findViewById(R.id.btn_detail);
            btnFavorite = itemView.findViewById(R.id.btn_favorite);
        }


        public void bind(final Student student) {
            Glide.with(itemView.getContext())
                    .load(student.getPhoto())
                    .apply(new RequestOptions().override(350,550))
                    .into(imgPhoto);

            tvName.setText(student.getName());
            tvKelas.setText(student.getKelas());

            btnDetail.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(itemView.getContext(), DetailActivity.class);
                    intent.putExtra(DetailActivity.PHOTO, student.getPhoto());
                    intent.putExtra(DetailActivity.NAME, student.getName());
                    intent.putExtra(DetailActivity.KELAS, student.getKelas());
                    intent.putExtra(DetailActivity.ACHIEVEMENT, student.getAchievement());
                    itemView.getContext().startActivity(intent);
                }
            });
        }
    }

}
