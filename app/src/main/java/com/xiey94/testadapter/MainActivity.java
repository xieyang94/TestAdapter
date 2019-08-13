package com.xiey94.testadapter;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

/**
 * Create by xiey on 2019/8/13.
 */
public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;

    ParentAdapter adapter;

    WorkData workData=new WorkData();


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recycler_view);

        LinearLayoutManager manager = new LinearLayoutManager(this);
        manager.setOrientation(LinearLayoutManager.VERTICAL);

        recyclerView.setLayoutManager(manager);
        adapter = new ParentAdapter(this, TempData.getParentData(),workData);
        recyclerView.setAdapter(adapter);

    }
}
