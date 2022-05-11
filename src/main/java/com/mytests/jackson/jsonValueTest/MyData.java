package com.mytests.jackson.jsonGetterTest;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * *
 * <p>Created by irina on 5/10/2022.</p>
 * <p>Project: jackson-test</p>
 * *
 */
@JsonPropertyOrder({"p1","p2","p3"})
public class MyData {

    String prop1;
    String prop2;
    String prop3;

    public MyData(String prop1, String prop2, String prop3) {
        this.prop1 = prop1;
        this.prop2 = prop2;
        this.prop3 = prop3;
    }
    @JsonGetter("p1")
    public String getDataProp1() {
        return prop1;
    }
    @JsonGetter("p2")
    public String getDataProp2() {
        return prop2;
    }
    @JsonGetter("p3")
    public String getDataProp3() {
        return prop3;
    }
}
