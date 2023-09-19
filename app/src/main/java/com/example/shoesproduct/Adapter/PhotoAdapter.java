package com.example.shoesproduct.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.shoesproduct.R;
import com.example.shoesproduct.asset.Photo;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class PhotoAdapter extends BaseAdapter {
    private ArrayList<Photo> photoList;
    private Context context;

    public PhotoAdapter(ArrayList<Photo> photoList, Context context) {
        this.photoList = photoList;
        this.context = context;
    }

    @Override
    public int getCount() {
        return photoList.size();
    }

    @Override
    public Object getItem(int position) {
        return photoList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return photoList.get(position).getId();
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        final MyView dataItem;
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        if (convertView == null) {
            dataItem = new MyView();
            convertView = inflater.inflate(R.layout.row_data, null);
            dataItem.iv_photo = convertView.findViewById(R.id.character_images);
            dataItem.tv_photo = convertView.findViewById(R.id.characters);
            convertView.setTag(dataItem);
        } else {
            dataItem = (MyView) convertView.getTag();
        }

        // Download photo from internet, resize and set it into activity
        Picasso.get().load(photoList.get(position).getPhotoSource()).resize(200, 200).centerCrop().into(dataItem.iv_photo);
        dataItem.tv_photo.setText(photoList.get(position).getPhotoTitle());

        return convertView;
    }

    public static class MyView {
        ImageView iv_photo;
        TextView tv_photo;
    }
}
