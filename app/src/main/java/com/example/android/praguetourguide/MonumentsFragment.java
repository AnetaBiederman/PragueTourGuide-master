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
public class MonumentsFragment extends Fragment {

    public MonumentsFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.item_list_view, container, false);

        // Create a list of monuments
        final ArrayList<GuideItem> items = new ArrayList<GuideItem>();
        items.add(new GuideItem(getString(R.string.prague_castle), getString(R.string.prague_castle_address),
                getString(R.string.prague_castle_web), getString(R.string.prague_castle_des),
                R.drawable.prague_castle));
        items.add(new GuideItem(getString(R.string.vysehrad), getString(R.string.vysehrad_address),
                getString(R.string.vysehrad_web), getString(R.string.vysehrad_des),
                R.drawable.vysehrad));
        items.add(new GuideItem(getString(R.string.charles_bridge), getString(R.string.charles_bridge_address),
                getString(R.string.charles_bridge_web), getString(R.string.charles_bridge_des),
                R.drawable.charles_bridge));
        items.add(new GuideItem(getString(R.string.old_town_square), getString(R.string.old_time_square_address),
                getString(R.string.old_town_square_web), getString(R.string.old_town_square_des),
                R.drawable.staromestcke_nam));
        items.add(new GuideItem(getString(R.string.wenceslas_square), getString(R.string.wenceslas_square_addess),
                getString(R.string.wenceslas_web), getString(R.string.wenceslas_des),
                R.drawable.vaclavske_nam));
        items.add(new GuideItem(getString(R.string.petrin), getString(R.string.petrin_address),
                getString(R.string.petrin_web), getString(R.string.petrin_des),
                R.drawable.petrin));
        items.add(new GuideItem(getString(R.string.national_museum), getString(R.string.national_museum_address),
                getString(R.string.national_museum_web), getString(R.string.national_museum_des),
                R.drawable.narodni_museum));
        items.add(new GuideItem(getString(R.string.hvezda), getString(R.string.hvezda_address),
                getString(R.string.hvezda_web), getString(R.string.hvezda_des),
                R.drawable.letohradek_hvezda));
        items.add(new GuideItem(getString(R.string.bethlehem_chapel), getString(R.string.bethlehem_chapel_address),
                getString(R.string.bethlem_chapel_web), getString(R.string.bethlehem_chapel_des),
                R.drawable.bethlehem_chapel));

        ItemAdapter adapter = new ItemAdapter(getActivity(), items, R.color.categoryMonuments);

        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);

        return rootView;
    }

}
