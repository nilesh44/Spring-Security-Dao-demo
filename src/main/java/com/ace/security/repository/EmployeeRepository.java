package com.ace.security.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ace.security.entity.Employees;
import com.ace.security.entity.Roles;
@Repository
public interface EmployeeRepository  extends CrudRepository<Employees, String> {

}
