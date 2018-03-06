package com.mvs.recyclerandcardview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    List<Book> mBookList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mBookList=new ArrayList<>();
        mBookList.add(new Book("Book 1","category 1", "Description 1",R.drawable.dfg));
        mBookList.add(new Book("Book 2","category 2", "Description 2",R.drawable.ert));
        mBookList.add(new Book("Book 3","category 3", "Description 3",R.drawable.qwe));
        mBookList.add(new Book("Book 4","category 4", "Description 4",R.drawable.rty));
        mBookList.add(new Book("Book 5","category 5", "Description 5",R.drawable.tyu));
        mBookList.add(new Book("Book 6","category 6", "Description 6",R.drawable.uio));
        mBookList.add(new Book("Book 7","category 7", "Description 7",R.drawable.wer));
        mBookList.add(new Book("Book 8","category 8", "Description 8",R.drawable.yui));
        mBookList.add(new Book("Book 9","category 9", "Description 9",R.drawable.zxc));
        mBookList.add(new Book("Book 1","category 1", "Description 1",R.drawable.dfg));
        mBookList.add(new Book("Book 2","category 2", "Description 2",R.drawable.ert));
        mBookList.add(new Book("Book 3","category 3", "Description 3",R.drawable.qwe));
        mBookList.add(new Book("Book 4","category 4", "Description 4",R.drawable.rty));
        mBookList.add(new Book("Book 5","category 5", "Description 5",R.drawable.tyu));
        mBookList.add(new Book("Book 6","category 6", "Description 6",R.drawable.uio));
        mBookList.add(new Book("Book 7","category 7", "Description 7",R.drawable.wer));
        mBookList.add(new Book("Book 8","category 8", "Description 8",R.drawable.yui));
        mBookList.add(new Book("Book 9","category 9", "Description 9",R.drawable.zxc));
        RecyclerView mRecyclerView=findViewById(R.id.rv_book);
        RecyclerViewAdapter recyclerViewAdapter=new RecyclerViewAdapter(mBookList,this);
        mRecyclerView.setLayoutManager(new GridLayoutManager(this,3));
        mRecyclerView.setAdapter(recyclerViewAdapter);
    }
}
