package com.mytests.jackson.jsonCreatorTest;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
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

    @JsonCreator
    public MyData(@JsonProperty("p1") String prop1, @JsonProperty("p2") String prop2, @JsonProperty("p3") String prop3) {
        this.prop1 = prop1;
        this.prop2 = prop2;
        this.prop3 = prop3;
    }

    public MyData() {
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
