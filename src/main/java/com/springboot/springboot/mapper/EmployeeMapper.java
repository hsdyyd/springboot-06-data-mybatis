package com.springboot.springboot.mapper;

import com.springboot.springboot.bean.Employee;
import org.springframework.stereotype.Component;

/**
 * @author yidong
 * @create 2019-02-27-09:31
 */

@Component(value = "employeeMapper")
public interface EmployeeMapper {

    public Employee getEmpById(Integer id);

    public void insertEmp(Employee employee);
}
