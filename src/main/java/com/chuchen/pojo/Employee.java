package com.chuchen.pojo;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.text.SimpleDateFormat;
import java.util.Date;

@Data
@NoArgsConstructor
public class Employee {
    private Integer id;
    private String lastName;
    private String email;
    private Integer gender;

    private Integer department_id;
    private String birth;

    SimpleDateFormat format =  new SimpleDateFormat("yyyy-MM-dd");

    public Employee(Integer id, String lastName, String email, Integer gender, int department_id) {
        this.id = id;
        this.lastName = lastName;
        this.email = email;
        this.gender = gender;
        this.department_id = department_id;
        //默认日期实现
        this.birth = format.format(new Date());
    }
}
