package com.nowandroid.materialmades.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.nowandroid.materialmades.ItemRMades;
import com.nowandroid.materialmades.R;

import java.util.ArrayList;

/**
 * Project: MaterialMades
 * Created: Vendetta
 * Date: 02.08.2016
 */
public class RVAdapter extends RecyclerView.Adapter<RVAdapter.CustomViewHolder> {

    private ArrayList<ItemRMades> mList;
    private OnClickItemListener   mListener;

    public RVAdapter(ArrayList<ItemRMades> mList, OnClickItemListener mListener) {
        this.mList = mList;
        this.mListener = mListener;
    }

    @Override
    public CustomViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new CustomViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_view, parent, false));
    }

    @Override
    public void onBindViewHolder(final CustomViewHolder holder, final int position) {
        holder.name.setText(mList.get(position).getTitle());
        holder.situation.setText(mList.get(position).getYear());
        holder.mImageView.setImageResource(mList.get(position).getPhoto());
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mListener.onClickItem(position);
            }
        });
    }

    @Override
    public int getItemCount() {
        return mList.size();
    }

    public class CustomViewHolder extends RecyclerView.ViewHolder {

        TextView name, situation;
        ImageView mImageView;

        public CustomViewHolder(View itemView) {
            super(itemView);

            name = (TextView) itemView.findViewById(R.id.title);
            situation = (TextView) itemView.findViewById(R.id.year);
            mImageView = (ImageView) itemView.findViewById(R.id.photo_album);

        }
    }

    public interface OnClickItemListener {
        void onClickItem(int position);
    }
}
