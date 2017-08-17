package com.example.fragmenthomework.fragments;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.example.fragmenthomework.R;

public class FragmentPictures extends Fragment {
    //Fields
    ImageView image;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_fragment_pictures, null);
        image = (ImageView) v.findViewById(R.id.imageView);
        return v;
    }

    @Override
    public void onResume() {
        super.onResume();
        image.setImageResource(R.drawable.monster_boy);
    }
}
