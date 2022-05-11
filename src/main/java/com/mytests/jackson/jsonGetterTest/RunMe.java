package com.mytests.jackson.jsonGetterTest;

import com.fasterxml.jackson.databind.ObjectMapper;


import java.io.IOException;

public class RunMe {
   public static void main(String args[]){
      ObjectMapper mapper = new ObjectMapper();
      try{
         MyData myData = new MyData("value1","value2","value3");

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