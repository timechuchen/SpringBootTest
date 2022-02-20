package com.chuchen.mapper;

import com.chuchen.pojo.Department;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.List;

//部门 Mapper
@Mapper  //这个注解表示这是一个 MyBatis 的 Mapper（Dao）接口
@Repository
public interface DepartmentMapper {

    //获取的所有部门信息
    List<Department> getAllDepartments();

    //通过id得到部门
    Department getDepartment(Integer id);
}
