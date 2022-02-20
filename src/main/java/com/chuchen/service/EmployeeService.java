package com.chuchen.service;

import com.chuchen.mapper.EmployeeMapper;
import com.chuchen.pojo.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

@Service
public class EmployeeService {
    @Autowired
    private EmployeeMapper employeeDao;
    @Autowired
    private DepartmentService departmentService;

    //增加一个员工
    public void save(Employee employee){
        if(employee.getId() == null){
            employee.setId((int) (Math.random() * 1000));
        }
        employeeDao.save(employee);
    }
    //查询全部员工信息
    public List<Employee> getAllEmployee(){
        return employeeDao.getAllEmployee();
    }

    //通过id查询员工
    public Employee getEmployee(Integer id){
        return employeeDao.getEmployee(id);
    }

    public boolean updateEmployee(Employee employee){
        int i = employeeDao.updateEmployee(employee);
        return i>0;
    }

    //通过id删除员工
    public boolean deleteEmployee(Integer id){
        int i = employeeDao.deleteEmployee(id);
        return i>0;
    }

    public HashMap<Integer,String> idToName(){
        List<Employee> allEmployee = employeeDao.getAllEmployee();
        HashMap<Integer,String> map = new HashMap<>();
        for (Employee employee : allEmployee) {
            Integer department_id = employee.getDepartment_id();
            String department_name = departmentService.getDepartment(department_id).getDepartmentName();
            map.put(department_id,department_name);
        }
        return map;
    }
}
