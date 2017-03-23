package com.grus95note.iItem;

import com.grus95note.R;

/**
 * Created by grus95 on 2017/3/23.
 */

public class ErrorItem extends BaseItem {
    @Override
    public int getLayout() {
        return R.layout.item_error;
    }

    public ErrorItem() {
        content = "Error happened! please try it later!";
    }

    // data part
    private String content;

    public String getContent() {
        return content;
    }
}
