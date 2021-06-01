package com.aj.android.messenger.Activity;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import com.aj.android.messenger.Fragments.SignInFragment;
import com.aj.android.messenger.Fragments.SignUpPhoneNumberFragment;
import com.aj.android.messenger.Interface.OnSignUpClickListener;
import com.aj.android.messenger.R;

public class SignUpActivity extends AppCompatActivity implements OnSignUpClickListener {
    SignInFragment signInFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
        signInFragment = new SignInFragment();
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.add(R.id.sign_fragment_placeholder, signInFragment)
                .commit();
    }

    @Override
    public void OnSignUpTextClick() {
        SignUpPhoneNumberFragment signUpPhoneNumberFragment = new SignUpPhoneNumberFragment();
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.sign_fragment_placeholder, signUpPhoneNumberFragment)
                .commit();
    }
}