package com.example.android.praguetourguide;

import android.content.ClipData;
import android.content.Context;
import android.content.Intent;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Aneta BIEDERMAN on 06 Apr 2018.
 */

public class ItemAdapter extends ArrayAdapter <GuideItem> {

    /** Resource ID for the background color for this list of words */
    private int ColorResourceId;

    private Context context = getContext();

    /**
     * Create a new {@link ItemAdapter} object.
     *
     * @param context is the current context (i.e. Activity) that the adapter is being created in.
     * @param guideItems is the list of {@link GuideItem}s to be displayed.
     */
    public ItemAdapter(Context context, ArrayList<GuideItem> guideItems, int colorResourceId) {
        super(context, 0, guideItems);
        ColorResourceId = colorResourceId;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if an existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.item_view, parent, false);
        }

        GuideItem currentGuideItem = getItem(position);

        //Get the object's properties
        String itemName = currentGuideItem.getItemName();
        String itemAddress = currentGuideItem.getItemAddress();
        String itemDescription = currentGuideItem.getItemDescription();
        String itemWeb = currentGuideItem.getItemWeb();
        int imageItemResourceId = currentGuideItem.getImageItemResourceId();


        TextView guideItemTextView = (TextView) listItemView.findViewById(R.id.item_name_text_view);
        guideItemTextView.setText(currentGuideItem.getItemName());

        TextView guideAddressTextView = (TextView) listItemView.findViewById(R.id.item_address_text_view);
        guideAddressTextView.setText(currentGuideItem.getItemAddress());

        ImageView imageView = (ImageView) listItemView.findViewById(R.id.image);
        imageView.setImageResource(currentGuideItem.getImageItemResourceId());

        // Set the theme color for the list item
        View textContainer = listItemView.findViewById(R.id.text_container);
        int color = ContextCompat.getColor(getContext(), ColorResourceId);
        textContainer.setBackgroundColor(color);

        //Create an implicit intent to display the detailed place information if the user taps on the list item
        final Intent itemIntent = new Intent(context, ItemDetailActivity.class);

        //Put the properties of the Object to the intent
        itemIntent.putExtra(context.getString(R.string.color_var), color);
        itemIntent.putExtra(context.getString(R.string.name_var), itemName);
        itemIntent.putExtra(context.getString(R.string.address_var), itemAddress);
        itemIntent.putExtra(context.getString(R.string.desc_var), itemDescription);
        itemIntent.putExtra(context.getString(R.string.img_var), imageItemResourceId);
        itemIntent.putExtra(context.getString(R.string.site_var), itemWeb);


        //Start the intent if the user taps on the list item
        listItemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                context.startActivity(itemIntent);
            }
        });

        return listItemView;
    }

}
