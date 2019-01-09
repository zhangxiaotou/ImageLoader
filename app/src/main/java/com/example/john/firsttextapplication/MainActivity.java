package com.example.john.firsttextapplication;

import android.net.Uri;
import android.os.Environment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.bumptech.glide.DrawableRequestBuilder;
import com.bumptech.glide.Glide;

import java.io.File;

import jp.wasabeef.glide.transformations.BlurTransformation;

public class MainActivity extends AppCompatActivity {
    private  ImageView src1;
    private Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        src1 = (ImageView)findViewById(R.id.image_view);
      //  button = (Button)findViewById(R.id.button);
       /* DrawableRequestBuilder requestBuilder = Glide.with(this).load("http://img4.imgtn.bdimg.com/it/u=3601034246,1191300534&fm=26&gp=0.jpg");
        Glide.with(this)
                //.load("http://p0.ifengimg.com/pmop/2018/0213/8AB8E5C1E5174D4E3BD41060173D16CC3E911ED0_size3436_w500_h275.gif")
               // .load("http://ws1.sinaimg.cn/large/d63ab74bly1foe250kpo4g20dw07r7wi.gif")
                .load("http://www.xnnews.com.cn/wenyu/rdzx/201803/W020180324698388855452.gif")
                .thumbnail(requestBuilder)
                .into(src1);*/

        Glide.with(this).load("http://img4.imgtn.bdimg.com/it/u=3601034246,1191300534&fm=26&gp=0.jpg").animate(R.anim.text).bitmapTransform(new BlurTransformation(this, 25)).into(src1);

      /* button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               //Glide.with(MainActivity.this).load("https://ad.12306.cn/res/delivery/0001/2017/08/31/201708311634229711.jpg").into(src);
                //Glide.with(MainActivity.this).load(R.mipmap.ic_launcher).into(src);
                *//*String path = Environment.getExternalStorageDirectory()+"/haha";
                File file = new File(path);
                Uri uri = Uri.fromFile(file);
                Glide.with(MainActivity.this).load(uri).into(src1);*//*
                //Glide.with(MainActivity.this).load("").placeholder(R.mipmap.ic_launcher).into(src1);

            }
        });*/
    }
}
