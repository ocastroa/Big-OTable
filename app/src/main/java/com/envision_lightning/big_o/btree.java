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

public class btree extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(com.envision_lightning.big_o.R.layout.btrees);

        TextView bt =(TextView)findViewById(com.envision_lightning.big_o.R.id.first_link);
        TextView bt_two =(TextView)findViewById(com.envision_lightning.big_o.R.id.second_link);
        TextView bt_video =(TextView)findViewById(com.envision_lightning.big_o.R.id.third_link);
        TextView bt_video_two =(TextView)findViewById(com.envision_lightning.big_o.R.id.fourth_link);

        bt.setClickable(true);
        bt.setMovementMethod(LinkMovementMethod.getInstance());
        String text = "<a href='http://www.cs.cornell.edu/courses/cs3110/2011sp/Recitations/rec24-B-trees/B-trees.htm'> B-Trees (cs.cornell.edu) </a>";
        bt.setText(Html.fromHtml(text));

        bt_two.setClickable(true);
        bt_two.setMovementMethod(LinkMovementMethod.getInstance());
        String textTwo = "<a href='https://www.cpp.edu/~ftang/courses/CS241/notes/b-tree.htm'> B-Trees (cpp.edu) </a>";
        bt_two.setText(Html.fromHtml(textTwo));

        bt_video.setClickable(true);
        bt_video.setMovementMethod(LinkMovementMethod.getInstance());
        String textThree= "<a href='https://www.youtube.com/watch?v=k5J9M5_IMzg'>  B-Trees Video (youtube) </a>";
        bt_video.setText(Html.fromHtml(textThree));

        bt_video_two.setClickable(true);
        bt_video_two.setMovementMethod(LinkMovementMethod.getInstance());
        String textFour = "<a href='https://www.youtube.com/watch?v=I22wEC1tTGo'> B-Trees Video (youtube) </a>";
        bt_video_two.setText(Html.fromHtml(textFour));
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
