package com.ust.composite.controller;

import com.ust.composite.model.Employee;
import com.ust.composite.model.EmployeeCompositeKeyClass;
import com.ust.composite.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/ust")
public class EmployeeController{

    @Autowired
    private EmployeeRepository employeeRepository;

    @GetMapping("/employee")
    public List<Employee> getAllEmployee() {
        return employeeRepository.findAll();
    }

    @GetMapping("/{empId}/{empName}")
    public ResponseEntity<Employee> getEmployeeById(@PathVariable int empId, @PathVariable String empName) {
        EmployeeCompositeKeyClass employeeCompositeKeyClass = new EmployeeCompositeKeyClass(empId, empName);
        Optional<Employee> employee = employeeRepository.findById(employeeCompositeKeyClass);
        return employee.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping("/employee")
    public ResponseEntity<Employee> saveEmployee(@RequestBody Employee employee){
        Employee savedEmployee = employeeRepository.save(employee);
        return new ResponseEntity<>(savedEmployee, HttpStatus.CREATED);
    }

}
