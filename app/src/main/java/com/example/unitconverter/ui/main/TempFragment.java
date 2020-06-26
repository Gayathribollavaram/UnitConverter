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

public class TempFragment extends Fragment {

    EditText fahrenheitValue;
    TextView tvCelsius;
    TextView tvKelvin;
    Button btnConvert;

    public static TempFragment newInstance() {
        TempFragment fragment = new TempFragment();
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_temp, container, false);
        initialiseUx(view);
        return view;
    }

    private void initialiseUx(@NonNull View view) {
        fahrenheitValue = view.findViewById(R.id.fahrenheitValue);
        tvCelsius = view.findViewById(R.id.celsius);
        tvKelvin = view.findViewById(R.id.kelvin);
        btnConvert = view.findViewById(R.id.btnConvert);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        double fahrenheit = Double.parseDouble(fahrenheitValue.getText().toString());
        double celcius = (fahrenheit - 32) * 5 / 9;
        double kelvin = (fahrenheit + 459.67) * 5 / 9;

        tvCelsius.setText(Double.toString(celcius) + " " + getContext().getResources().getString(R.string.degreeCelsius));
        tvKelvin.setText(Double.toString(kelvin) + " " + getContext().getResources().getString(R.string.kelvin));

        btnConvert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                double fahrenheit = Double.parseDouble(fahrenheitValue.getText().toString());
                double celcius = (fahrenheit - 32) * 5 / 9;
                double kelvin = (fahrenheit + 459.67) * 5 / 9;

                tvCelsius.setText(Double.toString(celcius) + " " + getContext().getResources().getString(R.string.degreeCelsius));
                tvKelvin.setText(Double.toString(kelvin) + " " + getContext().getResources().getString(R.string.kelvin));
            }
        });
    }
}
