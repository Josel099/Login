package com.bmc.LoginAuthenticationBackend.Service;

import com.bmc.LoginAuthenticationBackend.Dto.EmployeeDTO;
import com.bmc.LoginAuthenticationBackend.Dto.LoginDTO;
import com.bmc.LoginAuthenticationBackend.Response.LoginResponse;

public interface EmployeeService {

    String addEmployee(EmployeeDTO employeeDTO);

    LoginResponse loginEmployee(LoginDTO loginDTO);
}
