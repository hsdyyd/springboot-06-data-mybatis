package com.springboot.springboot.controller;

import com.springboot.springboot.bean.Department;
import com.springboot.springboot.bean.Employee;
import com.springboot.springboot.mapper.DepartmentMapper;
import com.springboot.springboot.mapper.EmployeeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author yidong
 * @create 2019-02-26-11:47
 */
@RestController
public class DepartmentController {

    @Autowired
    DepartmentMapper departmentMapper;

    @Autowired
    EmployeeMapper employeeMapper;

    @GetMapping("/dept/{id}")
    public Department getDeptment(@PathVariable("id") Integer id){
        Department dept = departmentMapper.getDeptById(id);
        return dept;
    }

    @GetMapping("/dept")
    public Department insertDept(Department department){
        departmentMapper.insertDept(department);
        return department;
    }

    @GetMapping("/emp/{id}")
    public Employee getEmp(@PathVariable("id") Integer id){
        return employeeMapper.getEmpById(id);
    }
}
