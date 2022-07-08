package com.filipe.sisgar.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.filipe.sisgar.models.StudentModel;

public interface StudentRepository extends JpaRepository<StudentModel, Long>{

}
