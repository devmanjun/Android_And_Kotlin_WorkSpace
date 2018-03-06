package com.mvs.recyclerandcardview;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class BookDetailActivity extends AppCompatActivity {

    private ImageView imageThumbNail;
    private TextView tvDescription, tvCategory, tvTitle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_book_detail);
        imageThumbNail = findViewById(R.id.iv_book_detail);
        tvCategory = findViewById(R.id.tv_book_detail_category);
        tvDescription = findViewById(R.id.tv_book_detail_description);
        tvTitle = findViewById(R.id.tv_book_detail_title);
        Intent intent = getIntent();
        if (intent.getExtras() != null) {
            String title = intent.getStringExtra("title");
            tvTitle.setText(title);
            String description = intent.getStringExtra("description");
            tvDescription.setText(description);
            String category = intent.getStringExtra("category");
            tvCategory.setText(category);
            int thumbnail = intent.getIntExtra("thumbnail", 0);
            imageThumbNail.setImageResource(thumbnail);
        }
    }
}
