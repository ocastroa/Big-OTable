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

public class queue extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(com.envision_lightning.big_o.R.layout.queues);

        TextView queue_array =(TextView)findViewById(com.envision_lightning.big_o.R.id.first_link);
        TextView queue_linked_list =(TextView)findViewById(com.envision_lightning.big_o.R.id.second_link);
        TextView queue_video =(TextView)findViewById(com.envision_lightning.big_o.R.id.third_link);

        queue_array.setClickable(true);
        queue_array.setMovementMethod(LinkMovementMethod.getInstance());
        String text = "<a href='https://www.youtube.com/watch?v=okr-XE8yTO8'> Array Implementation of Queue (youtube) </a>";
        queue_array.setText(Html.fromHtml(text));

        queue_linked_list.setClickable(true);
        queue_linked_list.setMovementMethod(LinkMovementMethod.getInstance());
        String textTwo = "<a href='https://www.youtube.com/watch?v=A5_XdiK4J8A'> Linked List Implementation of Queue (youtube) </a>";
        queue_linked_list.setText(Html.fromHtml(textTwo));

        queue_video.setClickable(true);
        queue_video.setMovementMethod(LinkMovementMethod.getInstance());
        String textThree= "<a href='https://www.tutorialspoint.com/data_structures_algorithms/dsa_queue.htm'> Queue Data Structure (tutorialspoint) </a>";
        queue_video.setText(Html.fromHtml(textThree));
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
