package com.mytests.jackson.jsonSetterTest;

import com.fasterxml.jackson.databind.ObjectMapper;


import java.io.IOException;

/**
 * *
 * <p>Created by irina on 5/11/2022.</p>
 * <p>Project: jackson-test</p>
 * *
 */
public class RunMe {
    public static void main(String args[]){
        ObjectMapper mapper = new ObjectMapper();
        try{
            String json_input = "{\"p1\": \"value1\",\"prop2\": \"value2\", \"prop3\": \"value3\" }";

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
