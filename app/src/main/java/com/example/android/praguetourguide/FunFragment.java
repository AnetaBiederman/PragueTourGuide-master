package com.example.android.praguetourguide;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class FunFragment extends Fragment {


    public FunFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.item_list_view, container, false);

        // Create a list of monuments
        final ArrayList<GuideItem> items = new ArrayList<GuideItem>();
        items.add(new GuideItem(getString(R.string.bobsleigh), getString(R.string.bobsleigh_address),
                getString(R.string.bobsleigh_web), getString(R.string.bobsleigh_des),
                R.drawable.bobsleigh));
        items.add(new GuideItem(getString(R.string.beer_tasting), getString(R.string.beer_tasting_address), getString(R.string.beer_tasting_web),
                getString(R.string.beer_tasting_des), R.drawable.beer_museum));
        items.add(new GuideItem(getString(R.string.karting), getString(R.string.karting_address),
                getString(R.string.karting_web), getString(R.string.karting_des),
                R.drawable.karting));
        items.add(new GuideItem(getString(R.string.balloon), getString(R.string.balloon_address),
                getString(R.string.balloon_web), getString(R.string.balloon_des),
                R.drawable.ballons));

        ItemAdapter adapter = new ItemAdapter(getActivity(), items, R.color.categoryFun);

        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);

        return rootView;
    }


}
