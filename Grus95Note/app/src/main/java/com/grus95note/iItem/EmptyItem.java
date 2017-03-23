package com.grus95note.iItem;

import com.grus95note.R;

/**
 * Created by grus95 on 2017/3/23.
 */

public class EmptyItem extends BaseItem {
    @Override
    public int getLayout() {
        return R.layout.item_empty;
    }

    public EmptyItem() {
        content = "点击，加载数据！";
    }

    // data part
    private final String content;

    public String getContent() {
        return content;
    }
}
