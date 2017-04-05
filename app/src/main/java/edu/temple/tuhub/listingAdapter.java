package edu.temple.tuhub;

import android.content.Context;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import edu.temple.tuhub.models.Listingitem;

/**
 * Created by Rob on 4/4/2017.
 */

class listingAdapter extends BaseAdapter {

    ArrayList<Listingitem> list;
    Context context;

    listingAdapter(Context context) {
        this.context = context;
        list = new ArrayList<>();

        // put listing names/prices/postdates/images/ into arrays
        //i.e. String [] listingTitles = (wherever they are)

        String [] listingTitles;
        String [] descriptions;
        String [] dates;
        String [] prices;

        for(int i = 0; i < listingTitles.length; i++){
            Listingitem tempitem = new Listingitem(listingTitles[i], descriptions[i], dates[i], prices[i]);
            list.add(tempitem);
        }
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int position) {
        return list.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View row = convertView;
        ViewHolder holder = null;

        if(convertView == null)
        {
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            row = inflater.inflate(R.layout.listing_item, parent, false);
            holder = new ViewHolder(row);
            row.setTag(holder);
        }
        else
        {
            holder = (ViewHolder) row.getTag();
        }

        Listingitem temp = list.get(position);

        //holder.myPic.setImageResource(temp.imageid); might be setImageBitmap()
        holder.mytext.setText(temp.listingtitle);

        return row;
    }
}
