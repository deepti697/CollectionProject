package com.axis.app

import com.axis.model.Employee
import com.axis.services.EmployeeService

fun main() {

    var employeeService=EmployeeService()
    //var emp =employeeService.viewAllEmployees()
//    for (i in emp){
//        println("${i.id} | ${i.name} | ${i.salary} | ${i.department} | ${i.age}")
//    }
    //Adding employee
    var employee = Employee(106,"Aditi",50000,"HR",26)
    employeeService.addNewEmployee(employee)
    employeeService.viewAllEmployees()
}