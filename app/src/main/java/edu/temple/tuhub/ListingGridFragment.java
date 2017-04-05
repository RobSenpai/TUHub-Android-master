package edu.temple.tuhub;

import android.app.Fragment;
import android.content.Context;
import android.media.Image;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.ListView;
import org.json.JSONException;
import org.json.JSONObject;
import java.util.ArrayList;
import java.util.List;
import android.widget.GridView;
import android.widget.TextView;
import edu.temple.tuhub.models.Listingitem;
import edu.temple.tuhub.models.Newsitem;

;

/**
 * Created by mangaramu on 3/8/2017.
 */

public class ListingGridFragment extends Fragment {

    Context appcontext;
    GridView myGrid;
    listingAdapter x;
    ArrayList<Listingitem> list;

    public ListingGridFragment() {
        super();
    }


    @Override
    public void onAttach(Context context) {
        appcontext=context;
        super.onAttach(context);
    }

    @Override
    public void setRetainInstance(boolean retain) {
        super.setRetainInstance(true);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.listing_grid, container, false);
        myGrid = (GridView) view.findViewById(R.id.listinggrid);
        myGrid.setAdapter(new listingAdapter(view.getContext()));

        return view;

    }

//TODO have it so the data doesent reload .. unless to try and swipe down ... or you choose diffrent items from the selection menu!
    //TODO make an actionbar that has a dropdown with selectors of diffrent items based on the newsfeeds array.

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public void onStart() {
        super.onStart();
    }

    @Override
    public void onResume() {
        super.onResume();
    }

    @Override
    public void onPause() {
        super.onPause();
    }

    @Override
    public void onStop() {
        super.onStop();
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
    }

    @Override
    public void onDetach() {
        super.onDetach();
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
    }



}
