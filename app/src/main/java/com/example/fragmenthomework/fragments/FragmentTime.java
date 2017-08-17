package com.example.fragmenthomework.fragments;

import android.app.Fragment;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.example.fragmenthomework.R;

import java.text.SimpleDateFormat;

public class FragmentTime extends Fragment {
    //Fields
    TextView textTime;
    SimpleDateFormat sdf;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        sdf = new SimpleDateFormat("HH:mm:ss");
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_fragment_time, null);
        textTime = (TextView) v.findViewById(R.id.textTime);
        return v;
    }

    @Override
    public void onResume() {
        super.onResume();
        textTime.setText(sdf.format(System.currentTimeMillis()));
    }
}
