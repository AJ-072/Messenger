package com.aj.android.messenger.Fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatButton;
import androidx.fragment.app.Fragment;

import com.aj.android.messenger.BottomSheet.OtpVerificationLayout;
import com.aj.android.messenger.R;

public class SignUpPhoneNumberFragment extends Fragment {
    AppCompatButton next;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v=inflater.inflate(R.layout.sign_up_first,container,false);
        next= v.findViewById(R.id.next_button);
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                OtpVerificationLayout otpVerificationLayout= OtpVerificationLayout.newInstance();
                otpVerificationLayout.show(getChildFragmentManager(),this.toString());
            }
        });
        return v;
    }
}
