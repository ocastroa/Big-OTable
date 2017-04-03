package com.envision_lightning.big_o;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.Html;
import android.text.method.LinkMovementMethod;
import android.view.MenuItem;
import android.widget.TextView;

/**
 * Created by oscar on 1/9/2017.
 */

public class rbt extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(com.envision_lightning.big_o.R.layout.redblacktrees);

        TextView rbt =(TextView)findViewById(com.envision_lightning.big_o.R.id.first_link);
        TextView rbt_animation =(TextView)findViewById(com.envision_lightning.big_o.R.id.second_link);
        TextView rbt_video =(TextView)findViewById(com.envision_lightning.big_o.R.id.third_link);
        TextView rbt_video_two =(TextView)findViewById(com.envision_lightning.big_o.R.id.fourth_link);

        rbt.setClickable(true);
        rbt.setMovementMethod(LinkMovementMethod.getInstance());
        String text = "<a href='http://pages.cs.wisc.edu/~paton/readings/Red-Black-Trees/'> Red Black Trees (cs.wisc.edu) </a>";
        rbt.setText(Html.fromHtml(text));

        rbt_animation.setClickable(true);
        rbt_animation.setMovementMethod(LinkMovementMethod.getInstance());
        String textTwo = "<a href='https://www.youtube.com/watch?v=rcDF8IqTnyI'> Red Black Trees Animation (youtube) </a>";
        rbt_animation.setText(Html.fromHtml(textTwo));

        rbt_video.setClickable(true);
        rbt_video.setMovementMethod(LinkMovementMethod.getInstance());
        String textThree= "<a href='https://www.youtube.com/watch?v=axa2g5oOzCE'>  Red Black Trees Video (youtube) </a>";
        rbt_video.setText(Html.fromHtml(textThree));

        rbt_video_two.setClickable(true);
        rbt_video_two.setMovementMethod(LinkMovementMethod.getInstance());
        String textFour = "<a href='https://www.youtube.com/watch?v=PhY56LpCtP4'> Red Black Trees Video (youtube) </a>";
        rbt_video_two.setText(Html.fromHtml(textFour));
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
