package com.edicoding.picodiploma.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import com.edicoding.picodiploma.recyclerview.adapter.CardViewStudentAdapter;
import com.edicoding.picodiploma.recyclerview.adapter.GridStudentAdapter;
import com.edicoding.picodiploma.recyclerview.adapter.ListStudentAdapter;
import com.edicoding.picodiploma.recyclerview.model.Student;
import com.edicoding.picodiploma.recyclerview.model.StudentsData;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rvCategory;
    private ArrayList<Student> list = new ArrayList<>();
    private String title = "Mode List";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvCategory = findViewById(R.id.rv_category);
        rvCategory.setHasFixedSize(true);

        list.addAll(StudentsData.getListData());
        setActionBarTitle("Mode List");
        showRecyclerList();
    }

    private void showRecyclerList() {
        rvCategory.setLayoutManager(new LinearLayoutManager(this));
        ListStudentAdapter listStudentAdapter = new ListStudentAdapter(list);
        rvCategory.setAdapter(listStudentAdapter);

        listStudentAdapter.setOnItemClickCallback(new ListStudentAdapter.OnItemClickCallback() {
            @Override
            public void onItemClicked(Student data) {
                showSelectedStudent(data);
            }
        });
    }

    private void showRecyclerGrid() {
        rvCategory.setLayoutManager(new GridLayoutManager(this, 2));
        GridStudentAdapter gridStudentAdapter = new GridStudentAdapter(list);
        rvCategory.setAdapter(gridStudentAdapter);

        gridStudentAdapter.setOnItemClickCallback(new GridStudentAdapter.OnItemClickCallback() {
            @Override
            public void onItemClicked(Student data) {
                showSelectedStudent(data);
            }
        });
    }

    private void showRecyclerCardView(){
        rvCategory.setLayoutManager(new LinearLayoutManager(this));
        CardViewStudentAdapter cardViewStudentAdapter = new CardViewStudentAdapter(list);
        rvCategory.setAdapter(cardViewStudentAdapter);
    }

    // untuk menu
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return super.onCreateOptionsMenu(menu);
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        setMode(item.getItemId());
        return super.onOptionsItemSelected(item);
    }

    private void setActionBarTitle(String title){
        if (getSupportActionBar() != null){
            getSupportActionBar().setTitle(title);
        }
    }

    private void showSelectedStudent(Student student){
        Toast.makeText(this, "Kamu memilih " + student.getName(), Toast.LENGTH_SHORT).show();
    }

    private void setMode(int selectedMode) {
        switch (selectedMode){
            case R.id.action_list:
                title = "Mode List";
                showRecyclerList();
                break;
            case R.id.action_grid:
                title = "Mode Grid";
                showRecyclerGrid();
                break;
            case R.id.action_cardview:
                title = "Mode CardView";
                showRecyclerCardView();
                break;
        }

    }
}
