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
 * Creates the second tab fragment
 */

public class tab_fragment_two extends Fragment implements View.OnClickListener {

    View view;
    Button bucketsort;
    Button bubblesort;
    Button insertionsort;
    Button selectionsort;
    Button heapsort;
    Button mergesort;
    Button quicksort;
    Button radixsort;
    Button countingsort;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        view = inflater.inflate(com.envision_lightning.big_o.R.layout.tab_fragments_two, container, false);
        bucketsort = (Button) view.findViewById(com.envision_lightning.big_o.R.id.bucketsort);
        bubblesort = (Button) view.findViewById(com.envision_lightning.big_o.R.id.bubblesort);
        insertionsort = (Button) view.findViewById(com.envision_lightning.big_o.R.id.insertionsort);
        selectionsort = (Button) view.findViewById(com.envision_lightning.big_o.R.id.selectionsort);
        heapsort = (Button) view.findViewById(com.envision_lightning.big_o.R.id.heapsort);
        mergesort = (Button) view.findViewById(com.envision_lightning.big_o.R.id.mergesort);
        quicksort = (Button) view.findViewById(com.envision_lightning.big_o.R.id.quicksort);
        radixsort = (Button) view.findViewById(com.envision_lightning.big_o.R.id.radixsort);
        countingsort = (Button) view.findViewById(com.envision_lightning.big_o.R.id.countingsort);


        bucketsort.setOnClickListener(this);
        bubblesort.setOnClickListener(this);
        insertionsort.setOnClickListener(this);
        selectionsort.setOnClickListener(this);
        heapsort.setOnClickListener(this);
        mergesort.setOnClickListener(this);
        quicksort.setOnClickListener(this);
        radixsort.setOnClickListener(this);
        countingsort.setOnClickListener(this);
        return view;
    }

    @Override
    public void onClick(View v) { // second tab for sorting algorithms where each button is clickable
        Intent intent;

        switch(v.getId()){
            case com.envision_lightning.big_o.R.id.bucketsort:
                intent = new Intent(getActivity(),bucket_sort.class);
                startActivity(intent);
                break;

            case com.envision_lightning.big_o.R.id.bubblesort:
                intent = new Intent(getActivity(),bubble_sort.class);
                startActivity(intent);
                break;

            case com.envision_lightning.big_o.R.id.insertionsort:
                intent = new Intent(getActivity(),insertion_sort.class);
                startActivity(intent);
                break;

            case com.envision_lightning.big_o.R.id.selectionsort:
                intent = new Intent(getActivity(),selection_sort.class);
                startActivity(intent);
                break;

            case com.envision_lightning.big_o.R.id.heapsort:
                intent = new Intent(getActivity(),heap_sort.class);
                startActivity(intent);
                break;

            case com.envision_lightning.big_o.R.id.mergesort:
                intent = new Intent(getActivity(),merge_sort.class);
                startActivity(intent);
                break;

            case com.envision_lightning.big_o.R.id.quicksort:
                intent = new Intent(getActivity(),quick_sort.class);
                startActivity(intent);
                break;

            case com.envision_lightning.big_o.R.id.radixsort:
                intent = new Intent(getActivity(),radix_sort.class);
                startActivity(intent);
                break;

            case com.envision_lightning.big_o.R.id.countingsort:
                intent = new Intent(getActivity(),counting_sort.class);
                startActivity(intent);
                break;

        }
    }
}
