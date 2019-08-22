package com.example.recycle_card_view;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class SongAdapter extends RecyclerView.Adapter<SongAdapter.ViewHolder> {
    private List<Song> songList;

    @NonNull
    @Override
    //Create new View Layout Manager
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_song_list_item, parent, false);
        ViewHolder vh = new ViewHolder(v);
        return vh;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Song song = songList.get(position);
        holder.tvRank.setText((String.valueOf(song.getRank())));
        holder.tvSongName.setText(song.getName());
        holder.tvYear.setText(song.getYear());
        holder.ivAlbumCover.setImageResource(song.getPic());
        holder.tvYear.setText("2016");
    }

    @Override
    public int getItemCount() {
        return songList.size();
    }

    //Suitable Constructor
    public SongAdapter(List<Song> songList) {
        this.songList = songList;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        //Data string
        public TextView tvRank, tvSongName, tvSinger, tvYear;
        public ImageView ivAlbumCover;

        public ViewHolder(View v) {
            super(v);
            tvRank = (TextView) v.findViewById(R.id.tv_rank);
            tvSongName = (TextView) v.findViewById(R.id.tv_song_name);
            tvSinger = (TextView) v.findViewById(R.id.tv_singer);
            tvYear = (TextView) v.findViewById(R.id.tv_year);
            ivAlbumCover = (ImageView) v.findViewById(R.id.iv_album_cover);
        }
    }
}
