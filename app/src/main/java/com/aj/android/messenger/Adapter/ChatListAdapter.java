package com.aj.android.messenger.Adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.recyclerview.widget.RecyclerView;

import com.aj.android.messenger.Entities.ChatUserItem;
import com.aj.android.messenger.Others.Common;
import com.aj.android.messenger.R;
import com.google.android.material.imageview.ShapeableImageView;

import java.util.ArrayList;

public class ChatListAdapter extends RecyclerView.Adapter<ChatListAdapter.VH> {
    ArrayList<ChatUserItem> chats = new ArrayList<>();

    @NonNull
    @Override
    public ChatListAdapter.VH onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.chat_item_view, parent, false);
        return new VH(v);
    }

    @Override
    public void onBindViewHolder(@NonNull ChatListAdapter.VH holder, int position) {
        holder.setChatUserItem(chats.get(position));
    }

    @Override
    public int getItemCount() {
        return chats.size();
    }

    public void setChats(ArrayList<ChatUserItem> chats) {
        this.chats = chats;
        this.notifyDataSetChanged();
    }

    public static class VH extends RecyclerView.ViewHolder {
        private final ShapeableImageView chatIcon;
        private final AppCompatTextView chatName;
        private final AppCompatTextView chatLastMessage;
        private final AppCompatTextView chatTime;
        private final AppCompatTextView chatCount;

        public VH(@NonNull View itemView) {
            super(itemView);
            chatIcon = itemView.findViewById(R.id.chatIcon);
            chatName = itemView.findViewById(R.id.chatName);
            chatTime = itemView.findViewById(R.id.chatLastMessageTime);
            chatLastMessage = itemView.findViewById(R.id.chatLastMessage);
            chatCount = itemView.findViewById(R.id.chatMessageCount);
        }

        public void setChatUserItem(ChatUserItem item) {
            chatName.setText(item.getName());
            chatLastMessage.setText(item.getLastMessage());
            chatTime.setText(Common.getTime(item.getTime()));
            chatCount.setText(item.getCount() + "");
        }
    }
}
