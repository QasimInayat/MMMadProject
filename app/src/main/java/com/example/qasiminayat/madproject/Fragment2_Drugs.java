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

public class Fragment2_Drugs extends Fragment {


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment2_drugs, container, false);

        ListView ListView = (ListView) view.findViewById(R.id.ListView);
        ImageView imageView = (ImageView) view.findViewById(R.id.imageView);


        String[] menuItems = {
                "Beladarma Plaster",
                "Sanny Plast",
                "Bandage 3",
                "Bandage 4",
                "Bandage 5",
                "Bandage 6",
                "Bandage 7",
                "Bandage 8",
                "Bandage 9",

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