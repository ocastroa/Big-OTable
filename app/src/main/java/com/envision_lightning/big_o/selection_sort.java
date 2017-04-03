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

public class selection_sort extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(com.envision_lightning.big_o.R.layout.selection_sort);

        TextView selection_sort =(TextView)findViewById(com.envision_lightning.big_o.R.id.first_link);
        TextView selection_sort_two =(TextView)findViewById(com.envision_lightning.big_o.R.id.second_link);
        TextView selection_sort_video =(TextView)findViewById(com.envision_lightning.big_o.R.id.third_link);
        TextView iselection_sort_video_two =(TextView)findViewById(com.envision_lightning.big_o.R.id.fourth_link);

        selection_sort.setClickable(true);
        selection_sort.setMovementMethod(LinkMovementMethod.getInstance());
        String text = "<a href='https://www.tutorialspoint.com/data_structures_algorithms/selection_sort_algorithm.htm'> Selectionsort (tutorialspoint) </a>";
        selection_sort.setText(Html.fromHtml(text));

        selection_sort_two.setClickable(true);
        selection_sort_two.setMovementMethod(LinkMovementMethod.getInstance());
        String textTwo = "<a href='https://www.khanacademy.org/computing/computer-science/algorithms/sorting-algorithms/a/sorting'> Selectionsort (khanacademy)</a>";
        selection_sort_two.setText(Html.fromHtml(textTwo));

        selection_sort_video.setClickable(true);
        selection_sort_video.setMovementMethod(LinkMovementMethod.getInstance());
        String textThree= "<a href='https://www.youtube.com/watch?v=GUDLRan2DWM'> Selectionsort Video (youtube) </a>";
        selection_sort_video.setText(Html.fromHtml(textThree));

        iselection_sort_video_two.setClickable(true);
        iselection_sort_video_two.setMovementMethod(LinkMovementMethod.getInstance());
        String textFour = "<a href='https://www.youtube.com/watch?v=f8hXR_Hvybo'> Selectionsort Video (youtube) </a>";
        iselection_sort_video_two.setText(Html.fromHtml(textFour));
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
