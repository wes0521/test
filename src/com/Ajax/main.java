package com.Ajax;


import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.json.Grade;
import com.json.Student;

import java.util.ArrayList;

public class main {
    public static void main(String[] args) throws JsonProcessingException {

        String json1 = "{\"id\":1,\"name\":\"JAVAEE-1910\",\"stu\":[{\"id\":101,\"name\":\"刘一\",\"age\":16},{\"id\":102,\"name\":\"刘二\",\"age\":20}]}";

        //------------------json转对象--------------------
        ObjectMapper mapper = new ObjectMapper();

        Grade grade = mapper.readValue(json1,Grade.class);

        ArrayList<Student> s = grade.getStu();
        for (Student si:s){
            System.out.println(si);
        }

        //---------------对象转json--------------------
        ArrayList<Student> students = new ArrayList<Student>();
        students.add(new Student(1,"xx",20));
        students.add(new Student(2,"yy",21));
        students.add(new Student(3,"zz",22));

        Grade g = new Grade(1,"hzfj",students);

        mapper.enable(SerializationFeature.INDENT_OUTPUT);
        mapper.disable(SerializationFeature.FAIL_ON_EMPTY_BEANS);
        String s1 = mapper.writeValueAsString(g);
        System.out.println(s1);

    }
}
