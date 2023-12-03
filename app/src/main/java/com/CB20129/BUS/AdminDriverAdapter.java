package com.CB20129.BUS;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class AdminDriverAdapter extends RecyclerView.Adapter<AdminDriverAdapter.AdminDriverHolder> {

    private Context context;
    private ArrayList<UserModel> usersArrayList;
    private int selectedPosition = RecyclerView.NO_POSITION;
    private OnItemClickListener onItemClickListener;

    public AdminDriverAdapter(Context context, ArrayList<UserModel> usersArrayList) {
        this.context = context;
        this.usersArrayList = usersArrayList;
    }

    @NonNull
    @Override
    public AdminDriverAdapter.AdminDriverHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(context).inflate(R.layout.activity_admin_item, parent, false);
        return new AdminDriverHolder(v, onItemClickListener);
    }

    @Override
    public void onBindViewHolder(@NonNull AdminDriverAdapter.AdminDriverHolder holder, int position) {
        UserModel user = usersArrayList.get(position);
        holder.fullName.setText(user.FullName);

        // Highlight the selected item
        holder.itemView.setSelected(selectedPosition == position);
    }

    @Override
    public int getItemCount() {
        return usersArrayList.size();
    }

    public static class AdminDriverHolder extends RecyclerView.ViewHolder {

        TextView fullName;

        public AdminDriverHolder(@NonNull View itemView, OnItemClickListener listener) {
            super(itemView);
            fullName = itemView.findViewById(R.id.fullName);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (listener != null) {
                        int position = getAdapterPosition();
                        if (position != RecyclerView.NO_POSITION) {
                            listener.onItemClick(position);
                        }
                    }
                }
            });
        }
    }

    public int getSelectedPosition() {
        return selectedPosition;
    }

    @SuppressLint("NotifyDataSetChanged")
    public void setSelectedPosition(int position) {
        selectedPosition = position;
        notifyDataSetChanged();
    }

    // Interface to handle item clicks
    public interface OnItemClickListener {
        void onItemClick(int position);
    }

    // Setter method for the listener
    public void setOnItemClickListener(OnItemClickListener listener) {
        this.onItemClickListener = listener;
    }
}
