package com.ust.composite.repository;

import com.ust.composite.model.Employee;
import com.ust.composite.model.EmployeeCompositeKeyClass;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, EmployeeCompositeKeyClass> {
}
