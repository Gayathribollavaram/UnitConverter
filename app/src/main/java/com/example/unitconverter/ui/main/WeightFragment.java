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

public class WeightFragment extends Fragment {

    EditText poundValue;
    TextView tvKilogram;
    TextView tvGram;
    TextView tvOunce;
    Button btnConvert;

    public static WeightFragment newInstance() {
        WeightFragment fragment = new WeightFragment();
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_weight, container, false);
        initialiseUx(view);
        return view;
    }

    private void initialiseUx(@NonNull View view) {
        poundValue = view.findViewById(R.id.weightValue);
        tvKilogram = view.findViewById(R.id.kilogram);
        tvGram = view.findViewById(R.id.gram);
        tvOunce = view.findViewById(R.id.ounce);
        btnConvert = view.findViewById(R.id.btnConvert);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        double weightValue = Double.parseDouble(poundValue.getText().toString());
        double kilogram = 0.453592;
        double gram = 453.592;
        double ounce = 16;

        tvKilogram.setText(Double.toString(weightValue * kilogram) + " " + getContext().getResources().getString(R.string.kilogram));
        tvGram.setText(Double.toString(weightValue * gram) + " " + getContext().getResources().getString(R.string.gram));
        tvOunce.setText(Double.toString(weightValue * ounce) + " " + getContext().getResources().getString(R.string.ounce));

        btnConvert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                double weightValue = Double.parseDouble(poundValue.getText().toString());
                double kilogram = 0.453592;
                double gram = 453.592;
                double ounce = 16;

                tvKilogram.setText(Double.toString(weightValue * kilogram) + " " + getContext().getResources().getString(R.string.kilogram));
                tvGram.setText(Double.toString(weightValue * gram) + " " + getContext().getResources().getString(R.string.gram));
                tvOunce.setText(Double.toString(weightValue * ounce) + " " + getContext().getResources().getString(R.string.ounce));
            }
        });
    }
}
