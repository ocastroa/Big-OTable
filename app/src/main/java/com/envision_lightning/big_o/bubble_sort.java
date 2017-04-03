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

public class bubble_sort extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(com.envision_lightning.big_o.R.layout.bubble_sort);

        TextView bubble_sort =(TextView)findViewById(com.envision_lightning.big_o.R.id.first_link);
        TextView bubble_sort_two =(TextView)findViewById(com.envision_lightning.big_o.R.id.second_link);
        TextView bubble_sort_video =(TextView)findViewById(com.envision_lightning.big_o.R.id.third_link);
        TextView bubble_sort_video_two =(TextView)findViewById(com.envision_lightning.big_o.R.id.fourth_link);

        bubble_sort.setClickable(true);
        bubble_sort.setMovementMethod(LinkMovementMethod.getInstance());
        String text = "<a href='https://www.tutorialspoint.com/data_structures_algorithms/bubble_sort_algorithm.htm'> Bubblesort (tutorialspoint) </a>";
        bubble_sort.setText(Html.fromHtml(text));

        bubble_sort_two.setClickable(true);
        bubble_sort_two.setMovementMethod(LinkMovementMethod.getInstance());
        String textTwo = "<a href='http://quiz.geeksforgeeks.org/bubble-sort/'> Bubblesort (geeksforgeeks)</a>";
        bubble_sort_two.setText(Html.fromHtml(textTwo));

        bubble_sort_video.setClickable(true);
        bubble_sort_video.setMovementMethod(LinkMovementMethod.getInstance());
        String textThree= "<a href='https://www.youtube.com/watch?v=Jdtq5uKz-w4'> Bubblesort Video (youtube) </a>";
        bubble_sort_video.setText(Html.fromHtml(textThree));

        bubble_sort_video_two.setClickable(true);
        bubble_sort_video_two.setMovementMethod(LinkMovementMethod.getInstance());
        String textFour = "<a href='https://www.youtube.com/watch?v=8Kp-8OGwphY'> Bubblesort Video (youtube) </a>";
        bubble_sort_video_two.setText(Html.fromHtml(textFour));
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
