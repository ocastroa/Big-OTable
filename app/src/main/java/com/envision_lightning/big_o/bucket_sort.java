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

public class bucket_sort extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(com.envision_lightning.big_o.R.layout.bucket_sort);

        TextView bucket_sort =(TextView)findViewById(com.envision_lightning.big_o.R.id.first_link);
        TextView bucket_sort_visualization =(TextView)findViewById(com.envision_lightning.big_o.R.id.second_link);
        TextView bucket_sort_video =(TextView)findViewById(com.envision_lightning.big_o.R.id.third_link);
        TextView bucket_sort_video_two =(TextView)findViewById(com.envision_lightning.big_o.R.id.fourth_link);

        bucket_sort.setClickable(true);
        bucket_sort.setMovementMethod(LinkMovementMethod.getInstance());
        String text = "<a href='http://www.geeksforgeeks.org/bucket-sort-2/'> Bucketsort (geeksforgeeks) </a>";
        bucket_sort.setText(Html.fromHtml(text));

        bucket_sort_visualization.setClickable(true);
        bucket_sort_visualization.setMovementMethod(LinkMovementMethod.getInstance());
        String textTwo = "<a href='https://www.cs.usfca.edu/~galles/visualization/BucketSort.html'> Bucketsort Visualization (cs.usfca.edu)</a>";
        bucket_sort_visualization.setText(Html.fromHtml(textTwo));

        bucket_sort_video.setClickable(true);
        bucket_sort_video.setMovementMethod(LinkMovementMethod.getInstance());
        String textThree= "<a href='https://www.youtube.com/watch?v=geVyIsFpxUs'> Bucketsort Video (youtube) </a>";
        bucket_sort_video.setText(Html.fromHtml(textThree));

        bucket_sort_video_two.setClickable(true);
        bucket_sort_video_two.setMovementMethod(LinkMovementMethod.getInstance());
        String textFour = "<a href='https://www.youtube.com/watch?v=VuXbEb5ywrU'> Bucketsort Video (youtube) </a>";
        bucket_sort_video_two.setText(Html.fromHtml(textFour));
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
