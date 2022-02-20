package com.chuchen.mapper;

import com.chuchen.pojo.Employee;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

//员工Dao
@Mapper  //这个注解表示这是一个 MyBatis 的 Mapper（Dao）接口
@Repository
public interface EmployeeMapper {
    //增加一个员工
    void save(Employee employee);

    //查询全部员工信息
    List<Employee> getAllEmployee();

    //通过id查询员工
    Employee getEmployee(Integer id);

    //通过id删除员工
    int deleteEmployee(Integer id);

    //修改员工
    int updateEmployee(Employee employee);

}
