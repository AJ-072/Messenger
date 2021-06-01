package com.aj.android.messenger.BottomSheet;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.aj.android.messenger.R;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;

public class OtpVerificationLayout extends BottomSheetDialogFragment {
    public static OtpVerificationLayout newInstance() {
        Bundle args = new Bundle();
        OtpVerificationLayout fragment = new OtpVerificationLayout();
        fragment.setArguments(args);
        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.otp_bottom_sheet, container);
        return v;
    }
}
