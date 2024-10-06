package com.ust.composite.model;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Employee {

    @EmbeddedId
    private EmployeeCompositeKeyClass employeeCompositeKeyClass;

    private int empAge;
    private String empDesignation;


}
