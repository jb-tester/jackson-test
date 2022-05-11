package com.mytests.jackson.jsonAnyGetterTest;
import java.io.IOException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class RunMe {
   public static void main(String args[]){
      ObjectMapper mapper = new ObjectMapper();
      try{
         MyData myData = new MyData();
         myData.add("prop1", "value1");
         myData.add("prop2", "value2");
         myData.add("prop3", "value3");
         String json_rez = mapper
            .writerWithDefaultPrettyPrinter() 
            .writeValueAsString(myData);
         System.out.println(json_rez);
      }
      catch (IOException e) {
         e.printStackTrace();
      } 
   }
}