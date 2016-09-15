package com.example.nari.myapplication;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class ListViewAdapter extends BaseAdapter {
    private Context context = null;
    private ArrayList<ListData> listDatas = new ArrayList<ListData>();

    public ListViewAdapter(Context context) {
        super();
        this.context = context;
    }

    @Override
    public int getCount() {
        return listDatas.size();
    }

    @Override
    public Object getItem(int position) {
        return listDatas.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder;

        if (convertView == null) {
            holder = new ViewHolder();

            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

            int resource = R.layout.list_item;
            ViewGroup viewGroup = null;
            convertView = inflater.inflate(resource, viewGroup);

            ImageView iconView = (ImageView) convertView.findViewById(R.id.icon);
            TextView titleView = (TextView) convertView.findViewById(R.id.listItemTitle);
            TextView subTitleView = (TextView) convertView.findViewById(R.id.subTitle);

            ListData listData = listDatas.get(position);
            Drawable iconDrawble = listData.getIcon();
            iconView.setImageDrawable(iconDrawble);
            String title = listData.getTitle();
            titleView.setText(title);
            String subTitle = listData.getSubTitle();
            subTitleView.setText(subTitle);

        }

        return convertView;
    }

    public void addItem(Drawable icon, String title, String subTitle) {
        ListData listData = new ListData();

        listData.setIcon(icon);
        listData.setTitle(title);
        listData.setSubTitle(subTitle);

        listDatas.add(listData);
    }
}
