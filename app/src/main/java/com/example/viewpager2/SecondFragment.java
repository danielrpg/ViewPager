package com.example.viewpager2;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class SecondFragment extends Fragment {


    public SecondFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.second_fragment, container, false);
        TextView textView = view.findViewById(R.id.text_main);
        textView.setText(R.string.second_fragment);

        ImageView imageView = view.findViewById(R.id.img_main);
        imageView.setImageResource(R.mipmap.ic_launcher);
        return view;
    }
}
