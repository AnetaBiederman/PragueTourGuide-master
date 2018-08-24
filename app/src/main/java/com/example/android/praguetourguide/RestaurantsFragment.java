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
public class RestaurantsFragment extends Fragment {


    public RestaurantsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.item_list_view, container, false);

        // Create a list of monuments
        final ArrayList<GuideItem> items = new ArrayList<GuideItem>();
        items.add(new GuideItem(getString(R.string.la_degustation), getString(R.string.la_degustation_address),
                getString(R.string.la_degustation_web), getString(R.string.la_degustation_des),
                R.drawable.la_degustation));
        items.add(new GuideItem(getString(R.string.divinis), getString(R.string.divinis_address),
                getString(R.string.divinis_web), getString(R.string.divinis_des),
                R.drawable.divinis));
        items.add(new GuideItem(getString(R.string.cotto_crudo), getString(R.string.cotto_crudo_address),
                getString(R.string.cotto_crudo_web), getString(R.string.cotto_crudo_des),
                R.drawable.cottocrudo));
        items.add(new GuideItem(getString(R.string.aromi), getString(R.string.aromi_address),
                getString(R.string.aromi_web), getString(R.string.aromi_des),
                R.drawable.aromi));
        items.add(new GuideItem(getString(R.string.v_kolkovne), getString(R.string.v_kolkovne_address),
                getString(R.string.v_kolkovne_web), getString(R.string.v_kolkovne_des),
                R.drawable.kolkovna));
        items.add(new GuideItem(getString(R.string.hergetova_cihelna), getString(R.string.hergetova_cihelna_address),
                getString(R.string.hergetova_cihelna_web), getString(R.string.hergetova_cihelna_des),
                R.drawable.cihelna));
        items.add(new GuideItem(getString(R.string.café_savoy), getString(R.string.café_savoy_address),
                getString(R.string.café_savoy_web), getString(R.string.café_savoy_des),
                R.drawable.cafe_savoy));
        items.add(new GuideItem(getString(R.string.lokal_dlouha), getString(R.string.lokal_dlouha_address),
                getString(R.string.lokal_dlouha_web), getString(R.string.lokal_dlouha_des),
                R.drawable.dlouha));
        items.add(new GuideItem(getString(R.string.pho_vietnam), getString(R.string.pho_vietnam_address),
                getString(R.string.pho_vietnam_web), getString(R.string.pho_vietnam_des),
                R.drawable.pho_vietnam));
        items.add(new GuideItem(getString(R.string.rugantino), getString(R.string.rugantino_address),
                getString(R.string.rugantino_web), getString(R.string.rugantino_des),
                R.drawable.pizza_rugantino));

        ItemAdapter adapter = new ItemAdapter(getActivity(), items, R.color.categoryRestaurants);

        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);

        return rootView;
    }


}
