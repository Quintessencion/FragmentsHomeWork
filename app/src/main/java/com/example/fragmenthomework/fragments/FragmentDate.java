package com.example.fragmenthomework.fragments;

import android.content.Context;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import android.widget.TextView;
import com.example.fragmenthomework.R;

import java.text.SimpleDateFormat;

public class FragmentDate extends Fragment {
    //Fields
    TextView textDate;
    SimpleDateFormat sdf;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        sdf = new SimpleDateFormat("dd.MM.yyyy");
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_fragment_date, null);
        textDate = (TextView) v.findViewById(R.id.textDate);
        return v;
    }

    @Override
    public void onResume() {
        super.onResume();
        textDate.setText(sdf.format(System.currentTimeMillis()));
    }
}
