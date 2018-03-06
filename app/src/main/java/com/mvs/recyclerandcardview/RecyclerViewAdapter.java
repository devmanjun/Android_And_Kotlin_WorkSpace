package com.mvs.recyclerandcardview;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by User on 06-Mar-18.
 */

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.MyViewHolder> {

    private List<Book> mBookList;
    private Context mContext;

    public RecyclerViewAdapter(List<Book> mBookList, Context mContext) {
        this.mBookList = mBookList;
        this.mContext = mContext;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater=LayoutInflater.from(mContext);
        View mView=layoutInflater.inflate(R.layout.cardview_row,parent,false);
        return new MyViewHolder(mView);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, final int position) {
        holder.bookTitle.setText(mBookList.get(position).getTitle());
        holder.bookThumbNail.setImageResource(mBookList.get(position).getThumbnail());
        holder.cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent bookIntent=new Intent(mContext,BookDetailActivity.class);
                bookIntent.putExtra("title", mBookList.get(position).getTitle());
                bookIntent.putExtra("category", mBookList.get(position).getCategory());
                bookIntent.putExtra("description", mBookList.get(position).getDescription());
                bookIntent.putExtra("thumbnail", mBookList.get(position).getThumbnail());
                mContext.startActivity(bookIntent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return mBookList.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder
    {
        ImageView bookThumbNail;
        TextView bookTitle;
        CardView cardView;

        public MyViewHolder(View itemView) {
            super(itemView);
            bookThumbNail=itemView.findViewById(R.id.iv_cv_book_image);
            bookTitle=itemView.findViewById(R.id.tv_cv_book_title);
            cardView=itemView.findViewById(R.id.cv_book);
        }
    }
}
