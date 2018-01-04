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

public class Fragment6 extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment6, container, false);

        ListView ListView = (ListView) view.findViewById(R.id.ListView);
        ImageView imageView = (ImageView) view.findViewById(R.id.imageView);


        String[] menuItems = {
                "Arial (1KG PACK)/RS.250",
                "Surf Excel (1KG PACK)/RS.300",
                "Gaye Washing Powder (1KG PACK)/RS.150",
                "Bonus (1KG PACK)/RS.150",
                "Bonus Tri Star (1KG PACK)/RS.200",
                "Rim (1KG PACK)/RS.100",
                "Pak (1KG PACK)/RS.90",
                "Excel (1KG PACK/RS.100)",
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
