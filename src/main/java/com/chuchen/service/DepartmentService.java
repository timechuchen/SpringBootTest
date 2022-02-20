package com.chuchen.service;

import com.chuchen.mapper.DepartmentMapper;
import com.chuchen.pojo.Department;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.List;

@Service
public class DepartmentService {

    @Autowired
    private DepartmentMapper departmentDao;

    //获取的所有部门信息
    public List<Department> getAllDepartments(){
        return departmentDao.getAllDepartments();
    }

    //通过id得到部门
    public Department getDepartment(Integer id){
        return departmentDao.getDepartment(id);
    }
}
