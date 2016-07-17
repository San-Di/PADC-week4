package net.sandi.myapplication.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import net.sandi.myapplication.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class LinkedInFragment extends Fragment {


    public LinkedInFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_linked_in, container, false);
    }

    public static LinkedInFragment newInstance() {
        return new LinkedInFragment();
    }
}
