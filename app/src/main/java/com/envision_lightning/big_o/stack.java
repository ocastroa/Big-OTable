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

public class stack extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(com.envision_lightning.big_o.R.layout.stacks);

        TextView stack_queues = (TextView) findViewById(com.envision_lightning.big_o.R.id.first_link);
        TextView stack_array = (TextView) findViewById(com.envision_lightning.big_o.R.id.second_link);
        TextView stack_array_video = (TextView) findViewById(com.envision_lightning.big_o.R.id.third_link);
        TextView stack_linked_list = (TextView) findViewById(com.envision_lightning.big_o.R.id.fourth_link);

        stack_queues.setClickable(true);
        stack_queues.setMovementMethod(LinkMovementMethod.getInstance());
        String text = "<a href='https://www.cs.cmu.edu/~adamchik/15-121/lectures/Stacks%20and%20Queues/Stacks%20and%20Queues.html'> Stacks and Queues (cs.cmu.edu) </a>";
        stack_queues.setText(Html.fromHtml(text));

        stack_array.setClickable(true);
        stack_array.setMovementMethod(LinkMovementMethod.getInstance());
        String textTwo = "<a href='https://www.cs.bu.edu/teaching/c/stack/array/'> Implementation of Stack Array  (cs.bu.edu) </a>";
        stack_array.setText(Html.fromHtml(textTwo));

        stack_array_video.setClickable(true);
        stack_array_video.setMovementMethod(LinkMovementMethod.getInstance());
        String textThree = "<a href='https://www.youtube.com/watch?v=sFVxsglODoo'> Implementation of Stack Array Video (youtube) </a>";
        stack_array_video.setText(Html.fromHtml(textThree));

        stack_linked_list.setClickable(true);
        stack_linked_list.setMovementMethod(LinkMovementMethod.getInstance());
        String textFour = "<a href='https://www.youtube.com/watch?v=MuwxQ2IB8lQ'> Implementation of Stacks with Linked Lists (youtube) </a>";
        stack_linked_list.setText(Html.fromHtml(textFour));
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
