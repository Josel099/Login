package com.bmc.LoginAuthenticationBackend.Service.Impl;

import com.bmc.LoginAuthenticationBackend.Dto.EmployeeDTO;
import com.bmc.LoginAuthenticationBackend.Dto.LoginDTO;
import com.bmc.LoginAuthenticationBackend.Entity.Employee;
import com.bmc.LoginAuthenticationBackend.Repositery.EmployeeRepo;
import com.bmc.LoginAuthenticationBackend.Response.LoginResponse;
import com.bmc.LoginAuthenticationBackend.Service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class EmployeeImpl implements EmployeeService {
    @Autowired
    private EmployeeRepo employeeRepo;
    @Autowired
    private PasswordEncoder passwordEncoder;

    @Override
    public String addEmployee( EmployeeDTO employeeDTO) {

        Employee employee = new Employee(   employeeDTO.getEmployeeId(),
                employeeDTO.getEmployeeName(),
                employeeDTO.getEmail(),
                this.passwordEncoder.encode(employeeDTO.getPassword())
        );
     employeeRepo.save(employee);
     return employee.getEmployeeName();
    }

    @Override
    public LoginResponse loginEmployee(LoginDTO loginDTO) {
        return null;
    }
}
