package com.example.demo;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/v1/emp")
public class EmployeeController {
    List<Employee> listEmp;

    EmployeeController(){
        listEmp = new ArrayList<>();
        listEmp.add(new Employee(25000,1,"IT","Full Stack developer"));
        listEmp.add(new Employee(45000,2,"IT","MERN Devloper"));
    }

    @GetMapping("/")
    public ResponseEntity<List<Employee>> getAllEmp(){
       return ResponseEntity.ok(listEmp);
    }

    @PostMapping("/createEmp")
    public ResponseEntity<Employee> createEmp(@RequestBody Employee employee){
        listEmp.add(employee);
        return ResponseEntity.ok(employee);
    }

    @GetMapping("/{empID}")
    public ResponseEntity<Employee> getEmpById(@PathVariable int empID){
        for (Employee emp : listEmp){
            if (emp.getID() == empID){
                return ResponseEntity.ok(emp);
            }
        }
        return ResponseEntity.notFound().build();
    }

    @DeleteMapping("/{empID}")
    public ResponseEntity<Employee> DeleteEmp(@PathVariable int empID){
        for(Employee emp : listEmp){
            if (emp.getID() == empID){
                listEmp.remove(emp);
                return ResponseEntity.ok(emp);
            }
        }
        return ResponseEntity.notFound().build();
    }

    @PutMapping("/update/{empID}")
    public ResponseEntity<Employee> UpdateEmp(@PathVariable int empID, @RequestBody Employee employee){
        for (Employee emp : listEmp){
            if (emp.getID() == empID){
                emp.setID(employee.getID());
                emp.setDepartment(employee.getDepartment());
                emp.setDesignation(employee.getDesignation());
                emp.setSalary(employee.getSalary());
                return ResponseEntity.ok(emp);
            }
        }
        return ResponseEntity.notFound().build();
    }


}
