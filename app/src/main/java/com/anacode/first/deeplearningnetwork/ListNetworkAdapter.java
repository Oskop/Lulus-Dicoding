package com.anacode.first.deeplearningnetwork;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

public class ListNetworkAdapter extends RecyclerView.Adapter<ListNetworkAdapter.ListViewHolder> {

    private ArrayList<NetworkArchitecture> listNetwork;

    private OnItemClickCallback onItemClickCallback;

    public ListNetworkAdapter(ArrayList<NetworkArchitecture> list) {
        this.listNetwork = list;
    }

    public void setOnItemClickCallback(OnItemClickCallback onItemClickCallback) {
        this.onItemClickCallback = onItemClickCallback;
    }

    @NonNull
    @Override
    public ListViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_row_network, parent, false);
        return new ListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final ListViewHolder holder, int position) {
        NetworkArchitecture nw = listNetwork.get(position);

        Glide.with(holder.itemView.getContext())
                .load(nw.getPhoto())
                .apply(new RequestOptions().override(60, 60))
                .into(holder.imgNetwork);
        holder.tvNickName.setText(nw.getNickName());
        holder.tvMajor.setText(nw.getMajor());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onItemClickCallback.onItemClicked(listNetwork.get(holder.getAdapterPosition()));
            }
        });
    }

    @Override
    public int getItemCount() {
        return listNetwork.size();
    }

    public class ListViewHolder extends RecyclerView.ViewHolder{
        ImageView imgNetwork;
        TextView tvFullName, tvNickName, tvDetail, tvMajor, tvUse;


        public ListViewHolder(@NonNull View itemView) {
            super(itemView);
            imgNetwork = itemView.findViewById(R.id.tv_network_photo);
            tvFullName = itemView.findViewById(R.id.tv_full_name);
            tvNickName = itemView.findViewById(R.id.tv_nick_name);
            tvDetail = itemView.findViewById(R.id.tv_detail);
            tvMajor = itemView.findViewById(R.id.tv_major);
            tvUse = itemView.findViewById(R.id.tv_use);

        }
    }

    public interface OnItemClickCallback {
        void onItemClicked(NetworkArchitecture data);
    }
}
