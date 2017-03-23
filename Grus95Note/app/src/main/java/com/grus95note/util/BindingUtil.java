package com.grus95note.util;

import android.databinding.BindingAdapter;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

/**
 * Created by grus95 on 2017/3/23.
 */

public class BindingUtil {
    @BindingAdapter({"imageUrl", "error", "placeholder"})
    public static void loadImage(ImageView imgView,
                                 String url,
                                 Drawable error,
                                 Drawable placeholder) {
        Glide.with(imgView.getContext())
                .load(url)
                .error(error)
                .placeholder(placeholder)
                .into(imgView);
    }
}
