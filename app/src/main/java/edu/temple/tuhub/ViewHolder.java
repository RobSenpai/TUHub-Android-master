package edu.temple.tuhub;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Rob on 4/4/2017.
 */

//this is for when we have an image
public class ViewHolder
{
    ImageView myPic; //this could also be int imageId
    TextView mytext;
    ViewHolder(View v) {
        myPic = (ImageView) v.findViewById(R.id.listingImage);
        mytext = (TextView) v.findViewById(R.id.title);
    }
}
