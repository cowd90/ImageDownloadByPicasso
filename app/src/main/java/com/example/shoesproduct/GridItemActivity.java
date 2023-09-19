package com.example.shoesproduct;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.shoesproduct.asset.PhotoData;
import com.squareup.picasso.Picasso;

public class GridItemActivity extends AppCompatActivity {

    TextView tv_title, tv_desc;
    ImageView iv_image;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grid_item);

        tv_title = (TextView) findViewById(R.id.grid_data);
        iv_image = (ImageView) findViewById(R.id.image_view);
        tv_desc = (TextView) findViewById(R.id.character_description);

        int id = (int) getIntent().getLongExtra("id", 0);
        Picasso.get().load(PhotoData.getPhotoFromId(id).getPhotoSource()).resize(300, 300).centerCrop().into(iv_image);
        tv_title.setText(PhotoData.getPhotoFromId(id).getPhotoTitle());
        tv_desc.setText(PhotoData.getPhotoFromId(id).getPhotoDescription());
    }
}