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

public class hashtable extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(com.envision_lightning.big_o.R.layout.hashtables);

        TextView hash_table =(TextView)findViewById(com.envision_lightning.big_o.R.id.first_link);
        TextView hashtable_implementation =(TextView)findViewById(com.envision_lightning.big_o.R.id.second_link);
        TextView hashtable_video =(TextView)findViewById(com.envision_lightning.big_o.R.id.third_link);
        TextView hashtable_video_two =(TextView)findViewById(com.envision_lightning.big_o.R.id.fourth_link);

        hash_table.setClickable(true);
        hash_table.setMovementMethod(LinkMovementMethod.getInstance());
        String text = "<a href='https://www.tutorialspoint.com/data_structures_algorithms/hash_data_structure.htm'> Hash Tables (tutorialspoint) </a>";
        hash_table.setText(Html.fromHtml(text));

        hashtable_implementation.setClickable(true);
        hashtable_implementation.setMovementMethod(LinkMovementMethod.getInstance());
        String textTwo = "<a href='http://www.personal.kent.edu/~rmuhamma/Algorithms/MyAlgorithms/hashTable.htm'> Hash Tables (personal.kent.edu) </a>";
        hashtable_implementation.setText(Html.fromHtml(textTwo));

        hashtable_video.setClickable(true);
        hashtable_video.setMovementMethod(LinkMovementMethod.getInstance());
        String textThree= "<a href='https://www.youtube.com/watch?v=tjtFkT97Xmc'>  Hash Tables Video (youtube) </a>";
        hashtable_video.setText(Html.fromHtml(textThree));

        hashtable_video_two.setClickable(true);
        hashtable_video_two.setMovementMethod(LinkMovementMethod.getInstance());
        String textFour = "<a href='https://www.youtube.com/watch?v=B4vqVDeERhI'> Hash Tables Implementation (youtube) </a>";
        hashtable_video_two.setText(Html.fromHtml(textFour));
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
