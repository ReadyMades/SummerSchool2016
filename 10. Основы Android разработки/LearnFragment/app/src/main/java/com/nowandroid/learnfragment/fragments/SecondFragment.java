package com.nowandroid.learnfragment.fragments;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.nowandroid.learnfragment.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class SecondFragment extends Fragment {

    private TextView mView;

    public SecondFragment() {
    }

    public static SecondFragment newInstance(int position) {
        SecondFragment frag   = new SecondFragment();
        Bundle         bundle = new Bundle();
        bundle.putInt("position", position);
        frag.setArguments(bundle);
        return frag;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_second, container, false);

        Bundle bundle   = getArguments();
        int    position = bundle.getInt("position");

        mView = (TextView) view.findViewById(R.id.position);

        mView.setText(String.valueOf(position));

        return view;
    }

}
