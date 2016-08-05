package com.nowandroid.materialmades.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import com.nowandroid.materialmades.R;

public class InfoActivity extends Activity {

    private TextView mTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);

        mTextView = (TextView) findViewById(R.id.position);

        Intent intent = getIntent();

        int pos = intent.getIntExtra(MainActivity.ITEM_POSITION, 0);

        mTextView.setText(String.valueOf(pos));

    }
}
