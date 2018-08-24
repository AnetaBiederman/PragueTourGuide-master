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
public class HotelsFragment extends Fragment {


    public HotelsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.item_list_view, container, false);

        // Create a list of monuments
        final ArrayList<GuideItem> items = new ArrayList<GuideItem>();
        items.add(new GuideItem(getString(R.string.alchymist), getString(R.string.alchymist_address),
                getString(R.string.alchymist_web), getString(R.string.alchymist_des),
                R.drawable.alchymist));
        items.add(new GuideItem(getString(R.string.savic), getString(R.string.savic_address), getString(R.string.savic_web),
                getString(R.string.savic_des),
                R.drawable.savic));
        items.add(new GuideItem(getString(R.string.residence_malostranska), getString(R.string.residence_malostranska_address),
                getString(R.string.residence_malostranska_web), getString(R.string.residence_malostranska_des),
                R.drawable.malostranska));
        items.add(new GuideItem(getString(R.string.albatros), getString(R.string.albatros_address),
                getString(R.string.albatros_web), getString(R.string.albatros_des),
                R.drawable.albatros));

        ItemAdapter adapter = new ItemAdapter(getActivity(), items, R.color.categoryHotels);

        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);

        return rootView;
    }


}
