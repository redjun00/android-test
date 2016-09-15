package com.example.nari.myapplication;

import android.graphics.drawable.Drawable;

import java.text.Collator;
import java.util.Comparator;

import lombok.Data;

@Data
public class ListData {
    private Drawable icon;
    private String title;
    private String subTitle;

    public static final Comparator<ListData> ALPHA_COMPARATOR = new Comparator<ListData>(){

        private final Collator collator = Collator.getInstance();

        @Override
        public int compare(ListData firstListData, ListData secondListData) {
            return collator.compare(firstListData.title, secondListData.title);
        }
    };
}
