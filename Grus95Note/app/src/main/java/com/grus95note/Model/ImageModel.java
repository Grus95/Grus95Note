package com.grus95note.model;

import com.grus95note.adapter.MultiTypeAdapter;
import com.grus95note.iItem.BaseItem;
import com.grus95note.iItem.ImageItem;

import java.util.Random;

/**
 * Created by grus95 on 2017/3/23.
 */

public class ImageModel extends BaseModel {
    @Override
    public BaseItem createItem(MultiTypeAdapter adapter) {
        return new ImageItem(adapter, this);
    }

    public String url;
    public boolean liked;

    public ImageModel() {
        super();
        url = "https://unsplash.it/200/200?random&" + new Random().nextInt(40);
        liked = new Random().nextBoolean();
    }
}
