package com.anacode.first.deeplearningnetwork;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class DetailNetwork extends AppCompatActivity {
    public static final String EXTRA_FULLNAME = "extra_fullname";
    public static final String EXTRA_NICKNAME= "extra_nickname";
    public static final String EXTRA_DETAIL= "extra_detail";
    public static final String EXTRA_MAJOR= "extra_majot";
    public static final String EXTRA_USE= "extra_use";
    public static final String EXTRA_IMG= "extra_img";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        ImageView imgNetwork;
        TextView tvFullName, tvNickName, tvDetail, tvMajor, tvUse;

        super.onCreate(savedInstanceState);
        setContentView(R.layout.network_detail);
        imgNetwork = findViewById(R.id.tv_network_photo);
        tvFullName = findViewById(R.id.tv_full_name);
        tvNickName = findViewById(R.id.tv_nick_name);
        tvDetail = findViewById(R.id.tv_detail);
        tvMajor = findViewById(R.id.tv_major);
        tvUse = findViewById(R.id.tv_use);

        String full = getIntent().getStringExtra(EXTRA_FULLNAME),
                nick = getIntent().getStringExtra(EXTRA_NICKNAME),
                detail = getIntent().getStringExtra(EXTRA_DETAIL),
                major = getIntent().getStringExtra(EXTRA_MAJOR),
                use = getIntent().getStringExtra(EXTRA_USE);
        int photo = getIntent().getIntExtra(EXTRA_IMG,0);
        Bitmap bmp = BitmapFactory.decodeResource(getResources(), photo);
        imgNetwork.setImageBitmap(bmp);
        tvFullName.setText(full);
        tvNickName.setText(nick);
        tvMajor.setText(major);
        tvUse.setText(use);
        tvDetail.setText(detail);
    }
}
