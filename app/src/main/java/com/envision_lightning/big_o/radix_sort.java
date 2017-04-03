package com.envision_lightning.big_o;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.Html;
import android.text.method.LinkMovementMethod;
import android.view.MenuItem;
import android.widget.TextView;

/**
 * Created by oscar on 1/10/2017.
 */

public class radix_sort extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(com.envision_lightning.big_o.R.layout.radix_sort);

        TextView radix_sort =(TextView)findViewById(com.envision_lightning.big_o.R.id.first_link);
        TextView radix_sort_two =(TextView)findViewById(com.envision_lightning.big_o.R.id.second_link);
        TextView radix_sort_three =(TextView)findViewById(com.envision_lightning.big_o.R.id.third_link);
        TextView radix_sort_visualization =(TextView)findViewById(com.envision_lightning.big_o.R.id.fourth_link);

        radix_sort.setClickable(true);
        radix_sort.setMovementMethod(LinkMovementMethod.getInstance());
        String text = "<a href='http://www.geeksforgeeks.org/radix-sort/'> Radixsort (geeksforgeeks) </a>";
        radix_sort.setText(Html.fromHtml(text));

        radix_sort_two.setClickable(true);
        radix_sort_two.setMovementMethod(LinkMovementMethod.getInstance());
        String textTwo = "<a href='http://stackoverflow.com/questions/14717560/how-does-radix-sort-work'> How Radixsort Works (stackoverflow)</a>";
        radix_sort_two.setText(Html.fromHtml(textTwo));

        radix_sort_three.setClickable(true);
        radix_sort_three.setMovementMethod(LinkMovementMethod.getInstance());
        String textThree= "<a href='https://www.cs.princeton.edu/~rs/AlgsDS07/18RadixSort.pdf'> Radixsort (cs.princeton.edu) </a>";
        radix_sort_three.setText(Html.fromHtml(textThree));

        radix_sort_visualization.setClickable(true);
        radix_sort_visualization.setMovementMethod(LinkMovementMethod.getInstance());
        String textFour = "<a href='https://www.cs.usfca.edu/~galles/visualization/RadixSort.html'> Radixsort Visualization (cs.usfca.edu) </a>";
        radix_sort_visualization.setText(Html.fromHtml(textFour));
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            finish();
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
