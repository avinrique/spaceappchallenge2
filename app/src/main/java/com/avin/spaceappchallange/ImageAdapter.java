package com.avin.spaceappchallange;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;

public class ImageAdapter extends BaseAdapter {
    private Context mContext;
    public int[]  imageArray = {
            R.drawable.ap9,R.drawable.ona,
            R.drawable.images,
            R.drawable.kaka,
            R.drawable.origin,
            R.drawable.a,
            R.drawable.b,
            R.drawable.ap,
            R.drawable.ap2,
            R.drawable.ap3,
            R.drawable.ap4,
            R.drawable.ap5,
            R.drawable.ap6,
            R.drawable.ap7,
            R.drawable.ap8,
            R.drawable.apple,
            R.drawable.ap10,
            R.drawable.swikarya,
            R.drawable.avi,




    };

    public ImageAdapter(Context mContext) {
        this.mContext = mContext;
    }

    @Override
    public int getCount() {
        return imageArray.length;
    }

    @Override
    public Object getItem(int position) {
        return imageArray[position];
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ImageView imageView = new ImageView(mContext);
        imageView.setImageResource(imageArray[position]);
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        imageView.setLayoutParams(new GridView.LayoutParams(340,350));
        return imageView;
    }
}
