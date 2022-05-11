package com.mytests.jackson.jsonCreatorTest;

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
         System.out.println(myData.getProp1()+", "+myData.getProp2()+", "+myData.getProp3());
      }
      catch (IOException e) {
         e.printStackTrace();
      } 
   }
}