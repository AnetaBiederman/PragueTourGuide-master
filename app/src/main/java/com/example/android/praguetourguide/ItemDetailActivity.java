package com.example.android.praguetourguide;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class ItemDetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.item_detail);

        //Get the properties of the Place Object from the intent
        Bundle bundle = getIntent().getExtras();
        int color = bundle.getInt(getString(R.string.color_var));
        String placeName = bundle.getString(getString(R.string.name_var));
        String placeAddress = bundle.getString(getString(R.string.address_var));
        String placeDescription = bundle.getString(getString(R.string.desc_var));
        int placeImage = bundle.getInt(getString(R.string.img_var));
        final String placeSite = bundle.getString(getString(R.string.site_var));

        LinearLayout detailContainer = this.findViewById(R.id.detail_container);
        detailContainer.setBackgroundColor(color);

        //Set the name of the place as the title of the screen
        this.setTitle(placeName);

        //Activate Up Button to enable the navigation back to the MainActivity
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        //Set the image to the ImageView in the activity_place_details.xml
        ImageView imageView = (ImageView) findViewById(R.id.detail_picture);
        imageView.setImageResource(placeImage);

        //Set the name to the TextView in the activity_place_details.xml
        TextView nameTextView = (TextView) findViewById(R.id.detail_item_name);
        nameTextView.setText(placeName);

        //Set the address to the TextView in the activity_place_details.xml
        TextView addressTextView = (TextView) findViewById(R.id.detail_address);
        addressTextView.setText(placeAddress);

        //Set the description to the TextView in the activity_place_details.xml
        TextView descriptionTextView = (TextView) findViewById(R.id.detail_description);
        descriptionTextView.setText(placeDescription);

        //Create an intent for the web page of the Place Object
        TextView linkView = (TextView) findViewById(R.id.detail_website);
        linkView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //If clicking on the icon, goes to the site of the place
                Uri webpage = Uri.parse(placeSite);
                Intent webIntent = new Intent(Intent.ACTION_VIEW, webpage);
                if (webIntent.resolveActivity(getPackageManager()) != null) {
                    startActivity(webIntent);
                }
            }
        });

    }

    }
