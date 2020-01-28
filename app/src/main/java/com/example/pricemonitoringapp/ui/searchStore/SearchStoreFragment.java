package com.example.pricemonitoringapp.ui.searchStore;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.example.pricemonitoringapp.R;

public class SearchStoreFragment extends Fragment {

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        View root = inflater.inflate(R.layout.fragment_search_store, container, false);

        final Spinner food_category_spinner = root.findViewById(R.id.food_category);
// Create an ArrayAdapter using the string array and a default spinner layout
        ArrayAdapter<CharSequence> food_category_adapter = ArrayAdapter.createFromResource(getContext(),
                R.array.food_categories_array, android.R.layout.simple_spinner_item);
// Specify the layout to use when the list of choices appears
        food_category_adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
// Apply the adapter to the spinner
        food_category_spinner.setAdapter(food_category_adapter);

        final Spinner area_spinner = root.findViewById(R.id.area);
        ArrayAdapter<CharSequence> area_adapter = ArrayAdapter.createFromResource(getContext(),
                R.array.areas_array, android.R.layout.simple_spinner_dropdown_item);
        food_category_adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        area_spinner.setAdapter(area_adapter);

        return root;
    }
}