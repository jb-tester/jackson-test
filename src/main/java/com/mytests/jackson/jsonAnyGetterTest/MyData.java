package com.mytests.jackson.jsonAnyGetterTest;

import com.fasterxml.jackson.annotation.JsonAnyGetter;

import java.util.HashMap;
import java.util.Map;

public class MyData {
   private Map<String, String> data;
   public MyData(){
      data = new HashMap<>();
   }
   @JsonAnyGetter
   public Map<String, String> getData(){
      return data;
   }
   public void add(String property, String value){
      data.put(property, value);
   }
}