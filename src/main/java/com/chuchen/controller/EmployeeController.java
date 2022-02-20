package com.chuchen.controller;

import com.chuchen.pojo.Department;
import com.chuchen.pojo.Employee;
import com.chuchen.service.DepartmentService;
import com.chuchen.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;
    @Autowired
    private DepartmentService departmentService;

    @RequestMapping("/employees")
    public String list(Model model){
        List<Employee> employees = employeeService.getAllEmployee();
        model.addAttribute("employees",employees);
        model.addAttribute("idToName",employeeService.idToName());
        return "employee/list";
    }

    @GetMapping("/employee")
    public String toAddPage(Model model){
        //查出所有部门信息
        List<Department> allDepartments = departmentService.getAllDepartments();
        model.addAttribute("allDepartments",allDepartments);
        return "employee/add";
    }

    @PostMapping("/employee")
    public String addPage(Employee employee){
        //添加的具体操作
        employeeService.save(employee);
        return "redirect:/employees";
    }

    //去员工的修改页面
    @GetMapping("/employee/{id}")
    public String toUpdatePage(@PathVariable("id") Integer id,Model model){
        //查出原来的数据
        Employee employee = employeeService.getEmployee(id);
        model.addAttribute("employee",employee);
        //查出所有部门信息
        List<Department> allDepartments = departmentService.getAllDepartments();
        model.addAttribute("allDepartments",allDepartments);
        return "employee/update";
    }

    @PostMapping("/update")
    public String updatePage(Employee employee){
        //修改的具体操作
        boolean flag = employeeService.updateEmployee(employee);
        if(flag) System.out.println("修改成功！");
        else System.out.println("修改失败！");
        return "redirect:/employees";
    }

    @GetMapping("/delete/{id}")
    public String delete(@PathVariable("id") Integer id){
        boolean flag = employeeService.deleteEmployee(id);
        if(flag) System.out.println("删除成功！");
        else System.out.println("删除失败！");
        return "redirect:/employees";
    }
}
