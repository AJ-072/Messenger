package com.aj.android.messenger.Adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.aj.android.messenger.Entities.Message;
import com.aj.android.messenger.Others.Common;
import com.aj.android.messenger.R;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;

public class MessageAdapter extends RecyclerView.Adapter<MessageAdapter.ViewHolder> {
    private static final String TAG = "MessageAdapter";
    private ArrayList<Message> data = new ArrayList<>();

    @NotNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View inflater = LayoutInflater.from(parent.getContext()).inflate(viewType, parent, false);
        return new ViewHolder(inflater);
    }

    @Override
    public int getItemViewType(int position) {
        if (data.get(position).getUser().equals("me"))
            return R.layout.send_message_view;
        else
            return R.layout.received_message_view;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.message.setText(data.get(position).getMessage());
        holder.time.setText(Common.getTime(data.get(position).getTime()));
    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    public void setData(ArrayList<Message> data) {
        this.data = data;
        this.notifyDataSetChanged();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        private final TextView message;
        private final TextView time;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            message = itemView.findViewById(R.id.message);
            time = itemView.findViewById(R.id.timeStamp);
        }
    }
}
