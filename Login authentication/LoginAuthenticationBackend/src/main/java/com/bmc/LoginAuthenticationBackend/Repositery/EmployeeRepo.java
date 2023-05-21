package com.bmc.LoginAuthenticationBackend.Repositery;

import com.bmc.LoginAuthenticationBackend.Entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

@EnableJpaRepositories
@Repository
public interface EmployeeRepo extends JpaRepository<Employee,Integer> {

}
