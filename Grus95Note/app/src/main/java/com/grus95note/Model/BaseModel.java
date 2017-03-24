package com.grus95note.model;

import android.content.Context;

import com.litesuits.orm.LiteOrm;
import com.litesuits.orm.db.annotation.Ignore;
import com.litesuits.orm.db.annotation.PrimaryKey;
import com.litesuits.orm.db.enums.AssignType;

/**
 * Created by grus95 on 2017/3/24.
 */

public class BaseModel {
    @PrimaryKey(AssignType.AUTO_INCREMENT)
    int Id;
    public static LiteOrm liteOrm;

    @Ignore
    static Context context;

    public BaseModel(Context context){
        this.context = context;
        if (liteOrm == null) {
            liteOrm = LiteOrm.newSingleInstance(context, "grus-note");
        }
        liteOrm.setDebugged(true);
    }
}
