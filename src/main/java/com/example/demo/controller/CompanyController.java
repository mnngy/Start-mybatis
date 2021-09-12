package com.example.demo.controller;

import com.example.demo.mapper.CompanyMapper;
import com.example.demo.model.Company;
import com.example.demo.service.CompanyService;
import lombok.RequiredArgsConstructor;
import org.apache.ibatis.annotations.Param;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/company")
@RequiredArgsConstructor
public class CompanyController {

    private final CompanyMapper mapper;
    private final CompanyService companyService;

    @PostMapping("")
    public Company post(@RequestBody Company company) {
        mapper.insert(company);
        return company;
    }

    @GetMapping("")
    public List<Company> getAll() {
        return companyService.getAll();
    }

    @GetMapping("/{id}")
    Company getById(@PathVariable("id") int id) {
        return mapper.getById(id);
    }
}
