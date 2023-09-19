package com.example.shoesproduct;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.shoesproduct.Adapter.PhotoAdapter;
import com.example.shoesproduct.asset.Photo;
import com.example.shoesproduct.asset.PhotoData;

import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    GridView gridView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        gridView = (GridView) findViewById(R.id.grid_view);
        PhotoAdapter adapter = new PhotoAdapter(PhotoData.generatePhotoData(), getApplicationContext());
        gridView.setAdapter(adapter);
        gridView.setOnItemClickListener(onItemClick);
    }

    private AdapterView.OnItemClickListener onItemClick = new AdapterView.OnItemClickListener() {
        @Override
        public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
            Intent intent = new Intent(getBaseContext(), GridItemActivity.class);
            intent.putExtra("id", gridView.getAdapter().getItemId(position));

            startActivity(intent);
        }
    };

//    private void parseXML() throws XmlPullParserException, IOException {
//        XmlPullParserFactory parserFactory;
//        parserFactory = XmlPullParserFactory.newInstance();
//        XmlPullParser parser = parserFactory.newPullParser();
//        InputStream inputStream = getAssets().open("data.xml");
//        parser.setFeature(XmlPullParser.FEATURE_PROCESS_NAMESPACES, false);
//        parser.setInput(inputStream, null);
//
//        processParsing(parser);
//    }
//
//    private void processParsing(XmlPullParser parser) throws XmlPullParserException, IOException {
//        ArrayList<Photo> photoList = new ArrayList<>();
//        int eventType = parser.getEventType();
//        Photo currentPhoto = null;
//
//        while(eventType != XmlPullParser.END_DOCUMENT) {
//            String eltName = null;
//
//            switch(eventType) {
//                case XmlPullParser.START_TAG:
//                    eltName = parser.getName();
//
//                    if("fruit".equals(eltName)) {
//                        currentPhoto = new Photo();
//                    } else if (currentPhoto != null) {
//                        if("name".equals(eltName)) {
//                            currentPhoto.setPhotoTitle(parser.nextText());
//                        } else if("source".equals(eltName)) {
//                            currentPhoto.setPhotoSource(parser.nextText());
//                        } else if("description".equals(eltName)) {
//                            currentPhoto.setPhotoDescription(parser.nextText());
//                        }
//                    }
//                    break;
//            }
//            eventType = parser.next();
//        }
//    }
}