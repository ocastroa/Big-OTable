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

public class avl extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(com.envision_lightning.big_o.R.layout.avltrees);

        TextView avl_two =(TextView)findViewById(com.envision_lightning.big_o.R.id.first_link);
        TextView avl =(TextView)findViewById(com.envision_lightning.big_o.R.id.second_link);
        TextView avl_video =(TextView)findViewById(com.envision_lightning.big_o.R.id.third_link);

        avl.setClickable(true);
        avl.setMovementMethod(LinkMovementMethod.getInstance());
        String text = "<a href='https://www.cs.auckland.ac.nz/software/AlgAnim/AVL.html'> AVL Trees (cs.auckland.ac.nz) </a>";
        avl.setText(Html.fromHtml(text));

        avl_two.setClickable(true);
        avl_two.setMovementMethod(LinkMovementMethod.getInstance());
        String textTwo = "<a href='https://www.tutorialspoint.com/data_structures_algorithms/avl_tree_algorithm.htm'> AVL Trees (tutorialspoint) </a>";
        avl_two.setText(Html.fromHtml(textTwo));

        avl_video.setClickable(true);
        avl_video.setMovementMethod(LinkMovementMethod.getInstance());
        String textThree= "<a href='https://www.youtube.com/watch?v=mYGYbZxrU_4'> AVL Trees Video(youtube) </a>";
        avl_video.setText(Html.fromHtml(textThree));
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
