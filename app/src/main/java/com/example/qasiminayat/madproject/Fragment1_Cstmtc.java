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

public class Fragment1_Cstmtc extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment1_cstmtc, container, false);

        ListView ListView = (ListView) view.findViewById(R.id.ListView);
        ImageView imageView = (ImageView) view.findViewById(R.id.imageView);


        String[] menuItems = {
                "Fair & Lovely Rs.90/Pack(small)",
                "Ponds Rs.220/Pack(medium)",
                "Olivia Rs.320/Pack(large)",
                "Fiaza Beauty Cream Rs.100/Pack(large)",
                "Mode Girl Rs.200/Pack(large)",
                "Lakme Rs.300/Pack(large)",
                "Fair & Lovely Men Rs.120/Pack",
                "Fair & Handsome Rs.100/Pack",
                "Garnier Rs.200/Pack",

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
