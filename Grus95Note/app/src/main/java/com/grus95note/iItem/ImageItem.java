package com.grus95note.iItem;

import android.view.View;

import com.grus95note.model.ImageModel;
import com.grus95note.R;
import com.grus95note.adapter.MultiTypeAdapter;

/**
 * Created by grus95 on 2017/3/23.
 */

public class ImageItem extends BaseItem {
    @Override
    public int getLayout() {
        return R.layout.item_image;
    }

    private final ImageModel imageModel;

    public ImageItem(final MultiTypeAdapter adapter, ImageModel imageModel) {
        this.imageModel = imageModel;

        setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (view.getId()) {
                    case R.id.tv_like:
                        toggleLiked();
                        adapter.notifyItemChanged(adapter.findPos(ImageItem.this));
                        break;
                    case R.id.tv_hide:
                        adapter.notifyItemRemoved(adapter.removeItem(ImageItem.this));
                        break;
                    case R.id.tv_comment:
                        // TODO: jump to another activity
                        break;
                }
            }
        });
    }

    public String getUrl() {
        return imageModel.url;
    }

    public boolean isLiked() {
        return imageModel.liked;
    }

    private void toggleLiked() {
        imageModel.liked = !imageModel.liked;
    }
}
