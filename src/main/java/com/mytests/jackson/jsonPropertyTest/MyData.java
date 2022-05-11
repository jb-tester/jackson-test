package com.mytests.jackson.jsonPropertyTest;

import com.fasterxml.jackson.annotation.JsonProperty;
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

    @JsonProperty("p1")
    public void setProperty1(String prop1) {
        this.prop1 = prop1;
    }

    @JsonProperty("p2")
    public void setProperty2(String prop2) {
        this.prop2 = prop2;
    }

    @JsonProperty("p3")
    public void setProperty3(String prop3) {
        this.prop3 = prop3;
    }

    //@JsonProperty("p1")
    public String getProperty1() {
        return prop1;
    }

    //@JsonProperty("p2")
    public String getProperty2() {
        return prop2;
    }

    //@JsonProperty("p3")
    public String getProperty3() {
        return prop3;
    }
}
