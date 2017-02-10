package ua.com.comeonbabe.fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.ListFragment;
import android.util.SparseBooleanArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Toast;

import ua.com.comeonbabe.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class GuideListFragment extends ListFragment {

    String[] guide ={
            "January",
            "February",
            "March",
            "April",
            "May",
            "June",
            "July",
            "August",
            "September",
            "October",
            "November",
            "December"
    };

    public GuideListFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        ListAdapter myListAdapter = new ArrayAdapter<String>(
                getActivity(),
                android.R.layout.simple_list_item_multiple_choice,
                guide
        );

        setListAdapter(myListAdapter);
        return inflater.inflate(R.layout.fragment_guide_list, container, false);
    }




    @Override
    public void onListItemClick(ListView l, View v, int position, long id) {

        String prompt =
                "clicked item: " + getListView().getItemAtPosition(position).toString() + "\n\n";

        prompt += "selected items: \n";
        int count = getListView().getCount();
        SparseBooleanArray sparseBooleanArray = getListView().getCheckedItemPositions();
        for (int i = 0; i < count; i++){
            if (sparseBooleanArray.get(i)) {
                prompt += getListView().getItemAtPosition(i).toString() + "\n";
            }
        }

        Toast.makeText(getActivity(), prompt, Toast.LENGTH_LONG).show();
    }


}
