package com.example.listviewpractice;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private String students[] = {
            "20161707",
            "20161713",
            "20171591",
            "20171592",
            "20171616",
            "20171627",
            "20171641",
            "20171649",
            "20171650",
            "20171653",
            "20171654",
            "20171655",
            "20171656",
            "20171659",
            "20171664",
            "20171666",
            "20171667",
            "20171668",
            "20171669",
            "20171670",
            "20171679",
            "20171688",
            "20171697",
            "20171705",
            "20171707",
            "20171714",
            "20171717",
            "20171731",
            "20171742",
            "20175064",
            "20175980",
            "20175990"
    };
    private int imageID[] = {
            R.drawable.emoji_kids_01,
            R.drawable.emoji_kids_02,
            R.drawable.emoji_kids_03,
            R.drawable.emoji_kids_04,
            R.drawable.emoji_kids_05,
            R.drawable.emoji_kids_06,
            R.drawable.emoji_kids_07,
            R.drawable.emoji_kids_08,
            R.drawable.emoji_kids_09,
            R.drawable.emoji_kids_10,
            R.drawable.emoji_kids_11,
            R.drawable.emoji_kids_12,
            R.drawable.emoji_kids_13,
            R.drawable.emoji_kids_14,
            R.drawable.emoji_kids_15,
            R.drawable.emoji_kids_16,
            R.drawable.emoji_kids_17,
            R.drawable.emoji_kids_18,
            R.drawable.emoji_kids_19,
            R.drawable.emoji_kids_20,
            R.drawable.emoji_kids_21,
            R.drawable.emoji_kids_22,
            R.drawable.emoji_kids_23,
            R.drawable.emoji_kids_24,
            R.drawable.emoji_kids_25,
            R.drawable.emoji_kids_26,
            R.drawable.emoji_kids_27,
            R.drawable.emoji_kids_28,
            R.drawable.emoji_kids_29,
            R.drawable.emoji_kids_30,
            R.drawable.emoji_kids_31,
            R.drawable.emoji_kids_32
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ListView listView = findViewById(R.id.studentList);
        ImageAdapter imageAdapter = new ImageAdapter();

        listView.setAdapter(imageAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent =  new Intent(MainActivity.this,ShowActivity.class);
                intent.putExtra("imageID",imageID[i]);
                intent.putExtra("studentName",students[i]);
                intent.setClass(getApplicationContext(), ShowActivity.class);
                startActivity(intent);
            }
        });
    }
    public class ImageAdapter extends BaseAdapter {
        //得到listView中item的总数
        @Override
        public int getCount() {
// TODO Auto-generated method stub
            return students.length;
        }


        @Override
        public String getItem(int position) {
// TODO Auto-generated method stub

            return students[position];
        }


        @Override
        public long getItemId(int position) {
// TODO Auto-generated method stub
            return position;
        }


        //简单来说就是拿到单行的一个布局，然后根据不同的数值，填充主要的listView的每一个item
        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
// TODO Auto-generated method stub
            View layout = View.inflate(MainActivity.this, R.layout.activity_item, null);
            ImageView imageView = (ImageView) layout.findViewById(R.id.imageView);
            TextView textView = (TextView) layout.findViewById(R.id.textView);
            imageView.setImageResource(imageID[position]);
            textView.setText(students[position]);
            return layout;
        }

    }

}
