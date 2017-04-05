package edu.temple.tuhub;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

import edu.temple.tuhub.models.Course;

/**
 * Created by rob s.
 */

public class RosterAdapter extends ArrayAdapter<Course> {

    List roster;

    public RosterAdapter(Context context, List roster) {
        super(context, android.R.layout.simple_list_item_2, roster);
        this.roster = roster;
    }

    @Override
    public int getCount() {
        return roster.size();
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Get the data item for this position
        Course roster = getItem(position);
        // Check if an existing view is being reused, otherwise inflate the view
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(android.R.layout.simple_list_item_2, parent, false);
        }
        // Lookup view for data population
        TextView text1 = (TextView) convertView.findViewById(android.R.id.text1);

        // Populate the data into the template view using the data object
        text1.setText(roster.getName());

        // Return the completed view to render on screen
        return convertView;
    }

}
