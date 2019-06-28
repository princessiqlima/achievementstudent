package com.edicoding.picodiploma.recyclerview;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.bumptech.glide.Glide;
import com.edicoding.picodiploma.recyclerview.model.Student;

public class DetailActivity extends AppCompatActivity {

    public static String NAME = "NAME";
    public static String KELAS = "KELAS";
    public static String ACHIEVEMENT = "PRESTASI";
    public static String PHOTO = "PHOTO";

    TextView name, kelas, achievement;
    ImageView photo;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
//        Student studenta = getIntent().getParcelableExtra("key");

        String imgPath = getIntent().getStringExtra(PHOTO);
        String nm = getIntent().getStringExtra(NAME);
        String kls = getIntent().getStringExtra(KELAS);
        String ach = getIntent().getStringExtra(ACHIEVEMENT);

        photo = (ImageView) findViewById(R.id.img_item_photo);
        name = (TextView) findViewById(R.id.tv_item_name);
        kelas = (TextView) findViewById(R.id.tv_item_kelas);
        achievement = (TextView) findViewById(R.id.tv_achievement);

        if (imgPath.isEmpty()){
            photo.setVisibility(View.GONE);
        }else {
            Glide.with(this )
                    .load(imgPath)
                    .into(photo);
        }

        name.setText(nm);
        kelas.setText(kls);
        achievement.setText(ach);

    }
}
