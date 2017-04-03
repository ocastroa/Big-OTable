package com.envision_lightning.big_o;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.Html;
import android.text.method.LinkMovementMethod;
import android.view.MenuItem;
import android.widget.TextView;

/**
 * Created by oscar on 1/7/2017.
 */

public class arrays extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(com.envision_lightning.big_o.R.layout.array);

        TextView arrays =(TextView)findViewById(com.envision_lightning.big_o.R.id.first_link);
        TextView array_video =(TextView)findViewById(com.envision_lightning.big_o.R.id.second_link);
        TextView array_video_two =(TextView)findViewById(com.envision_lightning.big_o.R.id.third_link);
        TextView array_video_three =(TextView)findViewById(com.envision_lightning.big_o.R.id.fourth_link);

        arrays.setClickable(true);
        arrays.setMovementMethod(LinkMovementMethod.getInstance());
        String text = "<a href='https://www.tutorialspoint.com/data_structures_algorithms/array_data_structure.htm'> Arrays (tutorialspoint) </a>"; // text is link to website
        arrays.setText(Html.fromHtml(text));

        array_video.setClickable(true);
        array_video.setMovementMethod(LinkMovementMethod.getInstance());
        String textTwo = "<a href='https://www.cs.cmu.edu/~adamchik/15-121/lectures/Arrays/arrays.html'> Arrays (cs.cmu.edu) </a>";
        array_video.setText(Html.fromHtml(textTwo));

        array_video_two.setClickable(true);
        array_video_two.setMovementMethod(LinkMovementMethod.getInstance());
        String textThree= "<a href='https://www.youtube.com/watch?v=5tPLyHCZdU0'> Array Implementation Video (youtube) </a>";
        array_video_two.setText(Html.fromHtml(textThree));

        array_video_three.setClickable(true);
        array_video_three.setMovementMethod(LinkMovementMethod.getInstance());
        String textFour = "<a href='https://www.youtube.com/watch?v=_j5lhHWkbnQ'> Pointers and Multidimensional Arrays (youtube) </a>";
        array_video_three.setText(Html.fromHtml(textFour));
        }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) { // goes back to its corresponding fragment
        if (item.getItemId() == android.R.id.home) {
            finish();
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
    }

