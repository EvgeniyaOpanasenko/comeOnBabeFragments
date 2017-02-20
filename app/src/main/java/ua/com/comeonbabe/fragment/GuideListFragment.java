package ua.com.comeonbabe.fragment;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.ListFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;

import ua.com.comeonbabe.R;
import ua.com.comeonbabe.activity.ImageGuideActivity;
import ua.com.comeonbabe.model.Guide;

/**
 *
 */
public class GuideListFragment extends ListFragment {

    public GuideListFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        String[] title = new String[Guide.guide.length];
        for (int i = 0; i < title.length; i++) {
            title[i] = Guide.guide[i].getName();
        }

        ListAdapter myListAdapter = new ArrayAdapter<String>(
                getActivity(),
                android.R.layout.simple_list_item_1, title
        );
        setListAdapter(myListAdapter);

        return inflater.inflate(R.layout.fragment_guide_list, container, false);

    }

    @Override
    public void onListItemClick(ListView l, View v, int position, long id) {

        Intent intent = new Intent(v.getContext(), ImageGuideActivity.class);
        intent.putExtra(ImageGuideActivity.EXTRA_GUIDE_NUM, (int) id);
        startActivity(intent);

    }
}



