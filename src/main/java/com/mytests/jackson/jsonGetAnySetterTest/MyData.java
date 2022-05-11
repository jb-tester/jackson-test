package com.mytests.jackson.jsonGetAnySetterTest;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;

import java.util.HashMap;
import java.util.Map;

public class MyData {
   private Map<String, String> data;
   public MyData(){
      data = new HashMap<>();
   }

   public Map<String, String> getData(){
      return data;
   }
   @JsonAnySetter
   public void addProps(String property, String value){
      data.put(property, value);
   }
}