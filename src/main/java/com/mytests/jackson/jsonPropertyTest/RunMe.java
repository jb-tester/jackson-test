package com.mytests.jackson.jsonPropertyTest;

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
            String json_input = "{\"p1\": \"value1\",\"p2\": \"value2\", \"p3\": \"value3\" }";

            MyData myData = mapper
                    .readerFor(MyData.class)
                    .readValue(json_input);
            System.out.println(myData.getProperty1()+", "+myData.getProperty2()+", "+myData.getProperty3());
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}
