package com.aj.android.messenger.Fragments;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import com.aj.android.messenger.Activity.HomeActivity;
import com.aj.android.messenger.Interface.OnSignUpClickListener;
import com.aj.android.messenger.R;

import java.util.Objects;

public class SignInFragment extends Fragment implements View.OnClickListener {
    private AppCompatButton logIn;
    private AppCompatTextView signUp;
    private final OnSignUpClickListener activity;

    public SignInFragment() {
        this.activity = (OnSignUpClickListener) getActivity();
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.sign_in, container, false);
        logIn = v.findViewById(R.id.next_button);
        signUp = v.findViewById(R.id.sign_up);

        return v;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        signUp.setOnClickListener(this);
        logIn.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.sign_up:
                SignUpPhoneNumberFragment signUpPhoneNumberFragment = new SignUpPhoneNumberFragment();
                FragmentTransaction transaction = Objects.requireNonNull(getActivity()).getSupportFragmentManager().beginTransaction();
                transaction.replace(R.id.sign_fragment_placeholder, signUpPhoneNumberFragment)
                        .commit();
                break;
            case R.id.next_button:
                startActivity(new Intent(getActivity(), HomeActivity.class));
                break;

        }
    }
}
