package com.nowandroid.materialmades.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.nowandroid.materialmades.ItemRMades;
import com.nowandroid.materialmades.R;
import com.nowandroid.materialmades.adapter.RVAdapter;

import java.util.ArrayList;
import java.util.Random;

public class MainActivity extends Activity {

    public static final String ITEM_POSITION = "position";

    private RecyclerView mRecyclerView;
    private ArrayList<ItemRMades> mList;
    private RVAdapter             mAdapter;
    private int    mas[]   =
            new int[]{R.drawable.baby, R.drawable.baby2, R.drawable.baby3, R.drawable.baby4};
    private Random mRandom = new Random();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mRecyclerView = (RecyclerView) findViewById(R.id.rv);

        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        mRecyclerView.setLayoutManager(layoutManager);

        mAdapter = new RVAdapter(createList(8), new RVAdapter.OnClickItemListener() {
            @Override
            public void onClickItem(int position) {
                Intent intent = new Intent(MainActivity.this, InfoActivity.class);
                intent.putExtra(ITEM_POSITION, position);
                startActivity(intent);
            }
        });

        mRecyclerView.setAdapter(mAdapter);
    }

    private ArrayList<ItemRMades> createList(int size) {
        mList = new ArrayList<ItemRMades>();
        for (int i = 1; i <= size; i++) {
            ItemRMades mades = new ItemRMades();

            mades.setTitle("Альбом " + i);
            if (i > 9) {
                mades.setYear("20" + i);
            } else {
                mades.setYear("200" + i);
            }

            mades.setPhoto(mas[mRandom.nextInt(mas.length)]);

            mList.add(mades);
        }
        return mList;
    }
}
