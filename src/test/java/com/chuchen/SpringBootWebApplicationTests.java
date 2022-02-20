package com.chuchen;

import com.chuchen.mapper.DepartmentMapper;
import com.chuchen.service.DepartmentService;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Bean;

@SpringBootTest
class SpringBootWebApplicationTests {

    @Test
    void contextLoads() {
        DepartmentService departmentService = new DepartmentService();
        System.out.println(departmentService.getAllDepartments());
    }
}
