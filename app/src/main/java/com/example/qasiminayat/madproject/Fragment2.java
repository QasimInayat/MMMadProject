package com.example.qasiminayat.madproject;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;

/**
 * Created by QasimInayat on 5/4/2017.
 */

public class Fragment2 extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment2, container, false);

        ListView ListView = (ListView) view.findViewById(R.id.ListView);
        ImageView imageView = (ImageView) view.findViewById(R.id.imageView);


        String[] menuItems = {"Cucumber  RS.20/KG",
                "Onions Rs.30/KG",
                "Carrots Rs.30/KG",
                "Lady Finger Rs.80/KG",
                "Patato Rs.35/KG",
                "Sweet Patato Rs.50/KG",
                "Tomato RS.40/KG",
                "Green Chilli RS.150/KG",
                "Pumpkin RS.40/KG",
                "Mint RS.250/KG" ,

        };

        ArrayAdapter<String> ListViewAdapter = new ArrayAdapter<String>(
                getActivity(),
                android.R.layout.simple_list_item_1,
                menuItems
        );

        ListView.setAdapter(ListViewAdapter);
        return view;

    }
}
