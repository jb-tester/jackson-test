package com.mytests.jackson.jsonAnySetterTest;

import com.fasterxml.jackson.databind.ObjectMapper;


import java.io.IOException;

public class RunMe {
   public static void main(String args[]){
      ObjectMapper mapper = new ObjectMapper();
      try{
         String json_input = "{\"p1\": \"value1\",\"p2\": \"value2\", \"p3\": \"value3\" }";

         MyData myData = mapper
                 .readerFor(MyData.class)
                 .readValue(json_input);
         myData.getData().forEach((k, v) -> System.out.println((k + ":" + v)));
      }
      catch (IOException e) {
         e.printStackTrace();
      }
   }
}