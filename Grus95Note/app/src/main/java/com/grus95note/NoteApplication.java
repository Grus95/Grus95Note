package com.grus95note;

import android.app.Application;

import com.grus95note.model.BaseModel;
import com.grus95note.model.User;

/**
 * Created by grus95 on 2017/3/24.
 */

public class NoteApplication extends Application {
    BaseModel baseModel;
    @Override
    public void onCreate() {
        super.onCreate();
        baseModel = new BaseModel(this);
    }

    public User getUser(){
        return baseModel.liteOrm.query(User.class).size()==0?null:baseModel.liteOrm.query(User.class).get(0);
    }

    public boolean isLogin(){
        return getUser()!=null;
    }
}
