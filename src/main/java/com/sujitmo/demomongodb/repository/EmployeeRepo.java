package com.sujitmo.demomongodb.repository;

import com.sujitmo.demomongodb.model.Employee;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface EmployeeRepo extends MongoRepository<Employee,String> {
}
