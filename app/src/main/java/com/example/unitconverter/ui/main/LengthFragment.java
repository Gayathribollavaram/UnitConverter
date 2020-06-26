package com.example.unitconverter.ui.main;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.unitconverter.R;

public class LengthFragment extends Fragment {

    EditText mileValue;
    TextView tvKiloMeter;
    TextView tvMeter;
    TextView tvFeet;
    TextView tvInch;
    Button btnConvert;

    public LengthFragment() {
        // Required empty public constructor
    }

    public static LengthFragment newInstance() {
        LengthFragment fragment = new LengthFragment();
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.fragment_length, container, false);
        initialiseUx(view);
        return view;
    }

    private void initialiseUx(@NonNull View view) {
        mileValue = view.findViewById(R.id.lengthValue);
        tvKiloMeter = view.findViewById(R.id.kilometer);
        tvMeter = view.findViewById(R.id.meter);
        tvFeet = view.findViewById(R.id.feet);
        tvInch = view.findViewById(R.id.inch);
        btnConvert = view.findViewById(R.id.btnConvert);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        double lengthValue = Double.parseDouble(mileValue.getText().toString());
        double kilometer = 1.60934;
        double meter = 1609.34;
        double feet = 5280;
        double inch = 63360;

        tvKiloMeter.setText(Double.toString(lengthValue * kilometer) + " " + getContext().getResources().getString(R.string.kilometer));
        tvMeter.setText(Double.toString(lengthValue * meter) + " " + getContext().getResources().getString(R.string.meter));
        tvFeet.setText(Double.toString(lengthValue * feet) + " " + getContext().getResources().getString(R.string.feet));
        tvInch.setText(Double.toString(lengthValue * inch) + " " + getContext().getResources().getString(R.string.inch));

        btnConvert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double lengthValue = Double.parseDouble(mileValue.getText().toString());
                double kilometer = 1.60934;
                double meter = 1609.34;
                double feet = 5280;
                double inch = 63360;

                tvKiloMeter.setText(Double.toString(lengthValue * kilometer) + " " + getContext().getResources().getString(R.string.kilometer));
                tvMeter.setText(Double.toString(lengthValue * meter) + " " + getContext().getResources().getString(R.string.meter));
                tvFeet.setText(Double.toString(lengthValue * feet) + " " + getContext().getResources().getString(R.string.feet));
                tvInch.setText(Double.toString(lengthValue * inch) + " " + getContext().getResources().getString(R.string.inch));
            }
        });
    }
}
