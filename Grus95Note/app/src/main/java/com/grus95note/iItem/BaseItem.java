package com.grus95note.iItem;

import android.view.View;

import com.grus95note.adapter.MultiTypeAdapter;
import com.grus95note.util.BR;

/**
 * Created by grus95 on 2017/3/23.
 */

public abstract class BaseItem implements MultiTypeAdapter.IItem {
    @Override
    public int getVariableId() {
        return BR.item;
    }

    // handle event
    private View.OnClickListener onClickListener;

    public View.OnClickListener getOnClickListener() {
        return onClickListener;
    }

    public void setOnClickListener(View.OnClickListener onClickListener) {
        this.onClickListener = onClickListener;
    }
}
