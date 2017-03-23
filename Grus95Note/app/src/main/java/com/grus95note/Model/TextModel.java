package com.grus95note.Model;

import com.grus95note.adapter.MultiTypeAdapter;
import com.grus95note.iItem.BaseItem;
import com.grus95note.iItem.TextItem;

import java.util.Date;
import java.util.Random;

/**
 * Created by grus95 on 2017/3/23.
 */

public class TextModel extends BaseModel {
    @Override
    public BaseItem createItem(MultiTypeAdapter adapter) {
        return new TextItem(adapter, this);
    }

    public String content;
    public boolean liked;

    public TextModel() {
        super();
        content = new Date().toString();
        liked = new Random().nextBoolean();
    }
}
