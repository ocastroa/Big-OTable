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

public class bst extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(com.envision_lightning.big_o.R.layout.bst);

        TextView bst =(TextView)findViewById(com.envision_lightning.big_o.R.id.first_link);
        TextView bst_two =(TextView)findViewById(com.envision_lightning.big_o.R.id.second_link);
        TextView bst_traversal =(TextView)findViewById(com.envision_lightning.big_o.R.id.third_link);
        TextView bst_video =(TextView)findViewById(com.envision_lightning.big_o.R.id.fourth_link);

        bst.setClickable(true);
        bst.setMovementMethod(LinkMovementMethod.getInstance());
        String text = "<a href='https://www.tutorialspoint.com/data_structures_algorithms/binary_search_tree.htm'> Binary Search Tree (tutorialspoint) </a>";
        bst.setText(Html.fromHtml(text));

        bst_two.setClickable(true);
        bst_two.setMovementMethod(LinkMovementMethod.getInstance());
        String textTwo = "<a href='https://www.cs.cmu.edu/~adamchik/15-121/lectures/Trees/trees.html'> Binary Search Tree (cs.cmu.edu) </a>";
        bst_two.setText(Html.fromHtml(textTwo));

        bst_traversal.setClickable(true);
        bst_traversal.setMovementMethod(LinkMovementMethod.getInstance());
        String textThree= "<a href='https://www.youtube.com/watch?v=gm8DUJJhmY4'>  Binary Tree Traversal (youtube) </a>";
        bst_traversal.setText(Html.fromHtml(textThree));

        bst_video.setClickable(true);
        bst_video.setMovementMethod(LinkMovementMethod.getInstance());
        String textFour = "<a href='https://www.youtube.com/watch?v=COZK7NATh4k'> Binary Tree Implementation (youtube) </a>";
        bst_video.setText(Html.fromHtml(textFour));
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
