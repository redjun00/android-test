package com.example.nari.myapplication;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_view);

        ListView listView = (ListView) findViewById(R.id.listView);
        Context context = this;
        ListViewAdapter listAdapter = new ListViewAdapter(context);

        listView.setAdapter(listAdapter);

        Drawable iconImage = ContextCompat.getDrawable(context, R.drawable.abc_btn_radio_to_on_mtrl_015);
        listAdapter.addItem(iconImage, "nrKim", "developer");
        listAdapter.addItem(iconImage, "drKim", "qa");
        listAdapter.addItem(iconImage, "dhLim", "developer");
    }

    public void refreshButtonEvent(View view) {
    }
}
