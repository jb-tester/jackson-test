package com.mytests.jackson.test1;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JacksonTester {
   public static void main(String args[]){
      ObjectMapper mapper = new ObjectMapper();
      try{
         Student student = new Student(); 
         student.add("Name", "Mark"); 
         student.add("RollNo", "1"); 
         String jsonString = mapper 
            .writerWithDefaultPrettyPrinter() 
            .writeValueAsString(student); 
         System.out.println(jsonString); 
      }
      catch (IOException e) {
         e.printStackTrace();
      } 
   }
}