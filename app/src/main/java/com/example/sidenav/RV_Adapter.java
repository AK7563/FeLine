package com.example.sidenav;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

public class RV_Adapter extends RecyclerView.Adapter<RV_Adapter.ViewHolder> {

    private LayoutInflater inflater;
    Context context;
    ArrayList<Items> data;
    static ItemClickListener clickListener;


    public RV_Adapter(Context context, ArrayList<Items> data){
        this.inflater = LayoutInflater.from(context);
        this.data = data;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.recycler_row, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.adapter_Name.setText(data.get(position).getName());
        holder.adapter_Description.setText(data.get(position).getDescription());
        Glide.with(context).load(data.get(position).getImage()).into(holder.adapter_Image);
    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
        TextView adapter_Name;
        TextView adapter_Description;
        ImageView adapter_Image;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            adapter_Name = itemView.findViewById(R.id.title_row);
            adapter_Description =itemView.findViewById(R.id.description_row);
            adapter_Image = itemView.findViewById(R.id.image_row);
            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View view) {
            if (clickListener != null) clickListener.onItemClick(view, getAdapterPosition());
        }
    }

    public String getDescription(int id) {
        return data.get(id).getName();
    }
    public String getName(int id) {
        return data.get(id).getDescription();
    }
    public void setClickListener(ItemClickListener itemClickListener) {
        this.clickListener = itemClickListener;
    }
    public interface ItemClickListener {
        void onItemClick(View view, int position);
    }
}
