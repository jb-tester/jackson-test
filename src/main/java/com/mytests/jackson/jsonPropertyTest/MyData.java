package com.mytests.jackson.jsonSetterTest;

import com.fasterxml.jackson.annotation.JsonSetter;

/**
 * *
 * <p>Created by irina on 5/11/2022.</p>
 * <p>Project: jackson-test</p>
 * *
 */
public class MyData {
    String prop1;
    String prop2;
    String prop3;
    @JsonSetter("p1")
    public void setProp1(String prop1) {
        this.prop1 = prop1;
    }

    public String getProp1() {
        return prop1;
    }

    public String getProp2() {
        return prop2;
    }

    public String getProp3() {
        return prop3;
    }
}
