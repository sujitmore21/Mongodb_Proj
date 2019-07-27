package com.sujitmo.demomongodb.controller;


import com.sujitmo.demomongodb.model.Employee;
import com.sujitmo.demomongodb.repository.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {

    @Autowired
    private EmployeeRepo employeeRepo;

    @PostMapping(value = "/saveemp")
    public String saveEmp(@RequestBody Employee employee){


        employeeRepo.save(employee);
        return "Data saved";
    }
}
