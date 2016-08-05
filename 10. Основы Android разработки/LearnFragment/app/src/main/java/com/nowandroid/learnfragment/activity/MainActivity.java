package com.nowandroid.learnfragment.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.nowandroid.learnfragment.R;
import com.nowandroid.learnfragment.fragments.FirstFragment;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if (savedInstanceState == null) {
            getFragmentManager().beginTransaction().add(R.id.container, new FirstFragment()).commit();
        }
    }
}
