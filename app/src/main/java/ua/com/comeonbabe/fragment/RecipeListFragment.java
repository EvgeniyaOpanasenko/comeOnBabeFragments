package ua.com.comeonbabe.fragment;


import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import ua.com.comeonbabe.R;


/**
 * A simple {@link Fragment} subclass.
 */
public class RecipeListFragment extends Fragment {

    public RecipeListFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        return inflater.inflate(R.layout.fragment_recipe_list, container, false);
    }


}
