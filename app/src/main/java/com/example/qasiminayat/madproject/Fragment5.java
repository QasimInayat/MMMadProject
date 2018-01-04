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

public class Fragment5 extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment5, container, false);

        ListView ListView = (ListView) view.findViewById(R.id.ListView);
        ImageView imageView = (ImageView) view.findViewById(R.id.imageView);


        String[] menuItems = {
                "Tapal (1KG PACK)/RS.250",
                "Lipton (1KG PACK)/RS.300 ",
                "Everyday (1KG PACK)/RS.500",
                "Habib Milk (1KG PACK)/RS.180",
                "Maggi Noodles (12 PACK)/RS.120",
                "Kolsan Macrony (1KG PACK)/RS.250",
                "Trang (12PACK)/RS.120",
                "Good milk (12PACK)/RS.120",
                "Day fresh (1KG PACK)/RS.200",
                "Olpers (1KG PACK)/RS.250",
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



