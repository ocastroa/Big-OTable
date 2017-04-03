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

public class insertion_sort extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(com.envision_lightning.big_o.R.layout.insertion_sort);

        TextView insertion_sort =(TextView)findViewById(com.envision_lightning.big_o.R.id.first_link);
        TextView insertion_sort_two =(TextView)findViewById(com.envision_lightning.big_o.R.id.second_link);
        TextView insertion_sort_video =(TextView)findViewById(com.envision_lightning.big_o.R.id.third_link);
        TextView insertion_sort_video_two =(TextView)findViewById(com.envision_lightning.big_o.R.id.fourth_link);

        insertion_sort.setClickable(true);
        insertion_sort.setMovementMethod(LinkMovementMethod.getInstance());
        String text = "<a href='https://www.tutorialspoint.com/data_structures_algorithms/insertion_sort_algorithm.htm'> Insertionsort (tutorialspoint) </a>";
        insertion_sort.setText(Html.fromHtml(text));

        insertion_sort_two.setClickable(true);
        insertion_sort_two.setMovementMethod(LinkMovementMethod.getInstance());
        String textTwo = "<a href='https://www.khanacademy.org/computing/computer-science/algorithms/insertion-sort/a/insertion-sort'> Insertionsort (khanacademy)</a>";
        insertion_sort_two.setText(Html.fromHtml(textTwo));

        insertion_sort_video.setClickable(true);
        insertion_sort_video.setMovementMethod(LinkMovementMethod.getInstance());
        String textThree= "<a href='https://www.youtube.com/watch?v=i-SKeOcBwko'> Insertionsort Video (youtube) </a>";
        insertion_sort_video.setText(Html.fromHtml(textThree));

        insertion_sort_video_two.setClickable(true);
        insertion_sort_video_two.setMovementMethod(LinkMovementMethod.getInstance());
        String textFour = "<a href='https://www.youtube.com/watch?v=DFG-XuyPYUQ'> Insertionsort Video (youtube) </a>";
        insertion_sort_video_two.setText(Html.fromHtml(textFour));
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
