package com.chonlavit.networkforice;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


public class Group1Fragment extends Fragment {

    final static String LAYOUT_ID = "layoutId";

    public static Group1Fragment newInstance(int layoutId) {
        Group1Fragment pane = new Group1Fragment();
        Bundle bundle = new Bundle();
        bundle.putInt(LAYOUT_ID, layoutId);
        pane.setArguments(bundle);
        return pane;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        ViewGroup root = (ViewGroup) inflater.inflate(getArguments().getInt(LAYOUT_ID, -1), container, false);
        return root;

    }

}