package com.nowandroid.learnfragment.fragments;

import android.app.Fragment;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.nowandroid.learnfragment.ItemRMades;
import com.nowandroid.learnfragment.R;
import com.nowandroid.learnfragment.adapters.RVAdapter;

import java.util.ArrayList;
import java.util.Random;

/**
 * A simple {@link Fragment} subclass.
 */
public class FirstFragment extends Fragment {

    private RecyclerView          mRecyclerView;
    private ArrayList<ItemRMades> mList;
    private RVAdapter             mAdapter;
    private int    mas[]   =
            new int[]{R.drawable.baby, R.drawable.baby2, R.drawable.baby3, R.drawable.baby4};
    private Random mRandom = new Random();

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_first, container, false);

        mRecyclerView = (RecyclerView) view.findViewById(R.id.rv);

        LinearLayoutManager layoutManager = new LinearLayoutManager(getActivity());
        mRecyclerView.setLayoutManager(layoutManager);

        mAdapter = new RVAdapter(createList(8), new RVAdapter.OnClickItemListener() {
            @Override
            public void onClickItem(int position) {
                FragmentTransaction ft           =
                        getActivity().getFragmentManager().beginTransaction();
                SecondFragment      frag = SecondFragment.newInstance(position);
                ft.replace(R.id.container, frag);
                ft.addToBackStack(null);
                ft.commit();
            }
        });

        mRecyclerView.setAdapter(mAdapter);

        return view;
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
