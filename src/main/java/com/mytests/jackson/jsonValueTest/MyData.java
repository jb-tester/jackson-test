package com.mytests.jackson.jsonValueTest;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * *
 * <p>Created by irina on 5/10/2022.</p>
 * <p>Project: jackson-test</p>
 * *
 */

public class MyData {

    String prop1;
    String prop2;
    String prop3;

    public MyData(String prop1, String prop2, String prop3) {
        this.prop1 = prop1;
        this.prop2 = prop2;
        this.prop3 = prop3;
    }


    @JsonValue
    public String getRez(){
        return "{ properties: "+prop1+", "+prop2+", "+prop3+"}";
    }
}
