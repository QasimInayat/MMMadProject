package com.example.qasiminayat.madproject;

import android.os.Bundle;
import android.provider.ContactsContract;
import android.support.v4.app.Fragment;
import android.support.v4.media.session.IMediaControllerCallback;
import android.support.v4.widget.ListViewAutoScrollHelper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 * Created by QasimInayat on 5/4/2017.
 */

public class Fragment1 extends Fragment {













    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment1, container, false);

        ListView ListView = (ListView) view.findViewById(R.id.ListView);
        ImageView imageView = (ImageView) view.findViewById(R.id.imageView);


        String [] menuItems = {"Meezan Banaspati (Pillow Pack x 5) Rs. 600",
                "Meezan Banaspati (Can) Rs.500",
                "Meezan Cooking Oil (Pillow Pack x 5) Rs.750",
                "Habib Banaspati (Pillow Pack x 5) Rs. 700",
                "Habib Banaspati (Can) Rs.600",
                "Habib Cooking Oil (Pillow Pack x 5) Rs.850",
                "Barkat Banaspati (Pillow Pack x 5) Rs. 400",
                "Barkat Banaspati (Can) Rs.400",
                "Meezan Cooking Oil (Pillow Pack x 5) Rs.550",
                "Talo Banaspati (Pillow Pack x 5) Rs. 600",
                "Talo Banaspati (Can) Rs.500",
                "Talo Cooking Oil (Pillow Pack x 5) Rs.750",
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
