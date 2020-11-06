package com.aj.android.messenger.Fragments;

import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.aj.android.messenger.Adapter.ChatListAdapter;
import com.aj.android.messenger.Entities.ChatUserItem;
import com.aj.android.messenger.R;
import com.aj.android.messenger.ViewModels.MessageViewModel;

import java.util.ArrayList;

public class ChatsFragment extends Fragment {

    private MessageViewModel mViewModel;
    private RecyclerView recyclerView;
    private ArrayList<ChatUserItem> chats = new ArrayList<>();
    private ChatListAdapter chatListAdapter;

    public static ChatsFragment newInstance() {
        return new ChatsFragment();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View v= inflater.inflate(R.layout.chats_fragment, container, false);
        recyclerView = v.findViewById(R.id.message_recycler);
        chatListAdapter = new ChatListAdapter();
        mViewModel = new ViewModelProvider(this).get(MessageViewModel.class);
        return v;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        recyclerView.setAdapter(chatListAdapter);
        chats.add(new ChatUserItem("Hello","AbYZzzz",System.currentTimeMillis(),20));
        chats.add(new ChatUserItem("Hii","me",System.currentTimeMillis(),4));
        chatListAdapter.setChats(chats);
        /*ArrayList<Message> messages = new ArrayList<>();
        for (int i = new Random().nextInt(10); i>0;i--){
            int n= new Random().nextInt(2);
            messages.add(new Message(n==0?"me":"asd","Hello "));
        }
        newAd.setData(messages);*/
    }
}