package com.grus95note.model;

import android.content.Context;
import android.util.Log;

import com.litesuits.orm.db.annotation.Default;
import com.litesuits.orm.db.annotation.Ignore;
import com.litesuits.orm.db.annotation.NotNull;
import com.litesuits.orm.db.assit.QueryBuilder;
import com.litesuits.orm.log.OrmLog;

import java.util.List;

/**
 * Created by grus95 on 2017/3/24.
 */

public class User extends BaseModel {
    @NotNull
    private String userId;

    @NotNull
    private String userName;

    @Ignore
    private String password;

    private String img;

    @Default("true")
    private boolean isLogin;

    private String token;

    public String getUserId() {
        return userId;
    }

    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }

    public String getImg() {
        return img;
    }

    public boolean isLogin() {
        return isLogin;
    }

    public String getToken() {
        return token;
    }

    public User(){
        super(context);
    }

    public User(Context context){
        super(context);
    }

    public User(String userName, String password, String img, boolean isLogin, String token){
        super(context);
        this.userName = userName;
        this.password = password;
        this.img = img;
        this.isLogin = isLogin;
        this.token = token;
    }

    public boolean UserLogin(String userName, String password){
        User user = new User();
        user.userId = userName;
        user.userName = userName;
        user.password = password;
        user.img = "123.png";
        user.isLogin = true;
        user.token = "abc";
        liteOrm.save(user);
        return true;
    }

    public User getUser(){
        return liteOrm.query(User.class).size()==0?null:liteOrm.query(User.class).get(0);
    }
}
