package com.example.fragmenthomework.fragments;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.example.fragmenthomework.R;

import java.text.SimpleDateFormat;

public class FragmentData extends Fragment {
    //Fields
    static final String ARGUMENT_PAGE_NUMBER = "arg_page_number";
    static final String TAG = "myLogs";

    SimpleDateFormat sdf;

    TextView textData;
    ImageView image;

    int pageNumber;
    static int page;


    //Constructor
    public FragmentData() {
    }


    //Functions
    public static FragmentData newInstance(int position) {
        Log.d(TAG, "newInstance: " + position);
        page = position;
        FragmentData fragment = new FragmentData();
        Bundle args = new Bundle();
        args.putInt(ARGUMENT_PAGE_NUMBER, position);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        Log.d(TAG, "onAttach: " + page);
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        if (getArguments() != null) {
            pageNumber = getArguments().getInt(ARGUMENT_PAGE_NUMBER);
        }

        Log.d(TAG, "onCreate: " + pageNumber);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Log.d(TAG, "onCreateView: " + pageNumber);

        View view = inflater.inflate(R.layout.fragment_fragment_data, null);

        switch (pageNumber) {
            case 0:
                sdf = new SimpleDateFormat("HH:mm:ss");
                textData = (TextView) view.findViewById(R.id.textData);
                break;
            case 1:
                sdf = new SimpleDateFormat("dd.MM.yyyy");
                textData = (TextView) view.findViewById(R.id.textData);
                break;
            case 2:
                image = (ImageView) view.findViewById(R.id.image);
                image.setImageResource(R.drawable.monster_boy);
                break;
        }
        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        Log.d(TAG, "onActivityCreated: " + pageNumber);
    }

    @Override
    public void onStart() {
        super.onStart();
        Log.d(TAG, "onStart: " + pageNumber);
    }

    @Override
    public void onResume() {
        super.onResume();
        Log.d(TAG, "onResume: " + pageNumber);

        if (textData != null) {
            textData.setText(sdf.format(System.currentTimeMillis()));
        }
    }

    @Override
    public void onPause() {
        super.onPause();
        Log.d(TAG, "onPause: " + pageNumber);
    }

    @Override
    public void onStop() {
        super.onStop();
        Log.d(TAG, "onStop: " + pageNumber);
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        Log.d(TAG, "onDestroyView: " + pageNumber);
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "onDestroy: " + pageNumber);
    }

    @Override
    public void onDetach() {
        super.onDetach();
        Log.d(TAG, "onDetach: " + pageNumber);
    }
}
