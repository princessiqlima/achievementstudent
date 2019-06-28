package com.edicoding.picodiploma.recyclerview;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

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
    }
}
