package com.example.android.praguetourguide;

/**
 * Created by Aneta BIEDERMAN on 06 Apr 2018.
 */

public class GuideItem {

    /** Name of Item */
    private String myItemName;

    /** Address of Item */
    private String myItemAddress;

    /** Address of Item */
    private String myItemDescription;

    /** Address of Item */
    private String myItemWeb;

    /** Image resource ID for the Item */
    private int myImageItemResourceId;

    /**
     * Create a new Item object.
     *
     * @param itemName is the name of the item in guide
     * @param itemAddress is the address of the item in guide
     * @param itemWeb is the website of the item in guide
     * @param itemDescription is the description of the item in guide
     * @param imageItemResourceId is the picture of the item in guide
     */
    public GuideItem (String itemName, String itemAddress, String itemWeb, String itemDescription, int imageItemResourceId) {
        myItemName = itemName;
        myItemAddress = itemAddress;
        myItemDescription = itemDescription;
        myItemWeb = itemWeb;
        myImageItemResourceId = imageItemResourceId;
    }

    /**
     * Get the name of the Item.
     */
    public String getItemName() {
        return myItemName;
    }

    /**
     * Get the address of the Item.
     */
    public String getItemAddress() {
        return myItemAddress;
    }

    /**
     * Get the description of the Item.
     */
    public String getItemDescription() {
        return myItemDescription;
    }

    /**
     * Get the website of the Item.
     */
    public String getItemWeb() {
        return myItemWeb;
    }

    /**
     * Return the image resource ID of the Item.
     */
    public int getImageItemResourceId() {
        return myImageItemResourceId;
    }
}
