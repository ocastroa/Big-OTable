package com.envision_lightning.big_o;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

/**
 * Created by oscar on 1/6/2017.
 * Creates the first tab fragment
 */

public class tab_fragment_one extends Fragment implements View.OnClickListener {

    View view;
    Button array;
   Button linkedlist;
   Button hashtable;
   Button bst;
   Button btree;
    Button rbt;
   Button avl;
    Button stack;
    Button queue;



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        view = inflater.inflate(com.envision_lightning.big_o.R.layout.tab_fragment_one, container, false);
        array = (Button) view.findViewById(com.envision_lightning.big_o.R.id.array);
        linkedlist = (Button) view.findViewById(com.envision_lightning.big_o.R.id.linkedlist);
        hashtable = (Button) view.findViewById(com.envision_lightning.big_o.R.id.hashtable);
        bst = (Button) view.findViewById(com.envision_lightning.big_o.R.id.bst);
        btree = (Button) view.findViewById(com.envision_lightning.big_o.R.id.btree);
        rbt = (Button) view.findViewById(com.envision_lightning.big_o.R.id.first_link);
        avl = (Button) view.findViewById(com.envision_lightning.big_o.R.id.second_link);
        stack = (Button) view.findViewById(com.envision_lightning.big_o.R.id.stack);
        queue = (Button) view.findViewById(com.envision_lightning.big_o.R.id.queue);


        array.setOnClickListener(this);
        linkedlist.setOnClickListener(this);
        hashtable.setOnClickListener(this);
        bst.setOnClickListener(this);
        btree.setOnClickListener(this);
        rbt.setOnClickListener(this);
        avl.setOnClickListener(this);
        stack.setOnClickListener(this);
        queue.setOnClickListener(this);


        return view;
    }

    @Override
    public void onClick(View v) { // first tab page with data structures. This functions tells program what to do when a button is clicked
        Intent intent;

        switch(v.getId()){
            case com.envision_lightning.big_o.R.id.array:
                intent = new Intent(getActivity(),arrays.class);
                startActivity(intent);
                break;

            case com.envision_lightning.big_o.R.id.hashtable:
                intent = new Intent(getActivity(),hashtable.class);
                startActivity(intent);
                break;

            case com.envision_lightning.big_o.R.id.linkedlist:
                intent = new Intent(getActivity(),linkedlist.class);
                startActivity(intent);
                break;

            case com.envision_lightning.big_o.R.id.bst:
                intent = new Intent(getActivity(),bst.class);
                startActivity(intent);
                break;

            case com.envision_lightning.big_o.R.id.btree:
                intent = new Intent(getActivity(),btree.class);
                startActivity(intent);
                break;

            case com.envision_lightning.big_o.R.id.first_link:
                intent = new Intent(getActivity(),rbt.class);
                startActivity(intent);
                break;

            case com.envision_lightning.big_o.R.id.second_link:
                intent = new Intent(getActivity(),avl.class);
                startActivity(intent);
                break;

            case com.envision_lightning.big_o.R.id.stack:
                intent = new Intent(getActivity(),stack.class);
                startActivity(intent);
                break;

            case com.envision_lightning.big_o.R.id.queue:
                intent = new Intent(getActivity(),queue.class);
                startActivity(intent);
                break;

        }
    }
}
