package com.envision_lightning.big_o;

/**
 * Created by oscar on 2/10/2017.
 */
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.NavUtils;
import android.support.v7.app.AppCompatActivity;
import android.text.Html;
import android.text.method.LinkMovementMethod;
import android.util.DisplayMetrics;
import android.view.MenuItem;
import android.widget.TextView;

/**
 * Created by ocastroa on 7/11/16.
 * about info
 */
public class about extends AppCompatActivity {

    private static TextView aboutInfo;
    private static TextView note;
    private static TextView setLicense;
    private static TextView licenseInfo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(com.envision_lightning.big_o.R.layout.about);

        DisplayMetrics dm = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(dm);

        int width = dm.widthPixels;
        int height = dm.heightPixels;

        getWindow().setLayout((int)(width *.72), (int)(height * .30)); // sets pop up window within certain x & y dimensions

        aboutInfo = (TextView) findViewById(com.envision_lightning.big_o.R.id.aboutInfo);
        aboutInfo.setText("Big-O Reference Website: ");

        note = (TextView) findViewById(com.envision_lightning.big_o.R.id.note);
        note.setClickable(true);
        note.setMovementMethod(LinkMovementMethod.getInstance());
        String text = "<a href='http://bigocheatsheet.com/'> bigocheatsheet.com </a>";
        note.setText(Html.fromHtml(text));

        setLicense = (TextView) findViewById(com.envision_lightning.big_o.R.id.setLicense);
        setLicense.setText("PagerSlidingTabStrip");

        licenseInfo = (TextView) findViewById(com.envision_lightning.big_o.R.id.licenseInfo);
        licenseInfo.setText("Released by Andreas Stuetz under the Apache License, Version 2.0.");
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        switch (item.getItemId()) {
////            // Respond to the action bar's Up/Home button
            case android.R.id.home:
                Intent intent = NavUtils.getParentActivityIntent(this);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP|Intent.FLAG_ACTIVITY_SINGLE_TOP);
                NavUtils.navigateUpTo(this, intent);
                return true;
        }
        return super.onOptionsItemSelected(item);
    }
}