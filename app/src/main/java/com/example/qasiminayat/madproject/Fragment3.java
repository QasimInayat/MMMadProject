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

public class Fragment3 extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment3, container, false);

        ListView ListView = (ListView) view.findViewById(R.id.ListView);
        ImageView imageView = (ImageView) view.findViewById(R.id.imageView);


        String[] menuItems = {
                "Banana RS.80/Dozen",
                "Orange RS.100/Dozen",
                "Mango RS.300/KG",
                "PomeGranate RS.250/KG",
                "Peach RS.250/KG",
                "Cherry RS.200/BOX",
                "Stawberry RS.150/KG",
                "Pineapple RS.500/KG",
                "Apple RS.350/KG",
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



