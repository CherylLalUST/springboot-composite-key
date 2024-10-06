package com.ust.composite.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class EmployeeCompositeKeyClass implements Serializable {

    private int empId;
    private String empName;

}
