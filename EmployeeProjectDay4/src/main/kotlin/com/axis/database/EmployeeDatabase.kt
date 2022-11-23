package com.axis.database

import com.axis.model.Employee

class EmployeeDatabase {
    var employees= mutableListOf<Employee>()
    init {
        employees.add(Employee(101,"Deepti",76000,"IT",22))
        employees.add(Employee(102,"Supriya",45000,"CS",24))
        employees.add(Employee(103,"Chetana",64000,"HR",23))
        employees.add(Employee(104,"Krisha",55300,"CS",26))
        employees.add(Employee(105,"Shruti",63000,"IT",29))
    }
    fun data():MutableList<Employee>{
        return employees
    }
}