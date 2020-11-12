package com.aj.android.messenger.Fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import com.aj.android.messenger.Activity.SignUpActivity;
import com.aj.android.messenger.BottomSheet.OtpVerificationLayout;
import com.aj.android.messenger.Interface.OnSignUpClickListener;
import com.aj.android.messenger.R;

import java.util.Objects;

public class SignInFragment extends Fragment {
    private AppCompatButton logIn;
    private AppCompatTextView signUp;
    private OnSignUpClickListener activity;

    public SignInFragment(){
        this.activity= (OnSignUpClickListener) getActivity();
    }
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v =inflater.inflate(R.layout.sign_in,container,false);
        logIn= v.findViewById(R.id.next_button);
        signUp=v.findViewById(R.id.sign_up);

        return v;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        signUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SignUpPhoneNumberFragment signUpPhoneNumberFragment= new SignUpPhoneNumberFragment();
                FragmentTransaction transaction= Objects.requireNonNull(getActivity()).getSupportFragmentManager().beginTransaction();
                transaction.replace(R.id.sign_fragment_placeholder,signUpPhoneNumberFragment)
                        .commit();
            }
        });
    }
}
