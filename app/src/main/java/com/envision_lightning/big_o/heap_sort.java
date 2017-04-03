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

public class heap_sort extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(com.envision_lightning.big_o.R.layout.heap_sort);

        TextView heap_sort =(TextView)findViewById(com.envision_lightning.big_o.R.id.first_link);
        TextView heap_sort_two =(TextView)findViewById(com.envision_lightning.big_o.R.id.second_link);
        TextView heap_sort_psuedocode =(TextView)findViewById(com.envision_lightning.big_o.R.id.third_link);
        TextView heap_sort_video =(TextView)findViewById(com.envision_lightning.big_o.R.id.fourth_link);

        heap_sort.setClickable(true);
        heap_sort.setMovementMethod(LinkMovementMethod.getInstance());
        String text = "<a href='http://quiz.geeksforgeeks.org/heap-sort/'> Heapsort (geeksforgeeks) </a>";
        heap_sort.setText(Html.fromHtml(text));

        heap_sort_two.setClickable(true);
        heap_sort_two.setMovementMethod(LinkMovementMethod.getInstance());
        String textTwo = "<a href='http://faculty.simpson.edu/lydia.sinapova/www/cmsc250/LN250_Weiss/L13-HeapSortEx.htm'> Example of Heapsort (faculty.simpson.edu)</a>";
        heap_sort_two.setText(Html.fromHtml(textTwo));

        heap_sort_psuedocode.setClickable(true);
        heap_sort_psuedocode.setMovementMethod(LinkMovementMethod.getInstance());
        String textThree= "<a href='http://www.cc.gatech.edu/classes/cs3158_98_fall/heapsort.html'> Heapsort Pseudocode (cc.gatech.edu) </a>";
        heap_sort_psuedocode.setText(Html.fromHtml(textThree));

        heap_sort_video.setClickable(true);
        heap_sort_video.setMovementMethod(LinkMovementMethod.getInstance());
        String textFour = "<a href='https://www.youtube.com/watch?v=PqS5T9ZKZno'> Heapsort Video (youtube) </a>";
        heap_sort_video.setText(Html.fromHtml(textFour));
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
