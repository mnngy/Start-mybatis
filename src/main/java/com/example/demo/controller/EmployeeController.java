package com.example.demo.controller;

import com.example.demo.mapper.CompanyMapper;
import com.example.demo.mapper.EmployeeMapper;
import com.example.demo.model.Company;
import com.example.demo.model.Employee;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employee")
@RequiredArgsConstructor
public class EmployeeController {

    private final EmployeeMapper mapper;

    @PostMapping("")
    public Employee post(@RequestBody Employee employee) {
        mapper.insert(employee);
        return employee;
    }

    @GetMapping("")
    public List<Employee> getAll() {
        return mapper.getAll();
    }

    @GetMapping("/{id}")
    Employee getById(@PathVariable("id") int id) {
        return mapper.getById(id);
    }
}
