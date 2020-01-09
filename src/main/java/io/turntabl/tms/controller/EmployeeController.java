package io.turntabl.tms.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Api
@RestController
public class EmployeeController {
@ApiOperation("Get all available employee")
    @GetMapping("/Employee")

    public List<Employee> getEmployee(){
    return dao.getAvailableEmployee();
}
}
