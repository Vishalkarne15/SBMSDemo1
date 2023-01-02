package com.springboot.microservices.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springboot.microservices.entity.Department;


@Repository("departmentRepository")
public interface DepartmentRepository extends JpaRepository<Department, Long> {

	public Department findByDepartmentId(Long departmentById);

}
