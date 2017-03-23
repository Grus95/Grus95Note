package com.grus95note.iItem;

import android.view.View;

import com.grus95note.model.TextModel;
import com.grus95note.R;
import com.grus95note.adapter.MultiTypeAdapter;

/**
 * Created by grus95 on 2017/3/23.
 */

public class TextItem extends BaseItem {
    @Override
    public int getLayout() {
        return R.layout.item_text;
    }

    private final TextModel textModel;

    public TextItem(final MultiTypeAdapter adapter, TextModel textModel) {
        this.textModel = textModel;

        setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (view.getId()) {
                    case R.id.tv_like:
                        toggleLiked();
                        adapter.notifyItemChanged(adapter.findPos(TextItem.this));
                        break;
                    case R.id.tv_hide:
                        adapter.notifyItemRemoved(adapter.removeItem(TextItem.this));
                        break;
                    case R.id.tv_comment:
                        // TODO: jump to another activity
                        break;
                }
            }
        });
    }

    public String getContent() {
        return textModel.content;
    }

    public boolean isLiked() {
        return textModel.liked;
    }

    private void toggleLiked() {
        textModel.liked = !textModel.liked;
    }
}
