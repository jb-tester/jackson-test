package com.mytests.jackson.test1;

import com.fasterxml.jackson.annotation.JsonAnyGetter;

import java.util.HashMap;
import java.util.Map;

public class Student {
   private Map<String, String> properties;
   public Student(){
      properties = new HashMap<>();
   }
   @JsonAnyGetter
   public Map<String, String> getProperties(){
      return properties;
   }
   public void add(String property, String value){
      properties.put(property, value);
   }
}