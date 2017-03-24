package com.grus95note.multitype_model;

import java.util.Random;

/**
 * Created by grus95 on 2017/3/23.
 */

public class ModelFaker {
    public static MultiTypeModel fake() {
        String type = new Random().nextBoolean() ? "image" : "text";
        if (type.equals("image")) {
            return new ImageModel();
        } else {
            return new TextModel();
        }
    }
}
