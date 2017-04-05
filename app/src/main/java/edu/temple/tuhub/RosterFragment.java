package edu.temple.tuhub;

import android.app.Fragment;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.androidnetworking.error.ANError;

import java.util.Arrays;

import edu.temple.tuhub.models.Course;

/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link RosterFragment.OnCourseFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link RosterFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class RosterFragment extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER

    private static final String ARG_TERM_INDEX = "term-index";
    private static final String ARG_PARAM1 = "section";
    private static final String ARG_PARAM2 = "term";

    private OnCourseFragmentInteractionListener mListener;
    private Course mCourse;
    private ListView rosterlist;


    public RosterFragment() {
    }



    public static RosterFragment newInstance(String section, String term) {
        RosterFragment fragment = new RosterFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, section);
        args.putString(ARG_PARAM2, term);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        mCourse.retrieveRoster(new Course.RosterRequestListener() {
            @Override
            public void onResponse(String[] roster) {
                final ArrayAdapter<String> arrayAdapter = new ArrayAdapter<>(RosterFragment.this.getContext(),
                        // Replace MainActivity with whatever Activity you're currently in
                        android.R.layout.simple_list_item_1,
                        android.R.id.text1,
                        Arrays.asList(roster));
                RosterFragment.this.getActivity().runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        rosterlist.setAdapter(arrayAdapter);
                    }
                });
            }

            @Override
            public void onError(ANError error) {

            }
        });
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        rosterlist = (ListView) getActivity().findViewById(R.id.roster);

        setRetainInstance(true);
        return inflater.inflate(R.layout.fragment_roster,container,false);
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof OnCourseFragmentInteractionListener) {
            mListener = (OnCourseFragmentInteractionListener) context;
        } else {
            throw new RuntimeException(context.toString()
                    + " must implement OnFragmentInteractionListener");
        }
    }

    @Override
    public void onDetach() {
        super.onDetach();
        mListener = null;
    }

    /**
     * This interface must be implemented by activities that contain this
     * fragment to allow an interaction in this fragment to be communicated
     * to the activity and potentially other fragments contained in that
     * activity.
     * <p>
     * See the Android Training lesson <a href=
     * "http://developer.android.com/training/basics/fragments/communicating.html"
     * >Communicating with Other Fragments</a> for more information.
     */
    public interface OnCourseFragmentInteractionListener {
        // TODO: Update argument type and name
        void onFragmentInteraction(Course item);
    }
}
