package com.dicoding.picodiploma.myfavjpopartist.adapter;

import android.content.Context;
import android.media.Image;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.dicoding.picodiploma.myfavjpopartist.R;
import com.dicoding.picodiploma.myfavjpopartist.model.Singer;

import java.util.ArrayList;
import java.util.List;

public class ListSingerAdapter extends RecyclerView.Adapter<ListSingerAdapter.SingerHolder> {
    private ArrayList<Singer> listSinger;
    private Context context;

    public ListSingerAdapter(Context context){
        this.context = context;
    }

    public ArrayList<Singer> getListSinger(){
        return listSinger;
    }

    public void setListSinger(ArrayList<Singer> listSinger){
        this.listSinger = listSinger;
    }

    @NonNull
    @Override
    public SingerHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemRow = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_row_singer,parent,false);
        return new SingerHolder(itemRow);
    }

    @Override
    public void onBindViewHolder(@NonNull ListSingerAdapter.SingerHolder holder, int position) {
        holder.tvName.setText(getListSinger().get(position).getName());
        holder.tvAbout.setText(getListSinger().get(position).getAbout());

        Glide.with(context)
                .load(getListSinger().get(position).getPhoto())
                .apply(new RequestOptions().override(55,55))
                .into(holder.imgPhoto);
    }

    @Override
    public int getItemCount() {
        return getListSinger().size();
    }

    public class SingerHolder extends RecyclerView.ViewHolder {
        TextView tvName,tvAbout;
        ImageView imgPhoto;

        public SingerHolder(@NonNull View itemView) {
            super(itemView);
            tvName = itemView.findViewById(R.id.tv_item_name);
            tvAbout = itemView.findViewById(R.id.tv_item_about);
            imgPhoto = itemView.findViewById(R.id.img_item_photo);
        }
    }
}
