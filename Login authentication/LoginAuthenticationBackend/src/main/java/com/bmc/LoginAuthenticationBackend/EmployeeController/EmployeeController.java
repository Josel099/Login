package com.bmc.LoginAuthenticationBackend.EmployeeController;

import com.bmc.LoginAuthenticationBackend.Dto.EmployeeDTO;
import com.bmc.LoginAuthenticationBackend.Dto.LoginDTO;
import com.bmc.LoginAuthenticationBackend.Response.LoginResponse;
import com.bmc.LoginAuthenticationBackend.Service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/employee")
@CrossOrigin
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;




    @PostMapping(path = "/save")
    public String saveEmployee(@RequestBody EmployeeDTO employeeDTO){
        String Id = employeeService.addEmployee(employeeDTO);
        return Id;
    }

@PostMapping(path = "/login")
    public ResponseEntity<?> loginEmployee(@RequestBody LoginDTO loginDTO){
        LoginResponse loginResponse =employeeService.loginEmployee(loginDTO);
        return ResponseEntity.ok(loginResponse);
    }
}
