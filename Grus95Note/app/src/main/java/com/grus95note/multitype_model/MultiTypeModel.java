package com.grus95note.multitype_model;

import com.grus95note.adapter.MultiTypeAdapter;
import com.grus95note.iItem.BaseItem;

import java.util.Date;
import java.util.Random;

/**
 * Created by grus95 on 2017/3/23.
 */

public class MultiTypeModel {
    public BaseItem createItem(MultiTypeAdapter adapter) {
        return null;
    }

    public int id;
    public Date createdAt;
    public Date updatedAt;

    public MultiTypeModel() {
        id = (new Random()).nextInt(10000);
        createdAt = new Date();
        updatedAt = new Date();
    }
}