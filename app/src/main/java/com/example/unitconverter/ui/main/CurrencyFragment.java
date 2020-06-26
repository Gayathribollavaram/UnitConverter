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

public class CurrencyFragment extends Fragment {

    EditText usCurrency;
    TextView euroCurrency;
    TextView rupeeCurrency;
    TextView australianCurrency;
    TextView canadianCurrency;
    Button btnConvert;

    public CurrencyFragment() {
        // Required empty public constructor
    }

    public static CurrencyFragment newInstance() {
        CurrencyFragment fragment = new CurrencyFragment();
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_currency, container, false);
        initialiseUx(view);
        return view;
    }

    private void initialiseUx(@NonNull View view) {
        usCurrency = view.findViewById(R.id.currencyValue);
        euroCurrency = view.findViewById(R.id.euro);
        rupeeCurrency = view.findViewById(R.id.rupee);
        australianCurrency = view.findViewById(R.id.australianDollar);
        canadianCurrency = view.findViewById(R.id.canadianDollar);
        btnConvert = view.findViewById(R.id.btnConvert);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        double currencyValue = Double.parseDouble(usCurrency.getText().toString());
        double euro = 0.89;
        double rupee = 75.57;
        double australianDollar = 1.46;
        double canadianDollar = 1.36;

        euroCurrency.setText(Double.toString(currencyValue * euro) + " " + getContext().getResources().getString(R.string.euro));
        rupeeCurrency.setText(Double.toString(currencyValue * rupee) + " " + getContext().getResources().getString(R.string.rupee));
        australianCurrency.setText(Double.toString(currencyValue * australianDollar) + " " + getContext().getResources().getString(R.string.australianDollar));
        canadianCurrency.setText(Double.toString(currencyValue * canadianDollar) + " " + getContext().getResources().getString(R.string.canadianDollar));

        btnConvert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                double currencyValue = Double.parseDouble(usCurrency.getText().toString());
                double euro = 0.89;
                double rupee = 75.57;
                double australianDollar = 1.46;
                double canadianDollar = 1.36;

                euroCurrency.setText(Double.toString(currencyValue * euro) + " " + getContext().getResources().getString(R.string.euro));
                rupeeCurrency.setText(Double.toString(currencyValue * rupee) + " " + getContext().getResources().getString(R.string.rupee));
                australianCurrency.setText(Double.toString(currencyValue * australianDollar) + " " + getContext().getResources().getString(R.string.australianDollar));
                canadianCurrency.setText(Double.toString(currencyValue * canadianDollar) + " " + getContext().getResources().getString(R.string.canadianDollar));

            }
        });
    }
}
