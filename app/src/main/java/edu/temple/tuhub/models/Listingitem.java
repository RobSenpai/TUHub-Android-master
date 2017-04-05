package edu.temple.tuhub.models;

import android.graphics.Bitmap;

/**
 * Created by mangaramu on 3/12/2017.
 */

public class Listingitem {
    public String listingtitle, description, postDate, listingprice, listingimagelink;
    public Bitmap listingimage;
    public Listingitem(String title, String imagelink, Bitmap image, String content, String date, String price)
    {
        listingtitle=title;
        description = content;
        postDate = date;
        listingprice = price;

        //listingimage=image;
        //listingimagelink = imagelink;
    }
    public Listingitem(String title, String content, String date, String price) {
        this.listingtitle=title;
        this.description = content;
        this.postDate = date;
        this.listingprice = price;
    }

    public void setListingtitle(String newstitle) {

        this.listingtitle = newstitle;
    }

    public void setListingDescription(String descr) {
        this.description = descr;
    }

    public void setPostDate(String date) {

        this.postDate = date;
    }

    public void setPrice(String price) {

        this.listingprice = price;
    }

    public String getlistingtitle() {
        return listingtitle;
    }

    public String getListingDescription() {
        return description;
    }

    public String getPostDate() {
        return postDate;
    }

    public String getListingprice() { return listingprice; }

}

