package com.axis.services

import com.axis.database.EmployeeDatabase
import com.axis.model.Employee

class EmployeeService {

    var employeeUtil=EmployeeDatabase()
    fun viewAllEmployees(){
        var employees = employeeUtil.data()

        for (employee in employees) {
            println("${employee.id} | ${employee.name} | ${employee.salary} | ${employee.department} | ${employee.age}")
        }
    }

    fun addNewEmployee(employee: Employee):String{
        employeeUtil.data().add(employee)
        return "Employee Added Successfully!!!"
    }
}