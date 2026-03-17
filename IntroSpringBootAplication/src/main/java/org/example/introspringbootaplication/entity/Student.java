package org.example.introspringbootaplication.entity;

import jakarta.persistence.*;

//Entity: modelo de objetos de la base de datos
@Entity //NO ES UN BEAN
@Table(name = "students")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String code; // Ejemplo: A00123456
    private String name;
    private String program;
    private String Age;


    public void setAge(String age) {
        Age = age;
    }


    public String getAge() {
        return Age;
    }


    public  Student(){}

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProgram() {
        return program;
    }

    public void setProgram(String program) {
        this.program = program;
    }
}
